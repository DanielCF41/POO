package engtelecom.poo;

// Qual o contexto? SIGAA

import java.time.LocalDate;

public class Aluno {
    private String matricula;
    private String nome;
    private String curso;
    private String situacao; //Ativo, cancelado, trancado
    private String email;
    private LocalDate dataNascimento;
    private String cpf;

    public Aluno(String matricula, String nome, String curso, String email, LocalDate dataNascimento, String cpf){
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.situacao = "ativo";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "..:: ALUNO ::..\n Matricula:" + matricula + "\nNome:" + nome + "\nCurso:" + curso + "\nData:" + dataNascimento + "\nCPF:" + cpf + "\nSituação:"
                + situacao + "\nEmail:" + email;
    }
}
