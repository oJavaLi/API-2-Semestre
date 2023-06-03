package com.fullmadagilists.api2semestre.entidades;


public class Parametro {
    private String descricao;
    private String horas;
    private String porcentagem;
    private String verba;
    
    public Parametro() {
    }
    
    public Parametro (String descricao, String horas, String porcentagem, String verba){
    
        this.descricao = descricao;
        this.horas = horas;
        this.porcentagem = porcentagem;
        this.verba = verba;
        
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(String porcentagem) {
        this.porcentagem = porcentagem;
    }

    public String getVerba() {
        return verba;
    }

    public void setVerba(String verba) {
        this.verba = verba;
    }
  
}