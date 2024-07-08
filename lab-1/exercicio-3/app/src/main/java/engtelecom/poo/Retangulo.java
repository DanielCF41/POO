package engtelecom.poo;

public class Retangulo {
    private int largura;
    private int altura;
    private String codificacao;

    public Retangulo(int largura, int altura, String codificacao) {
        if (!setCodificacao(codificacao)) {
            this.codificacao = "ASCII";
        }
        if (!setAltura(altura) || !setLargura(largura)) {
            this.altura = 3;
            this.largura = 4;
        }
    }

    public Retangulo() {
        largura = 4;
        altura = 3;
        codificacao = "ASCII";
    }

    public int getLargura() {
        return largura;
    }

    public boolean setLargura(int largura) {
        if (largura > 0) {
            this.largura = largura;
            return true;
        }
        return false;
    }

    public int getAltura() {
        return altura;
    }

    public boolean setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
            return true;
        }
        return false;
    }

    public String getCodificacao() {
        return codificacao;
    }

    public boolean setCodificacao(String codificacao) {
        if (codificacao.equals("ASCII") || codificacao.equals("UTF-8")) {
            this.codificacao = codificacao;
            return true;
        }
        return false;
    }

    public int areaRetangulo() {
        return this.altura * this.largura;
    }

    public int perimetroRetangulo() {
        return 2 * (this.altura + this.largura);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        char cantoSuperiorDireito;
        char cantoSuperiorEsquerdo;
        char cantoInferiorDireito;
        char cantoInferiorEsquerdo;
        char laterais;
        char bases;

        if (codificacao.equals("ASCII")) {
            cantoSuperiorDireito = '+';
            cantoSuperiorEsquerdo = '+';
            cantoInferiorDireito = '+';
            cantoInferiorEsquerdo = '+';
            laterais = '|';
            bases = '-';
        }else{
            cantoSuperiorDireito = '\u2510';
            cantoSuperiorEsquerdo = '\u250c';
            cantoInferiorDireito = '\u2518';
            cantoInferiorEsquerdo = '\u2514';
            laterais = '\u2502';
            bases = '\u2500';
        }
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= largura; j++) {
                if (j == 1 || j == largura) {
                    if (i > 1 && i < altura) {
                        sb.append(laterais);
                    } else if(j == 1 && i == 1){
                        sb.append(cantoSuperiorEsquerdo);
                    }else if(j == largura && i == 1){
                        sb.append(cantoSuperiorDireito);
                    } else if (j == 1 && i == altura) {
                        sb.append(cantoInferiorEsquerdo);
                    }else{
                        sb.append(cantoInferiorDireito);
                    }
                } else if (i == 1 || i == altura) {
                    sb.append(bases);
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
