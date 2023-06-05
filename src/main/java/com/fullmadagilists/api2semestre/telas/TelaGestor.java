package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.comum.Autenticacao;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.awt.Color;

public class TelaGestor extends javax.swing.JFrame {
    Usuario usuario;

    public TelaGestor() {
        this.usuario = Autenticacao.getUsuarioLogado();
        initComponents();
        String user = usuario.getNome();
        jLabel2.setText(user);
        jLabel2.setForeground(Color.WHITE);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botaoVerFuncionarios = new javax.swing.JButton();
        botaoApontarsobreaviso = new javax.swing.JButton();
        botaoApontarHoraExtra = new javax.swing.JButton();
        iconAprovarHoras = new javax.swing.JLabel();
        resultados2 = new javax.swing.JLabel();
        retangulo4 = new javax.swing.JLabel();
        iconPerson = new javax.swing.JLabel();
        funcionarios = new javax.swing.JLabel();
        retangulo = new javax.swing.JLabel();
        resultados3 = new javax.swing.JLabel();
        funcionarios1 = new javax.swing.JLabel();
        funcionarios2 = new javax.swing.JLabel();
        funcionarios3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 498));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(1, 30, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel2.setRequestFocusEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GESTOR");

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person.png"))); // NOI18N

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logo1)
                .addGap(235, 235, 235)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(logo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        botaoSair.setBackground(new java.awt.Color(46, 44, 45));
        botaoSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(242, 242, 242));
        botaoSair.setText("SAIR");
        botaoSair.setPreferredSize(new java.awt.Dimension(200, 40));
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 216, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FUNCIONÁRIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 250, -1, -1));

        botaoVerFuncionarios.setBackground(new java.awt.Color(153, 204, 255));
        botaoVerFuncionarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoVerFuncionarios.setText("Ver Funcionários");
        botaoVerFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerFuncionariosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVerFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 130, 50));

        botaoApontarsobreaviso.setBackground(new java.awt.Color(153, 204, 255));
        botaoApontarsobreaviso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoApontarsobreaviso.setText("+ Sobre Aviso");
        botaoApontarsobreaviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApontarsobreavisoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoApontarsobreaviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 130, -1));

        botaoApontarHoraExtra.setBackground(new java.awt.Color(153, 204, 255));
        botaoApontarHoraExtra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoApontarHoraExtra.setText("+ Hora Extra");
        botaoApontarHoraExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApontarHoraExtraActionPerformed(evt);
            }
        });
        getContentPane().add(botaoApontarHoraExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 130, -1));

        iconAprovarHoras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconAprovarHoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apontar.png"))); // NOI18N
        getContentPane().add(iconAprovarHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 150, 90));

        resultados2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        resultados2.setForeground(new java.awt.Color(255, 255, 255));
        resultados2.setText("APONTAR HORAS");
        getContentPane().add(resultados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        retangulo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retangulo.png"))); // NOI18N
        getContentPane().add(retangulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        iconPerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/users-solid 1.png"))); // NOI18N
        getContentPane().add(iconPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 130, 150, -1));

        funcionarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        funcionarios.setForeground(new java.awt.Color(255, 255, 255));
        funcionarios.setText("HORAS EXTRAS");
        getContentPane().add(funcionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        retangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retangulo.png"))); // NOI18N
        getContentPane().add(retangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        resultados3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        resultados3.setForeground(new java.awt.Color(255, 255, 255));
        resultados3.setText("HORAS EXTRAS");
        getContentPane().add(resultados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        funcionarios1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        funcionarios1.setForeground(new java.awt.Color(255, 255, 255));
        funcionarios1.setText("HORAS EXTRAS");
        getContentPane().add(funcionarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        funcionarios2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        funcionarios2.setForeground(new java.awt.Color(255, 255, 255));
        funcionarios2.setText("HORAS EXTRAS");
        getContentPane().add(funcionarios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        funcionarios3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        funcionarios3.setForeground(new java.awt.Color(255, 255, 255));
        funcionarios3.setText("HORAS EXTRAS");
        getContentPane().add(funcionarios3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        Login login = new Login();
        this.setVisible(false);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoVerFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerFuncionariosActionPerformed
        TelaAprovarHoras aprovarHoras = new TelaAprovarHoras();
        this.setVisible(false);
        aprovarHoras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVerFuncionariosActionPerformed

    private void botaoApontarsobreavisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApontarsobreavisoActionPerformed
        TelaApontarSobreAviso apontarSobreaviso = new TelaApontarSobreAviso();
        this.setVisible(false);
        apontarSobreaviso.setVisible(true);
    }//GEN-LAST:event_botaoApontarsobreavisoActionPerformed

    private void botaoApontarHoraExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApontarHoraExtraActionPerformed
        this.setVisible(false);
        new TelaApontarHoraExtra().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoApontarHoraExtraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoApontarHoraExtra;
    private javax.swing.JButton botaoApontarsobreaviso;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoVerFuncionarios;
    private javax.swing.JLabel funcionarios;
    private javax.swing.JLabel funcionarios1;
    private javax.swing.JLabel funcionarios2;
    private javax.swing.JLabel funcionarios3;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel iconAprovarHoras;
    private javax.swing.JLabel iconPerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel resultados2;
    private javax.swing.JLabel resultados3;
    private javax.swing.JLabel retangulo;
    private javax.swing.JLabel retangulo4;
    // End of variables declaration//GEN-END:variables
}
