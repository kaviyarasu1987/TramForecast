package com.rim.tramforecast.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/rim/tramforecast/data/SchedulerFactoryImpl;", "Lcom/rim/tramforecast/data/SchedulerFactory;", "()V", "ioScheduler", "Lio/reactivex/Scheduler;", "getIoScheduler", "()Lio/reactivex/Scheduler;", "mainScheduler", "getMainScheduler", "app_debug"})
public final class SchedulerFactoryImpl implements com.rim.tramforecast.data.SchedulerFactory {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Scheduler mainScheduler = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Scheduler ioScheduler = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler getMainScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler getIoScheduler() {
        return null;
    }
    
    public SchedulerFactoryImpl() {
        super();
    }
}