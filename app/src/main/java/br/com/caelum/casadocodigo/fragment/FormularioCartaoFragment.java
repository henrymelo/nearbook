package br.com.caelum.casadocodigo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import br.com.caelum.casadocodigo.R;
import br.com.caelum.casadocodigo.fragment.dummy.DummyContent;
import br.com.caelum.casadocodigo.fragment.dummy.DummyContent.DummyItem;
import butterknife.BindView;
import butterknife.ButterKnife;

public class FormularioCartaoFragment extends Fragment {

    @BindView(R.id.formulario_nome)
    EditText nome;

    @BindView(R.id.formulario_vencimento)
    EditText vencimento;

    @BindView(R.id.formulario_numero)
    EditText numero;

    @BindView(R.id.formulario_cvv)
    EditText cvv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.formulario_cartao_fragment, container, false);
        ButterKnife.bind(this,view);

        return view;
    }
}
