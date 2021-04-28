// Generated code from Butter Knife. Do not modify!
package com.miftarom.sablonapp.admin;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.miftarom.sablonapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomAdmin2_ViewBinding implements Unbinder {
  private HomAdmin2 target;

  private View view7f08005d;

  private View view7f080005;

  @UiThread
  public HomAdmin2_ViewBinding(HomAdmin2 target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomAdmin2_ViewBinding(final HomAdmin2 target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btnKeluar, "method 'Login'");
    view7f08005d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.Login();
      }
    });
    view = Utils.findRequiredView(source, R.id.LhtEtalase, "method 'SeeEtalase'");
    view7f080005 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.SeeEtalase();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view7f08005d.setOnClickListener(null);
    view7f08005d = null;
    view7f080005.setOnClickListener(null);
    view7f080005 = null;
  }
}
