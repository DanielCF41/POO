package engtelecom.poo;

public class Contador {

    private int valorAtual;

    public void atribuir(int x){
        valorAtual = x;
    }

    public void incrementar(){
        valorAtual++;
    }

    public int atual(){
        return valorAtual;
    }
}
