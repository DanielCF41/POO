package engtelecom.poo;

public abstract class Objeto {
    private String corDeLinha;

    public Objeto(String corDeLinha) {
        this.corDeLinha = corDeLinha;
    }

    public abstract String desenhar();
}
