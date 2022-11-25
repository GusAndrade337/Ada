package ADA;


public class Caixa {

    private static double valorTotal = 0;

    public static double getValorTotal() {
        return valorTotal;
    }

    public static void somaCarrinho(double valorCompra) {
        valorTotal += valorCompra;
    }
}
