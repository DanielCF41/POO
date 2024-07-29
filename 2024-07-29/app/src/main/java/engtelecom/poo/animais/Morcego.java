package engtelecom.poo.animais;

import engtelecom.poo.Animal;
import engtelecom.poo.animais.tipos.Mamifero;
import engtelecom.poo.animais.tipos.Voador;

public class Morcego extends Animal implements Voador, Mamifero {
    public Morcego(String nome) {
        super(nome);
    }

    @Override
    public String morder() {
        return "Morcego " + nome + " mordendo";
    }

    @Override
    public String voar() {
        return "Morcego " + nome + " voando";
    }
}
