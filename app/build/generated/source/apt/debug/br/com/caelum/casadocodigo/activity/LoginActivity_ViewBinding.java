// Generated code from Butter Knife. Do not modify!
package br.com.caelum.casadocodigo.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import br.com.caelum.casadocodigo.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view2131492993;

  private View view2131492994;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    target.campoEmail = Utils.findRequiredViewAsType(source, R.id.login_email, "field 'campoEmail'", EditText.class);
    target.campoSenha = Utils.findRequiredViewAsType(source, R.id.login_senha, "field 'campoSenha'", EditText.class);
    view = Utils.findRequiredView(source, R.id.login_logar, "method 'logar'");
    view2131492993 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.logar();
      }
    });
    view = Utils.findRequiredView(source, R.id.login_novo, "method 'novoUsuario'");
    view2131492994 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.novoUsuario();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.campoEmail = null;
    target.campoSenha = null;

    view2131492993.setOnClickListener(null);
    view2131492993 = null;
    view2131492994.setOnClickListener(null);
    view2131492994 = null;
  }
}
