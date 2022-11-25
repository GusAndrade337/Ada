package ADA;



public class Livraria {

    public static void main(String[] args) {
        /* Adicionando os Produtos */
        Estoque.adicionar(new Livro(1, "O Capital", 22, "Filosofia", "Karl Marx","BoiTempo", false));
        Estoque.adicionar(new Brinquedo(4, "PS4 do Paraguai", 30.2, "Videogame", false));
        Estoque.adicionar(new Livro(2, "Manifesto Comunista", 70, "Filosofia", "Karl Marx", "BoiTempo", false));
        Estoque.adicionar(new Filme(3, "Vingadores", 55, "Ação", "Irmãos Russo", "Marvel", "Kevin Feige", true));
        Estoque.adicionar(new Jogo(5, "Minecraft", 210, "RPG", "Microsoft", "Mojang", false));
        Estoque.adicionar(new Musica(6, "Revenge Against the System", 210, "RPG", "Microsoft", "Ada", true));
        Estoque.adicionar(new Jogo(7, "Call Of Duty", 400, "FPS", "Sony", "Sony", true));

        /* Listando os Produtos do estoque */        
        Estoque.listar();

        /* Remoção de Produtos */
        Estoque.apagar(Estoque.getEstoque(7));
        Estoque.listar();


        /* Quantidade de itens no estoque */
        System.out.println("\n-------------------------- Itens no Estoque -------------------------");
        ItensEstoque controleEstoque = new ItensEstoque();
        controleEstoque.somaLivros(Estoque.estoque);
        controleEstoque.somaBrinquedos(Estoque.estoque);
        controleEstoque.somaFilmes(Estoque.estoque);
        controleEstoque.somaJogos(Estoque.estoque);
        controleEstoque.somaMusicas(Estoque.estoque);

        /* Exibe Itens por categoria */
        System.out.println("\n------------------------- Itens no Estoque por Categoria -------------------------");
        controleEstoque.buscarLivros(Estoque.estoque);
        controleEstoque.buscarBrinquedos(Estoque.estoque);
        controleEstoque.buscarFilmes(Estoque.estoque);
        controleEstoque.buscarJogos(Estoque.estoque);
        controleEstoque.buscarMusicas(Estoque.estoque);


        /* Valor do Caixa Inicial */
        System.out.println("\n------------------------- Valor do Caixa Inicial -------------------------");
        System.out.println(Caixa.getValorTotal());

        /* Cadastro de cliente menor de idade */
        Cliente cadastroClienteMenor = new Cliente("Pedro", "123", "123", "20/11/2010");

        /* Cadastro de cliente maior de idade */
        Cliente cadastroClienteMaior = new Cliente("Marcio", "123", "123", "11/05/1982");

        /* Cadastros de Compras com desconto */
        System.out.println("\n------------------------- Cadastros de Compras-------------------------");
        Compra compra = new Compra();
        compra.produtosCompra.add(Estoque.getEstoque(1));
        compra.produtosCompra.add(Estoque.getEstoque(2));
        compra.produtosCompra.add(Estoque.getEstoque(4));
        compra.efetuarCompra(compra.produtosCompra, cadastroClienteMaior);

        /* Exibe valor da compra e caixa */
        System.out.println("\n------------------------- Exibe valor da compra e caixa -------------------------");
        System.out.println(compra.getValorCompra());
        System.out.println(Caixa.getValorTotal());

        /* Cadastro de compras */
        System.out.println("\n------------------------- Cadastros de Compras-------------------------");
        Compra compra2 = new Compra();
        compra2.produtosCompra.add(Estoque.getEstoque(5));
        compra2.efetuarCompra(compra2.produtosCompra, cadastroClienteMenor);

        /* Exibe valor da compra e caixa */
        System.out.println("\n------------------------- Exibe valor da compra e caixa -------------------------");
        System.out.println(compra2.getValorCompra());
        System.out.println(Caixa.getValorTotal());

        /* Cadastro de compras */
        System.out.println("\n------------------------- Cadastros de Compras recusada pela idade -------------------------");
        Compra compra3 = new Compra();
        compra3.produtosCompra.add(Estoque.getEstoque(6));
        compra3.efetuarCompra(compra3.produtosCompra, cadastroClienteMenor);

        /* Exibe valor da compra e caixa */
        System.out.println("\n------------------------- Exibe valor da compra e caixa -------------------------");
        System.out.println(compra3.getValorCompra());
        System.out.println(Caixa.getValorTotal());

        /* Exibe Estoque após compras */
        System.out.println("\n------------------------- Exibe Quantidade após compras -------------------------");
        ItensEstoque controleEstoque2 = new ItensEstoque();
        controleEstoque2.somaLivros(Estoque.estoque);
        controleEstoque2.somaBrinquedos(Estoque.estoque);
        controleEstoque2.somaFilmes(Estoque.estoque);
        controleEstoque2.somaJogos(Estoque.estoque);
        controleEstoque2.somaMusicas(Estoque.estoque);

        /* Exibe Estoque após compras */
        System.out.println("\n------------------------- Exibe por categoria após compras -------------------------");
        controleEstoque2.buscarLivros(Estoque.estoque);
        controleEstoque2.buscarBrinquedos(Estoque.estoque);
        controleEstoque2.buscarFilmes(Estoque.estoque);
        controleEstoque2.buscarJogos(Estoque.estoque);
        controleEstoque2.buscarMusicas(Estoque.estoque);

        Estoque.listar();


    }
}
