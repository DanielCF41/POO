package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tarefa {
    private String nome;
    private LocalDate dataEntrega;
    private LocalDate dataConclusao;
    private Classificacao classificacao;
    private ArrayList<Pessoa> grupo;

    public Tarefa(String nome, LocalDate dataEntrega, Classificacao classificacao, ArrayList<Pessoa> grupo) {
        this.nome = nome;
        this.dataEntrega = dataEntrega;
        this.classificacao = classificacao;
        this.grupo = grupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public ArrayList<Pessoa> getGrupo() {
        return grupo;
    }

    public void setGrupo(ArrayList<Pessoa> grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "TAREFA: " + nome + "\n" + "Prazo: " + dataEntrega + "\n" + classificacao + "\n" + "Responsáveis: " + grupo + "\n\n";
    }
}
