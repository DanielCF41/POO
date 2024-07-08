
package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public App() {
        this.tarefas = tarefas;
    }

    public void criarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public static void main(String[] args) {
        App app = new App();

        Pessoa daniel = new Pessoa("Daniel");
        Pessoa guerra = new Pessoa("Guerra");
        Pessoa juca = new Pessoa("Juca");

        Classificacao estudo = new Classificacao("Estudar");
        Classificacao domestica = new Classificacao("Doméstica");
        Classificacao pessoal = new Classificacao("Pessoal");

        ArrayList<Pessoa> estudar = new ArrayList<>();
        estudar.add(daniel);
        estudar.add(guerra);
        estudar.add(juca);

        ArrayList<Pessoa> limpar = new ArrayList<>();
        limpar.add(juca);
        limpar.add(daniel);

        ArrayList<Pessoa> comprar = new ArrayList<>();
        comprar.add(guerra);

        Tarefa tarefa1 = new Tarefa("Estudar física", LocalDate.of(2024, 7, 1), estudo, estudar);
        Tarefa tarefa2 = new Tarefa("Limpar a casa", LocalDate.of(2024,7,10), domestica, limpar);
        Tarefa tarefa3 = new Tarefa("Comprar remédio", LocalDate.of(2024, 7, 17), pessoal, comprar);

        app.criarTarefa(tarefa1);
        app.criarTarefa(tarefa2);
        app.criarTarefa(tarefa3);

        System.out.println(app.tarefas);

    }
}
