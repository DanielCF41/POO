package engtelecom.poo;

public class Cavaleiro extends Personagem{
    public Cavaleiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String atacar(){
        return "Cavaleiro atacando";
    }

    @Override
    public String mover(){
        return "Cavaleiro movendo";
    }
}
