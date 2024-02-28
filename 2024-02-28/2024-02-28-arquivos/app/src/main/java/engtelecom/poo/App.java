package engtelecom.poo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner linha = new Scanner(System.in);
        int cont = 0;
        while(linha.hasNext()){
            cont++;
            String aux = linha.nextLine();
            System.out.print(cont + " ");
            System.out.println(aux.toUpperCase());

        }
    }
}
