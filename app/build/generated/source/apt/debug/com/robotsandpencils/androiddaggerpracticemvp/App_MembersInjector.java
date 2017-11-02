package com.robotsandpencils.androiddaggerpracticemvp;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider;

  public App_MembersInjector(
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    assert dispatchingAndroidInjectorProvider != null;
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<App> create(
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    return new App_MembersInjector(dispatchingAndroidInjectorProvider);
  }

  @Override
  public void injectMembers(App instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.dispatchingAndroidInjector = dispatchingAndroidInjectorProvider.get();
  }

  public static void injectDispatchingAndroidInjector(
      App instance,
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    instance.dispatchingAndroidInjector = dispatchingAndroidInjectorProvider.get();
  }
}
