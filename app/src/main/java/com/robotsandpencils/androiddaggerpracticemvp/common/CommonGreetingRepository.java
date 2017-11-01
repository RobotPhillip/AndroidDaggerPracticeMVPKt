package com.robotsandpencils.androiddaggerpracticemvp.common;

import io.reactivex.Single;

/**
 * Created by pwray on 2017-11-01.
 */

public class CommonGreetingRepository {
    public Single<String> getGreeting() {
        return Single.just("Hello from CommonGreetingRepository");
    }
}
