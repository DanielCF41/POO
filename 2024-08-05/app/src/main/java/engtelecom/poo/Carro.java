package engtelecom.poo;

public class Carro {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}
