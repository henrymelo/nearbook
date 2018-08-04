// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package br.com.caelum.casadocodigo.fragment;

import br.com.caelum.casadocodigo.modelo.Carrinho;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class DetalhesLivroFragment_MembersInjector
    implements MembersInjector<DetalhesLivroFragment> {
  private final Provider<Carrinho> carrinhoProvider;

  public DetalhesLivroFragment_MembersInjector(Provider<Carrinho> carrinhoProvider) {
    assert carrinhoProvider != null;
    this.carrinhoProvider = carrinhoProvider;
  }

  public static MembersInjector<DetalhesLivroFragment> create(Provider<Carrinho> carrinhoProvider) {
    return new DetalhesLivroFragment_MembersInjector(carrinhoProvider);
  }

  @Override
  public void injectMembers(DetalhesLivroFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.carrinho = carrinhoProvider.get();
  }

  public static void injectCarrinho(
      DetalhesLivroFragment instance, Provider<Carrinho> carrinhoProvider) {
    instance.carrinho = carrinhoProvider.get();
  }
}
