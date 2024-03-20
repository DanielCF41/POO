package engtelecom.poo;

public class App {

    public static void main(String[] args) {
        Ponto p = new Ponto(2,3);
        Ponto p1 = new Ponto(5 ,8);
        System.out.println(p.toString());
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(p.distanciaPontos(p1));

        p.setX(74);
        p.setY(50);
        System.out.println(p.toString());
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(p.distanciaPontos(p1));
    }

}
