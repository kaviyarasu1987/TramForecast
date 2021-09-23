package com.rim.tramforecast.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/rim/tramforecast/data/GetForecast;", "", "forecastRepository", "Lcom/rim/tramforecast/data/ForecastRepository;", "(Lcom/rim/tramforecast/data/ForecastRepository;)V", "getForecastRepository", "()Lcom/rim/tramforecast/data/ForecastRepository;", "invoke", "Lio/reactivex/Flowable;", "Lcom/rim/tramforecast/api/AsyncResult;", "Lcom/rim/tramforecast/data/ForecastResponseWrapper;", "queries", "Lcom/rim/tramforecast/data/Query;", "app_debug"})
public class GetForecast {
    @org.jetbrains.annotations.NotNull()
    private final com.rim.tramforecast.data.ForecastRepository forecastRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Flowable<com.rim.tramforecast.api.AsyncResult<com.rim.tramforecast.data.ForecastResponseWrapper>> invoke(@org.jetbrains.annotations.NotNull()
    io.reactivex.Flowable<com.rim.tramforecast.data.Query> queries) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rim.tramforecast.data.ForecastRepository getForecastRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public GetForecast(@org.jetbrains.annotations.NotNull()
    com.rim.tramforecast.data.ForecastRepository forecastRepository) {
        super();
    }
}