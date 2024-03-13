package engtelecom.poo;

public class Carro {

    //atributos
    private double velocidade;
    private String modelo;


    public void acelerar(double v){
        velocidade+=v;
    }
    public void frear(double v){
        velocidade-=v;
    }
    public double obterVelocidade(){
        return velocidade;
    }

}
