// Generated code from Butter Knife. Do not modify!
package com.miftarom.sablonapp.users;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.miftarom.sablonapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Login_ViewBinding implements Unbinder {
  private Login target;

  private View view7f08005f;

  private View view7f080006;

  @UiThread
  public Login_ViewBinding(Login target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Login_ViewBinding(final Login target, View source) {
    this.target = target;

    View view;
    target.edtUsername = Utils.findRequiredViewAsType(source, R.id.edtUserName, "field 'edtUsername'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btnRegis, "method 'Registrasi'");
    view7f08005f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.Registrasi();
      }
    });
    view = Utils.findRequiredView(source, R.id.Loginbtn, "method 'Login'");
    view7f080006 = view;
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
    Login target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.edtUsername = null;

    view7f08005f.setOnClickListener(null);
    view7f08005f = null;
    view7f080006.setOnClickListener(null);
    view7f080006 = null;
  }
}
