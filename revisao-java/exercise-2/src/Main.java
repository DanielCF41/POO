public class Main {
    public static void main(String[] args) {
        float p1 = Float.parseFloat(args[0]);
        float p2 = Float.parseFloat(args[1]);
        float p3 = Float.parseFloat(args[2]);

        if ((((p1 * 2) + (p2 * 3)) / 5) * 0.9 + p3 * 0.1 >= 6) {
            System.out.println("APROVADO\n");
        } else {
            System.out.println("REPROVADO\n");
        }
    }
}
