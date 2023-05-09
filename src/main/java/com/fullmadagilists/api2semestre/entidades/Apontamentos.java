
package com.fullmadagilists.api2semestre.entidades;

import java.util.Date;

public class Apontamentos {
    private int id;
    private String categoria;
    private String data_hora_inicio;
    private String data_hora_fim;
    private String justificativa;
    private String cliente;
    private String projeto;
    private String solicitante;
    private String cr;

    public Apontamentos(){
    }

    public Apontamentos( String categoria, String data_hora_inicio, String data_hora_fim, String justificativa, String cliente, String projeto, String solicitante, String cr) {
        this.categoria = categoria;
        this.data_hora_inicio = data_hora_inicio;
        this.data_hora_fim = data_hora_fim;
        this.justificativa = justificativa;
        this.cliente = cliente;
        this.projeto = projeto;
        this.solicitante = solicitante;
        this.cr = cr;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getData_hora_inicio() {
        return data_hora_inicio;
    }

    public void setData_hora_inicio(String data_hora_inicio) {
        this.data_hora_inicio = data_hora_inicio;
    }

    public String getData_hora_fim() {
        return data_hora_fim;
    }

    public void setData_hora_fim(String data_hora_fim) {
        this.data_hora_fim = data_hora_fim;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }    
}
