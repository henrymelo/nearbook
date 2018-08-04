package br.com.caelum.casadocodigo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.caelum.casadocodigo.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by android7392 on 28/04/18.
 */

public class ListaCartoesFragment extends Fragment {

    @BindView(R.id.lista_cartoes)
    RecyclerView lista;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.lista_cartoes, container, false);
        ButterKnife.bind(this, view);

        return view;
    }
}
