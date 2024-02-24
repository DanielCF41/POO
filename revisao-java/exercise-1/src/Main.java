import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o seu nome:");
        String name = teclado.nextLine();
        System.out.println("Entre com o ano que nasceu:");
        int year_born = teclado.nextInt();
        System.out.println("Entre com o ano atual:");
        int year = teclado.nextInt();
        int result = year - year_born;
        System.out.println("    " + name + " tem    " + result + " anos\n");
    }
}