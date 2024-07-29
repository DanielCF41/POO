package engtelecom.poo.animais;

import engtelecom.poo.Animal;
import engtelecom.poo.animais.tipos.Mamifero;
import engtelecom.poo.animais.tipos.Terrestre;

public class Leao extends Animal implements Terrestre, Mamifero {
    public Leao(String nome) {
        super(nome);
    }

    @Override
    public String morder() {
        return "Leao " + nome + " mordendo";
    }

    @Override
    public String correr() {
        return "Leao " + nome + " correndo";
    }
}
