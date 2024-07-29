package engtelecom.poo.animais;

import engtelecom.poo.Animal;
import engtelecom.poo.animais.tipos.Mamifero;
import engtelecom.poo.animais.tipos.Terrestre;

public class Macaco extends Animal implements Terrestre, Mamifero {
    public Macaco(String nome) {
        super(nome);
    }

    @Override
    public String morder() {
        return "Macaco " + nome + " mordendo";
    }

    @Override
    public String correr() {
        return "Macaco " + nome + " correndo";
    }
}
