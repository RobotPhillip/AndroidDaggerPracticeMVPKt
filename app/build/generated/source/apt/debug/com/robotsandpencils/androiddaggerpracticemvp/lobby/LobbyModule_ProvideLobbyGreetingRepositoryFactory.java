package com.robotsandpencils.androiddaggerpracticemvp.lobby;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LobbyModule_ProvideLobbyGreetingRepositoryFactory
    implements Factory<LobbyGreetingRepository> {
  private final LobbyModule module;

  public LobbyModule_ProvideLobbyGreetingRepositoryFactory(LobbyModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LobbyGreetingRepository get() {
    return Preconditions.checkNotNull(
        module.provideLobbyGreetingRepository(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LobbyGreetingRepository> create(LobbyModule module) {
    return new LobbyModule_ProvideLobbyGreetingRepositoryFactory(module);
  }

  /** Proxies {@link LobbyModule#provideLobbyGreetingRepository()}. */
  public static LobbyGreetingRepository proxyProvideLobbyGreetingRepository(LobbyModule instance) {
    return instance.provideLobbyGreetingRepository();
  }
}
