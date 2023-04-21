
package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.entidades.Apontamentos;
import java.util.List;


public class TelaApontarHoraExtra extends javax.swing.JFrame {
    List<Apontamentos> apontamentosList;
    TelaApontamentos telaApontamentos;

    /**
     * Creates new form PlacesScreen
     */

    public TelaApontarHoraExtra(List<Apontamentos> apontamentosList, TelaApontamentos telaApontamentos) {
        this.apontamentosList = apontamentosList;
        this.telaApontamentos = telaApontamentos;
        initComponents();
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        entradaHoraExtraTextField = new javax.swing.JTextField();
        saidaHoraExtraTextField = new javax.swing.JTextField();
        clienteHoraExtraTextField = new javax.swing.JTextField();
        projetoHoraExtraTextField = new javax.swing.JTextField();
        solicitanteHoraExtraTextField = new javax.swing.JTextField();
        crHoraExtraTextField = new javax.swing.JTextField();
        justificativaHoraExtraTextField = new javax.swing.JTextField();
        botaoSubmeterHoraExtra = new javax.swing.JButton();
        botaoCancelarHoraExtra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 60));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APONTAMENTO HORA EXTRA");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\aless\\Documents\\API-2-Semestre\\src\\main\\java\\com\\fullmadagilists\\api2semestre\\telas\\imagens\\logo.png")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\aless\\Documents\\API-2-Semestre\\src\\main\\java\\com\\fullmadagilists\\api2semestre\\telas\\imagens\\person.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(134, 134, 134)
                .addComponent(jLabel10)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\aless\\Documents\\API-2-Semestre\\src\\main\\java\\com\\fullmadagilists\\api2semestre\\telas\\imagens\\horario.png")); // NOI18N
        jLabel3.setText("Saida:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\aless\\Documents\\API-2-Semestre\\src\\main\\java\\com\\fullmadagilists\\api2semestre\\telas\\imagens\\horario.png")); // NOI18N
        jLabel4.setText("Entrada:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\aless\\Documents\\API-2-Semestre\\src\\main\\java\\com\\fullmadagilists\\api2semestre\\telas\\imagens\\cliente.png")); // NOI18N
        jLabel5.setText("Cliente:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\aless\\Documents\\API-2-Semestre\\src\\main\\java\\com\\fullmadagilists\\api2semestre\\telas\\imagens\\projeto.png")); // NOI18N
        jLabel6.setText("Projeto:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\aless\\Documents\\API-2-Semestre\\src\\main\\java\\com\\fullmadagilists\\api2semestre\\telas\\imagens\\solicitante.png")); // NOI18N
        jLabel7.setText("Solicitante:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\aless\\Documents\\API-2-Semestre\\src\\main\\java\\com\\fullmadagilists\\api2semestre\\telas\\imagens\\mensagem.png")); // NOI18N
        jLabel8.setText("Justificativa:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\aless\\Documents\\API-2-Semestre\\src\\main\\java\\com\\fullmadagilists\\api2semestre\\telas\\imagens\\cr.png")); // NOI18N
        jLabel9.setText("CR:");

        projetoHoraExtraTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projetoHoraExtraTextFieldActionPerformed(evt);
            }
        });

        solicitanteHoraExtraTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitanteHoraExtraTextFieldActionPerformed(evt);
            }
        });

        botaoSubmeterHoraExtra.setBackground(new java.awt.Color(49, 117, 185));
        botaoSubmeterHoraExtra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoSubmeterHoraExtra.setForeground(new java.awt.Color(255, 255, 255));
        botaoSubmeterHoraExtra.setText("Submeter Hora Extra");
        botaoSubmeterHoraExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubmeterHoraExtraActionPerformed(evt);
            }
        });

        botaoCancelarHoraExtra.setBackground(new java.awt.Color(46, 44, 45));
        botaoCancelarHoraExtra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoCancelarHoraExtra.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancelarHoraExtra.setText("Cancelar");
        botaoCancelarHoraExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarHoraExtraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCancelarHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSubmeterHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clienteHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projetoHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(solicitanteHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(crHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entradaHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(saidaHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(justificativaHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saidaHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projetoHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solicitanteHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(justificativaHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(botaoSubmeterHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCancelarHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void projetoHoraExtraTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projetoHoraExtraTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projetoHoraExtraTextFieldActionPerformed

    private void solicitanteHoraExtraTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitanteHoraExtraTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_solicitanteHoraExtraTextFieldActionPerformed

    private void botaoSubmeterHoraExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubmeterHoraExtraActionPerformed
        // TODO add your handling code here:
        Apontamentos apontamentos = new Apontamentos(1, "Hora Extra",
                this.justificativaHoraExtraTextField.getText(), 
                this.entradaHoraExtraTextField.getText(),
                this.saidaHoraExtraTextField.getText(), 1, 1);
        
        this.apontamentosList.add(apontamentos);
        this.TelaApontamentos.refreshtabelaApontamentos();
        
    }//GEN-LAST:event_botaoSubmeterHoraExtraActionPerformed

    private void botaoCancelarHoraExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarHoraExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCancelarHoraExtraActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarHoraExtra;
    private javax.swing.JButton botaoSubmeterHoraExtra;
    private javax.swing.JTextField clienteHoraExtraTextField;
    private javax.swing.JTextField crHoraExtraTextField;
    private javax.swing.JTextField entradaHoraExtraTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField justificativaHoraExtraTextField;
    private javax.swing.JTextField projetoHoraExtraTextField;
    private javax.swing.JTextField saidaHoraExtraTextField;
    private javax.swing.JTextField solicitanteHoraExtraTextField;
    // End of variables declaration//GEN-END:variables
}
