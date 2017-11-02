package com.robotsandpencils.androiddaggerpracticemvp.common

import javax.inject.Inject

import io.reactivex.Single

/**
 * Created by pwray on 2017-11-01.
 *
 * The use case acts as an interactor.
 * The use case is implemented as a Command Pattern.
 */

class LoadCommonGreetingUseCase @Inject
internal constructor(private val greetingRepository: CommonGreetingRepository) {

    fun execute(): Single<String> {
        return greetingRepository.greeting
    }
}
