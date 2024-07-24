package engtelecom.poo;

public class Aldeao extends Personagem implements Coletor, Guerreiro{

    public Aldeao(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String coletarMadeira() {
        return "Aldeão Coletando madeira";
    }

    @Override
    public String coletarOuro() {
        return "Aldeão Coletando ouro";
    }

    @Override
    public String atacar() {
        return "Aldeão atacando";
    }

    @Override
    public String mover() {
        return "Aldeão movendo";
    }
}
