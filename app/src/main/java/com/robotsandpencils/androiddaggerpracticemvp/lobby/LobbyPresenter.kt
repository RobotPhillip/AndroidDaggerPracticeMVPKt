package com.robotsandpencils.androiddaggerpracticemvp.lobby

import com.robotsandpencils.androiddaggerpracticemvp.common.LoadCommonGreetingUseCase
import com.robotsandpencils.androiddaggerpracticemvp.mvp.BasePresenter
import com.robotsandpencils.androiddaggerpracticemvp.rx.SchedulersFacade

import io.reactivex.Single
import io.reactivex.functions.Consumer

/**
 * Created by pwray on 2017-11-01.
 */

class LobbyPresenter internal constructor(view: LobbyGreetingContract.LobbyView,
                                          private val loadCommonGreetingUseCase: LoadCommonGreetingUseCase,
                                          private val loadLobbyGreetingUseCase: LoadLobbyGreetingUseCase,
                                          private val schedulersFacade: SchedulersFacade) : BasePresenter<LobbyGreetingContract.LobbyView>(view), LobbyGreetingContract.LobbyPresenter {

    override fun loadCommonGreeting() {
        loadGreeting(loadCommonGreetingUseCase.execute())
    }

    override fun loadLobbyGreeting() {
        loadGreeting(loadLobbyGreetingUseCase.execute())
    }

    private fun loadGreeting(greetingSingle: Single<String>) {
        addDisposable(greetingSingle
                .subscribeOn(schedulersFacade.io())
                .observeOn(schedulersFacade.ui())
                .subscribe(Consumer<String> { view.displayGreeting(it) }, Consumer<Throwable> { view.displayGreetingError(it) }))
    }
}
