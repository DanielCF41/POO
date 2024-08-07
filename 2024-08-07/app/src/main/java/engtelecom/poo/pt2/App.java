package engtelecom.poo.pt2;

public class App {

    public static void main(String[] args) {

        Bola futebol = new Bola("campo", "branca", 5.3, 0.5);
        Bola volei = new Bola("quadra", "azul", 4, 0.3);

        String s = "IFSC";
        String n = "POO";

        if(futebol.equals(volei)){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }

    }

}
