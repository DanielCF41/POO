package engtelecom.poo.animais;

import engtelecom.poo.Animal;
import engtelecom.poo.animais.tipos.Mamifero;
import engtelecom.poo.animais.tipos.Terrestre;

public class Lobo extends Animal implements Terrestre, Mamifero {
    public Lobo(String nome) {
        super(nome);
    }

    @Override
    public String morder() {
        return "Lobo " + nome + " mordendo";
    }

    @Override
    public String correr() {
        return "Lobo " + nome + " correndo";
    }
}
