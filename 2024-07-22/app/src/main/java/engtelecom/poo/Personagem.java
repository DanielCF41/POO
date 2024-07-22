package engtelecom.poo;

public class Personagem {
    private int vida;
    private int ataque;
    private double velocidade;

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String atacar(){
        return "atacando";
    }

    public String mover(){
        return "andando";
    }


}
