package engtelecom.poo;

public class Estudande extends Pessoa{
    private String matricula;

    public Estudande(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudande{" +
                "matricula='" + matricula + '\'' +
                '}';
    }
}
