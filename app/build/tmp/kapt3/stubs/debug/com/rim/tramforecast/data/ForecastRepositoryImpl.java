package com.rim.tramforecast.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006*\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/rim/tramforecast/data/ForecastRepositoryImpl;", "Lcom/rim/tramforecast/data/ForecastRepository;", "api", "Lcom/rim/tramforecast/api/ForecastAPI;", "(Lcom/rim/tramforecast/api/ForecastAPI;)V", "getForecastDetails", "Lio/reactivex/Flowable;", "Lcom/rim/tramforecast/api/AsyncResult;", "Lcom/rim/tramforecast/data/ForecastResponseWrapper;", "stop", "", "boundDetails", "toForecastResponse", "Lio/reactivex/Single;", "app_debug"})
public final class ForecastRepositoryImpl implements com.rim.tramforecast.data.ForecastRepository {
    private final com.rim.tramforecast.api.ForecastAPI api = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<com.rim.tramforecast.api.AsyncResult<com.rim.tramforecast.data.ForecastResponseWrapper>> getForecastDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String stop, @org.jetbrains.annotations.NotNull()
    java.lang.String boundDetails) {
        return null;
    }
    
    private final io.reactivex.Flowable<com.rim.tramforecast.api.AsyncResult<com.rim.tramforecast.data.ForecastResponseWrapper>> toForecastResponse(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<com.rim.tramforecast.data.ForecastResponseWrapper> $this$toForecastResponse, java.lang.String boundDetails) {
        return null;
    }
    
    public ForecastRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.rim.tramforecast.api.ForecastAPI api) {
        super();
    }
}