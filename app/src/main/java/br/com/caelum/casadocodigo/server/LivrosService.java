package br.com.caelum.casadocodigo.server;

import java.util.List;

import br.com.caelum.casadocodigo.modelo.Livro;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by android7392 on 14/04/18.
 */

public interface LivrosService {

    //http://cdcmob.herokuapp.com/listarLivros?indicePrimeiroLivro=0&qtdLivros=20
    /////@GET("listarLivros?indicePrimeiroLivro=0&qtdLivros=20")
    @GET("listarLivros")
    Call<List<Livro>> listaLivros(@Query("indicePrimeiroLivro") int indicePrimeiroLivro,
                                  @Query("qtdLivros") int qtdLivros);


    @POST("device")
    Call<List<Livro>> cadastrarCelular(@Query("email") String email,
                                  @Query("id") String token);

    //Call<List<Livro>> listaLivros();
    /////Call<List<Livro>> listaLivros();

}
