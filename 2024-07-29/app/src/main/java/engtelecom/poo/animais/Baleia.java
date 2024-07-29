package engtelecom.poo.animais;

import engtelecom.poo.Animal;
import engtelecom.poo.animais.tipos.Mamifero;
import engtelecom.poo.animais.tipos.Nadador;

public class Baleia extends Animal implements Nadador, Mamifero {
    public Baleia(String nome) {
        super(nome);
    }

    @Override
    public String morder() {
        return "Baleia " + nome + " mordendo" ;
    }

    @Override
    public String nadar() {
        return "Baleia " + nome + " nadando";
    }
}
