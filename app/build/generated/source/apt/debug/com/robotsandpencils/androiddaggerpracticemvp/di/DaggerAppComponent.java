package com.robotsandpencils.androiddaggerpracticemvp.di;

import android.app.Activity;
import com.robotsandpencils.androiddaggerpracticemvp.App;
import com.robotsandpencils.androiddaggerpracticemvp.App_MembersInjector;
import com.robotsandpencils.androiddaggerpracticemvp.common.CommonGreetingRepository;
import com.robotsandpencils.androiddaggerpracticemvp.common.LoadCommonGreetingUseCase;
import com.robotsandpencils.androiddaggerpracticemvp.common.LoadCommonGreetingUseCase_Factory;
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LoadLobbyGreetingUseCase;
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LoadLobbyGreetingUseCase_Factory;
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyActivity;
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyActivity_MembersInjector;
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyModule;
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyModule_ProvideLobbyGreetingRepositoryFactory;
import com.robotsandpencils.androiddaggerpracticemvp.lobby.LobbyModule_ProvideLobbyPresenterFactory;
import com.robotsandpencils.androiddaggerpracticemvp.rx.SchedulersFacade_Factory;
import dagger.MembersInjector;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<BuildersModule_BindLobbyActivity.LobbyActivitySubcomponent.Builder>
      lobbyActivitySubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Activity>> bindAndroidInjectorFactoryProvider;

  private Provider<
          Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>>
      mapOfClassOfAndProviderOfFactoryOfProvider;

  private Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider;

  private MembersInjector<App> appMembersInjector;

  private Provider<CommonGreetingRepository> provideCommonHelloServiceProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.lobbyActivitySubcomponentBuilderProvider =
        new dagger.internal.Factory<
            BuildersModule_BindLobbyActivity.LobbyActivitySubcomponent.Builder>() {
          @Override
          public BuildersModule_BindLobbyActivity.LobbyActivitySubcomponent.Builder get() {
            return new LobbyActivitySubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider = (Provider) lobbyActivitySubcomponentBuilderProvider;

    this.mapOfClassOfAndProviderOfFactoryOfProvider =
        MapProviderFactory
            .<Class<? extends Activity>, AndroidInjector.Factory<? extends Activity>>builder(1)
            .put(LobbyActivity.class, bindAndroidInjectorFactoryProvider)
            .build();

    this.dispatchingAndroidInjectorProvider =
        DispatchingAndroidInjector_Factory.create(mapOfClassOfAndProviderOfFactoryOfProvider);

    this.appMembersInjector = App_MembersInjector.create(dispatchingAndroidInjectorProvider);

    this.provideCommonHelloServiceProvider =
        DoubleCheck.provider(AppModule_ProvideCommonHelloServiceFactory.create(builder.appModule));
  }

  @Override
  public void inject(App app) {
    appMembersInjector.injectMembers(app);
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    private App application;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (application == null) {
        throw new IllegalStateException(App.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(App application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class LobbyActivitySubcomponentBuilder
      extends BuildersModule_BindLobbyActivity.LobbyActivitySubcomponent.Builder {
    private LobbyModule lobbyModule;

    private LobbyActivity seedInstance;

    @Override
    public BuildersModule_BindLobbyActivity.LobbyActivitySubcomponent build() {
      if (lobbyModule == null) {
        this.lobbyModule = new LobbyModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(LobbyActivity.class.getCanonicalName() + " must be set");
      }
      return new LobbyActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(LobbyActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class LobbyActivitySubcomponentImpl
      implements BuildersModule_BindLobbyActivity.LobbyActivitySubcomponent {
    private Provider<LobbyActivity> seedInstanceProvider;

    @SuppressWarnings("rawtypes")
    private Provider provideLobbyViewProvider;

    private Provider<LoadCommonGreetingUseCase> loadCommonGreetingUseCaseProvider;

    @SuppressWarnings("rawtypes")
    private Provider provideLobbyGreetingRepositoryProvider;

    private Provider<LoadLobbyGreetingUseCase> loadLobbyGreetingUseCaseProvider;

    @SuppressWarnings("rawtypes")
    private Provider provideLobbyPresenterProvider;

    private MembersInjector<LobbyActivity> lobbyActivityMembersInjector;

    private LobbyActivitySubcomponentImpl(LobbyActivitySubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final LobbyActivitySubcomponentBuilder builder) {

      this.seedInstanceProvider = InstanceFactory.create(builder.seedInstance);

      this.provideLobbyViewProvider = (Provider) seedInstanceProvider;

      this.loadCommonGreetingUseCaseProvider =
          LoadCommonGreetingUseCase_Factory.create(
              DaggerAppComponent.this.provideCommonHelloServiceProvider);

      this.provideLobbyGreetingRepositoryProvider =
          LobbyModule_ProvideLobbyGreetingRepositoryFactory.create(builder.lobbyModule);

      this.loadLobbyGreetingUseCaseProvider =
          LoadLobbyGreetingUseCase_Factory.create(provideLobbyGreetingRepositoryProvider);

      this.provideLobbyPresenterProvider =
          LobbyModule_ProvideLobbyPresenterFactory.create(
              builder.lobbyModule,
              provideLobbyViewProvider,
              loadCommonGreetingUseCaseProvider,
              loadLobbyGreetingUseCaseProvider,
              SchedulersFacade_Factory.create());

      this.lobbyActivityMembersInjector =
          LobbyActivity_MembersInjector.create(provideLobbyPresenterProvider);
    }

    @Override
    public void inject(LobbyActivity arg0) {
      lobbyActivityMembersInjector.injectMembers(arg0);
    }
  }
}
