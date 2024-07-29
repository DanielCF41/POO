package engtelecom.poo.animais;

import engtelecom.poo.Animal;
import engtelecom.poo.animais.tipos.Aves;
import engtelecom.poo.animais.tipos.Nadador;

public class Pinguim extends Animal implements Aves, Nadador {
    public Pinguim(String nome) {
        super(nome);
    }

    @Override
    public String bicar() {
        return "Pinguim " + nome + " bicando";
    }

    @Override
    public String nadar() {
        return "Pinguim " + nome + " nadando";
    }

    @Override
    public String botarOvo() {
        return "Pinguim " + nome + " botando";
    }
}
