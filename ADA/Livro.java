package ADA;

public class Livro extends Produto implements Comparable<Produto> {

    private String genero;
    private String escritor;
    private String editora;

    public Livro(Integer id, String nome, double preco, String genero, String escritor,
                  String editora, boolean publicoAdulto) {
        super(id, nome, preco, publicoAdulto);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro=" + super.toString() +
                "genero='" + genero + '\'' +
                ", escritor='" + escritor + '\'' +
                ", editora='" + editora + '\'' +
                "} \n";
    }

    @Override
    public int compareTo(Produto o) {
        return this.toString().compareTo("Livros=");
    }
}
