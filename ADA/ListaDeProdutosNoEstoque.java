package ADA;

import java.util.List;

public interface ListaDeProdutosNoEstoque {
    void somaLivros(List<Produto> list);
    void somaBrinquedos(List<Produto> list);
    void somaFilmes(List<Produto> list);
    void somaJogos(List<Produto> list);
    void somaMusicas(List<Produto> list);

    void buscarLivros(List<Produto> list);
    void buscarBrinquedos(List<Produto> list);
    void buscarFilmes(List<Produto> list);
    void buscarJogos(List<Produto> list);
    void buscarMusicas(List<Produto> list);
}
