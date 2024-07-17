package engtelecom.poo;

public class Dimensao {
    /**
     * Altura do objeto
     */
    private double altura;
    /**
     * Largura do objeto
     */
    private double largura;
    /**
     * Porfundidade do objeto
     */
    private double profundidade;

    public Dimensao(double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Altura: " + this.altura + "\n" + "Largura: " + this.largura + "\n" + "Profundidade: " + this.profundidade;
    }
}
