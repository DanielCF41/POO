package engtelecom.poo.produtos;

public class Celular extends SemFio {
    private String sistemaOperacional;

    public Celular() {
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
