package com.robotsandpencils.androiddaggerpracticemvp.lobby;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoadLobbyGreetingUseCase_Factory implements Factory<LoadLobbyGreetingUseCase> {
  private final Provider<LobbyGreetingRepository> greetingRepositoryProvider;

  public LoadLobbyGreetingUseCase_Factory(
      Provider<LobbyGreetingRepository> greetingRepositoryProvider) {
    assert greetingRepositoryProvider != null;
    this.greetingRepositoryProvider = greetingRepositoryProvider;
  }

  @Override
  public LoadLobbyGreetingUseCase get() {
    return new LoadLobbyGreetingUseCase(greetingRepositoryProvider.get());
  }

  public static Factory<LoadLobbyGreetingUseCase> create(
      Provider<LobbyGreetingRepository> greetingRepositoryProvider) {
    return new LoadLobbyGreetingUseCase_Factory(greetingRepositoryProvider);
  }

  /** Proxies {@link LoadLobbyGreetingUseCase#LoadLobbyGreetingUseCase(LobbyGreetingRepository)}. */
  public static LoadLobbyGreetingUseCase newLoadLobbyGreetingUseCase(Object greetingRepository) {
    return new LoadLobbyGreetingUseCase((LobbyGreetingRepository) greetingRepository);
  }
}
