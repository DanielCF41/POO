package engtelecom.poo.produtos;

import engtelecom.poo.Dimensao;

public class Telefone {
    /**
     * código de barras do telefone
     */
    protected int codigo;
    /**
     * número de série do telefone
     */
    private String numeroDeSerie;
    /**
     * modelo do telefone
     */
    private String modelo;
    /**
     * cor do telefone
     */
    private String cor;
    /**
     * peso do telefone
     */
    private double peso;
    /**
     * Dimensões do telefone
     */
    private Dimensao dimensoes;

    /**
     * Método construtor da classe Telefone
     * @param codigo parâmetro códgido do telefone
     * @param numeroDeSerie parâmetro número de série do telefone
     * @param modelo parâmetro modelo do telefone
     * @param cor parâmetro cor do telefone
     * @param peso parâmetro peso do telefone
     * @param dimensoes parâmetro dimensões do telefone
     */
    public Telefone(int codigo, String numeroDeSerie, String modelo, String cor, double peso, Dimensao dimensoes) {
        this.codigo = codigo;
        this.numeroDeSerie = numeroDeSerie;
        this.modelo = modelo;
        this.cor = cor;
        this.peso = peso;
        this.dimensoes = dimensoes;
    }

    /**
     *  Imprime os dados da classe Telefone
     * @return string com todos os dados da classe telefone
     */
    public String imprimirDados(){
        return "TELEFONE\n" + "Cógido: " + this.codigo + "\n" + "N°série: " + this.numeroDeSerie + "\n" +
                "Modelo: " + this.modelo + "\n" + "Cor: " + this.cor + "\n" + "Peso: " + this.peso + "\n"
                + dimensoes;

    }
}
