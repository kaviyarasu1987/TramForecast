package com.rim.tramforecast.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/rim/tramforecast/api/ForecastAPI;", "", "getCurrentForecast", "Lio/reactivex/Single;", "Lcom/rim/tramforecast/data/ForecastResponseWrapper;", "action", "", "stop", "encrypt", "app_debug"})
public abstract interface ForecastAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "xml/get.ashx")
    public abstract io.reactivex.Single<com.rim.tramforecast.data.ForecastResponseWrapper> getCurrentForecast(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "action")
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "stop")
    java.lang.String stop, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "encrypt")
    java.lang.String encrypt);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}