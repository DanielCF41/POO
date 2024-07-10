package engtelecom.poo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TermometroTest {
    @Test
    public void testeConstrutor() {
        Termometro termometro = new Termometro('C',50, 100,0);
        assertEquals("A = 50 °C\nMÍN = 0 °C\nMÁX = 100 °C", termometro.toString());

        assertFalse(termometro.setTemperaturaAtual(-50));
        assertFalse(termometro.setTemperaturaAtual(500));
        assertFalse(termometro.setEscala('H'));
    }
    @Test
    public void testeRetornaTemperatura(){
        Termometro termometro =  new Termometro('C',50, 100,0);

        assertEquals("A = 122 °F\nMÍN = 32 °F\nMÁX = 212 °F",termometro.retornaTemperatura('F'));
        assertEquals("A = 232.15 °K\nMÍN = 273.15 °F\nMÁX = 373.15 °F", termometro.retornaTemperatura('K'));
        assertEquals("A = 50,0 °C\nMÍN = 0,0 °C\nMÁX = 100,0 °C", termometro.retornaTemperatura('C'));

    }


}
