package engtelecom.poo.pt2;

import java.util.Objects;

public class Bola {
    private String tipo;
    private String cor;
    private double tamanho;
    private double peso;

    public Bola(String tipo, String cor, double tamanho, double peso) {
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bola bola = (Bola) o;
        return Double.compare(tamanho, bola.tamanho) == 0 && Double.compare(peso, bola.peso) == 0 && Objects.equals(tipo, bola.tipo) && Objects.equals(cor, bola.cor);
    }

}
