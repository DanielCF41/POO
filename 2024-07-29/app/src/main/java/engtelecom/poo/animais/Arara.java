package engtelecom.poo.animais;

import engtelecom.poo.Animal;
import engtelecom.poo.animais.tipos.Aves;
import engtelecom.poo.animais.tipos.Voador;

public class Arara extends Animal implements Aves, Voador {

    public Arara(String nome) {
        super(nome);
    }

    @Override
    public String bicar() {
        return "Arara " + nome + " bicando";
    }

    @Override
    public String voar() {
        return "Arara " + nome + " voando";
    }

    @Override
    public String botarOvo() {
        return "Arara " + nome + " botando";
    }
}
