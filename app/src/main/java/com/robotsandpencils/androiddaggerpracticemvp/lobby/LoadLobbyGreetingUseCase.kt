package com.robotsandpencils.androiddaggerpracticemvp.lobby

import javax.inject.Inject

import io.reactivex.Single

/**
 * Created by pwray on 2017-11-01.
 *
 * The use case acts as an interactor.
 * The use case is implemented as a Command Pattern.
 */

class LoadLobbyGreetingUseCase @Inject
internal constructor(private val greetingRepository: LobbyGreetingRepository) {

    fun execute(): Single<String> {
        return greetingRepository.greeting
    }
}
