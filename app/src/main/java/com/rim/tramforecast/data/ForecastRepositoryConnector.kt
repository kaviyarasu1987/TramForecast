package com.rim.tramforecast.data

import com.jakewharton.rxrelay2.BehaviorRelay
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import java.util.*
import java.util.Calendar.*
import javax.inject.Inject

class ForecastRepositoryConnector @Inject internal constructor() {
    private val timeZoneTextRelay = BehaviorRelay.create<String>()


    open val queries: Flowable<Query>
        get() = timeZoneTextRelay.map {
                when (it.isBlank()) {
                    true -> getAntiMeridiem
                    false -> Search(it)
                }
            }.toFlowable(BackpressureStrategy.BUFFER)

    open fun updateForecast(stop:String) {

        timeZoneTextRelay.accept(stop)
    }
}