package engtelecom.poo;

public class Cavaleiro extends Personagem implements Guerreiro{
    public Cavaleiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String mover(){
        return "Cavaleiro movendo";
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacando";
    }
}
