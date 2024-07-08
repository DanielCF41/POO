package engtelecom.poo;

public class Classificacao {
    private String nome;

    public Classificacao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Classificação: " + nome;
    }

}
