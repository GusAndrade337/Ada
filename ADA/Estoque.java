package ADA;


import java.util.ArrayList;
import java.util.List;


public class Estoque<T extends Produto> {

    public static List<Produto> estoque = new ArrayList<>();

    public static void adicionar(Produto t) {
        if (!estoque.contains(t)) {
            estoque.add(t);
        }
    }

    public static Produto getEstoque(Integer id) {
        List<Produto> p = new ArrayList<>();
        estoque.forEach(item -> {
            if (item.getId().equals(id)) {
                p.add(item);
            }
        });
        return p.get(0);
    }

    public static void apagar(Produto t) {
        if (!vetorVazio()) {
            for (int i = 0; i < estoque.size(); i++) {
                if (estoque.get(i).getId().equals(t.getId())) {
                    estoque.remove(t);
                }
            }
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public static void listar() {
        System.out.println("\n*********************** Listagem de Produtos no estoque *****************************");
        estoque.forEach(System.out::println);
    }

    public static void editar(Produto t) {
        if (!vetorVazio()) {
            for (int i = 0; i < estoque.size(); i++) {
                if (estoque.get(i).getId().equals(t.getId())) {
                    estoque.set(i, t);
                }
            }
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public static boolean vetorVazio() {
        if (estoque.size() == 0) {
            System.out.println("Estoque Vazio!!!");
            return true;
        } else {
            return false;
        }
    }
}
