package engtelecom.poo;

/**
 * Representar uma pessoa em um sistema de informação de comércio
 */

public class Pessoa {

    private String cpf;
    private String endereco;
    private String telefone;
    private String sexo;
    private String nome;
    private String email;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nCpf: " + cpf +
                "\nEndereco: " + endereco +
                "\nTelefone: " + telefone +
                "\nSexo: " + sexo +
                "\nEmail: " + email;
    }
}
