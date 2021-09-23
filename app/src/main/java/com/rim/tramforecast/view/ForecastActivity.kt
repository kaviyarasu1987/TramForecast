package com.rim.tramforecast.view


import android.os.Bundle
import android.support.v7.app.AppCompatActivity


import com.rim.tramforecast.R
import android.support.v4.app.SupportActivity
import android.support.v4.app.SupportActivity.ExtraData
import android.support.v4.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds



class ForecastActivity  : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            this.supportActionBar!!.hide()

        } catch (e: NullPointerException) {
        }
        //initialize add view on the activity

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(android.R.id.content, ForecastFragment())
                .commit()
        }
    }



}
