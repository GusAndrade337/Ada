package ADA;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Compra {

    private double valorCompra = 0;
    private double valorDesconto = 200.00;
    private Integer porcentagemDeDesconto = 15;
    public List<Produto> produtosCompra = new ArrayList<>();

    public void efetuarCompra(List<Produto> carrinho, Cliente cadastroComprador) {
        AtomicReference<Boolean> ongoing = new AtomicReference<>(true);
        carrinho.stream().takeWhile(item -> ongoing.get()).forEach(item -> {
            System.out.println("Está sendo comprado o item: " + item.getNome());
            if (cadastroComprador.calcularIdade() < 18) {
                if (!item.getPublicoAdulto()) {
                    this.setValorCompra(this.getValorCompra() + item.getPreco());
                    Estoque.apagar(item);
                } else {
                    this.setValorCompra(0d);
                    System.out.println("Compra Bloqueada, comprador não pode consumir esse produto");
                    ongoing.set(false);
                }
            } else {
                this.setValorCompra(this.getValorCompra() + item.getPreco());
                Estoque.apagar(item);
            }
        });
        if (this.getValorCompra() >= valorDesconto) {
            this.setValorCompra(this.desconto(this.getValorCompra()));
        }
        Caixa.somaCarrinho(this.getValorCompra());
    }

    public double desconto(double valor) {
        double valorDesconto = (porcentagemDeDesconto * valor) / 100;
        return valor - valorDesconto;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
