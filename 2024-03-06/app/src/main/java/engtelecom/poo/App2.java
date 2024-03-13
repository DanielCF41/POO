package engtelecom.poo;

import org.checkerframework.checker.units.qual.C;

public class App2 {
    public static void main(String[] args) {

        // Sobrecarga de métodos
        Caneta bic = new Caneta(-100, "azul");

        Caneta pilot = new Caneta("vermelha");

        Caneta stabilo =  new Caneta();

        bic.setNivelTinta(10);
        bic.setNivelTinta(-10);
    }
}
