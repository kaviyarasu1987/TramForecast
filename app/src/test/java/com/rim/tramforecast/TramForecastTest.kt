 package com.rim.tramforecast

import android.content.res.Resources
import com.nhaarman.mockito_kotlin.*
import com.rim.tramforecast.api.AsyncResult
import com.rim.tramforecast.api.Busy
import com.rim.tramforecast.api.Success
import com.rim.tramforecast.data.*
import io.reactivex.processors.BehaviorProcessor
import org.amshove.kluent.shouldEqual
import org.junit.Test
import java.util.*
import java.util.Calendar.getInstance


 @Suppress("IllegalIdentifier")
class TramForecastTest {
  private val forecasFlow = BehaviorProcessor.create<AsyncResult<ForecastResponseWrapper>>()
  private val getForecast = mock<GetForecast> {
    on { invoke(any()) }.thenReturn(forecasFlow)
  }
    private val resources = mock<Resources>()
  private val schedulerFactory = TestSchedulerFactory()

  private val queryFlow = BehaviorProcessor.create<Query>()
  private val forecastRepositoryConnectorRepository = mock<ForecastRepositoryConnector> {
    on { queries }.thenReturn(queryFlow)
  }


  private val viewModel by lazy {
    ForecastViewModel(
        forecastRepositoryConnectorRepository,
        getForecast,
        schedulerFactory

    )
  }

  @Test
  fun `show inbound and stopping from view model  from mock forecast response`() {
   //mock tram,directons on forecast Flow test
    val trams = listOf(
        TramDetails("15","Test Destination"),
        TramDetails("12","Test Destination1")
    )
    val directions = listOf(DirectionResponse("Inbound",trams))
    val forecast =  ForecastResponseWrapper("","sti","Stillorgan","Green services",directions)

      forecasFlow.onNext(Success(forecast))

      //should show Inbound and Stillorgan as per task
      viewModel.directions.get()!!.name.shouldEqual("Inbound")
      viewModel.forecast.get()!!.stopAbv.shouldEqual("Stillorgan")

  }

    @Test
    fun `show outbound and stopping from view model  from mock forecast response`() {
        //mock tram,directons on forecast Flow test
        val trams = listOf(
            TramDetails("15","Test Destination"),
            TramDetails("12","Test Destination1")
        )
        val directions = listOf(DirectionResponse("Outbound",trams))
        val forecast =  ForecastResponseWrapper("","mar","Marlborough","Green services",directions)

        forecasFlow.onNext(Success(forecast))

        //should show Outbound and Marlborough as per task
        viewModel.directions.get()!!.name.shouldEqual("Outbound")
        viewModel.forecast.get()!!.stopAbv.shouldEqual("Marlborough")

    }

    @Test
    fun `check after meridium and post meridium based on current hour`() {


        val hourOftheDay = getInstance().get(Calendar.HOUR_OF_DAY);
        //simple meridiem check :)
        forecastRepositoryConnectorRepository.updateForecast()
        forecastRepositoryConnectorRepository.queries.subscribe{

               when (hourOftheDay>=0&&hourOftheDay<12) {
                   true -> it.shouldEqual(getAntiMeridiem)
                   false -> it.shouldEqual(getPostMeridiem)
               }

        }


    }


}
