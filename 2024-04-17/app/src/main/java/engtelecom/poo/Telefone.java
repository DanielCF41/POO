package engtelecom.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {
    private  String valor;
    private String rotulo;

    public Telefone (String valor, String rotulo){
        this.rotulo = rotulo;
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    private String formata (){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter("(##) #####-####");
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(this.valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }
    @Override
    public String toString() {

        return  formata() + "\n";
    }
}
