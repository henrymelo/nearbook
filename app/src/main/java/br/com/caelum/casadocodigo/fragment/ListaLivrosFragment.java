package br.com.caelum.casadocodigo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.casadocodigo.R;
import br.com.caelum.casadocodigo.adapter.LivroAdapter;
import br.com.caelum.casadocodigo.modelo.Livro;
import br.com.caelum.casadocodigo.server.WebClient;
import br.com.caelum.casadocodigo.util.EndLessListListener;

/**
 * Created by android7392 on 07/04/18.
 */

public class ListaLivrosFragment extends Fragment {
//    @BindView(R.id.lista_livros)
    RecyclerView recyclerView;
    private List<Livro> livros = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lista_livros, container, false);

//        ButterKnife.bind(this, view);

        /**
        List<Livro> livros = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Autor autor = new Autor();
            autor.setNome("Autor " +i);
            Livro livro = new Livro("Livro " + i, "Descricao " + i, Arrays.asList(autor));
            livros.add(livro);

        }
        */

        recyclerView = (RecyclerView) view.findViewById(R.id.lista_livros);
        recyclerView.setAdapter(new LivroAdapter(livros));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

    public void populaListaCom(final List<Livro> livros) {
//        this.livros.clear();
        this.livros.addAll(livros);
        recyclerView.getAdapter().notifyDataSetChanged();

        recyclerView.addOnScrollListener( new EndLessListListener() {
            @Override
            public void carregarMaisItens() {
                new WebClient().getLivros( ListaLivrosFragment.this.livros.size(), 10);
            }
        });

    }
}
