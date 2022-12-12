package ExercicioListaDuplamenteEncadeada;

public class MainDuplamenteEncadeado {
    public static void main(String[] args) throws Exception {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("Ana");
        lista.add("André");
        lista.add("Ultimo");
        lista.add("Fábio");
        lista.add("José");

        lista.printList();

        System.out.println("Item selecionado: " + lista.get(3));


//        lista.printListReverse();

//        lista.remove(3);

//        lista.printList();
    }
}
