package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.rim.tramforecast.DataBinderMapperImpl());
  }
}
