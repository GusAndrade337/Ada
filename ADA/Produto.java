package ADA;
public class Produto {
    private Integer id;
    private String nome;
    private double preco;
    private boolean publicoAdulto;
    private String type;
    


    public Produto(Integer id, String nome, double preco, boolean publicoAdulto) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.publicoAdulto = publicoAdulto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean getPublicoAdulto() {
        return publicoAdulto;
    }

    public void setPublicoAdulto(boolean publicoAdulto) {
        this.publicoAdulto = publicoAdulto;
    }

    public String getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", Público Adulto?='" + publicoAdulto + '\'' +
                ", preco=" + preco + '\'' +
                ' ';
    }
}
