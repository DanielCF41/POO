package engtelecom.poo.pt1;

public class Pilha<E> {
    private int topo;
    private int tamanho;
    private E[] pilha;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        pilha = (E[]) new Object[tamanho];
        this.topo = -1;
    }

    public void empilhar (E o) throws PilhaCheiaException{
        if(full()){
            throw new PilhaCheiaException("A pilha está cheia");
        }else{
            pilha[++topo] =  o;
        }
    }

    public E desempilhar() throws PilhaVaziaException{
        if(empty()){
            throw new PilhaVaziaException("A pilha está vazia");
        }else {
            return pilha[topo--];
        }
    }

    public E elementoTopo() throws PilhaVaziaException{
        if(empty()){
            throw new PilhaVaziaException("A pilha está vazia");
        } else {
            return pilha[topo];
        }
    }

    public boolean empty(){
        if(topo == -1){
            return true;
        }
        return false;
    }

    public boolean full(){
        if(topo == tamanho - 1){
            return true;
        }
        return false;
    }



}
