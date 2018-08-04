package br.com.caelum.casadocodigo.util;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by android7392 on 14/04/18.
 */

public abstract class EndLessListListener extends RecyclerView.OnScrollListener{


    private int quantidadeTotalItens;
    private int primeiroItemVisivel;
    private int quantidadeItensVisiveis;
    private boolean carregando = true;
    private int totalAnterior = 0;

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        
        quantidadeTotalItens = layoutManager.getItemCount();
        primeiroItemVisivel = layoutManager.findFirstVisibleItemPosition();
        quantidadeItensVisiveis = recyclerView.getChildCount();

        int indiceLimiteParaCarregar = quantidadeTotalItens - quantidadeItensVisiveis - 5;

        if (carregando) {
            if (quantidadeTotalItens > totalAnterior) {
                totalAnterior = quantidadeTotalItens;
                carregando = false;
            }
        }

        if (!carregando && primeiroItemVisivel >= indiceLimiteParaCarregar) {
            carregarMaisItens();
            carregando = true;
        }

    }

    public abstract void carregarMaisItens();
}
