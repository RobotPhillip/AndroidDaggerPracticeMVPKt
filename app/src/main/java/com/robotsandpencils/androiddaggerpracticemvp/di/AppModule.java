package com.robotsandpencils.androiddaggerpracticemvp.di;

/**
 * Created by pwray on 2017-11-01.
 */

import android.content.Context;

import com.robotsandpencils.androiddaggerpracticemvp.App;
import com.robotsandpencils.androiddaggerpracticemvp.common.CommonGreetingRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * This is where you will inject application-wide dependencies.
 */
@Module
public class AppModule {

    @Provides
    Context provideContext(App application) {
        return application.getApplicationContext();
    }

    @Singleton
    @Provides
    CommonGreetingRepository provideCommonHelloService() {
        return new CommonGreetingRepository();
    }
}