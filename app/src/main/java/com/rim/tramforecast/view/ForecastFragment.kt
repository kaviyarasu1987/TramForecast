package com.rim.tramforecast.view

import android.content.Context
import android.net.Uri
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


import com.rim.tramforecast.BR
import com.rim.tramforecast.R


import com.rim.tramforecast.data.ForecastViewModel
import com.rim.tramforecast.data.TramDetails
import com.rim.tramforecast.databinding.ForecastListBinding
import dagger.android.support.DaggerFragment
import me.tatarka.bindingcollectionadapter2.ItemBinding
import me.tatarka.bindingcollectionadapter2.LayoutManagers

import javax.inject.Inject
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.os.Handler
import android.support.design.widget.Snackbar
import android.widget.AdapterView
import android.widget.ArrayAdapter

import android.widget.Button
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.rim.tramforecast.api.Appconstants.Factory.currentStop
import kotlinx.android.synthetic.main.forecast_list.*
import kotlin.concurrent.fixedRateTimer


class ForecastFragment : DaggerFragment1() {
    // TODO: Rename and change types of parameters

    @Inject
    lateinit var viewModel: ForecastViewModel

    lateinit var timerView:com.github.anastr.flattimelib.CountDownTimerView
    private val mAppUnitId: String = "ca-app-pub-9977175471932994/4081991951"
    private lateinit var mAdView: AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.loadForecast(context!!)
        initializeTimer()
        viewModel.onErrorLoadingForecast.subscribe{
            view?.let {
                Snackbar
                    .make(it, R.string.cannot_load_forecast, Snackbar.LENGTH_LONG)
                    .setAction(R.string.retry) { viewModel.onQueryTimeUpdate("STX") }
                    .show()
            }

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = ForecastListBinding.inflate(inflater)
        binding.swipeRefreshLayout.isEnabled = false

        binding.tramDownTimer.start(30000);
        timerView = binding.tramDownTimer;
        binding.tramView.layoutManager = LayoutManagers
            .grid(resources.getInteger(R.integer.galleryColumns))
            .create(binding.tramView)
        binding.tramViewOutbound.layoutManager = LayoutManagers
            .grid(resources.getInteger(R.integer.galleryColumns))
            .create(binding.tramViewOutbound)
        val stoppings = resources.getStringArray(R.array.stoppings)
        val stopAdapter =  ArrayAdapter(activity as Context, android.R.layout.simple_spinner_item, stoppings)
        binding.stops.adapter = stopAdapter
        mAdView = binding.adView
        initializeBannerAd(mAppUnitId,activity as Context)
        loadBannerAd()
        binding.stops.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var stopAbrv = stoppings[position].toString().split(",")[0]
                currentStop = stopAbrv

                viewModel.onQueryTimeUpdate(stopAbrv)
                tramDownTimer.start(30000);
            }

        }
        binding.notification.setOnClickListener{

            viewModel.toggleNotification();
        }


       // setAnimationForRefresh(binding.refresh)
        binding.tramItemBinding = ItemBinding.of<TramDetails>(BR.viewModel, R.layout.forecast_item)
        binding.tramItemBindingOutBound = ItemBinding.of<TramDetails>(BR.viewModel, R.layout.forecast_item)
        binding.viewModel = viewModel

        return binding.root
    }



    override fun onDestroy() {
        viewModel.onCleared()
        super.onDestroy()
    }

    fun setAnimationForRefresh(view: Button)
    {
        //
        val scaleDown = ObjectAnimator.ofPropertyValuesHolder(
            view,
            PropertyValuesHolder.ofFloat("scaleX", 1.2f),
            PropertyValuesHolder.ofFloat("scaleY", 1.2f)
        )
        scaleDown.duration = 410

        scaleDown.repeatCount = ObjectAnimator.INFINITE
        scaleDown.repeatMode = ObjectAnimator.REVERSE

        scaleDown.start()

    }


fun initializeTimer()
{

    val handler = Handler()
    handler.postDelayed(object : Runnable {
        override fun run() {
            viewModel.onQueryTimeUpdate(currentStop)
            timerView.success()
            timerView.start(30000);
            handler.postDelayed(this, 30000)//1 sec delay
        }
    }, 0)

}



    private fun initializeBannerAd(appUnitId: String,context: Context) {

        MobileAds.initialize(context, appUnitId)

    }

    private fun loadBannerAd() {

        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
    }


}
