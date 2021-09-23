package com.rim.tramforecast.data;

import java.lang.System;

<<<<<<< HEAD
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\nJ\u000e\u00107\u001a\u00020\"2\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u00020\"J\u0006\u0010;\u001a\u00020\"J\u0016\u0010<\u001a\u00020\"2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001a0>H\u0002R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R2\u0010%\u001a&\u0012\f\u0012\n \'*\u0004\u0018\u00010\"0\" \'*\u0012\u0012\f\u0012\n \'*\u0004\u0018\u00010\"0\"\u0018\u00010&0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020)X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u0002000/\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002000/\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00102\u00a8\u0006?"}, d2 = {"Lcom/rim/tramforecast/data/ForecastViewModel;", "Lcom/rim/tramforecast/data/BaseViewModel;", "forecastRepository", "Lcom/rim/tramforecast/data/ForecastRepositoryConnector;", "getForecast", "Lcom/rim/tramforecast/data/GetForecast;", "schedulerFactory", "Lcom/rim/tramforecast/data/SchedulerFactory;", "(Lcom/rim/tramforecast/data/ForecastRepositoryConnector;Lcom/rim/tramforecast/data/GetForecast;Lcom/rim/tramforecast/data/SchedulerFactory;)V", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "setAppContext", "(Landroid/content/Context;)V", "directions", "Landroid/databinding/ObservableField;", "Lcom/rim/tramforecast/data/DirectionResponse;", "getDirections", "()Landroid/databinding/ObservableField;", "setDirections", "(Landroid/databinding/ObservableField;)V", "directionsOutbound", "getDirectionsOutbound", "setDirectionsOutbound", "forecast", "Lcom/rim/tramforecast/data/ForecastResponseWrapper;", "setForecast", "isLoading", "Landroid/databinding/ObservableBoolean;", "()Landroid/databinding/ObservableBoolean;", "isMuteNotification", "onErrorLoadingForecast", "Lio/reactivex/Observable;", "", "getOnErrorLoadingForecast", "()Lio/reactivex/Observable;", "onErrorLoadingForecastRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "kotlin.jvm.PlatformType", "player", "Landroid/media/MediaPlayer;", "getPlayer", "()Landroid/media/MediaPlayer;", "setPlayer", "(Landroid/media/MediaPlayer;)V", "trams", "Landroid/databinding/ObservableList;", "Lcom/rim/tramforecast/data/TramDetails;", "getTrams", "()Landroid/databinding/ObservableList;", "tramsOutbound", "getTramsOutbound", "loadForecast", "context", "onQueryTimeUpdate", "stop", "", "playTramSound", "toggleNotification", "updateForecastDetails", "result", "Lcom/rim/tramforecast/api/Success;", "app_debug"})
=======
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0016\u0010\u001e\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110 H\u0002R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006!"}, d2 = {"Lcom/rim/tramforecast/data/ForecastViewModel;", "Lcom/rim/tramforecast/data/BaseViewModel;", "forecastRepository", "Lcom/rim/tramforecast/data/ForecastRepositoryConnector;", "getForecast", "Lcom/rim/tramforecast/data/GetForecast;", "schedulerFactory", "Lcom/rim/tramforecast/data/SchedulerFactory;", "(Lcom/rim/tramforecast/data/ForecastRepositoryConnector;Lcom/rim/tramforecast/data/GetForecast;Lcom/rim/tramforecast/data/SchedulerFactory;)V", "directions", "Landroid/databinding/ObservableField;", "Lcom/rim/tramforecast/data/DirectionResponse;", "getDirections", "()Landroid/databinding/ObservableField;", "setDirections", "(Landroid/databinding/ObservableField;)V", "forecast", "Lcom/rim/tramforecast/data/ForecastResponseWrapper;", "setForecast", "isLoading", "Landroid/databinding/ObservableBoolean;", "()Landroid/databinding/ObservableBoolean;", "trams", "Landroid/databinding/ObservableList;", "Lcom/rim/tramforecast/data/TramDetails;", "getTrams", "()Landroid/databinding/ObservableList;", "loadForecast", "", "onQueryTimeUpdate", "updateForecastDetails", "result", "Lcom/rim/tramforecast/api/Success;", "app_debug"})
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
public final class ForecastViewModel extends com.rim.tramforecast.data.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean isLoading = null;
    @org.jetbrains.annotations.NotNull()
<<<<<<< HEAD
    private final android.databinding.ObservableBoolean isMuteNotification = null;
    @org.jetbrains.annotations.NotNull()
=======
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
    private android.databinding.ObservableField<com.rim.tramforecast.data.ForecastResponseWrapper> forecast;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<com.rim.tramforecast.data.DirectionResponse> directions;
    @org.jetbrains.annotations.NotNull()
<<<<<<< HEAD
    private android.databinding.ObservableField<com.rim.tramforecast.data.DirectionResponse> directionsOutbound;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableList<com.rim.tramforecast.data.TramDetails> trams = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableList<com.rim.tramforecast.data.TramDetails> tramsOutbound = null;
    private final com.jakewharton.rxrelay2.PublishRelay<kotlin.Unit> onErrorLoadingForecastRelay = null;
    @org.jetbrains.annotations.NotNull()
    public android.media.MediaPlayer player;
    @org.jetbrains.annotations.NotNull()
    public android.content.Context appContext;
=======
    private final android.databinding.ObservableList<com.rim.tramforecast.data.TramDetails> trams = null;
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
    private final com.rim.tramforecast.data.ForecastRepositoryConnector forecastRepository = null;
    private final com.rim.tramforecast.data.GetForecast getForecast = null;
    private final com.rim.tramforecast.data.SchedulerFactory schedulerFactory = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
<<<<<<< HEAD
    public final android.databinding.ObservableBoolean isMuteNotification() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
=======
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
    public final android.databinding.ObservableField<com.rim.tramforecast.data.ForecastResponseWrapper> getForecast() {
        return null;
    }
    
    public final void setForecast(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<com.rim.tramforecast.data.ForecastResponseWrapper> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<com.rim.tramforecast.data.DirectionResponse> getDirections() {
        return null;
    }
    
    public final void setDirections(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<com.rim.tramforecast.data.DirectionResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
<<<<<<< HEAD
    public final android.databinding.ObservableField<com.rim.tramforecast.data.DirectionResponse> getDirectionsOutbound() {
        return null;
    }
    
    public final void setDirectionsOutbound(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<com.rim.tramforecast.data.DirectionResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
=======
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
    public final android.databinding.ObservableList<com.rim.tramforecast.data.TramDetails> getTrams() {
        return null;
    }
    
<<<<<<< HEAD
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableList<com.rim.tramforecast.data.TramDetails> getTramsOutbound() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.media.MediaPlayer getPlayer() {
        return null;
    }
    
    public final void setPlayer(@org.jetbrains.annotations.NotNull()
    android.media.MediaPlayer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getAppContext() {
        return null;
    }
    
    public final void setAppContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<kotlin.Unit> getOnErrorLoadingForecast() {
        return null;
    }
    
    public final void onQueryTimeUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.String stop) {
    }
    
    public final void toggleNotification() {
    }
    
    public final void loadForecast(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void playTramSound() {
=======
    public final void onQueryTimeUpdate() {
    }
    
    public final void loadForecast() {
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
    }
    
    private final void updateForecastDetails(com.rim.tramforecast.api.Success<com.rim.tramforecast.data.ForecastResponseWrapper> result) {
    }
    
    @javax.inject.Inject()
    public ForecastViewModel(@org.jetbrains.annotations.NotNull()
    com.rim.tramforecast.data.ForecastRepositoryConnector forecastRepository, @org.jetbrains.annotations.NotNull()
    com.rim.tramforecast.data.GetForecast getForecast, @org.jetbrains.annotations.NotNull()
    com.rim.tramforecast.data.SchedulerFactory schedulerFactory) {
        super();
    }
}