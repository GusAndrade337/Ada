package ADA;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class ItensEstoque implements ListaDeProdutosNoEstoque {
    private final AtomicInteger count = new AtomicInteger();

    @Override
    public void somaLivros(List<Produto> list) {
        list.forEach(x -> {
            if(x instanceof Livro)
                count.getAndIncrement();
        });
        System.out.println("Total de Livros: " + count);
        count.set(0);
    }

    @Override
    public void somaBrinquedos(List<Produto> list) {
        list.forEach(x -> {
            if(x instanceof Brinquedo)
                count.getAndIncrement();
        });
        System.out.println("Total de Brinquedos: " + count);
        count.set(0);
    }

    @Override
    public void somaFilmes(List<Produto> list) {
        list.forEach(x -> {
            if(x instanceof Filme)
                count.getAndIncrement();
        });
        System.out.println("Total de Filmes: " + count);
        count.set(0);
    }

    @Override
    public void somaJogos(List<Produto> list) {
        list.forEach(x -> {
            if(x instanceof Jogo)
                count.getAndIncrement();
        });
        System.out.println("Total de Jogos: " + count);
        count.set(0);
    }

    @Override
    public void somaMusicas(List<Produto> list) {
        list.forEach(x -> {
            if(x instanceof Musica)
                count.getAndIncrement();
        });
        System.out.println("Total de Musicas: " + count);
        count.set(0);
    }

    @Override
    public void buscarLivros(List<Produto> list) {
        List<Produto> listTiposEspecificos = new ArrayList<>();
        list.forEach(x -> {
            if(x instanceof Livro)
                listTiposEspecificos.add(x);
        });
        System.out.println("Estoque de livros: " + listTiposEspecificos);
    }

    @Override
    public void buscarBrinquedos(List<Produto> list) {
        List<Produto> listTiposEspecificos = new ArrayList<>();
        list.forEach(x -> {
            if(x instanceof Brinquedo)
                listTiposEspecificos.add(x);
        });
        System.out.println("Estoque de brinquedos: " + listTiposEspecificos);
    }

    @Override
    public void buscarFilmes(List<Produto> list) {
        List<Produto> listTiposEspecificos = new ArrayList<>();
        list.forEach(x -> {
            if(x instanceof Filme)
                listTiposEspecificos.add(x);
        });
        System.out.println("Estoque de filmes: " + listTiposEspecificos);
    }

    @Override
    public void buscarJogos(List<Produto> list) {
        List<Produto> listTiposEspecificos = new ArrayList<>();
        list.forEach(x -> {
            if(x instanceof Jogo)
                listTiposEspecificos.add(x);
        });
        System.out.println("Estoque de jogos: " + listTiposEspecificos);
    }

    @Override
    public void buscarMusicas(List<Produto> list) {
        List<Produto> listTiposEspecificos = new ArrayList<>();
        list.forEach(x -> {
            if(x instanceof Musica)
                listTiposEspecificos.add(x);
        });
        System.out.println("Estoque de musicas: " + listTiposEspecificos);
    }
}
