package ADA;
public class Brinquedo extends Produto{

    private String tipo;

    public Brinquedo(Integer id, String nome, double preco, String tipo, boolean publicoAdulto) {
        super(id, nome, preco, publicoAdulto);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedo=" + super.toString() +
                "tipo='" + tipo + '\'' +
                "} \n";
    }
}
