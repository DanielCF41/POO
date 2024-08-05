package engtelecom.poo;

public class Caixa<T extends Pessoa> {
    private T conteudo;

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
}
