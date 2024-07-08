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
    private static int MAX = 120;

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
        if(i > 0 ) {
            if(i + velocidadeAtual > 120){
                this.velocidadeAtual = 120;
            } else {
                this.velocidadeAtual += i;
            }
        }
        return velocidadeAtual;
    }

    /**
     * Decrementa a velocidade do carro de acorod com o parâmetro fornecido
     * @param i decremento da velocidade
     * @return nova velocidade do carro
     */
    public int frear(int i){
        if(i > 0 && i <= velocidadeAtual) {
            this.velocidadeAtual -= i;
        }
        return velocidadeAtual;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
