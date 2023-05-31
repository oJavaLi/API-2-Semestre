
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


public class TelaApontarHoraExtra extends javax.swing.JFrame {
    private TelaApontamentos apontamentos;
    private Usuario usuario;
    private Apontamentos config;

    public TelaApontarHoraExtra(TelaApontamentos apontamentos, Usuario usuario,Apontamentos config) {
        this.apontamentos = apontamentos;
        this.usuario = usuario;
        this.config = config;
        initComponents();
        carregarClientes();
        carregarCR();
        String user = usuario.getNome();
        jLabel2.setText(user);
        jLabel2.setForeground(Color.WHITE);
        solicitanteHoraExtraTextField.setText(user);

        // Arredonda Hora
        Calendar hora = Calendar.getInstance();
        dataEntrada.setDate(hora.getTime());
        hora.add(Calendar.HOUR, 1);
        dataSaida.setDate(hora.getTime());
        if(config!=null){
            Date dataE = dataEntrada.getDate();
            Date dataS = dataSaida.getDate();

        //Formata a Data
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String dataFormatadaE = formatador.format(dataE);
            String dataFormatadaS = formatador.format(dataS);

            int id = config.getId();
            dataEntrada.setDate(dataE);
            dataSaida.setDate(dataS);
            solicitanteHoraExtraTextField.setText(config.getSolicitante());
            projetoHoraExtraTextField.setText(config.getProjeto());
            clienteHoraExtraTextField.setSelectedItem(config.getCliente());
            crHoraExtraTextField.setSelectedItem(config.getCr());
            justificativaHoraHextraJTextArea.setText(config.getJustificativa());
         }
        
    }
    private void carregarClientes() {
    try {
        Connection conexao = ConexaoBancoDeDados.conector();
        String clientesquery = "select razao_social from cliente";
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(clientesquery);

        while (resultado.next()) {
            clienteHoraExtraTextField.addItem(resultado.getString("razao_social"));
        }
    } catch(Exception e) {
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
            crHoraExtraTextField.addItem(resultado.getString("nomeCR"));
        }
    } catch(Exception e) {
        e.printStackTrace();
    }

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        projetoHoraExtraTextField = new javax.swing.JTextField();
        solicitanteHoraExtraTextField = new javax.swing.JTextField();
        botaoSubmeterHoraExtra = new javax.swing.JButton();
        botaoCancelarHoraExtra = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        clienteHoraExtraTextField = new javax.swing.JComboBox<>();
        dataEntrada = new com.toedter.calendar.JSpinnerDateEditor();
        dataSaida = new com.toedter.calendar.JSpinnerDateEditor();
        crHoraExtraTextField = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        justificativaHoraHextraJTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente.png"))); // NOI18N
        jLabel5.setText("Cliente:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto.png"))); // NOI18N
        jLabel6.setText("Projeto:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solicitante.png"))); // NOI18N
        jLabel7.setText("Solicitante:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mensagem.png"))); // NOI18N
        jLabel8.setText("Justificativa:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr.png"))); // NOI18N
        jLabel9.setText("CR:");

        projetoHoraExtraTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        projetoHoraExtraTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projetoHoraExtraTextFieldActionPerformed(evt);
            }
        });

        solicitanteHoraExtraTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APONTAR HORA EXTRA");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person.png"))); // NOI18N

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logo)
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/horario.png"))); // NOI18N
        jLabel3.setText("Saida:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/horario.png"))); // NOI18N
        jLabel4.setText("Entrada:");

        clienteHoraExtraTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clienteHoraExtraTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteHoraExtraTextFieldActionPerformed(evt);
            }
        });

        dataEntrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dataSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        crHoraExtraTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        crHoraExtraTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crHoraExtraTextFieldActionPerformed(evt);
            }
        });

        justificativaHoraHextraJTextArea.setColumns(20);
        justificativaHoraHextraJTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        justificativaHoraHextraJTextArea.setRows(5);
        jScrollPane1.setViewportView(justificativaHoraHextraJTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(botaoSubmeterHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(botaoCancelarHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(dataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(dataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(solicitanteHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(projetoHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(clienteHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9)))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(clienteHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(solicitanteHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(projetoHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(crHoraExtraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(botaoSubmeterHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCancelarHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void botaoCancelarHoraExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarHoraExtraActionPerformed
        this.setVisible(false);
        apontamentos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCancelarHoraExtraActionPerformed

    private void botaoSubmeterHoraExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubmeterHoraExtraActionPerformed
     
        //Pega a data escolhida pelo usuario no formulário
        Date dataE = dataEntrada.getDate();
        Date dataS = dataSaida.getDate();

        //Formata a Data
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataFormatadaE = formatador.format(dataE);
        String dataFormatadaS = formatador.format(dataS);


        try{
            Apontamentos apontamento = new Apontamentos("Hora Extra",
                dataFormatadaE,
                dataFormatadaS,
                this.justificativaHoraHextraJTextArea.getText(),
                this.clienteHoraExtraTextField.getSelectedItem().toString(),
                this.projetoHoraExtraTextField.getText(),
                this.solicitanteHoraExtraTextField.getText(),
                this.crHoraExtraTextField.getSelectedItem().toString());
            if(config==null){
            cadastrarApontamentos(apontamento, this.usuario);
            }else{
                ConexaoBancoDeDados.editarApontamentos(apontamento, this.usuario,config.getId());
                
            }
            JOptionPane.showMessageDialog(null, "Hora Extra cadastrada com Sucesso! ");
            apontamentos.carregarApontamentos();
            apontamentos.setVisible(true);
            this.setVisible(false);
            this.dispose();

        }catch(Exception e){
            System.out.print(e);}
    }//GEN-LAST:event_botaoSubmeterHoraExtraActionPerformed

    private void clienteHoraExtraTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteHoraExtraTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_clienteHoraExtraTextFieldActionPerformed

    private void crHoraExtraTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crHoraExtraTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crHoraExtraTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarHoraExtra;
    private javax.swing.JButton botaoSubmeterHoraExtra;
    private javax.swing.JComboBox<String> clienteHoraExtraTextField;
    private javax.swing.JComboBox<String> crHoraExtraTextField;
    private com.toedter.calendar.JSpinnerDateEditor dataEntrada;
    private com.toedter.calendar.JSpinnerDateEditor dataSaida;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea justificativaHoraHextraJTextArea;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField projetoHoraExtraTextField;
    private javax.swing.JTextField solicitanteHoraExtraTextField;
    // End of variables declaration//GEN-END:variables
}
