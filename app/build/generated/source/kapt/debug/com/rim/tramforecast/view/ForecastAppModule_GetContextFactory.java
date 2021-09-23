// Generated by Dagger (https://google.github.io/dagger).
package com.rim.tramforecast.view;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class ForecastAppModule_GetContextFactory implements Factory<Context> {
  private final ForecastAppModule module;

  private final Provider<Application> appProvider;

  public ForecastAppModule_GetContextFactory(
      ForecastAppModule module, Provider<Application> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public Context get() {
    return provideInstance(module, appProvider);
  }

  public static Context provideInstance(
      ForecastAppModule module, Provider<Application> appProvider) {
    return proxyGetContext(module, appProvider.get());
  }

  public static ForecastAppModule_GetContextFactory create(
      ForecastAppModule module, Provider<Application> appProvider) {
    return new ForecastAppModule_GetContextFactory(module, appProvider);
  }

  public static Context proxyGetContext(ForecastAppModule instance, Application app) {
    return Preconditions.checkNotNull(
        instance.getContext(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
