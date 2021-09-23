package com.rim.tramforecast.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/rim/tramforecast/data/ForecastRepository;", "", "getForecastDetails", "Lio/reactivex/Flowable;", "Lcom/rim/tramforecast/api/AsyncResult;", "Lcom/rim/tramforecast/data/ForecastResponseWrapper;", "stop", "", "boundDetails", "app_debug"})
public abstract interface ForecastRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<com.rim.tramforecast.api.AsyncResult<com.rim.tramforecast.data.ForecastResponseWrapper>> getForecastDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String stop, @org.jetbrains.annotations.NotNull()
    java.lang.String boundDetails);
}