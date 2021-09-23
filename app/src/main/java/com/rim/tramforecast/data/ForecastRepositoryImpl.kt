package com.rim.tramforecast.data

import com.rim.tramforecast.api.*
import com.rim.tramforecast.api.ForecastAPI
import io.reactivex.Flowable
import io.reactivex.Single

internal class ForecastRepositoryImpl internal  constructor(
 private val api: ForecastAPI
) :ForecastRepository {

    override fun getForecastDetails(stop:String,boundDetails: String): Flowable<AsyncResult<ForecastResponseWrapper>> =
        api.getCurrentForecast(stop = stop).toForecastResponse(boundDetails)


    private fun Single<ForecastResponseWrapper>.toForecastResponse(boundDetails: String): Flowable<AsyncResult<ForecastResponseWrapper>> =
        this.toFlowable()

            .map<AsyncResult<ForecastResponseWrapper>>  {
                Success(it)
            }
            .doOnError { }
            .onErrorReturn {
                Failure(it)
            }
            .startWith(Busy())



}