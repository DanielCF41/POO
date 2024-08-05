package engtelecom.poo;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
