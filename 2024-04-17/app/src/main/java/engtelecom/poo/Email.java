package engtelecom.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Email {
    private String valor;
    private String rotulo;

    public Email(String valor, String rotulo) {
        if(!setValor(valor)){
            this.valor = null;
        }
        this.rotulo = rotulo;
    }

    public String getValor() {
        return valor;
    }

    public boolean setValor(String valor) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if (valor.matches(eR)) {
            this.valor = valor;
            return true;
        } else {
            return false;
        }
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    @Override
    public String toString() {
        return "Email: " + this.valor + " - " + this.rotulo + "\n";
    }
}