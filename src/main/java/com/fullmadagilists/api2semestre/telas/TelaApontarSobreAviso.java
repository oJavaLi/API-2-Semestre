
package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados;
import static com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados.cadastrarApontamentos;
import com.fullmadagilists.api2semestre.entidades.Apontamentos;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaApontarSobreAviso extends javax.swing.JFrame {
    TelaApontamentos apontamentos;
    Usuario usuario;

    public TelaApontarSobreAviso(TelaApontamentos apontamentos, Usuario usuario) {
        this.apontamentos = apontamentos;
        this.usuario = usuario;
        initComponents();
        String user = usuario.getNome();
        jLabel2.setText(user);
        jLabel2.setForeground(Color.WHITE);
        carregarClientes();
        carregarCR();
        tabelaHoraExtra.setFillsViewportHeight(true); // hackzinho pra tabela ficar do tamanho do componente
        buttonGroup1.add(jRadioButtonNao);
        buttonGroup1.add(jRadioButtonSim);
        jScrollPane1.setVisible(false);

        // Arredonda Hora
        Calendar hora = Calendar.getInstance();
        dataEntrada.setDate(hora.getTime());
        hora.add(Calendar.HOUR, 1);
        dataSaida.setDate(hora.getTime());
    }

    private void carregarClientes() {
        try {
            Connection conexao = ConexaoBancoDeDados.conector();
            String clientesquery = "select razao_social from cliente";
            Statement stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(clientesquery);

            while (resultado.next()) {
                clienteTextField.addItem(resultado.getString("razao_social"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void carregarCR() {
    try {
        Connection conexao = ConexaoBancoDeDados.conector();
        String crquery = "select nomeCR from centroresultado";
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(crquery);

        while (resultado.next()) {
            crTextField.addItem(resultado.getString("nomeCR"));
        }
    } catch(Exception e) {
        e.printStackTrace();
    }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        justificativaSobreavisoTextField = new javax.swing.JTextField();
        botaoSubmeterSobreaviso = new javax.swing.JButton();
        botaoCancelarHoraExtra = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButtonSim = new javax.swing.JRadioButton();
        jRadioButtonNao = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHoraExtra = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        projetoTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        solicitanteTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        clienteTextField = new javax.swing.JComboBox<>();
        dataEntrada = new com.toedter.calendar.JSpinnerDateEditor();
        dataSaida = new com.toedter.calendar.JSpinnerDateEditor();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        crTextField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person.png"))); // NOI18N

        jLabel2.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APONTAR SOBREAVISO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logo)
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(logo)
                                .addComponent(icon)))))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mensagem.png"))); // NOI18N
        jLabel8.setText("Justificativa:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr.png"))); // NOI18N
        jLabel9.setText("CR:");

        projetoTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        projetoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projetoTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/horario.png"))); // NOI18N
        jLabel3.setText("Saida:");

        solicitanteTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        solicitanteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitanteTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/horario.png"))); // NOI18N
        jLabel4.setText("Entrada:");

        clienteTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clienteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteTextFieldActionPerformed(evt);
            }
        });

        dataEntrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dataSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente.png"))); // NOI18N
        jLabel5.setText("Cliente:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto.png"))); // NOI18N
        jLabel6.setText("Projeto:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solicitante.png"))); // NOI18N
        jLabel7.setText("Solicitante:");

        crTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        crTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(dataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(crTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(solicitanteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(projetoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(justificativaSobreavisoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(solicitanteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(projetoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
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

    private void crTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crTextFieldActionPerformed

    private void botaoSubmeterSobreavisoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoSubmeterSobreavisoActionPerformed

        // Pega a data escolhida pelo usuario no formulário
        Date dataE = dataEntrada.getDate();
        Date dataS = dataSaida.getDate();

        // Formata a Data
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataFormatadaE = formatador.format(dataE);
        String dataFormatadaS = formatador.format(dataS);

        try {
            Apontamentos apontamento = new Apontamentos("Sobreaviso",
                    dataFormatadaE,
                    dataFormatadaS,
                    this.justificativaSobreavisoTextField.getText(),
                    this.clienteTextField.getSelectedItem().toString(),
                    this.projetoTextField.getText(),
                    this.solicitanteTextField.getText(),
                    this.crTextField.getSelectedItem().toString());

            cadastrarApontamentos(apontamento, this.usuario);

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

                    if (dataHoraInicio == null || dataHoraFim == null || justificativa == null)
                        continue;
                    if (dataHoraInicio.isBlank() || dataHoraFim.isBlank() || justificativa.isBlank())
                        continue; // Se não preencher tudo passa pro próximo

                    Apontamentos apontamentoHoraExtra = new Apontamentos("Hora Extra",
                            dataHoraInicio,
                            dataHoraFim,
                            justificativa,
                            this.clienteTextField.getSelectedItem().toString(),
                            this.projetoTextField.getText(),
                            this.solicitanteTextField.getText(),
                            this.crTextField.getSelectedItem().toString());
                    cadastrarApontamentos(apontamentoHoraExtra, usuario);
                }
            }

            JOptionPane.showMessageDialog(null, "Sobre aviso e horas extras cadastradas com Sucesso! ");
            apontamentos.carregarApontamentos();
            apontamentos.setVisible(true);
            this.setVisible(false);
            this.dispose();

        } catch (Exception e) {
            System.out.print(e);
        }
    }// GEN-LAST:event_botaoSubmeterSobreavisoActionPerformed

    private void botaoCancelarHoraExtraActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoCancelarHoraExtraActionPerformed
        this.setVisible(false);
        apontamentos.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_botaoCancelarHoraExtraActionPerformed

    private void jRadioButtonSimActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioButtonSimActionPerformed
        jScrollPane1.setVisible(true);
        tabelaHoraExtra.setVisible(true);
        this.pack(); // acorda o swing falando que ele tem que atualizar a tela de novo
    }// GEN-LAST:event_jRadioButtonSimActionPerformed

    private void jRadioButtonNaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioButtonNaoActionPerformed
        jScrollPane1.setVisible(false);
        tabelaHoraExtra.setVisible(true);
        this.pack(); // acorda o swing falando que ele tem que atualizar a tela de novo
    }// GEN-LAST:event_jRadioButtonNaoActionPerformed

    private void jRadioButtonSimStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jRadioButtonSimStateChanged

    }// GEN-LAST:event_jRadioButtonSimStateChanged

    private void projetoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_projetoTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_projetoTextFieldActionPerformed

    private void solicitanteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_solicitanteTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_solicitanteTextFieldActionPerformed


    private void clienteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clienteTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_clienteTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarHoraExtra;
    private javax.swing.JButton botaoSubmeterSobreaviso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> clienteTextField;
    private javax.swing.JComboBox<String> crTextField;
    private com.toedter.calendar.JSpinnerDateEditor dataEntrada;
    private com.toedter.calendar.JSpinnerDateEditor dataSaida;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel logo;
    private javax.swing.JTextField projetoTextField;
    private javax.swing.JTextField solicitanteTextField;
    private javax.swing.JTable tabelaHoraExtra;
    // End of variables declaration//GEN-END:variables
}