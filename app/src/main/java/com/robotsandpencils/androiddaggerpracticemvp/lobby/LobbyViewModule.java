package com.robotsandpencils.androiddaggerpracticemvp.lobby;

import dagger.Binds;
import dagger.Module;

/**
 * Created by pwray on 2017-11-01.
 */
@Module
public abstract class LobbyViewModule {

    @Binds
    abstract LobbyGreetingContract.LobbyView provideLobbyView(LobbyActivity lobbyActivity);
}
