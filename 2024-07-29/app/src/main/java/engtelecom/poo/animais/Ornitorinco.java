package engtelecom.poo.animais;

import engtelecom.poo.Animal;
import engtelecom.poo.animais.tipos.Mamifero;
import engtelecom.poo.animais.tipos.Oviparo;
import engtelecom.poo.animais.tipos.Terrestre;

public class Ornitorinco extends Animal implements Terrestre, Mamifero, Oviparo {

    public Ornitorinco(String nome) {
        super(nome);
    }

    @Override
    public String morder() {
        return "Ornitorinco " + nome + " mordendo";
    }

    @Override
    public String correr() {
        return "Ornitorinco " + nome + " correndo";
    }

    @Override
    public String botarOvo() {
        return "Ornitorinco " + nome + " botando ovo";
    }
}
