package engtelecom.poo;

import java.time.LocalDate;

public class Autor {
    private String nome;
    private String nacionalidade;
    private LocalDate dataNascimento;

    public Autor(String nome, String nacionalidade, LocalDate dataNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
