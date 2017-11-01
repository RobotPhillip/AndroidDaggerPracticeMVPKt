package com.robotsandpencils.androiddaggerpracticemvp.lobby;

import javax.inject.Inject;

import io.reactivex.Single;

/**
 * Created by pwray on 2017-11-01.
 *
 * The use case acts as an interactor.
 * The use case is implemented as a Command Pattern.
 */

public class LoadLobbyGreetingUseCase {

    private final LobbyGreetingRepository greetingRepository;

    @Inject
    LoadLobbyGreetingUseCase(LobbyGreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    Single<String> execute() {
        return greetingRepository.getGreeting();
    }
}
