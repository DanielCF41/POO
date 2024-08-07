package engtelecom.poo.pt1;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class App2 {

    public static String formata(String mascara, String valor) throws ParseException {
        MaskFormatter mask = null;
        String resultado = "";

        mask = new MaskFormatter(mascara);
        mask.setValueContainsLiteralCharacters(false);
        mask.setPlaceholderCharacter('_');
        resultado = mask.valueToString(valor);

        return resultado;
    }

    public static void main(String[] args) {
        try {
            System.out.println(formata(null, "48991082103"));
        }catch (ParseException e){
            System.err.println("Error ao formatar a String");
        }

    }

}


