package com.robotsandpencils.androiddaggerpracticemvp.rx

import javax.inject.Inject

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by pwray on 2017-11-01.
 */

class SchedulersFacade @Inject
constructor() {

    /**
     * IO thread pool scheduler
     */
    fun io(): Scheduler {
        return Schedulers.io()
    }

    /**
     * Computation thread pool scheduler
     */
    fun computation(): Scheduler {
        return Schedulers.computation()
    }

    /**
     * Main Thread Scheduler
     */
    fun ui(): Scheduler {
        return AndroidSchedulers.mainThread()
    }
}
