package com.fullmadagilists.api2semestre;

import com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados;
import com.fullmadagilists.api2semestre.telas.Login;
import com.fullmadagilists.api2semestre.telas.TelaApontarHoraExtra;

public class API2Semestre {

    public static void main(String[] args) {
        
        ConexaoBancoDeDados.usuarios();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
