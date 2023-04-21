
package com.fullmadagilists.api2semestre.entidades;

import java.util.Date;

public class Apontamentos {
    private int idapontamentos;
    private String categoria;
    private String justificativa;
    private Date data_hora_inicio;
    private Date data_hora_fim;
    private int id_usuario;
    private int id_cr;

    public Apontamentos(int idapontamentos, String categoria, String justificativa, Date data_hora_inicio, Date data_hora_fim, int id_usuario, int id_cr) {
        this.idapontamentos = idapontamentos;
        this.categoria = categoria;
        this.justificativa = justificativa;
        this.data_hora_inicio = data_hora_inicio;
        this.data_hora_fim = data_hora_fim;
        this.id_usuario = id_usuario;
        this.id_cr = id_cr;
    }

    public int getIdapontamentos() {
        return idapontamentos;
    }

    public void setIdapontamentos(int idapontamentos) {
        this.idapontamentos = idapontamentos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public Date getData_hora_inicio() {
        return data_hora_inicio;
    }

    public void setData_hora_inicio(Date data_hora_inicio) {
        this.data_hora_inicio = data_hora_inicio;
    }

    public Date getData_hora_fim() {
        return data_hora_fim;
    }

    public void setData_hora_fim(Date data_hora_fim) {
        this.data_hora_fim = data_hora_fim;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_cr() {
        return id_cr;
    }

    public void setId_cr(int id_cr) {
        this.id_cr = id_cr;
    }
    
    
}
