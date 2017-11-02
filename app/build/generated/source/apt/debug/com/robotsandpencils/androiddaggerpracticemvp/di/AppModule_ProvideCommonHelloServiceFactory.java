package com.robotsandpencils.androiddaggerpracticemvp.di;

import com.robotsandpencils.androiddaggerpracticemvp.common.CommonGreetingRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideCommonHelloServiceFactory
    implements Factory<CommonGreetingRepository> {
  private final AppModule module;

  public AppModule_ProvideCommonHelloServiceFactory(AppModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CommonGreetingRepository get() {
    return Preconditions.checkNotNull(
        module.provideCommonHelloService(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CommonGreetingRepository> create(AppModule module) {
    return new AppModule_ProvideCommonHelloServiceFactory(module);
  }

  /** Proxies {@link AppModule#provideCommonHelloService()}. */
  public static CommonGreetingRepository proxyProvideCommonHelloService(AppModule instance) {
    return instance.provideCommonHelloService();
  }
}
