package engtelecom.poo;

public class Carro {
    private String nome;
    private String cor;
    private Motor motor;

    public Carro(String nome, String cor, Motor motor) {
        this.nome = nome;
        this.cor = cor;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", motor=" + motor +
                '}';
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
