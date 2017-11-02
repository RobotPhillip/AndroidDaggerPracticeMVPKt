package com.robotsandpencils.androiddaggerpracticemvp.lobby;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LobbyActivity_MembersInjector implements MembersInjector<LobbyActivity> {
  private final Provider<LobbyPresenter> presenterProvider;

  public LobbyActivity_MembersInjector(Provider<LobbyPresenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<LobbyActivity> create(Provider<LobbyPresenter> presenterProvider) {
    return new LobbyActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(LobbyActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }

  public static void injectPresenter(
      LobbyActivity instance, Provider<LobbyPresenter> presenterProvider) {
    instance.presenter = presenterProvider.get();
  }
}
