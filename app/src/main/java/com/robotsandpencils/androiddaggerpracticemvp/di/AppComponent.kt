package com.robotsandpencils.androiddaggerpracticemvp.di

/**
 * Created by pwray on 2017-11-01.
 */

import com.robotsandpencils.androiddaggerpracticemvp.App

import javax.inject.Singleton

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@Singleton
@Component(modules = arrayOf(
        /* Use AndroidInjectionModule.class if you're not using support library */
        AndroidSupportInjectionModule::class, AppModule::class, BuildersModule::class))
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}