package engtelecom.poo.objetos.formas;

import engtelecom.poo.Coordenadas;
import engtelecom.poo.objetos.Forma;

public class Circulo extends Forma {
    double raio;
    Coordenadas centro;

    public Circulo(String corDeLinha, String corDePreenchimento, double raio) {
        super(corDeLinha, corDePreenchimento);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public String desenhar() {
        return "";
    }
}
