package br.com.caelum.casadocodigo.server;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import br.com.caelum.casadocodigo.converter.LivroServiceConverterFactory;
import br.com.caelum.casadocodigo.modelo.Livro;
import br.com.caelum.casadocodigo.modelo.LivroEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by android7392 on 14/04/18.
 */

public class WebClient {

    private static final String SERVER_URL = "http://cdcmob.herokuapp.com/";
//    private final LivrosDelegate delegate;

//    public WebClient(LivrosDelegate delegate) {
//        this.delegate = delegate;
//    }

    public void getLivros(int indicePrimeiroLivro, int qtdLivros) {

        Retrofit client = new Retrofit.Builder()
                .baseUrl(SERVER_URL)
                .addConverterFactory(new LivroServiceConverterFactory())
                .build();

        LivrosService service = client.create(LivrosService.class);

//        Call<List<Livro>> call = service.listaLivros();
        Call<List<Livro>> call = service.listaLivros(indicePrimeiroLivro, qtdLivros);

        call.enqueue(new Callback<List<Livro>>() {
            @Override
            public void onResponse(Call<List<Livro>> call, Response<List<Livro>> response) {
//                delegate.lidaComSucesso(response.body());
                EventBus.getDefault().post(new LivroEvent(response.body()));
            }

            @Override
            public void onFailure(Call<List<Livro>> call, Throwable t) {
//                delegate.lidaComErro(t);
                EventBus.getDefault().post(t);
            }

        });

    }

    public void cadastrarCelular(String email, String token) {
        Retrofit client = new Retrofit.Builder()
                .baseUrl(SERVER_URL)
                .addConverterFactory(new LivroServiceConverterFactory())
                .build();

        LivrosService service = client.create(LivrosService.class);

//        Call<List<Livro>> call = service.listaLivros();
        Call<List<Livro>> call = service.cadastrarCelular(email, token);

        call.enqueue(new Callback<List<Livro>>() {
            @Override
            public void onResponse(Call<List<Livro>> call, Response<List<Livro>> response) {
//                delegate.lidaComSucesso(response.body());
                EventBus.getDefault().post(new LivroEvent(response.body()));
            }

            @Override
            public void onFailure(Call<List<Livro>> call, Throwable t) {
//                delegate.lidaComErro(t);
                EventBus.getDefault().post(t);
            }

        });
    }
}
