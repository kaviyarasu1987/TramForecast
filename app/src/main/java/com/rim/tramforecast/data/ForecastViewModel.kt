package com.rim.tramforecast.data


import android.app.Application
import android.content.Context
import android.databinding.ObservableArrayList
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.databinding.ObservableList
import android.os.Bundle


import com.rim.tramforecast.api.Busy
import com.rim.tramforecast.api.Failure
import com.rim.tramforecast.api.Success
import com.rim.tramforecast.data.BaseViewModel
import com.rim.tramforecast.data.GetForecast
import com.rim.tramforecast.data.SchedulerFactory
import io.reactivex.Observable

import javax.inject.Inject

import me.tatarka.bindingcollectionadapter2.ItemBinding
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.media.MediaPlayer
import com.jakewharton.rxrelay2.PublishRelay

import com.rim.tramforecast.BR
import com.rim.tramforecast.R


class ForecastViewModel @Inject  internal constructor(
private val forecastRepository:ForecastRepositoryConnector,
private val getForecast:GetForecast,
private val schedulerFactory: SchedulerFactory
): BaseViewModel() {
    val isLoading = ObservableBoolean()
    val isMuteNotification = ObservableBoolean()
    var forecast: ObservableField<ForecastResponseWrapper> = ObservableField<ForecastResponseWrapper>()
    var directions: ObservableField<DirectionResponse> = ObservableField<DirectionResponse>()
    var directionsOutbound: ObservableField<DirectionResponse> = ObservableField<DirectionResponse>()
    val trams:ObservableList<TramDetails> = ObservableArrayList<TramDetails>()
    val tramsOutbound:ObservableList<TramDetails> = ObservableArrayList<TramDetails>()
    private val onErrorLoadingForecastRelay = PublishRelay.create<Unit>()
    lateinit var player:MediaPlayer
    lateinit var  appContext:Context;
    val onErrorLoadingForecast: Observable<Unit>
        get() = onErrorLoadingForecastRelay.autoClear()

init {
    isMuteNotification.set(false)

    getForecast(queries = forecastRepository.queries)
        .subscribeOn(schedulerFactory.ioScheduler)
        .observeOn(schedulerFactory.mainScheduler)
        .subscribe { result ->
            when (result) {
                is Busy -> isLoading.set(true)
                is Success<ForecastResponseWrapper> -> {

                    updateForecastDetails(result)
                    isLoading.set(false)

                }
                is Failure -> {
                    onErrorLoadingForecastRelay.accept(Unit)
                    isLoading.set(false)
                }
            }
        }


}

    fun onQueryTimeUpdate(stop:String)
    {
        playTramSound()
        forecastRepository.updateForecast(stop)

    }

    fun toggleNotification()
    {
       if( isMuteNotification.get())
           isMuteNotification.set(false)
        else
           isMuteNotification.set(true)

    }
    fun loadForecast(context: Context) {
        appContext = context
        playTramSound()
        forecastRepository.updateForecast("STX")
    }

    fun playTramSound()
    {
        if(::player.isInitialized)
        {
            player.stop();

        }
        if(!isMuteNotification.get()) {
            player = MediaPlayer.create(appContext, R.raw.tram);
            player.start()

        }



    }

    private fun updateForecastDetails(result: Success<ForecastResponseWrapper>) {
        forecast.set(result.value)
        directions.set(result.value.DirectionList!!.get(0))
        directionsOutbound.set(result.value.DirectionList!!.get(1))
        trams.clear()
        tramsOutbound.clear()
        result.value.DirectionList!!.get(0).tramList?.let { trams.addAll(it) }
        result.value.DirectionList!!.get(1).tramList?.let { tramsOutbound.addAll(it) }
    }


}