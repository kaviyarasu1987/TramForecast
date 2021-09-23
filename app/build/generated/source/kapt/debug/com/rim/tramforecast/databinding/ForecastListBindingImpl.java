package com.rim.tramforecast.databinding;
import com.rim.tramforecast.R;
import com.rim.tramforecast.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ForecastListBindingImpl extends ForecastListBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.showdescriptioncontenttitle, 4);
        sViewsWithIds.put(R.id.text_layout, 5);
        sViewsWithIds.put(R.id.due, 6);
        sViewsWithIds.put(R.id.destination, 7);
        sViewsWithIds.put(R.id.refresh, 8);
        sViewsWithIds.put(R.id.refreshtext, 9);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ForecastListBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ForecastListBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.support.v4.widget.SwipeRefreshLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[5]
            , (android.support.v7.widget.RecyclerView) bindings[3]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.stopview.setTag(null);
        this.swipeRefreshLayout.setTag(null);
        this.tramView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.tramItemBinding == variableId) {
            setTramItemBinding((me.tatarka.bindingcollectionadapter2.ItemBinding) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.rim.tramforecast.data.ForecastViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTramItemBinding(@Nullable me.tatarka.bindingcollectionadapter2.ItemBinding TramItemBinding) {
        this.mTramItemBinding = TramItemBinding;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.tramItemBinding);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.rim.tramforecast.data.ForecastViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTrams((android.databinding.ObservableList<com.rim.tramforecast.data.TramDetails>) object, fieldId);
            case 1 :
                return onChangeViewModelDirections((android.databinding.ObservableField<com.rim.tramforecast.data.DirectionResponse>) object, fieldId);
            case 2 :
                return onChangeViewModelForecast((android.databinding.ObservableField<com.rim.tramforecast.data.ForecastResponseWrapper>) object, fieldId);
            case 3 :
                return onChangeViewModelIsLoading((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTrams(android.databinding.ObservableList<com.rim.tramforecast.data.TramDetails> ViewModelTrams, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDirections(android.databinding.ObservableField<com.rim.tramforecast.data.DirectionResponse> ViewModelDirections, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelForecast(android.databinding.ObservableField<com.rim.tramforecast.data.ForecastResponseWrapper> ViewModelForecast, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(android.databinding.ObservableBoolean ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelDirectionsName = null;
        android.databinding.ObservableList<com.rim.tramforecast.data.TramDetails> viewModelTrams = null;
        android.databinding.ObservableField<com.rim.tramforecast.data.DirectionResponse> viewModelDirections = null;
        android.databinding.ObservableField<com.rim.tramforecast.data.ForecastResponseWrapper> viewModelForecast = null;
        me.tatarka.bindingcollectionadapter2.ItemBinding tramItemBinding = mTramItemBinding;
        boolean viewModelIsLoadingGet = false;
        com.rim.tramforecast.data.ForecastResponseWrapper viewModelForecastGet = null;
        java.lang.String viewModelForecastStopJavaLangString = null;
        com.rim.tramforecast.data.DirectionResponse viewModelDirectionsGet = null;
        java.lang.String viewModelForecastStopJavaLangStringViewModelDirectionsName = null;
        java.lang.String viewModelForecastStop = null;
        android.databinding.ObservableBoolean viewModelIsLoading = null;
        com.rim.tramforecast.data.ForecastViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x71L) != 0) {
        }
        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x71L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.trams
                        viewModelTrams = viewModel.getTrams();
                    }
                    updateRegistration(0, viewModelTrams);
            }
            if ((dirtyFlags & 0x66L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.directions
                        viewModelDirections = viewModel.getDirections();
                        // read viewModel.forecast
                        viewModelForecast = viewModel.getForecast();
                    }
                    updateRegistration(1, viewModelDirections);
                    updateRegistration(2, viewModelForecast);


                    if (viewModelDirections != null) {
                        // read viewModel.directions.get()
                        viewModelDirectionsGet = viewModelDirections.get();
                    }
                    if (viewModelForecast != null) {
                        // read viewModel.forecast.get()
                        viewModelForecastGet = viewModelForecast.get();
                    }


                    if (viewModelDirectionsGet != null) {
                        // read viewModel.directions.get().name
                        viewModelDirectionsName = viewModelDirectionsGet.getName();
                    }
                    if (viewModelForecastGet != null) {
                        // read viewModel.forecast.get().stop
                        viewModelForecastStop = viewModelForecastGet.getStop();
                    }


                    // read (viewModel.forecast.get().stop) + (" ")
                    viewModelForecastStopJavaLangString = (viewModelForecastStop) + (" ");


                    // read ((viewModel.forecast.get().stop) + (" ")) + (viewModel.directions.get().name)
                    viewModelForecastStopJavaLangStringViewModelDirectionsName = (viewModelForecastStopJavaLangString) + (viewModelDirectionsName);
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading
                        viewModelIsLoading = viewModel.isLoading();
                    }
                    updateRegistration(3, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading.get()
                        viewModelIsLoadingGet = viewModelIsLoading.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x66L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.stopview, viewModelForecastStopJavaLangStringViewModelDirectionsName);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            com.rim.tramforecast.data.SwipeRefreshLayoutBindings.setRefreshing(this.swipeRefreshLayout, viewModelIsLoadingGet);
        }
        if ((dirtyFlags & 0x71L) != 0) {
            // api target 1

            me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapters.setAdapter(this.tramView, tramItemBinding, viewModelTrams, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter)null, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter.ItemIds)null, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter.ViewHolderFactory)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.trams
        flag 1 (0x2L): viewModel.directions
        flag 2 (0x3L): viewModel.forecast
        flag 3 (0x4L): viewModel.isLoading
        flag 4 (0x5L): tramItemBinding
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}