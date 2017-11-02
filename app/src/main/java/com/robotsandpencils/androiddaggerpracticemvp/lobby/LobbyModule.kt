package com.robotsandpencils.androiddaggerpracticemvp.lobby

import com.robotsandpencils.androiddaggerpracticemvp.common.LoadCommonGreetingUseCase
import com.robotsandpencils.androiddaggerpracticemvp.rx.SchedulersFacade

import dagger.Module
import dagger.Provides

/**
 * Define LobbyActivity-specific dependencies here.
 */
@Module
class LobbyModule {

    @Provides
    internal fun provideLobbyGreetingRepository(): LobbyGreetingRepository {
        return LobbyGreetingRepository()
    }

    @Provides
    internal fun provideLobbyPresenter(lobbyView: LobbyGreetingContract.LobbyView,
                                       loadCommonGreetingUseCase: LoadCommonGreetingUseCase,
                                       loadLobbyGreetingUseCase: LoadLobbyGreetingUseCase,
                                       schedulersFacade: SchedulersFacade): LobbyPresenter {
        return LobbyPresenter(lobbyView, loadCommonGreetingUseCase, loadLobbyGreetingUseCase, schedulersFacade)
    }
}