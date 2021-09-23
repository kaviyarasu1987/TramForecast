package com.rim.tramforecast.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/rim/tramforecast/data/DirectionResponse;", "", "name", "", "tramList", "", "Lcom/rim/tramforecast/data/TramDetails;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getTramList", "()Ljava/util/List;", "setTramList", "(Ljava/util/List;)V", "app_debug"})
@org.simpleframework.xml.Root()
public final class DirectionResponse {
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Attribute(name = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.ElementList(entry = "tram", inline = true, required = false)
    private java.util.List<com.rim.tramforecast.data.TramDetails> tramList;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.rim.tramforecast.data.TramDetails> getTramList() {
        return null;
    }
    
    public final void setTramList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.rim.tramforecast.data.TramDetails> p0) {
    }
    
    public DirectionResponse(@org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Attribute(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.List<com.rim.tramforecast.data.TramDetails> tramList) {
        super();
    }
    
    public DirectionResponse(@org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Attribute(name = "name")
    java.lang.String name) {
        super();
    }
    
    public DirectionResponse() {
        super();
    }
}