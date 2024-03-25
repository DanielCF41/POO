package engtelecom.poo;

public class Carro2 {

    private int velocidade;
    private final int VELOCIDADE_MAX;
    public static int contador = 0;

    public static int getContador() {
        return contador;
    }

    public Carro2(int n, int max){
        this();
        setVelocidade(n);
    }
    public Carro2(int max){
        this.VELOCIDADE_MAX = max;
        velocidade = 0;
    }

    public Carro2(){
        velocidade = 0;
        this.VELOCIDADE_MAX = 200;
        this.contador++;

    }
    public static String aceleracao(){
        return "9,8m/s*s";
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if(velocidade >= 0 && velocidade <= VELOCIDADE_MAX) {
            this.velocidade = velocidade;
        }else if(velocidade < 0) {
            this.velocidade = 0;
        }else {
            this.velocidade = VELOCIDADE_MAX;
        }
    }

    public void acelerarCarro(int n){
        n = n + velocidade;
        setVelocidade(n);
    }

    public void frearCarro(int n){
        n = velocidade - (n);
        setVelocidade(n);
    }
}
