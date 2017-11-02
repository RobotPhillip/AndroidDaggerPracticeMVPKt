package com.robotsandpencils.androiddaggerpracticemvp.lobby;

import com.robotsandpencils.androiddaggerpracticemvp.common.LoadCommonGreetingUseCase;
import com.robotsandpencils.androiddaggerpracticemvp.mvp.BasePresenter;
import com.robotsandpencils.androiddaggerpracticemvp.rx.SchedulersFacade;

import io.reactivex.Single;

/**
 * Created by pwray on 2017-11-01.
 */

public class LobbyPresenter extends BasePresenter<LobbyGreetingContract.LobbyView> implements LobbyGreetingContract.LobbyPresenter {

    private final LoadCommonGreetingUseCase loadCommonGreetingUseCase;

    private final LoadLobbyGreetingUseCase loadLobbyGreetingUseCase;

    private final SchedulersFacade schedulersFacade;

    LobbyPresenter(LobbyGreetingContract.LobbyView view,
                   LoadCommonGreetingUseCase loadCommonGreetingUseCase,
                   LoadLobbyGreetingUseCase loadLobbyGreetingUseCase,
                   SchedulersFacade schedulersFacade) {
        super(view);
        this.loadCommonGreetingUseCase = loadCommonGreetingUseCase;
        this.loadLobbyGreetingUseCase = loadLobbyGreetingUseCase;
        this.schedulersFacade = schedulersFacade;
    }

    @Override
    public void loadCommonGreeting() {
        loadGreeting(loadCommonGreetingUseCase.execute());
    }

    @Override
    public void loadLobbyGreeting() {
        loadGreeting(loadLobbyGreetingUseCase.execute());
    }

    private void loadGreeting(Single<String> greetingSingle) {
        addDisposable(greetingSingle
                .subscribeOn(schedulersFacade.io())
                .observeOn(schedulersFacade.ui())
                .subscribe(view::displayGreeting, view::displayGreetingError));
    }
}
