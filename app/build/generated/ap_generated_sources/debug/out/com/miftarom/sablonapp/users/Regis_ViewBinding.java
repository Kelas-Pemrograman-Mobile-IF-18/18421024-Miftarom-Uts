// Generated code from Butter Knife. Do not modify!
package com.miftarom.sablonapp.users;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.miftarom.sablonapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Regis_ViewBinding implements Unbinder {
  private Regis target;

  private View view7f08005e;

  @UiThread
  public Regis_ViewBinding(Regis target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Regis_ViewBinding(final Regis target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btnLogin, "method 'Login'");
    view7f08005e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.Login();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view7f08005e.setOnClickListener(null);
    view7f08005e = null;
  }
}
