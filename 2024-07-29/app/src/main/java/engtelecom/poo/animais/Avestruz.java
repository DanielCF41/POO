package engtelecom.poo.animais;

import engtelecom.poo.Animal;
import engtelecom.poo.animais.tipos.Aves;
import engtelecom.poo.animais.tipos.Terrestre;

public class Avestruz extends Animal implements Aves, Terrestre {
    public Avestruz(String nome) {
        super(nome);
    }

    @Override
    public String bicar() {
        return "Avetruz " + nome + "bicando";
    }

    @Override
    public String correr() {
        return "Avestruz " + nome + "correndo";
    }

    @Override
    public String botarOvo() {
        return "Avestruz " + nome + "botar ovo";
    }
}
