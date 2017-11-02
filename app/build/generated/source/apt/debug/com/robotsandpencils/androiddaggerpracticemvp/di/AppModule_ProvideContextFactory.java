package com.robotsandpencils.androiddaggerpracticemvp.di;

import android.content.Context;
import com.robotsandpencils.androiddaggerpracticemvp.App;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideContextFactory implements Factory<Context> {
  private final AppModule module;

  private final Provider<App> applicationProvider;

  public AppModule_ProvideContextFactory(AppModule module, Provider<App> applicationProvider) {
    assert module != null;
    this.module = module;
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideContext(applicationProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(AppModule module, Provider<App> applicationProvider) {
    return new AppModule_ProvideContextFactory(module, applicationProvider);
  }

  /** Proxies {@link AppModule#provideContext(App)}. */
  public static Context proxyProvideContext(AppModule instance, App application) {
    return instance.provideContext(application);
  }
}
