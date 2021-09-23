// Generated by Dagger (https://google.github.io/dagger).
package com.rim.tramforecast.data;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class ForecastViewModel_Factory implements Factory<ForecastViewModel> {
  private final Provider<ForecastRepositoryConnector> forecastRepositoryProvider;

  private final Provider<GetForecast> getForecastProvider;

  private final Provider<SchedulerFactory> schedulerFactoryProvider;

  public ForecastViewModel_Factory(
      Provider<ForecastRepositoryConnector> forecastRepositoryProvider,
      Provider<GetForecast> getForecastProvider,
      Provider<SchedulerFactory> schedulerFactoryProvider) {
    this.forecastRepositoryProvider = forecastRepositoryProvider;
    this.getForecastProvider = getForecastProvider;
    this.schedulerFactoryProvider = schedulerFactoryProvider;
  }

  @Override
  public ForecastViewModel get() {
    return provideInstance(
        forecastRepositoryProvider, getForecastProvider, schedulerFactoryProvider);
  }

  public static ForecastViewModel provideInstance(
      Provider<ForecastRepositoryConnector> forecastRepositoryProvider,
      Provider<GetForecast> getForecastProvider,
      Provider<SchedulerFactory> schedulerFactoryProvider) {
    return new ForecastViewModel(
        forecastRepositoryProvider.get(),
        getForecastProvider.get(),
        schedulerFactoryProvider.get());
  }

  public static ForecastViewModel_Factory create(
      Provider<ForecastRepositoryConnector> forecastRepositoryProvider,
      Provider<GetForecast> getForecastProvider,
      Provider<SchedulerFactory> schedulerFactoryProvider) {
    return new ForecastViewModel_Factory(
        forecastRepositoryProvider, getForecastProvider, schedulerFactoryProvider);
  }

  public static ForecastViewModel newForecastViewModel(
      ForecastRepositoryConnector forecastRepository,
      GetForecast getForecast,
      SchedulerFactory schedulerFactory) {
    return new ForecastViewModel(forecastRepository, getForecast, schedulerFactory);
  }
}