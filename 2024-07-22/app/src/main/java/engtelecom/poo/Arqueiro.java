package engtelecom.poo;

public class Arqueiro extends Personagem{
    public Arqueiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String atacar(){
        return "Arqueiro atacando";
    }

    @Override
    public String mover(){
        return "Arqueiro movendo";
    }
}
