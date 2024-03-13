package engtelecom.poo;

public class Caneta {

    private boolean aberta;
    private int nivelTinta;
    private String cor;

    // Método construtor - chamado apenas na criação da variável, apenas no "new
    public Caneta(int n, String c){
        nivelTinta = 100;
        this.setNivelTinta(n);
        cor = c;
        aberta = false;
    }
    public Caneta(String c){
        this(100, c);
    }
    public Caneta(){
        this("preta");
    }

    public void abrirFechar() {
        aberta = !aberta;
    }

    public void desenhar() {
        if(aberta && (nivelTinta > 0)) {
            System.out.println("Desenhando na cor " + cor);
            nivelTinta--;
        }
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public int getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(int nivelTinta) {
        if(nivelTinta >= 0 && nivelTinta <= 100) {
            this.nivelTinta = nivelTinta;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}