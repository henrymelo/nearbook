package br.com.caelum.casadocodigo.modelo;

import java.util.List;

/**
 * Created by android7392 on 14/04/18.
 */

public class NotificacaoEvent {

    private final List<Livro> livros;

    public NotificacaoEvent(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
