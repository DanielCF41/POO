package engtelecom.poo;

public class Termometro {
    /**
     * Escala do termômetro (C,K,F)
     */
    private char escala;
    /**
     * Temperatura atual do termômetro
     */
    private double temperaturaAtual;
    /**
     * Temperatura máxima do termômetro
     */
    private double temperaturaMaxima;
    /**
     * Temperatura mínima do termômetro
     */
    private double temperaturaMinima;

    /**
     * Método construto do termômetro
     * @param escala determina em qual escala o termômetro está adequado
     * @param temperaturaAtual determina a temperatura atual do termômetro
     * @param temperaturaMaxima determina a  temperatura máxima do termômetro
     * @param temperaturaMinima determina a temperatura mínima do termômetro
     */
    public Termometro(char escala, double temperaturaAtual, double temperaturaMaxima, double temperaturaMinima) {
        if(!setEscala(escala) || !setTemperaturaAtual(temperaturaAtual)){
            this.escala = 'C';
            this.temperaturaAtual = 50;
            this.temperaturaMaxima = 100;
            this.temperaturaMinima = 0;
        }else {
            this.escala = escala;
            this.temperaturaAtual = temperaturaAtual;
            this.temperaturaMaxima = temperaturaMaxima;
            this.temperaturaMinima = temperaturaMinima;
        }
    }

    public boolean setEscala(char escala) {
        if(escala == 'C' || escala == 'F' || escala == 'K') {
            this.escala = escala;
            return true;
        }
        return false;
    }
    /**
     * Método para obter a escala
     * @return retorna a escola do termômetro
     */
    public char getEscala() {
        return escala;
    }

    /**
     * Método para obter a temperatura atual do termômetro
     * @return retorna  a temperatura atual do termômetro
     */
    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    /**
     * Método para definir a temperatura atual
     * @param temperaturaAtual valor da temperatura atual do termômetro
     */
    public boolean setTemperaturaAtual(double temperaturaAtual) {
        if(temperaturaAtual > this.temperaturaMinima && temperaturaAtual < this.temperaturaMaxima) {
            this.temperaturaAtual = temperaturaAtual;
            return true;
        }
        return false;
    }

    /**
     * Método para obter a temperatura Máxima do termômetro
     * @return retorna a temperatura máxima do termômetro
     */
    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    /**
     * Método para obter a temperatura mínicma do termômetro
     * @return retorna a temperatura mínima do termômetro
     */
    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    /**
     * Método que retorna a temperatura atual, a mínima e a máxima na escala escolhida
     * @param escala
     * @return
     */
    public String retornaTemperatura(char escala){
        if(escala != this.escala){
            switch (escala){
            }
        }
        return "";
    }

    /**
     * Método que recebe um objeto da classe termômetro e a sigla da escala termométrica (C, F ou K) e retorna a diferença de temperatura atual na escala informada
     * @param termometro
     * @param escala
     * @return
     */
    public double diferencaTemperatura(Termometro termometro, char escala){
        return 0;
    }


    @Override
    public String toString() {
        return String.format("A = %1,f °%c\nMÍN = %1.f °%c\nMÁX = %1.f °%c", this.temperaturaAtual, this.escala, this.temperaturaMinima, this.escala, this.temperaturaMaxima, this.escala);
    }
}


