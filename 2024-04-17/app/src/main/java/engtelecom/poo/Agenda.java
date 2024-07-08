package engtelecom.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class Agenda {
    ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean adicionarContato (Contato contato){
        if(contatos.add(contato)) {
            return true;
        }
        return false;
    }

    public boolean removerContato (String nome, String sobrenome){
        if(contatos.removeIf(elemento->elemento.getNome().equals(nome) && elemento.getSobrenome().equals(sobrenome))){
            return true;
        }
        return false;
    }

    public boolean adicionarTelefone (String rotulo, String numero, Contato c){
        Telefone novo = new Telefone(numero, rotulo);
        if(c.adicionarTelefone(novo)){
            return true;
        }
        return false;
    }

    public boolean adicionarEmail (String rotulo, String email, Contato c){
        Email novo = new Email(email, rotulo);
        if(c.adicionarEmail(novo)){
            return true;
        }
        return false;
    }

    public boolean atualizarTelefone (String rotulo, String telefone, Contato c){
        if(c.atualizarTelefone(rotulo, telefone)){
            return true;
        }
        return false;
    }

    public boolean atualizarEmail (String rotulo, String email, Contato c){
        if(c.atualizarEmail(rotulo, email)){
            return true;
        }
        return false;
    }

    public boolean removeTelefone (String rotulo, Contato c){
        if(c.removeTelefone(rotulo)){
            return true;
        }
        return false;
    }

    public boolean removeEmail (String rotulo, Contato c){
        if(c.removeEmail(rotulo)){
            return true;
        }
        return false;
    }

    public void listarContatos(){
        int i = 0;
        for (int j = 0; j < contatos.size(); j++) {
            System.out.println("ID[" + i + "]" + "\n" + contatos.get(j));
            i++;
        }
    }
    @Override
    public String toString() {
        return "...::: AGENDA :::...\n" + contatos.toString();
    }
}
