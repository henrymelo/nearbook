package br.com.caelum.casadocodigo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import br.com.caelum.casadocodigo.R;
import br.com.caelum.casadocodigo.delegate.LivrosDelegate;
import br.com.caelum.casadocodigo.fragment.DetalhesLivroFragment;
import br.com.caelum.casadocodigo.fragment.ListaLivrosFragment;
import br.com.caelum.casadocodigo.modelo.Livro;
import br.com.caelum.casadocodigo.modelo.LivroEvent;
import br.com.caelum.casadocodigo.modelo.NotificacaoEvent;
import br.com.caelum.casadocodigo.server.WebClient;

public class MainActivity extends AppCompatActivity  implements LivrosDelegate {

    private ListaLivrosFragment listaLivrosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        listaLivrosFragment = new ListaLivrosFragment();
        transaction.replace(R.id.frame_principal, listaLivrosFragment);
        transaction.commit();

        new WebClient().getLivros(0, 10);

        EventBus.getDefault().register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void lidaComLivroSelecionado(Livro livro) {
        //Toast.makeText(this, "Livro selecionado: " + livro.getNome(), Toast.LENGTH_LONG).show();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        DetalhesLivroFragment detalhesLivroFragment = criaDetalhesCom(livro);
        transaction.replace(R.id.frame_principal, detalhesLivroFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

//    public void lidaComSucesso(List<Livro> livros) {
//        listaLivrosFragment.populaListaCom(livros);
//    }

    //@Subscribe usado para informar este metodo ao EventBus
    @Subscribe
    public void lidaComSucesso(LivroEvent livroEvent) {
        listaLivrosFragment.populaListaCom(livroEvent.getLivros());
    }


    @Subscribe
    public void lidaComErro(Throwable erro) {
        Toast.makeText(this, "Nao foi possivel carregar os livros...", Toast.LENGTH_SHORT).show();
    }

    private DetalhesLivroFragment criaDetalhesCom(Livro livro) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("livro", livro);
        DetalhesLivroFragment detalhesLivroFragment = new DetalhesLivroFragment();
        detalhesLivroFragment.setArguments(bundle);
        return detalhesLivroFragment;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //return super.onOptionsItemSelected(item);
        if (item.getItemId() == R.id.vai_para_carrinho) {
            Intent vaiParaCarrinho = new Intent(this, CarrinhoActivity.class);
            startActivity(vaiParaCarrinho);
        }
        return true;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void recebeNotificacao(NotificacaoEvent event) {
        Toast.makeText(this, "Receber uma notificaçao do servidor", Toast.LENGTH_SHORT).show();
    }
}
