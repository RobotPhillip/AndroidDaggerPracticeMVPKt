package com.robotsandpencils.androiddaggerpracticemvp.rx;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SchedulersFacade_Factory implements Factory<SchedulersFacade> {
  private static final SchedulersFacade_Factory INSTANCE = new SchedulersFacade_Factory();

  @Override
  public SchedulersFacade get() {
    return new SchedulersFacade();
  }

  public static Factory<SchedulersFacade> create() {
    return INSTANCE;
  }
}
