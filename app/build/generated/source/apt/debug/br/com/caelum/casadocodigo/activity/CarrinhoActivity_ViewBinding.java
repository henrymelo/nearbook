// Generated code from Butter Knife. Do not modify!
package br.com.caelum.casadocodigo.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import br.com.caelum.casadocodigo.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CarrinhoActivity_ViewBinding implements Unbinder {
  private CarrinhoActivity target;

  @UiThread
  public CarrinhoActivity_ViewBinding(CarrinhoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CarrinhoActivity_ViewBinding(CarrinhoActivity target, View source) {
    this.target = target;

    target.listaItens = Utils.findRequiredViewAsType(source, R.id.lista_itens_carrinho, "field 'listaItens'", RecyclerView.class);
    target.valorTotal = Utils.findRequiredViewAsType(source, R.id.valor_carrinho, "field 'valorTotal'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CarrinhoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.listaItens = null;
    target.valorTotal = null;
  }
}
