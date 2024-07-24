package engtelecom.poo;

public abstract class Personagem {
    private int vida;
    private int ataque;
    private double velocidade;

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public abstract String mover();
}
