package engtelecom.poo;
import java.util.Random;

public class Carro {

    private int identificacao;
    private int velocidade;
    private final int VELOCIDADE_MAX = 200;

    public Carro(int identificacao, int velocidade){
        this.identificacao = identificacao;
        if(!setVelocidade(velocidade)){
            this.velocidade = 0;
        }
    }
    public Carro(int identificacao){
        this(identificacao, 0);
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public boolean setVelocidade(int velocidade) {
        if(velocidade >= 0 && velocidade <= VELOCIDADE_MAX) {
            this.velocidade = velocidade;
            return true;
        }
        return false;
    }

    public boolean acelerar(int velocidade){
        if(setVelocidade(velocidade + this.velocidade)){
            return true;
        }
        return false;
    }

    public boolean frear(int velocidade){
        if(setVelocidade(Math.abs(velocidade - this.velocidade))){
            return true;
        }
        return false;
    }
}

