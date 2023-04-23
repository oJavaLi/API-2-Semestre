
package com.fullmadagilists.api2semestre.telas;

import static com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados.cadastrarApontamentos;
import com.fullmadagilists.api2semestre.entidades.Apontamentos;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaApontarSobreaviso extends javax.swing.JFrame {
    TelaApontamentos apontamentos;

    public TelaApontarSobreaviso(TelaApontamentos apontamentos) {
        this.apontamentos = apontamentos;
        initComponents();
        tabelaHoraExtra.setFillsViewportHeight(true); // hackzinho pra tabela ficar do tamanho do componente
        buttonGroup1.add(jRadioButtonNao);
        buttonGroup1.add(jRadioButtonSim);
        jScrollPane1.setVisible(false);
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        entradaSobreavisoTextField = new javax.swing.JTextField();
        saidaSobreavisoTextField = new javax.swing.JTextField();
        clienteSobreavisoTextField = new javax.swing.JTextField();
        projetoSobreavisoTextField = new javax.swing.JTextField();
        solicitanteSobreavisoTextField = new javax.swing.JTextField();
        crSobreavisoTextField = new javax.swing.JTextField();
        justificativaSobreavisoTextField = new javax.swing.JTextField();
        botaoSubmeterSobreaviso = new javax.swing.JButton();
        botaoCancelarHoraExtra = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButtonSim = new javax.swing.JRadioButton();
        jRadioButtonNao = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHoraExtra = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 60));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APONTAMENTO SOBREAVISO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jLabel10))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Saida:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Entrada:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Cliente:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Projeto:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Solicitante:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Justificativa:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("CR:");

        projetoSobreavisoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projetoSobreavisoTextFieldActionPerformed(evt);
            }
        });

        solicitanteSobreavisoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitanteSobreavisoTextFieldActionPerformed(evt);
            }
        });

        botaoSubmeterSobreaviso.setBackground(new java.awt.Color(49, 117, 185));
        botaoSubmeterSobreaviso.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoSubmeterSobreaviso.setForeground(new java.awt.Color(255, 255, 255));
        botaoSubmeterSobreaviso.setText("Submeter Sobreaviso");
        botaoSubmeterSobreaviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubmeterSobreavisoActionPerformed(evt);
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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Você fez hora extra durante o período de sobreaviso?");

        jRadioButtonSim.setText("Sim");
        jRadioButtonSim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonSimStateChanged(evt);
            }
        });
        jRadioButtonSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSimActionPerformed(evt);
            }
        });

        jRadioButtonNao.setSelected(true);
        jRadioButtonNao.setText("Não");
        jRadioButtonNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNaoActionPerformed(evt);
            }
        });

        tabelaHoraExtra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Início", "Fim", "Descrição da Atividade"
            }
        ));
        jScrollPane1.setViewportView(tabelaHoraExtra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addGap(303, 303, 303)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(entradaSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saidaSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addGap(185, 185, 185)
                        .addComponent(jLabel6)
                        .addGap(180, 180, 180)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(clienteSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(projetoSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(solicitanteSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(botaoSubmeterSobreaviso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(botaoCancelarHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(justificativaSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(301, 301, 301)
                                .addComponent(jRadioButtonNao)
                                .addGap(57, 57, 57)
                                .addComponent(jRadioButtonSim))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entradaSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saidaSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clienteSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projetoSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solicitanteSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(crSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(justificativaSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonNao)
                    .addComponent(jRadioButtonSim))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botaoSubmeterSobreaviso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(botaoCancelarHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void projetoSobreavisoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projetoSobreavisoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projetoSobreavisoTextFieldActionPerformed

    private void solicitanteSobreavisoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitanteSobreavisoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_solicitanteSobreavisoTextFieldActionPerformed

    private void botaoSubmeterSobreavisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubmeterSobreavisoActionPerformed
        try{
            Apontamentos apontamento = new Apontamentos("Sobreaviso", 
                this.entradaSobreavisoTextField.getText(),
                this.saidaSobreavisoTextField.getText(),
                this.justificativaSobreavisoTextField.getText(), 
                this.clienteSobreavisoTextField.getText(),
                this.projetoSobreavisoTextField.getText(),
                this.solicitanteSobreavisoTextField.getText(),
                this.clienteSobreavisoTextField.getText());
            cadastrarApontamentos(apontamento);
            
            if (jRadioButtonSim.isSelected()) {
                // Cadastra horas extras dentro do sobreaviso
                DefaultTableModel tabelaModel = (DefaultTableModel) tabelaHoraExtra.getModel();
                for (int row = 0; row < tabelaModel.getRowCount(); row++) {
                    String dataHoraInicio = (String) tabelaModel.getValueAt(row, 0);
                    String dataHoraFim = (String) tabelaModel.getValueAt(row, 1);
                    String justificativa = (String) tabelaModel.getValueAt(row, 2);

                    System.out.println(dataHoraInicio);
                    System.out.println(dataHoraFim);
                    System.out.println(justificativa);

                    if (dataHoraInicio == null || dataHoraFim == null || justificativa == null) continue;
                    if (dataHoraInicio.isBlank() || dataHoraFim.isBlank() || justificativa.isBlank()) continue; // Se não preencher tudo passa pro próximo

                    Apontamentos apontamentoHoraExtra = new Apontamentos("Hora Extra", 
                    dataHoraInicio,
                    dataHoraFim,
                    justificativa, 
                    this.clienteSobreavisoTextField.getText(),
                    this.projetoSobreavisoTextField.getText(),
                    this.solicitanteSobreavisoTextField.getText(),
                    this.clienteSobreavisoTextField.getText());
                    cadastrarApontamentos(apontamentoHoraExtra);
                }
            }
            
            JOptionPane.showMessageDialog(null, "Sobre aviso e horas extras cadastradas com Sucesso! ");
            apontamentos.carregarApontamentos();
            apontamentos.setVisible(true);
            this.setVisible(false);
            this.dispose();

        }catch(Exception e){
        System.out.print(e);}
    }//GEN-LAST:event_botaoSubmeterSobreavisoActionPerformed

    private void botaoCancelarHoraExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarHoraExtraActionPerformed
        this.setVisible(false);
        apontamentos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCancelarHoraExtraActionPerformed

    private void jRadioButtonSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSimActionPerformed
        jScrollPane1.setVisible(true);
        tabelaHoraExtra.setVisible(true);
        this.pack(); // acorda o swing falando que ele tem que atualizar a tela de novo
    }//GEN-LAST:event_jRadioButtonSimActionPerformed

    private void jRadioButtonNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNaoActionPerformed
        jScrollPane1.setVisible(false);
        tabelaHoraExtra.setVisible(true);
        this.pack(); // acorda o swing falando que ele tem que atualizar a tela de novo
    }//GEN-LAST:event_jRadioButtonNaoActionPerformed

    private void jRadioButtonSimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButtonSimStateChanged

    }//GEN-LAST:event_jRadioButtonSimStateChanged
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarHoraExtra;
    private javax.swing.JButton botaoSubmeterSobreaviso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField clienteSobreavisoTextField;
    private javax.swing.JTextField crSobreavisoTextField;
    private javax.swing.JTextField entradaSobreavisoTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonNao;
    private javax.swing.JRadioButton jRadioButtonSim;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField justificativaSobreavisoTextField;
    private javax.swing.JTextField projetoSobreavisoTextField;
    private javax.swing.JTextField saidaSobreavisoTextField;
    private javax.swing.JTextField solicitanteSobreavisoTextField;
    private javax.swing.JTable tabelaHoraExtra;
    // End of variables declaration//GEN-END:variables
}
