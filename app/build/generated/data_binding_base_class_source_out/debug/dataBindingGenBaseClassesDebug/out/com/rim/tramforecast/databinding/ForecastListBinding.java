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
import android.widget.TextView;
import com.rim.tramforecast.data.ForecastViewModel;
import java.lang.Deprecated;
import java.lang.Object;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public abstract class ForecastListBinding extends ViewDataBinding {
  @NonNull
  public final TextView destination;

  @NonNull
  public final TextView due;

  @NonNull
  public final Button refresh;

  @NonNull
  public final TextView refreshtext;

  @NonNull
  public final LinearLayout showdescriptioncontenttitle;

  @NonNull
  public final TextView stopview;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  @NonNull
  public final LinearLayout textLayout;

  @NonNull
  public final RecyclerView tramView;

  @Bindable
  protected ForecastViewModel mViewModel;

  @Bindable
  protected ItemBinding mTramItemBinding;

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
