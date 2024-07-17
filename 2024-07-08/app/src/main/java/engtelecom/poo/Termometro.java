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

    public double conversao(char escala, double temperatura) {
        double tempAux = 0.0;

        if (escala != this.escala) {
            switch (escala) {
                case 'C':
                    if (this.escala == 'F') {
                        tempAux = (temperatura - 32) * 0.55;
                    } else if (this.escala == 'K') {
                        tempAux = temperatura - 273.15;
                    }
                    break;
                case 'F':
                    if (this.escala == 'C') {
                        tempAux = (temperatura * 1.8) + 32;
                    } else if (this.escala == 'K') {
                        tempAux = (temperatura - 273.15) * 1.8 + 32;
                    }
                    break;
                case 'K':
                    if (this.escala == 'C') {
                        tempAux = temperatura + 273.15;
                    } else if (this.escala == 'F') {
                        tempAux = (temperatura - 32) * 0.55 + 273.15;
                    }
            }
        }

        /**
         * Método que retorna a temperatura atual, a mínima e a máxima na escala escolhida
         * @param escala
         * @return
         */
        public String retornaTemperatura ( char escala){
            double atual = 0.0;
            double max = 0.0;
            double min = 0.0;
            if (escala != this.escala) {
                switch (escala) {
                    case 'C':
                        if (this.escala == 'F') {
                            atual = (this.temperaturaAtual - 32) * 0.55;
                            max = (this.temperaturaMaxima - 32) * 0.55;
                            min = (this.temperaturaMinima - 32) * 0.55;
                        } else if (this.escala == 'K') {
                            atual = this.temperaturaAtual - 273.15;
                            max = this.temperaturaMaxima - 273.15;
                            min = this.temperaturaMinima - 273.15;
                        }
                        break;
                    case 'F':
                        if (this.escala == 'C') {
                            atual = (this.temperaturaAtual * 1.8) + 32;
                            max = (this.temperaturaMaxima * 1.8) + 32;
                            min = (this.temperaturaMinima * 1.8) + 32;
                        } else if (this.escala == 'K') {
                            atual = (this.temperaturaAtual - 273.15) * 1.8 + 32;
                            max = (this.temperaturaMaxima - 273.15) * 1.8 + 32;
                            min = (this.temperaturaMinima - 273.15) * 1.8 + 32;
                        }
                        break;
                    case 'K':
                        if (this.escala == 'C') {
                            atual = this.temperaturaAtual + 273.15;
                            max = this.temperaturaMaxima + 273.15;
                            min = this.temperaturaMinima + 273.15;
                        } else if (this.escala == 'F') {
                            atual = (this.temperaturaAtual - 32) * 0.55 + 273.15;
                            max = (this.temperaturaMaxima - 32) * 0.55 + 273.15;
                            min = (this.temperaturaMinima - 32) * 0.55 + 273.15;
                        }
                }
            } else {
                return "A = " + this.temperaturaAtual + " °" + this.escala + "\nMÍN = " + this.temperaturaMinima + " °" + this.escala + "\nMÁX = " + this.temperaturaMaxima + " °" + this.escala;
            }
            return "A = " + atual + " °" + escala + "\nMÍN = " + min + " °" + escala + "\nMÁX = " + max + " °" + escala;
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
        return String.format("A = %.1f °%c\nMÍN = %.1f °%c\nMÁX = %.1f °%c", this.temperaturaAtual, this.escala, this.temperaturaMinima, this.escala, this.temperaturaMaxima, this.escala);
    }
}


