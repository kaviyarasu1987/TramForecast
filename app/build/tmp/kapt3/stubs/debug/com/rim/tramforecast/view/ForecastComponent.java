package com.rim.tramforecast.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/rim/tramforecast/view/ForecastComponent;", "Ldagger/android/AndroidInjector;", "Lcom/rim/tramforecast/view/Application;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.rim.tramforecast.view.AndroidBindingModule.class, com.rim.tramforecast.view.ForecastAppModule.class, com.rim.tramforecast.data.ForecastRepositoryModule.class, com.rim.tramforecast.data.SchedulerFactoryModule.class})
@javax.inject.Singleton()
public abstract interface ForecastComponent extends dagger.android.AndroidInjector<com.rim.tramforecast.view.Application> {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/rim/tramforecast/view/ForecastComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lcom/rim/tramforecast/view/Application;", "()V", "app_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<com.rim.tramforecast.view.Application> {
        
        public Builder() {
            super();
        }
    }
}