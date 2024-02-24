import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);

        int op;
        int[] numbers;
        numbers = new int[500];
        int count = 0;
        do {
            System.out.println("Entre com um número:");
            op = teclado.nextInt();
            if(op != number) {
                int rep = 0;
                for (int i = 0; i < count; i++) {
                    if(numbers[i] == op){
                        rep++;
                    }
                }
                numbers[count] = op;
                count++;
                if(rep == 0){
                    System.out.println("Número errado!\n");
                }else {
                    System.out.println("O número " + op + " já foi escolhido " + rep + " vezes\n");
                }
            }
        } while (op != number);
        System.out.println("Parabéns!\n");

    }
}
