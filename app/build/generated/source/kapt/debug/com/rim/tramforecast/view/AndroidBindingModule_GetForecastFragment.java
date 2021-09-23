package com.rim.tramforecast.view;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = AndroidBindingModule_GetForecastFragment.ForecastFragmentSubcomponent.class)
public abstract class AndroidBindingModule_GetForecastFragment {
  private AndroidBindingModule_GetForecastFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ForecastFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ForecastFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ForecastFragmentSubcomponent extends AndroidInjector<ForecastFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ForecastFragment> {}
  }
}
