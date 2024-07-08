package engtelecom.poo;

public class Motor {
    private String modelo;
    private int cilindradas;
    private int valvulas;

    public Motor(String modelo, int cilindradas, int valvulas) {
        this.modelo = modelo;
        this.cilindradas = cilindradas;
        this.valvulas = valvulas;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cilindradas=" + cilindradas +
                ", valvulas=" + valvulas +
                '}';
    }
}
