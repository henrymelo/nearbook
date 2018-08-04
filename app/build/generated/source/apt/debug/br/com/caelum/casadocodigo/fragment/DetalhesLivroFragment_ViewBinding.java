// Generated code from Butter Knife. Do not modify!
package br.com.caelum.casadocodigo.fragment;

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

public class DetalhesLivroFragment_ViewBinding implements Unbinder {
  private DetalhesLivroFragment target;

  private View view2131493009;

  private View view2131493010;

  private View view2131493011;

  @UiThread
  public DetalhesLivroFragment_ViewBinding(final DetalhesLivroFragment target, View source) {
    this.target = target;

    View view;
    target.foto = Utils.findRequiredViewAsType(source, R.id.detalhes_livro_foto, "field 'foto'", ImageView.class);
    target.nome = Utils.findRequiredViewAsType(source, R.id.detalhes_livro_nome, "field 'nome'", TextView.class);
    target.autores = Utils.findRequiredViewAsType(source, R.id.detalhes_livro_autores, "field 'autores'", TextView.class);
    target.descricao = Utils.findRequiredViewAsType(source, R.id.detalhes_livro_descricao, "field 'descricao'", TextView.class);
    target.numPaginas = Utils.findRequiredViewAsType(source, R.id.detalhes_livro_num_paginas, "field 'numPaginas'", TextView.class);
    target.isbn = Utils.findRequiredViewAsType(source, R.id.detalhes_livro_isbn, "field 'isbn'", TextView.class);
    target.dataPublicacao = Utils.findRequiredViewAsType(source, R.id.detalhes_livro_data_publicacao, "field 'dataPublicacao'", TextView.class);
    view = Utils.findRequiredView(source, R.id.detalhes_livro_comprar_fisico, "field 'botaoComprarFisico' and method 'comprarFisico'");
    target.botaoComprarFisico = Utils.castView(view, R.id.detalhes_livro_comprar_fisico, "field 'botaoComprarFisico'", TextView.class);
    view2131493009 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.comprarFisico();
      }
    });
    view = Utils.findRequiredView(source, R.id.detalhes_livro_comprar_ebook, "field 'botaoComprarEbook' and method 'comprarVirtual'");
    target.botaoComprarEbook = Utils.castView(view, R.id.detalhes_livro_comprar_ebook, "field 'botaoComprarEbook'", TextView.class);
    view2131493010 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.comprarVirtual();
      }
    });
    view = Utils.findRequiredView(source, R.id.detalhes_livro_comprar_ambos, "field 'botaoComprarAmbos' and method 'comprarAmbos'");
    target.botaoComprarAmbos = Utils.castView(view, R.id.detalhes_livro_comprar_ambos, "field 'botaoComprarAmbos'", TextView.class);
    view2131493011 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.comprarAmbos();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    DetalhesLivroFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.foto = null;
    target.nome = null;
    target.autores = null;
    target.descricao = null;
    target.numPaginas = null;
    target.isbn = null;
    target.dataPublicacao = null;
    target.botaoComprarFisico = null;
    target.botaoComprarEbook = null;
    target.botaoComprarAmbos = null;

    view2131493009.setOnClickListener(null);
    view2131493009 = null;
    view2131493010.setOnClickListener(null);
    view2131493010 = null;
    view2131493011.setOnClickListener(null);
    view2131493011 = null;
  }
}
