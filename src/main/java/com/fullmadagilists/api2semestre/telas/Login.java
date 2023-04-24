
package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        SimboloLogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botaoAcessar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(24, 35, 57));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha:");
        jLabel1.setMinimumSize(new java.awt.Dimension(69, 20));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        txtNomeUsuario.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        txtNomeUsuario.setPreferredSize(new java.awt.Dimension(480, 60));
        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 286, -1, -1));

        txtSenhaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtSenhaUsuario.setMinimumSize(new java.awt.Dimension(480, 60));
        txtSenhaUsuario.setPreferredSize(new java.awt.Dimension(480, 60));
        txtSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));
        jPanel1.add(SimboloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 32, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuário:");
        jLabel4.setMinimumSize(new java.awt.Dimension(69, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 258, -1, -1));

        botaoAcessar.setBackground(new java.awt.Color(153, 204, 255));
        botaoAcessar.setText("Acessar");
        botaoAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAcessarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoAcessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAcessarActionPerformed

        List<Usuario> listaUsuarios = ConexaoBancoDeDados.usuarios();
        String matricula = txtNomeUsuario.getText();
        int matriculanumero;
        try{ matriculanumero = Integer.parseInt(matricula);}
        catch(NumberFormatException e){matriculanumero = 0;}

        String senha = txtSenhaUsuario.getText();

        boolean logado = false;
        Usuario usuarioLogado = null;

        for(Usuario u: listaUsuarios){
            if (u.getMatricula() == matriculanumero && u.getSenha().equals(senha)){
                new TelaApontamentos().setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null, "Bem vindo(a) " + u.getNome());
                logado = true;
                usuarioLogado = u;

            }
        }

        if(!logado){
            JOptionPane.showMessageDialog(null, "Credenciais inválidas");

        }

    }//GEN-LAST:event_botaoAcessarActionPerformed

    private void txtSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaUsuarioActionPerformed

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SimboloLogin;
    private javax.swing.JButton botaoAcessar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables
}
