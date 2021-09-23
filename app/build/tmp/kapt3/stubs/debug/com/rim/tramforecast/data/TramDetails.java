package com.rim.tramforecast.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/rim/tramforecast/data/TramDetails;", "", "dueMins", "", "destination", "(Ljava/lang/String;Ljava/lang/String;)V", "getDestination", "()Ljava/lang/String;", "setDestination", "(Ljava/lang/String;)V", "getDueMins", "setDueMins", "app_debug"})
@org.simpleframework.xml.Root()
public final class TramDetails {
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "dueMins")
    private java.lang.String dueMins;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "destination")
    private java.lang.String destination;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDueMins() {
        return null;
    }
    
    public final void setDueMins(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDestination() {
        return null;
    }
    
    public final void setDestination(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public TramDetails(@org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "dueMins")
    java.lang.String dueMins, @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "destination")
    java.lang.String destination) {
        super();
    }
    
    public TramDetails(@org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(name = "dueMins")
    java.lang.String dueMins) {
        super();
    }
    
    public TramDetails() {
        super();
    }
}