package engtelecom.poo;

import java.util.Random;

public class Buzz {

    // Atributos
    private boolean capaceteAberto = false;
    private boolean asaAberta = false;

    String[] frases = {"Ao infinito... e além!","Eu não sou um brinquedo, sou um patrulheiro espacial!",
    "Essa não é a Terra, é uma cópia exata!", "Aqui, entre o universo e a humanidade, estou eu.",
            "Nunca duvidei, sempre soube que era um brinquedo.",
            "Com licença, senhor. Meu amigo está nos esperando."};

    //Métodos
    public void abrirFecharCapacete(){
        capaceteAberto = !capaceteAberto;
    }

    public void abrirAsa(){
        asaAberta = !asaAberta;
    }

    public void dispararLaser(){
        System.out.println("Disparando laser ---**********|||");
    }

    public void aplicarGolpe(){
        System.out.println("Golpeando!");
    }

    public String falas(){
        Random r = new Random();
        return frases[r.nextInt(6)];
    }
}
