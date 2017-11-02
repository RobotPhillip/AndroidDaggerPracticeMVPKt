package com.robotsandpencils.androiddaggerpracticemvp.lobby

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.view.View
import android.widget.Toast

import com.robotsandpencils.androiddaggerpracticemvp.R
import com.robotsandpencils.androiddaggerpracticemvp.databinding.LobbyActivityBinding

import javax.inject.Inject

import dagger.android.AndroidInjection
import timber.log.Timber

class LobbyActivity : AppCompatActivity(), LobbyGreetingContract.LobbyView {

    @Inject
    lateinit var presenter: LobbyPresenter

    private var binding: LobbyActivityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.lobby_activity)
        binding!!.lobbyGreetingButton.setOnClickListener { _ -> onLobbyGreetingButtonClicked() }
        binding!!.commonGreetingButton.setOnClickListener { _ -> onCommonGreetingButtonClicked() }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        if (!TextUtils.isEmpty(binding!!.greetingTextview.text)) {
            outState!!.putCharSequence(BUNDLE_DATA_KEY_GREETING, binding!!.greetingTextview.text)
        }

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        binding!!.greetingTextview.text = savedInstanceState.getCharSequence(BUNDLE_DATA_KEY_GREETING)
    }

    override fun onStop() {
        super.onStop()
        presenter.stop()
    }

    override fun onCommonGreetingButtonClicked() {
        presenter.loadCommonGreeting()
    }

    override fun onLobbyGreetingButtonClicked() {
        presenter.loadLobbyGreeting()
    }

    override fun displayGreeting(greeting: String) {
        binding!!.greetingTextview.visibility = View.VISIBLE
        binding!!.greetingTextview.text = greeting
    }

    override fun hideGreeting() {
        binding!!.greetingTextview.visibility = View.GONE
    }

    override fun displayGreetingError(throwable: Throwable) {
        Timber.e(throwable.message)
        Toast.makeText(this, R.string.greeting_error, Toast.LENGTH_SHORT).show()
    }

    override fun setLoadingIndicator(active: Boolean) {
        binding!!.loadingIndicator.visibility = if (active) View.VISIBLE else View.GONE
    }

    companion object {

        private val BUNDLE_DATA_KEY_GREETING = "greeting"
    }
}
