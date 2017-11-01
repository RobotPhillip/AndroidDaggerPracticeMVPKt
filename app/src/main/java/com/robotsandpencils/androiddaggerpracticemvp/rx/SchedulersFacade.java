package com.robotsandpencils.androiddaggerpracticemvp.rx;

import javax.inject.Inject;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by pwray on 2017-11-01.
 */

public class SchedulersFacade {

    @Inject
    public SchedulersFacade() {

    }

    /**
     * IO thread pool scheduler
     */
    public Scheduler io() {
        return Schedulers.io();
    }

    /**
     * Computation thread pool scheduler
     */
    public Scheduler computation() {
        return Schedulers.computation();
    }

    /**
     * Main Thread Scheduler
     */
    public Scheduler ui() {
        return AndroidSchedulers.mainThread();
    }
}
