
package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.comum.Autenticacao;
import com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados;
import static com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados.cadastrarClientes;
import com.fullmadagilists.api2semestre.entidades.Cliente;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.awt.Color;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class TelaNovoCliente extends javax.swing.JFrame {
    Usuario usuario;
    Cliente clienteAEditar;


    public TelaNovoCliente(){
        this.usuario = Autenticacao.getUsuarioLogado();
        initComponents();
        String user = usuario.getNome();
        jLabel2.setText(user);
        jLabel2.setForeground(Color.WHITE);
        formatarCampo();
    }
    
    public TelaNovoCliente(Cliente clienteAEditar) {
        this();
        this.clienteAEditar = clienteAEditar;
        campoRazaoSocial.setText(clienteAEditar.getRazaoSocial());
        campoCnpj.setText(clienteAEditar.getCnpj());
        campoCnpj.setEditable(false);
    
    }

    private void formatarCampo(){
        try {
            MaskFormatter mask = new MaskFormatter("##.###.###/####-##");
            mask.install(campoCnpj);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "CNPJ inválido! O CNPJ deve ter 14 dígito", "Erro", JOptionPane.ERROR_MESSAGE);

        }

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submeter = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        campoCnpj = new javax.swing.JFormattedTextField();
        campoRazaoSocial = new javax.swing.JTextField();
        razao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOVO CLIENTE");

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
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addGap(195, 195, 195)
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo)
                            .addComponent(icon)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        submeter.setBackground(new java.awt.Color(49, 117, 185));
        submeter.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        submeter.setForeground(new java.awt.Color(255, 255, 255));
        submeter.setText("Submeter");
        submeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submeterActionPerformed(evt);
            }
        });

        botaoCancelar.setBackground(new java.awt.Color(46, 44, 45));
        botaoCancelar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        campoCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCnpjActionPerformed(evt);
            }
        });

        campoRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRazaoSocialActionPerformed(evt);
            }
        });

        razao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        razao.setText("Razão Social:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("CNPJ:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(razao)
                    .addComponent(jLabel3))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submeter, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(razao))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(79, 79, 79)
                .addComponent(submeter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 295, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCnpjActionPerformed

    private void campoRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRazaoSocialActionPerformed

    private void submeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submeterActionPerformed
        try {
            Cliente a = new Cliente (
                    this.campoRazaoSocial.getText(),
                    this.campoCnpj.getText()
             );
            if(clienteAEditar==null){
                cadastrarClientes(a);
            }else{
                ConexaoBancoDeDados.editarCliente(a);
            }
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso! ");

            TelaListarClientes telaListarClientes = new TelaListarClientes();
            telaListarClientes.setVisible(true);
            this.setVisible(false);
            this.dispose();

        } catch(Exception e){
            System.out.print(e);
        }

        //JOptionPane.showMessageDialog(null, "o CNPJ é: "+campoCnpj.getText(), "aviso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_submeterActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.setVisible(false);
        new TelaAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JFormattedTextField campoCnpj;
    private javax.swing.JTextField campoRazaoSocial;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel razao;
    private javax.swing.JButton submeter;
    // End of variables declaration//GEN-END:variables
}
