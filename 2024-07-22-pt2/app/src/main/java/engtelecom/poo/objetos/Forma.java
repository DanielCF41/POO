package engtelecom.poo.objetos;

import engtelecom.poo.Objeto;

public abstract class Forma extends Objeto {
    private String corDePreenchimento;

    public Forma(String corDeLinha, String corDePreenchimento) {
        super(corDeLinha);
        this.corDePreenchimento = corDePreenchimento;
    }

    public abstract double calcularArea();
}
