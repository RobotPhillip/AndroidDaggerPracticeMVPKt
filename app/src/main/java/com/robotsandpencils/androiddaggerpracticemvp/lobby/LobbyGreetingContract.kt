package com.robotsandpencils.androiddaggerpracticemvp.lobby

/**
 * Created by pwray on 2017-11-01.
 */

internal interface LobbyGreetingContract {
    interface LobbyView {
        // button events
        fun onCommonGreetingButtonClicked()

        fun onLobbyGreetingButtonClicked()

        // greeting text actions
        fun displayGreeting(greeting: String)

        fun hideGreeting()

        // greeting error actions
        fun displayGreetingError(throwable: Throwable)

        // loading indicator actions
        fun setLoadingIndicator(active: Boolean)
    }

    interface LobbyPresenter {
        fun loadCommonGreeting()
        fun loadLobbyGreeting()
    }
}
