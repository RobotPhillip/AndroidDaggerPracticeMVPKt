package com.robotsandpencils.androiddaggerpracticemvp.common;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoadCommonGreetingUseCase_Factory implements Factory<LoadCommonGreetingUseCase> {
  private final Provider<CommonGreetingRepository> greetingRepositoryProvider;

  public LoadCommonGreetingUseCase_Factory(
      Provider<CommonGreetingRepository> greetingRepositoryProvider) {
    assert greetingRepositoryProvider != null;
    this.greetingRepositoryProvider = greetingRepositoryProvider;
  }

  @Override
  public LoadCommonGreetingUseCase get() {
    return new LoadCommonGreetingUseCase(greetingRepositoryProvider.get());
  }

  public static Factory<LoadCommonGreetingUseCase> create(
      Provider<CommonGreetingRepository> greetingRepositoryProvider) {
    return new LoadCommonGreetingUseCase_Factory(greetingRepositoryProvider);
  }

  /**
   * Proxies {@link LoadCommonGreetingUseCase#LoadCommonGreetingUseCase(CommonGreetingRepository)}.
   */
  public static LoadCommonGreetingUseCase newLoadCommonGreetingUseCase(
      CommonGreetingRepository greetingRepository) {
    return new LoadCommonGreetingUseCase(greetingRepository);
  }
}
