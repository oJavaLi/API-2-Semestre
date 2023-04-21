package com.fullmadagilists.api2semestre.telas;


public class TelaApontamentos extends javax.swing.JFrame {


    public TelaApontamentos() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaApontamentos = new javax.swing.JTable();
        botaoApontarHoraExtra = new javax.swing.JButton();
        botaoApontarSobreAviso = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 32, 64));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APONTAMENTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(191, 191, 191)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        tabelaApontamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA", "TIPO", "PROJETO", "HORAS APONTADAS", "AÇÕES"
            }
        ));
        tabelaApontamentos.setPreferredSize(new java.awt.Dimension(500, 80));
        jScrollPane1.setViewportView(tabelaApontamentos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 81, 756, 550));

        botaoApontarHoraExtra.setBackground(new java.awt.Color(49, 117, 185));
        botaoApontarHoraExtra.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoApontarHoraExtra.setForeground(new java.awt.Color(242, 242, 242));
        botaoApontarHoraExtra.setText("+ APONTAR HORA EXTRA");
        botaoApontarHoraExtra.setPreferredSize(new java.awt.Dimension(200, 40));
        botaoApontarHoraExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApontarHoraExtraActionPerformed(evt);
            }
        });
        getContentPane().add(botaoApontarHoraExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 216, -1));

        botaoApontarSobreAviso.setBackground(new java.awt.Color(49, 117, 185));
        botaoApontarSobreAviso.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoApontarSobreAviso.setForeground(new java.awt.Color(242, 242, 242));
        botaoApontarSobreAviso.setText("+ APONTAR SOBRE AVISO");
        botaoApontarSobreAviso.setPreferredSize(new java.awt.Dimension(200, 40));
        botaoApontarSobreAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApontarSobreAvisoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoApontarSobreAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 680, 216, -1));

        botaoSair.setBackground(new java.awt.Color(46, 44, 45));
        botaoSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(242, 242, 242));
        botaoSair.setText("SAIR");
        botaoSair.setPreferredSize(new java.awt.Dimension(200, 40));
        getContentPane().add(botaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 680, 216, -1));

        jButton4.setText("EXCLUIR");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoApontarHoraExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApontarHoraExtraActionPerformed
        TelaApontarHoraExtra horaExtra = new TelaApontarHoraExtra();
        horaExtra.setVisible(true);
    }//GEN-LAST:event_botaoApontarHoraExtraActionPerformed

    private void botaoApontarSobreAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApontarSobreAvisoActionPerformed
        TelaApontarSobreAviso sobreAviso = new TelaApontarSobreAviso();
        sobreAviso.setVisible(true);
    }//GEN-LAST:event_botaoApontarSobreAvisoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaApontamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoApontarHoraExtra;
    private javax.swing.JButton botaoApontarSobreAviso;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaApontamentos;
    // End of variables declaration//GEN-END:variables
}
