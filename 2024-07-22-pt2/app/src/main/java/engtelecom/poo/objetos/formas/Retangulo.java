package engtelecom.poo.objetos.formas;

import engtelecom.poo.Coordenadas;
import engtelecom.poo.objetos.Forma;

public class Retangulo extends Forma {
    Coordenadas pontoSup;
    Coordenadas pontoInf;

    public Retangulo(String corDeLinha, String corDePreenchimento, Coordenadas pontoSup, Coordenadas pontoInf) {
        super(corDeLinha, corDePreenchimento);
        this.pontoSup = pontoSup;
        this.pontoInf = pontoInf;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public String desenhar() {
        return "Desenhando retangulo";
    }
}
