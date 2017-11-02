package com.robotsandpencils.androiddaggerpracticemvp.common

import io.reactivex.Single

/**
 * Created by pwray on 2017-11-01.
 */

class CommonGreetingRepository {
    val greeting: Single<String>
        get() = Single.just("Hello from CommonGreetingRepository")
}
