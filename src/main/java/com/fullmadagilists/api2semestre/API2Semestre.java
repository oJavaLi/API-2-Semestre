package com.fullmadagilists.api2semestre;


import com.fullmadagilists.api2semestre.telas.Login;

public class API2Semestre {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
