package ADA;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private String nome;
    private String rg;
    private String cpf;
    private String dataDeNascimento;

    public Cliente(String nome, String rg, String cpf, String dataDeNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Integer calcularIdade() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d = LocalDate.parse(this.dataDeNascimento, format);

        LocalDate data1 = LocalDate.of(d.getYear(), d.getMonth(), d.getDayOfMonth());
        LocalDate data2 = LocalDate.now();

        Period period = Period.between(data1, data2);
        return period.getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}
