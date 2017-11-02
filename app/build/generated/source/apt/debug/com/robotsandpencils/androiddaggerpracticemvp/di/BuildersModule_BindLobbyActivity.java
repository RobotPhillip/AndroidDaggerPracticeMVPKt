package com.robotsandpencils.androiddaggerpracticemvp.di;

import android.app.Activity;
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyActivity;
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyModule;
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyViewModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = BuildersModule_BindLobbyActivity.LobbyActivitySubcomponent.class)
public abstract class BuildersModule_BindLobbyActivity {
  private BuildersModule_BindLobbyActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(LobbyActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      LobbyActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {LobbyViewModule.class, LobbyModule.class})
  public interface LobbyActivitySubcomponent extends AndroidInjector<LobbyActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LobbyActivity> {}
  }
}
