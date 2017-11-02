package com.robotsandpencils.androiddaggerpracticemvp.lobby

import dagger.Binds
import dagger.Module

/**
 * Created by pwray on 2017-11-01.
 */
@Module
abstract class LobbyViewModule {

    @Binds
    internal abstract fun provideLobbyView(lobbyActivity: LobbyActivity): LobbyGreetingContract.LobbyView
}
