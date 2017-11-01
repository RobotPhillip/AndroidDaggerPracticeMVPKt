package com.robotsandpencils.androiddaggerpracticemvp.lobby;

/**
 * Created by pwray on 2017-11-01.
 */

interface LobbyGreetingContract {
    interface LobbyView {
        // button events
        void onCommonGreetingButtonClicked();
        void onLobbyGreetingButtonClicked();

        // greeting text actions
        void displayGreeting(String greeting);
        void hideGreeting();

        // greeting error actions
        void displayGreetingError(Throwable throwable);

        // loading indicator actions
        void setLoadingIndicator(boolean active);
    }

    interface LobbyPresenter {
        void loadCommonGreeting();
        void loadLobbyGreeting();
    }
}
