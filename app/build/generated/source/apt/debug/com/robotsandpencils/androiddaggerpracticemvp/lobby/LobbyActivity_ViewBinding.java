// Generated code from Butter Knife. Do not modify!
package com.robotsandpencils.androiddaggerpracticemvp.lobby;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.robotsandpencils.androiddaggerpracticemvp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LobbyActivity_ViewBinding implements Unbinder {
  private LobbyActivity target;

  private View view2131230765;

  private View view2131230810;

  @UiThread
  public LobbyActivity_ViewBinding(LobbyActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LobbyActivity_ViewBinding(final LobbyActivity target, View source) {
    this.target = target;

    View view;
    target.greetingTextView = Utils.findRequiredViewAsType(source, R.id.greeting_textview, "field 'greetingTextView'", TextView.class);
    target.loadingIndicator = Utils.findRequiredViewAsType(source, R.id.loading_indicator, "field 'loadingIndicator'", ProgressBar.class);
    view = Utils.findRequiredView(source, R.id.common_greeting_button, "method 'onCommonGreetingButtonClicked'");
    view2131230765 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCommonGreetingButtonClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.lobby_greeting_button, "method 'onLobbyGreetingButtonClicked'");
    view2131230810 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLobbyGreetingButtonClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LobbyActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.greetingTextView = null;
    target.loadingIndicator = null;

    view2131230765.setOnClickListener(null);
    view2131230765 = null;
    view2131230810.setOnClickListener(null);
    view2131230810 = null;
  }
}
