package engtelecom.poo;

public class AppCarro {
    public static void main(String[] args) {
        Carro2 c = new Carro2(200, 200);
        System.out.println(c.getVelocidade());
        c.acelerarCarro(10);
        System.out.println(c.getVelocidade());
        c.frearCarro(200);
        System.out.println(c.getVelocidade());
        c.acelerarCarro(-10);
        System.out.println(c.getVelocidade());
        c.frearCarro(-10);
        System.out.println(c.getVelocidade());
        c.acelerarCarro(10);
        System.out.println(c.getVelocidade());
        c.acelerarCarro(150);
        System.out.println(c.getVelocidade());
        c.acelerarCarro(50);
        System.out.println(c.getVelocidade());
        c.frearCarro(210);
        System.out.println(c.getVelocidade());
        c.frearCarro(210);
        System.out.println(c.getVelocidade());
    }
}
