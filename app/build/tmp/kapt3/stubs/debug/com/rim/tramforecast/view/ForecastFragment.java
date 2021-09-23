package com.rim.tramforecast.view;

import java.lang.System;

<<<<<<< HEAD
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u0014H\u0016J\u000e\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\'"}, d2 = {"Lcom/rim/tramforecast/view/ForecastFragment;", "Lcom/rim/tramforecast/view/DaggerFragment1;", "()V", "mAdView", "Lcom/google/android/gms/ads/AdView;", "mAppUnitId", "", "timerView", "Lcom/github/anastr/flattimelib/CountDownTimerView;", "getTimerView", "()Lcom/github/anastr/flattimelib/CountDownTimerView;", "setTimerView", "(Lcom/github/anastr/flattimelib/CountDownTimerView;)V", "viewModel", "Lcom/rim/tramforecast/data/ForecastViewModel;", "getViewModel", "()Lcom/rim/tramforecast/data/ForecastViewModel;", "setViewModel", "(Lcom/rim/tramforecast/data/ForecastViewModel;)V", "initializeBannerAd", "", "appUnitId", "context", "Landroid/content/Context;", "initializeTimer", "loadBannerAd", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "setAnimationForRefresh", "view", "Landroid/widget/Button;", "app_debug"})
=======
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/rim/tramforecast/view/ForecastFragment;", "Lcom/rim/tramforecast/view/DaggerFragment1;", "()V", "viewModel", "Lcom/rim/tramforecast/data/ForecastViewModel;", "getViewModel", "()Lcom/rim/tramforecast/data/ForecastViewModel;", "setViewModel", "(Lcom/rim/tramforecast/data/ForecastViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "setAnimationForRefresh", "view", "Landroid/widget/Button;", "app_debug"})
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
public final class ForecastFragment extends com.rim.tramforecast.view.DaggerFragment1 {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.rim.tramforecast.data.ForecastViewModel viewModel;
<<<<<<< HEAD
    @org.jetbrains.annotations.NotNull()
    public com.github.anastr.flattimelib.CountDownTimerView timerView;
    private final java.lang.String mAppUnitId = "ca-app-pub-9977175471932994/4081991951";
    private com.google.android.gms.ads.AdView mAdView;
=======
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.rim.tramforecast.data.ForecastViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.rim.tramforecast.data.ForecastViewModel p0) {
    }
    
<<<<<<< HEAD
    @org.jetbrains.annotations.NotNull()
    public final com.github.anastr.flattimelib.CountDownTimerView getTimerView() {
        return null;
    }
    
    public final void setTimerView(@org.jetbrains.annotations.NotNull()
    com.github.anastr.flattimelib.CountDownTimerView p0) {
    }
    
=======
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public final void setAnimationForRefresh(@org.jetbrains.annotations.NotNull()
    android.widget.Button view) {
    }
    
<<<<<<< HEAD
    public final void initializeTimer() {
    }
    
    private final void initializeBannerAd(java.lang.String appUnitId, android.content.Context context) {
    }
    
    private final void loadBannerAd() {
    }
    
=======
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
    public ForecastFragment() {
        super();
    }
}