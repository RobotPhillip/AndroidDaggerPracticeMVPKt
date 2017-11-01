package com.robotsandpencils.androiddaggerpracticemvp.common;

import javax.inject.Inject;

import io.reactivex.Single;

/**
 * Created by pwray on 2017-11-01.
 *
 * The use case acts as an interactor.
 * The use case is implemented as a Command Pattern.
 */

public class LoadCommonGreetingUseCase {

    private final CommonGreetingRepository greetingRepository;

    @Inject
    LoadCommonGreetingUseCase(CommonGreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Single<String> execute() {
        return greetingRepository.getGreeting();
    }
}
