package com.fullmadagilists.api2semestre.entidades;

public class CentroResultado{
    private String codigocr;
    private String nomecr;
    private String siglacr;
    
    public CentroResultado() {
    }
    
    public CentroResultado (String codigocr, String nomecr, String siglacr) {
        this.codigocr = codigocr;
        this.nomecr = nomecr;
        this.siglacr = siglacr;
    }

    public String getCodigocr() {
        return codigocr;
    }

    public void setCodigocr(String codigocr) {
        this.codigocr = codigocr;
    }

    public String getNomecr() {
        return nomecr;
    }

    public void setNomecr(String nomecr) {
        this.nomecr = nomecr;
    }

    public String getSiglacr() {
        return siglacr;
    }

    public void setSiglacr(String siglacr) {
        this.siglacr = siglacr;
    }
}