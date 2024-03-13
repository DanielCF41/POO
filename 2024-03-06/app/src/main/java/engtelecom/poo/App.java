package engtelecom.poo;

import org.checkerframework.checker.units.qual.C;

import java.sql.SQLOutput;

public class App {

    public static void main(String[] args) {
//        Carro c = new Carro();
//        Carro d = new Carro();
//
//        System.out.println("Velocidade c: " + c.obterVelocidade());
//        c.acelerar(10);
//        System.out.println("Velocidade c: " + c.obterVelocidade());
//
//        System.out.println("Velocidade d: " + d.obterVelocidade());
//
//        Contador a = new Contador();
//
//        System.out.println("Contagem: " + a.atual());
//        a.incrementar();
//        a.incrementar();
//        a.incrementar();
//        System.out.println("Contagem: " + a.atual());
//        a.atribuir(20);
//        System.out.println("Contagem: " + a.atual());
//        a.incrementar();
//        a.incrementar();
//        a.incrementar();
//        System.out.println("Contagem: " + a.atual());
//        Caneta bic = new Caneta();
//        bic.definirCor("azul");
//        bic.definirNivelTinta(3);
//
//        bic.abrirFechar();
//        bic.desenhar();
//        bic.desenhar();
//        bic.desenhar();
//        bic.desenhar();
//
//        Caneta pilot = new Caneta();
//        pilot.definirCor("vermelha");
//        pilot.definirNivelTinta(1);
//
//        pilot.abrirFechar();
//        pilot.desenhar();
//        Buzz b = new Buzz();
//        b.abrirAsa();
//        b.abrirFecharCapacete();
//        b.aplicarGolpe();
//        b.dispararLaser();
//        System.out.println(b.falas());

        Pessoa[] vetor = new Pessoa[10];

        //Pessoa juca = new Pessoa();
        vetor[0] = new Pessoa();
        vetor[0].setNome("Juca da Silva");
        vetor[0].setCpf("159.147.245-20");
        vetor[0].setSexo("Masculino");
        vetor[0].setEmail("juca.silva1998@gmail.com");
        vetor[0].setTelefone("(11) 99526-2354");
        vetor[0].setEndereco("Rua das PseudoBananas, 154");

        Pessoa ana = new Pessoa();
        ana.setNome("Ana");
        ana.setCpf("222.000.222-00");
        ana.setSexo("Feminino");
        ana.setEndereco("Rua Rio Verde");
        ana.setTelefone("(22) 51515656156");
        ana.setEmail("ana@example.com");

        vetor[1] = ana;

//        for (int i = 0; i < vetor.length; i++) {
//            if(vetor[i] != null) {
//                System.out.println(vetor[i] + "\n");
//            }
//        }
        for(Pessoa p: vetor){
            if(p != null) {
                System.out.println(p);
            }
        }

    }

}
