package com.fullmadagilists.api2semestre.entidades;

public class CentroResultado{
    private int codigocr;
    private String nomecr;
    private String siglacr;
    
    public CentroResultado() {
    }
    
    public CentroResultado (int codigocr, String nomecr, String seglacr) {
        this.codigocr = codigocr;
        this.nomecr = nomecr;
        this.siglacr = siglacr;
    }

    public int getCodigocr() {
        return codigocr;
    }

    public void setCodigocr(int codigocr) {
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