package com.rim.tramforecast.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\nR&\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lcom/rim/tramforecast/data/ForecastResponseWrapper;", "", "created", "", "stop", "stopAbv", "message", "DirectionList", "", "Lcom/rim/tramforecast/data/DirectionResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDirectionList", "()Ljava/util/List;", "setDirectionList", "(Ljava/util/List;)V", "getCreated", "()Ljava/lang/String;", "setCreated", "(Ljava/lang/String;)V", "getMessage", "setMessage", "getStop", "setStop", "getStopAbv", "setStopAbv", "app_debug"})
@org.simpleframework.xml.Root(name = "stopInfo", strict = false)
public final class ForecastResponseWrapper {
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "created")
    private java.lang.String created;
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Attribute(name = "stop")
    private java.lang.String stop;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "stopAbv")
    private java.lang.String stopAbv;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Element(name = "message")
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.ElementList(entry = "direction", inline = true, required = false)
    private java.util.List<com.rim.tramforecast.data.DirectionResponse> DirectionList;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreated() {
        return null;
    }
    
    public final void setCreated(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStop() {
        return null;
    }
    
    public final void setStop(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStopAbv() {
        return null;
    }
    
    public final void setStopAbv(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.rim.tramforecast.data.DirectionResponse> getDirectionList() {
        return null;
    }
    
    public final void setDirectionList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.rim.tramforecast.data.DirectionResponse> p0) {
    }
    
    public ForecastResponseWrapper(@org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "created")
    java.lang.String created, @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Attribute(name = "stop")
    java.lang.String stop, @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "stopAbv")
    java.lang.String stopAbv, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.util.List<com.rim.tramforecast.data.DirectionResponse> DirectionList) {
        super();
    }
    
    public ForecastResponseWrapper(@org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "created")
    java.lang.String created, @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Attribute(name = "stop")
    java.lang.String stop, @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "stopAbv")
    java.lang.String stopAbv, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        super();
    }
    
    public ForecastResponseWrapper(@org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "created")
    java.lang.String created, @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Attribute(name = "stop")
    java.lang.String stop, @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "stopAbv")
    java.lang.String stopAbv) {
        super();
    }
    
    public ForecastResponseWrapper(@org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "created")
    java.lang.String created, @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Attribute(name = "stop")
    java.lang.String stop) {
        super();
    }
    
    public ForecastResponseWrapper(@org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "created")
    java.lang.String created) {
        super();
    }
    
    public ForecastResponseWrapper() {
        super();
    }
}