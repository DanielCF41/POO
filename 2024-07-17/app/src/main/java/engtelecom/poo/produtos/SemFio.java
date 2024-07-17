package engtelecom.poo.produtos;

import engtelecom.poo.Dimensao;

public class SemFio extends Telefone {
    /**
     * Frequência do telefone sem fio
     */
    private double frequencia;
    /**
     * Canais do telefone sem fio
     */
    private int canais;
    /**
     * Distancia de operação do telefone sem fio
     */
    private double distanciaDeOperacao;

    /**
     * Método construtor da classe SemFio
     * @param codigo parâmetro código do telefone sem fio
     * @param numeroDeSerie parâmetro número de série do telefone sem fio
     * @param modelo parâmetro modelo do telefone sem fio
     * @param cor parâmetro cor do telefone sem fio
     * @param peso parâmetro peso do telefone sem fio
     * @param dimensoes parâmetro/classe dimensões do telefone sem fio
     * @param frequencia parâmetro frequência do telefone sem fio
     * @param canais parâmetro canais do telefone sem fio
     * @param distanciaDeOperacao parâmetro distância de operaçãoo do telefone sem fio
     */
    public SemFio(int codigo, String numeroDeSerie, String modelo, String cor, double peso, Dimensao dimensoes, double frequencia, int canais, double distanciaDeOperacao) {
        super(codigo, numeroDeSerie, modelo, cor, peso, dimensoes);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaDeOperacao = distanciaDeOperacao;
    }

    @Override
    public String imprimirDados() {
        codigo = 1001;
        return super.imprimirDados() + "\n" + "Frequência: " + frequencia + "\n" + "Canais: " + canais + "\n" + "Distâncida de operação: " + distanciaDeOperacao + "\n";
    }

}
