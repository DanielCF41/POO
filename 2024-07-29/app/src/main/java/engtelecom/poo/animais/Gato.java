package engtelecom.poo.animais;

import engtelecom.poo.Animal;
import engtelecom.poo.animais.tipos.Mamifero;
import engtelecom.poo.animais.tipos.Terrestre;

public class Gato extends Animal implements Terrestre, Mamifero {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String morder() {
        return "Gato " + nome + " mordendo";
    }

    @Override
    public String correr() {
        return "Gato " + nome + " correndo";
    }
}
