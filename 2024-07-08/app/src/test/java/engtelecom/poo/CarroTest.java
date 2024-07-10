package engtelecom.poo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroTest {

    @Test
    public void validarConstrutor(){
        Carro c = new Carro();
        assertEquals(0,c.getVelocidadeAtual());
    }

    @Test
    public void testeAcelerar(){
        Carro c = new Carro();

        assertEquals(10, c.acelerar(10));
        assertEquals(20, c.acelerar(10));
        assertEquals(20, c.acelerar(-1));
        assertEquals(20, c.acelerar(0));

        c.frear(20);

        assertEquals(120, c.acelerar(120));
        assertEquals(120, c.acelerar(20));
        assertEquals(120, c.acelerar(0));
        assertEquals(120, c.acelerar(-250));

        c.frear(120);

        assertEquals(120, c.acelerar(140));

    }

    @Test
    public void testeFrear(){
        Carro c = new Carro();

        c.acelerar(30);

        assertEquals(10, c.frear(20));
        assertEquals(10, c.frear(0));
        assertEquals(10, c.frear(-10));
        assertEquals(0,c.frear(20));
    }

}
