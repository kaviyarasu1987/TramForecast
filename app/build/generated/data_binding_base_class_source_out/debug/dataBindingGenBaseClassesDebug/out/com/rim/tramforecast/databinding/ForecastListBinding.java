package com.rim.tramforecast.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
<<<<<<< HEAD
import android.widget.Spinner;
import android.widget.TextView;
import com.github.anastr.flattimelib.CountDownTimerView;
import com.google.android.gms.ads.AdView;
=======
import android.widget.TextView;
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
import com.rim.tramforecast.data.ForecastViewModel;
import java.lang.Deprecated;
import java.lang.Object;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public abstract class ForecastListBinding extends ViewDataBinding {
  @NonNull
<<<<<<< HEAD
  public final AdView adView;

  @NonNull
  public final TextView destination;

  @NonNull
  public final TextView destinationOutbound;

  @NonNull
  public final TextView due;

  @NonNull
  public final TextView dueOutbound;

  @NonNull
  public final Button notification;
=======
  public final TextView destination;

  @NonNull
  public final TextView due;

  @NonNull
  public final Button refresh;

  @NonNull
  public final TextView refreshtext;
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7

  @NonNull
  public final LinearLayout showdescriptioncontenttitle;

  @NonNull
<<<<<<< HEAD
  public final LinearLayout showdescriptioncontenttitleinbound;

  @NonNull
  public final Spinner stops;

  @NonNull
  public final TextView stopview;

  @NonNull
  public final TextView stopviewInbound;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayoutOutbound;

  @NonNull
  public final LinearLayout textLayout;

  @NonNull
  public final LinearLayout textLayoutInbound;

  @NonNull
  public final CountDownTimerView tramDownTimer;

  @NonNull
  public final RecyclerView tramView;

  @NonNull
  public final RecyclerView tramViewOutbound;

=======
  public final TextView stopview;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  @NonNull
  public final LinearLayout textLayout;

  @NonNull
  public final RecyclerView tramView;

>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
  @Bindable
  protected ForecastViewModel mViewModel;

  @Bindable
  protected ItemBinding mTramItemBinding;

<<<<<<< HEAD
  @Bindable
  protected ItemBinding mTramItemBindingOutBound;

  protected ForecastListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AdView adView, TextView destination, TextView destinationOutbound, TextView due,
      TextView dueOutbound, Button notification, LinearLayout showdescriptioncontenttitle,
      LinearLayout showdescriptioncontenttitleinbound, Spinner stops, TextView stopview,
      TextView stopviewInbound, SwipeRefreshLayout swipeRefreshLayout,
      SwipeRefreshLayout swipeRefreshLayoutOutbound, LinearLayout textLayout,
      LinearLayout textLayoutInbound, CountDownTimerView tramDownTimer, RecyclerView tramView,
      RecyclerView tramViewOutbound) {
    super(_bindingComponent, _root, _localFieldCount);
    this.adView = adView;
    this.destination = destination;
    this.destinationOutbound = destinationOutbound;
    this.due = due;
    this.dueOutbound = dueOutbound;
    this.notification = notification;
    this.showdescriptioncontenttitle = showdescriptioncontenttitle;
    this.showdescriptioncontenttitleinbound = showdescriptioncontenttitleinbound;
    this.stops = stops;
    this.stopview = stopview;
    this.stopviewInbound = stopviewInbound;
    this.swipeRefreshLayout = swipeRefreshLayout;
    this.swipeRefreshLayoutOutbound = swipeRefreshLayoutOutbound;
    this.textLayout = textLayout;
    this.textLayoutInbound = textLayoutInbound;
    this.tramDownTimer = tramDownTimer;
    this.tramView = tramView;
    this.tramViewOutbound = tramViewOutbound;
=======
  protected ForecastListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView destination, TextView due, Button refresh, TextView refreshtext,
      LinearLayout showdescriptioncontenttitle, TextView stopview,
      SwipeRefreshLayout swipeRefreshLayout, LinearLayout textLayout, RecyclerView tramView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.destination = destination;
    this.due = due;
    this.refresh = refresh;
    this.refreshtext = refreshtext;
    this.showdescriptioncontenttitle = showdescriptioncontenttitle;
    this.stopview = stopview;
    this.swipeRefreshLayout = swipeRefreshLayout;
    this.textLayout = textLayout;
    this.tramView = tramView;
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
  }

  public abstract void setViewModel(@Nullable ForecastViewModel viewModel);

  @Nullable
  public ForecastViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setTramItemBinding(@Nullable ItemBinding tramItemBinding);

  @Nullable
  public ItemBinding getTramItemBinding() {
    return mTramItemBinding;
  }

<<<<<<< HEAD
  public abstract void setTramItemBindingOutBound(@Nullable ItemBinding tramItemBindingOutBound);

  @Nullable
  public ItemBinding getTramItemBindingOutBound() {
    return mTramItemBindingOutBound;
  }

=======
>>>>>>> 60757d28ed8f98bc9d1e79d17639ff23d430d8a7
  @NonNull
  public static ForecastListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.forecast_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ForecastListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ForecastListBinding>inflateInternal(inflater, com.rim.tramforecast.R.layout.forecast_list, root, attachToRoot, component);
  }

  @NonNull
  public static ForecastListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.forecast_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ForecastListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ForecastListBinding>inflateInternal(inflater, com.rim.tramforecast.R.layout.forecast_list, null, false, component);
  }

  public static ForecastListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ForecastListBinding bind(@NonNull View view, @Nullable Object component) {
    return (ForecastListBinding)bind(component, view, com.rim.tramforecast.R.layout.forecast_list);
  }
}
