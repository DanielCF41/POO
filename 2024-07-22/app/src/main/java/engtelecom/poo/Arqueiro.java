package engtelecom.poo;

public class Arqueiro extends Personagem implements Guerreiro{
    public Arqueiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String mover(){
        return "Arqueiro movendo";
    }

    @Override
    public String atacar() {
        return "Arqueiro atacando";
    }
}
