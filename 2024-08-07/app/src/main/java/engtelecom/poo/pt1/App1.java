package engtelecom.poo.pt1;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class App1 {

    public static String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";

        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            System.err.println("Erro ao formatar valor: " + valor);
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(formata("(##) #####-####", "48991082103"));
    }

}
