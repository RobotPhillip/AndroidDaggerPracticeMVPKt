package com.robotsandpencils.androiddaggerpracticemvp.lobby;

import io.reactivex.Single;

/**
 * Created by pwray on 2017-11-01.
 */

class LobbyGreetingRepository {
    Single<String> getGreeting() {
        return Single.just("Hello from LobbyGreetingRepository");
    }
}
