package com.robotsandpencils.androiddaggerpracticemvp.di;

import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyActivity;
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyModule;
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyViewModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by pwray on 2017-11-01.
 */
@Module
public abstract class BuildersModule {

    @ContributesAndroidInjector(modules = {LobbyViewModule.class, LobbyModule.class})
    abstract LobbyActivity bindLobbyActivity();

    // Add bindings for other sub-components here
}
