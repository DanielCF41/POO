package engtelecom.poo;

import java.time.LocalDate;
import java.util.HashMap;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private HashMap<String, Telefone> telefones;
    private HashMap<String, Email> emails;

    public Contato(String nome, String sobrenome,LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.telefones = new HashMap<>();
        this.emails = new HashMap<>();
    }

    public boolean adicionarTelefone(Telefone telefone){
        if(telefones.containsKey(telefone.getRotulo())){
            return false;
        }else{
            telefones.put(telefone.getRotulo(), telefone);
            return true;
        }
    }

    public boolean adicionarEmail (Email email){
        if(emails.containsKey(email.getRotulo())){
            return false;
        }else{
            if(email.getValor() != null) {
                emails.put(email.getRotulo(), email);
                return true;
            }
            return false;
        }
    }

    public boolean removeTelefone (String rotulo){
        if( telefones.remove(rotulo) != null){
            return true;
        }
        return false;
    }


    public boolean removeEmail (String rotulo){
        if( emails.remove(rotulo) != null){
            return true;
        }
        return false;
    }

    public boolean atualizarTelefone (String rotulo, String telefone){
        if(telefones.containsKey(rotulo)){
            Telefone auxNovo = telefones.get(rotulo);
            auxNovo.setValor(telefone);
            return true;
        }
        return false;
    }

    public boolean atualizarEmail (String rotulo, String email){
        if(emails.containsKey(rotulo)){
            Email auxNovo = emails.get(rotulo);
            auxNovo.setValor(email);
            if(auxNovo.getValor() == null){
                return false;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public HashMap<String, Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(HashMap<String, Telefone> telefones) {
        this.telefones = telefones;
    }

    public HashMap<String, Email> getEmails() {
        return emails;
    }

    public void setEmails(HashMap<String, Email> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("..::Telefones::..\n");
        this.telefones.forEach((s, telefone) -> new StringBuilder().append(telefone.getRotulo()).append(" - ").append(telefone.getValor()).toString());
        return "Nome: " + nome + sobrenome + "\n" + "Data de nascimento: " + dataNascimento + "\n"
                + telefones.toString() + emails.toString();
    }
}