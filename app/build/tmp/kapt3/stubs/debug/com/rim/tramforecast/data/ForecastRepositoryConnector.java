package com.rim.tramforecast.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0001\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R2\u0010\b\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/rim/tramforecast/data/ForecastRepositoryConnector;", "", "()V", "queries", "Lio/reactivex/Flowable;", "Lcom/rim/tramforecast/data/Query;", "getQueries", "()Lio/reactivex/Flowable;", "timeZoneTextRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "kotlin.jvm.PlatformType", "updateForecast", "", "stop", "app_debug"})
public final class ForecastRepositoryConnector {
    private final com.jakewharton.rxrelay2.BehaviorRelay<java.lang.String> timeZoneTextRelay = null;
    
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Flowable<com.rim.tramforecast.data.Query> getQueries() {
        return null;
    }
    
    public void updateForecast(@org.jetbrains.annotations.NotNull()
    java.lang.String stop) {
    }
    
    @javax.inject.Inject()
    public ForecastRepositoryConnector() {
        super();
    }
}