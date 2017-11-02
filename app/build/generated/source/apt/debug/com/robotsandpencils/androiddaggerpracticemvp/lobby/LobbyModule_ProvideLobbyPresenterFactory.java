package com.robotsandpencils.androiddaggerpracticemvp.lobby;

import com.robotsandpencils.androiddaggerpracticemvp.common.LoadCommonGreetingUseCase;
import com.robotsandpencils.androiddaggerpracticemvp.rx.SchedulersFacade;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LobbyModule_ProvideLobbyPresenterFactory implements Factory<LobbyPresenter> {
  private final LobbyModule module;

  private final Provider<LobbyGreetingContract.LobbyView> lobbyViewProvider;

  private final Provider<LoadCommonGreetingUseCase> loadCommonGreetingUseCaseProvider;

  private final Provider<LoadLobbyGreetingUseCase> loadLobbyGreetingUseCaseProvider;

  private final Provider<SchedulersFacade> schedulersFacadeProvider;

  public LobbyModule_ProvideLobbyPresenterFactory(
      LobbyModule module,
      Provider<LobbyGreetingContract.LobbyView> lobbyViewProvider,
      Provider<LoadCommonGreetingUseCase> loadCommonGreetingUseCaseProvider,
      Provider<LoadLobbyGreetingUseCase> loadLobbyGreetingUseCaseProvider,
      Provider<SchedulersFacade> schedulersFacadeProvider) {
    assert module != null;
    this.module = module;
    assert lobbyViewProvider != null;
    this.lobbyViewProvider = lobbyViewProvider;
    assert loadCommonGreetingUseCaseProvider != null;
    this.loadCommonGreetingUseCaseProvider = loadCommonGreetingUseCaseProvider;
    assert loadLobbyGreetingUseCaseProvider != null;
    this.loadLobbyGreetingUseCaseProvider = loadLobbyGreetingUseCaseProvider;
    assert schedulersFacadeProvider != null;
    this.schedulersFacadeProvider = schedulersFacadeProvider;
  }

  @Override
  public LobbyPresenter get() {
    return Preconditions.checkNotNull(
        module.provideLobbyPresenter(
            lobbyViewProvider.get(),
            loadCommonGreetingUseCaseProvider.get(),
            loadLobbyGreetingUseCaseProvider.get(),
            schedulersFacadeProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LobbyPresenter> create(
      LobbyModule module,
      Provider<LobbyGreetingContract.LobbyView> lobbyViewProvider,
      Provider<LoadCommonGreetingUseCase> loadCommonGreetingUseCaseProvider,
      Provider<LoadLobbyGreetingUseCase> loadLobbyGreetingUseCaseProvider,
      Provider<SchedulersFacade> schedulersFacadeProvider) {
    return new LobbyModule_ProvideLobbyPresenterFactory(
        module,
        lobbyViewProvider,
        loadCommonGreetingUseCaseProvider,
        loadLobbyGreetingUseCaseProvider,
        schedulersFacadeProvider);
  }

  /**
   * Proxies {@link LobbyModule#provideLobbyPresenter(LobbyGreetingContract.LobbyView,
   * LoadCommonGreetingUseCase, LoadLobbyGreetingUseCase, SchedulersFacade)}.
   */
  public static LobbyPresenter proxyProvideLobbyPresenter(
      LobbyModule instance,
      Object lobbyView,
      LoadCommonGreetingUseCase loadCommonGreetingUseCase,
      LoadLobbyGreetingUseCase loadLobbyGreetingUseCase,
      SchedulersFacade schedulersFacade) {
    return instance.provideLobbyPresenter(
        (LobbyGreetingContract.LobbyView) lobbyView,
        loadCommonGreetingUseCase,
        loadLobbyGreetingUseCase,
        schedulersFacade);
  }
}
