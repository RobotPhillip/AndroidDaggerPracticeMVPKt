package com.robotsandpencils.androiddaggerpracticemvp.di

import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyActivity
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyModule
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyViewModule

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by pwray on 2017-11-01.
 */
@Module
abstract class BuildersModule {

    @ContributesAndroidInjector(modules = arrayOf(LobbyViewModule::class, LobbyModule::class))
    internal abstract fun bindLobbyActivity(): LobbyActivity

    // Add bindings for other sub-components here
}
