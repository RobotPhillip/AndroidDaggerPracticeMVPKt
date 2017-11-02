package com.robotsandpencils.androiddaggerpracticemvp.di

/**
 * Created by pwray on 2017-11-01.
 */

import android.content.Context

import com.robotsandpencils.androiddaggerpracticemvp.App
import com.robotsandpencils.androiddaggerpracticemvp.common.CommonGreetingRepository

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

/**
 * This is where you will inject application-wide dependencies.
 */
@Module
class AppModule {

    @Provides
    internal fun provideContext(application: App): Context {
        return application.applicationContext
    }

    @Singleton
    @Provides
    internal fun provideCommonHelloService(): CommonGreetingRepository {
        return CommonGreetingRepository()
    }
}