package com.fullmadagilists.api2semestre.entidades;

public class Usuario {
    private int matricula;
    private String nome;
    private String senha;
    private String categoria;

    public Usuario() {
    }

    public Usuario(int matricula, String nome, String senha, String categoria) {
        this.matricula = matricula;
        this.nome = nome;
        this.senha = senha;
        this.categoria = categoria;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    

}
