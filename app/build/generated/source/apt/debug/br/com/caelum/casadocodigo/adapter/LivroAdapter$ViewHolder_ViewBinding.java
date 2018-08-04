// Generated code from Butter Knife. Do not modify!
package br.com.caelum.casadocodigo.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.caelum.casadocodigo.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LivroAdapter$ViewHolder_ViewBinding implements Unbinder {
  private LivroAdapter.ViewHolder target;

  private View view2131493020;

  @UiThread
  public LivroAdapter$ViewHolder_ViewBinding(final LivroAdapter.ViewHolder target, View source) {
    this.target = target;

    View view;
    target.foto = Utils.findRequiredViewAsType(source, R.id.item_livro_foto, "field 'foto'", ImageView.class);
    target.nome = Utils.findRequiredViewAsType(source, R.id.item_livro_nome, "field 'nome'", TextView.class);
    view = Utils.findRequiredView(source, R.id.item_livro, "method 'clickItem'");
    view2131493020 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickItem();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LivroAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.foto = null;
    target.nome = null;

    view2131493020.setOnClickListener(null);
    view2131493020 = null;
  }
}
