package engtelecom.poo.animais;

import engtelecom.poo.Animal;
import engtelecom.poo.animais.tipos.Mamifero;
import engtelecom.poo.animais.tipos.Terrestre;

public class Cachorro extends Animal implements Terrestre, Mamifero {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String morder() {
        return "Cachorro " + nome + " mordendo" ;
    }

    @Override
    public String correr() {
        return "Cachorro " + nome + " correndo";
    }
}
