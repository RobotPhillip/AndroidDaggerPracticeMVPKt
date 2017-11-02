package com.robotsandpencils.androiddaggerpracticemvp.lobby

import io.reactivex.Single

/**
 * Created by pwray on 2017-11-01.
 */

internal class LobbyGreetingRepository {
    val greeting: Single<String>
        get() = Single.just("Hello from LobbyGreetingRepository")
}
