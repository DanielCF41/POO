package engtelecom.poo;

/**
 * Representa um carro em um jogo de corrida
 *
 * @author Daniel Fernandes
 */

public class Carro {
    /**
     * Velocidade atual do carro
     */
    private int velocidadeAtual;

    /**
     * Velocidade máxima do carro
     */
    private static final int VELOCIDADE_MAXIMA = 120;
    private static final int VELOCIDADE_MINIMA = 0;

    /**
     * Cria um carro com velocidade inicial igual a 0
     */
    public Carro() {
        this.velocidadeAtual = 0;
    }

    /**
     * Incrementa a velocidade do carro de acordo com o parâmetro fornecido
     * @param i incremento da velocidade
     * @return nova velocidade do carro
     */
    public int acelerar(int i){
        if(i > 0) {
            if(i + velocidadeAtual > VELOCIDADE_MAXIMA){
                this.velocidadeAtual = VELOCIDADE_MAXIMA;
            } else {
                this.velocidadeAtual += i;
            }
        }
        return this.velocidadeAtual;
    }

    /**
     * Decrementa a velocidade do carro de acorod com o parâmetro fornecido
     * @param i decremento da velocidade
     * @return nova velocidade do carro
     */
    public int frear(int i){
        if(i > 0) {
            if(velocidadeAtual - i >= VELOCIDADE_MINIMA) {
                this.velocidadeAtual -= i;
            }else{
                this.velocidadeAtual = VELOCIDADE_MINIMA;
            }
        }
        return this.velocidadeAtual;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
