
package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.entidades.CentroResultado;
import javax.swing.JOptionPane;

public class TelaNovoCr extends javax.swing.JFrame {
    private TelaListarCr centroresultado;

    public TelaNovoCr(TelaListarCr centroresultado) {
        this.centroresultado = centroresultado;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        codigoCRTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        nomeCRTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        siglaCRTextField = new javax.swing.JTextField();
        botaoSubmeterCR = new javax.swing.JButton();
        botaoCancelarCR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOVO CENTRO DE RESULTADO");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logo)
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addGap(125, 125, 125)
                .addComponent(icon)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo)
                    .addComponent(icon)
                    .addComponent(jLabel1))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("Código CR:");

        codigoCRTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoCRTextFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Nome CR:");

        nomeCRTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCRTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Sigla CR:");

        siglaCRTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siglaCRTextFieldActionPerformed(evt);
            }
        });

        botaoSubmeterCR.setBackground(new java.awt.Color(49, 117, 185));
        botaoSubmeterCR.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoSubmeterCR.setForeground(new java.awt.Color(255, 255, 255));
        botaoSubmeterCR.setText("Submeter Hora Extra");
        botaoSubmeterCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubmeterCRActionPerformed(evt);
            }
        });

        botaoCancelarCR.setBackground(new java.awt.Color(46, 44, 45));
        botaoCancelarCR.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoCancelarCR.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancelarCR.setText("Cancelar");
        botaoCancelarCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarCRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(siglaCRTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(codigoCRTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(nomeCRTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botaoCancelarCR, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSubmeterCR, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(281, 281, 281))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addComponent(codigoCRTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(nomeCRTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(siglaCRTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addComponent(botaoSubmeterCR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCancelarCR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoCRTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoCRTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoCRTextFieldActionPerformed

    private void nomeCRTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCRTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCRTextFieldActionPerformed

    private void siglaCRTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siglaCRTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siglaCRTextFieldActionPerformed

    private void botaoSubmeterCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubmeterCRActionPerformed
        // TODO add your handling code here:
        try{
            CentroResultado centroderesultado = new CentroResultado("Centro de Resultado",
                
                this.codigoCRTextField.getText(),
                this.nomeCRTextField.getText(),
                this.siglaCRTextField.getText());

            carregarCentroresultado(centroderesultado);
            JOptionPane.showMessageDialog(null, "CR cadastrado com Sucesso! ");
            centroresultado.carregarCentroresultado();
            centroresultado.setVisible(true);
            this.setVisible(false);
            this.dispose();

        }catch(Exception e){
            System.out.print(e);}
    }//GEN-LAST:event_botaoSubmeterCRActionPerformed

    private void botaoCancelarCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarCRActionPerformed
        this.setVisible(false);
        centroresultado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCancelarCRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarCR;
    private javax.swing.JButton botaoSubmeterCR;
    private javax.swing.JTextField codigoCRTextField;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nomeCRTextField;
    private javax.swing.JTextField siglaCRTextField;
    // End of variables declaration//GEN-END:variables
}
