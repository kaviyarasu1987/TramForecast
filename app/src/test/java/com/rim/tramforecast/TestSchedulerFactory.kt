package com.rim.tramforecast

import com.rim.tramforecast.data.SchedulerFactory
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers


class TestSchedulerFactory : SchedulerFactory {
  override val mainScheduler: Scheduler
    get() = Schedulers.trampoline()

  override val ioScheduler: Scheduler
    get() = Schedulers.trampoline()
}
