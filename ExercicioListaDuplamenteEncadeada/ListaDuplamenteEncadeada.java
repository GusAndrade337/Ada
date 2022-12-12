package ExercicioListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {

    ItemListaDuplamenteEncadeada<T> primeiroItem;
    ItemListaDuplamenteEncadeada<T> ultimoItem;
    int tamanho = 0;

    public ListaDuplamenteEncadeada() {}

    public T add(T dado){
        if(primeiroItem==null){
            this.primeiroItem = new ItemListaDuplamenteEncadeada<>();
            primeiroItem.setDado(dado);
            ultimoItem = primeiroItem;
        } else {
            ItemListaDuplamenteEncadeada<T> item = new ItemListaDuplamenteEncadeada<>();
            item.setDado(dado);
            item.setAnterior(ultimoItem);
            ultimoItem.setProximo(item);
            ultimoItem = item;
        }
        tamanho++;
        return dado;
    }

    public T get(int posicao) throws Exception {
        this.validateRulesList(posicao);

        int metade = (tamanho / 2);

        if(posicao <= metade) {
            ItemListaDuplamenteEncadeada<T> itemPrimeiraMetade = primeiroItem;
            for (int i = 0; i <= posicao; i++) {
                if (i == posicao) {
                    return itemPrimeiraMetade.getDado();
                } else {
                    itemPrimeiraMetade = itemPrimeiraMetade.getProximo();
                }
            }
            return itemPrimeiraMetade.getDado();
        }

        ItemListaDuplamenteEncadeada<T> itemSegundaMetade = ultimoItem;
       for (int i = tamanho-1; i >= posicao ; i--) {
           if (i == posicao) {
               return itemSegundaMetade.getDado();
           } else {
               itemSegundaMetade = itemSegundaMetade.getAnterior();
           }
       }
       return null;
    }


    public T remove(int posicao) throws Exception {

        if (posicao == 0) {
            T dado = primeiroItem.getDado();
            primeiroItem = primeiroItem.getProximo();
            return dado;
        }

        ItemListaDuplamenteEncadeada<T> itemAtual = this.getItem(posicao);
        ItemListaDuplamenteEncadeada<T> itemAnterior = itemAtual.getAnterior();

        if (itemAtual == ultimoItem) {
            ultimoItem = itemAnterior;
            itemAnterior.setProximo(null);
        } else {
            itemAnterior.setProximo(itemAtual.getProximo());
        }

        return itemAtual.getDado();
    }

    public T validateRulesList(int posicao) throws Exception {
        if (posicao < 0) throw new Exception("Posição não pode ser negativa");
        if (posicao >= tamanho) throw new IndexOutOfBoundsException("Posição acima do tamanho da lista");

        return null;
    }

    public void printList() {
        ItemListaDuplamenteEncadeada<T> item = primeiroItem;

        System.out.println("\n");
        System.out.println("primeiroItem: " +  primeiroItem.getDado());
        System.out.println("ultimoItem: "  + ultimoItem.getDado());

        while (item.getProximo() != null) {
            System.out.println(item.getDado());
            item = item.getProximo();
        }

        System.out.println(item.getDado());
    }

    public void printListReverse() {
        ItemListaDuplamenteEncadeada<T> item = ultimoItem;

        System.out.println("\n");
        System.out.println("primeiroItem: " +  ultimoItem.getDado());
        System.out.println("ultimoItem: "  + primeiroItem.getDado());

        while (item.getAnterior() != null) {
            System.out.println(item.getDado());
            item = item.getAnterior();
        }

        System.out.println(item.getDado());
    }
    private ItemListaDuplamenteEncadeada<T> getItem(int posicao) throws Exception {
        this.validateRulesList(posicao);

        if (posicao == 0) return primeiroItem;

        ItemListaDuplamenteEncadeada<T> item = primeiroItem;

        for (int i = 0; i < posicao; i++) {
            item = item.getProximo();
        }

        return item;
    }

}

