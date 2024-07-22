package engtelecom.poo;

public class Aldeao extends Personagem{

    public Aldeao(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String atacar(){
        return "Aldeao atacando";
    }

    @Override
    public String mover(){
        return "Aldeao movendo";
    }
}
