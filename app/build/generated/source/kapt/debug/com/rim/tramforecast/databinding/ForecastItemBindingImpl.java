package com.rim.tramforecast.databinding;
import com.rim.tramforecast.R;
import com.rim.tramforecast.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ForecastItemBindingImpl extends ForecastItemBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.forecastitem, 4);
        sViewsWithIds.put(R.id.minuteitem, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ForecastItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ForecastItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.actualminutes.setTag(null);
        this.destination.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.minutes.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.rim.tramforecast.data.TramDetails) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.rim.tramforecast.data.TramDetails ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String viewModelDueMins = null;
        java.lang.String viewModelDestination = null;
        boolean viewModelDueMinsEqualsJavaLangStringDUE = false;
        com.rim.tramforecast.data.TramDetails viewModel = mViewModel;
        java.lang.String viewModelDueMinsEqualsJavaLangStringDUEJavaLangStringJavaLangStringMinutes = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.dueMins
                    viewModelDueMins = viewModel.getDueMins();
                    // read viewModel.destination
                    viewModelDestination = viewModel.getDestination();
                }


                if (viewModelDueMins != null) {
                    // read viewModel.dueMins.equals("DUE")
                    viewModelDueMinsEqualsJavaLangStringDUE = viewModelDueMins.equals("DUE");
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelDueMinsEqualsJavaLangStringDUE) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read viewModel.dueMins.equals("DUE") ? "" : "Minutes"
                viewModelDueMinsEqualsJavaLangStringDUEJavaLangStringJavaLangStringMinutes = ((viewModelDueMinsEqualsJavaLangStringDUE) ? ("") : ("Minutes"));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.actualminutes, viewModelDueMins);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.destination, viewModelDestination);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.minutes, viewModelDueMinsEqualsJavaLangStringDUEJavaLangStringJavaLangStringMinutes);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
        flag 2 (0x3L): viewModel.dueMins.equals("DUE") ? "" : "Minutes"
        flag 3 (0x4L): viewModel.dueMins.equals("DUE") ? "" : "Minutes"
    flag mapping end*/
    //end
}