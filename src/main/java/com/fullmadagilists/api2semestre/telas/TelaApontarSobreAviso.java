
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APONTAR SOBREAVISO");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logo)
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(icon)
                .addGap(126, 126, 126))
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/horario.png"))); // NOI18N
        jLabel4.setText("Entrada:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/horario.png"))); // NOI18N
        jLabel3.setText("Saida:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente.png"))); // NOI18N
        jLabel5.setText("Cliente:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto.png"))); // NOI18N
        jLabel6.setText("Projeto:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solicitante.png"))); // NOI18N
        jLabel7.setText("Solicitante:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr.png"))); // NOI18N
        jLabel9.setText("CR:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mensagem.png"))); // NOI18N
        jLabel8.setText("Justificativa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(303, 303, 303)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(saidaSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(entradaSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(183, 183, 183)
                .addComponent(jLabel6)
                .addGap(177, 177, 177)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(justificativaSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(crSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jRadioButtonNao)
                        .addGap(57, 57, 57)
                        .addComponent(jRadioButtonSim))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSubmeterSobreaviso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCancelarHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addComponent(saidaSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(entradaSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clienteSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projetoSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solicitanteSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(justificativaSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonNao)
                    .addComponent(jRadioButtonSim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
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
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel logo;
    private javax.swing.JTextField projetoSobreavisoTextField;
    private javax.swing.JTextField saidaSobreavisoTextField;
    private javax.swing.JTextField solicitanteSobreavisoTextField;
    private javax.swing.JTable tabelaHoraExtra;
    // End of variables declaration//GEN-END:variables
}
