package engtelecom.poo;

public class Caneta {

    private boolean aberta = false;
    private int nivelTinta = 0;
    private String cor;

    public void abrirFechar() {
        aberta = !aberta;
    }

    public void desenhar() {
        if(aberta && (nivelTinta > 0)) {
            System.out.println("Desenhando na cor " + cor);
            nivelTinta--;
        }
    }

    public void definirCor(String c){
        cor = c;
    }

    public void definirNivelTinta(int n){
        nivelTinta = n;
    }
}