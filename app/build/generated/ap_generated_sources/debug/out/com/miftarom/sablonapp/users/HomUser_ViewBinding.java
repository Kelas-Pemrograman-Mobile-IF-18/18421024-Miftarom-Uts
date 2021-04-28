// Generated code from Butter Knife. Do not modify!
package com.miftarom.sablonapp.users;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.miftarom.sablonapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomUser_ViewBinding implements Unbinder {
  private HomUser target;

  private View view7f080005;

  private View view7f08005d;

  @UiThread
  public HomUser_ViewBinding(HomUser target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomUser_ViewBinding(final HomUser target, View source) {
    this.target = target;

    View view;
    target.txtUser = Utils.findRequiredViewAsType(source, R.id.txtUser, "field 'txtUser'", TextView.class);
    view = Utils.findRequiredView(source, R.id.LhtEtalase, "method 'SeeEtalase'");
    view7f080005 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.SeeEtalase();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnKeluar, "method 'Login'");
    view7f08005d = view;
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
    HomUser target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtUser = null;

    view7f080005.setOnClickListener(null);
    view7f080005 = null;
    view7f08005d.setOnClickListener(null);
    view7f08005d = null;
  }
}
