package br.com.caelum.casadocodigo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import br.com.caelum.casadocodigo.R;
import butterknife.ButterKnife;

/**
 * Created by android7392 on 28/04/18.
 */

public class CartaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario_cartao_fragment);
        ButterKnife.bind(this);
    }


}
