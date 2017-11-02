package com.robotsandpencils.androiddaggerpracticemvp.lobby;

import com.robotsandpencils.androiddaggerpracticemvp.common.LoadCommonGreetingUseCase;
import com.robotsandpencils.androiddaggerpracticemvp.rx.SchedulersFacade;

import dagger.Module;
import dagger.Provides;

/**
 * Define LobbyActivity-specific dependencies here.
 */
@Module
public class LobbyModule {

    @Provides
    LobbyGreetingRepository provideLobbyGreetingRepository() {
        return new LobbyGreetingRepository();
    }

    @Provides
    LobbyPresenter provideLobbyPresenter(LobbyGreetingContract.LobbyView lobbyView,
                                         LoadCommonGreetingUseCase loadCommonGreetingUseCase,
                                         LoadLobbyGreetingUseCase loadLobbyGreetingUseCase,
                                         SchedulersFacade schedulersFacade) {
        return new LobbyPresenter(lobbyView, loadCommonGreetingUseCase, loadLobbyGreetingUseCase, schedulersFacade);
    }
}