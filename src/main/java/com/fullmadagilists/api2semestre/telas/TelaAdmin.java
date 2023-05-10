
package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.awt.Color;


public class TelaAdmin extends javax.swing.JFrame {
    Usuario usuario;
    public TelaAdmin(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        String user = usuario.getNome();
        jLabel2.setText(user);
        jLabel2.setForeground(Color.WHITE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoNovoFuncionario = new javax.swing.JButton();
        botaoListarFuncionarios = new javax.swing.JButton();
        iconPerson = new javax.swing.JLabel();
        funcionarios = new javax.swing.JLabel();
        retangulo = new javax.swing.JLabel();
        botaoNovoCliente = new javax.swing.JButton();
        botaoListarClientes = new javax.swing.JButton();
        iconClientes = new javax.swing.JLabel();
        clientes = new javax.swing.JLabel();
        retangulo1 = new javax.swing.JLabel();
        botaoNovoCr = new javax.swing.JButton();
        botaoListarCr = new javax.swing.JButton();
        iconResultados = new javax.swing.JLabel();
        resultados = new javax.swing.JLabel();
        retangulo2 = new javax.swing.JLabel();
        botaoVerFuncionarios = new javax.swing.JButton();
        botaoNovoRelatorio = new javax.swing.JButton();
        botaoListarRelatorios = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        iconAprovarHoras = new javax.swing.JLabel();
        resultados2 = new javax.swing.JLabel();
        retangulo4 = new javax.swing.JLabel();
        iconRelatorios = new javax.swing.JLabel();
        resultados3 = new javax.swing.JLabel();
        retangulo5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoNovoFuncionario.setText("+ Novo");
        botaoNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNovoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 110, -1));

        botaoListarFuncionarios.setText("Listar");
        botaoListarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarFuncionariosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoListarFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 110, -1));

        iconPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/users-solid 1.png"))); // NOI18N
        getContentPane().add(iconPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        funcionarios.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        funcionarios.setForeground(new java.awt.Color(255, 255, 255));
        funcionarios.setText("FUNCIONÁRIOS");
        getContentPane().add(funcionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        retangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retangulo.png"))); // NOI18N
        getContentPane().add(retangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        botaoNovoCliente.setText("+ Novo");
        botaoNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNovoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 110, -1));

        botaoListarClientes.setText("Listar");
        botaoListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(botaoListarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 110, -1));

        iconClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes.png"))); // NOI18N
        getContentPane().add(iconClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 60, 90));

        clientes.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        clientes.setForeground(new java.awt.Color(255, 255, 255));
        clientes.setText("CLIENTES");
        getContentPane().add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        retangulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retangulo.png"))); // NOI18N
        getContentPane().add(retangulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        botaoNovoCr.setText("+ Novo");
        botaoNovoCr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoCrActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNovoCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 110, -1));

        botaoListarCr.setText("Listar");
        botaoListarCr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarCrActionPerformed(evt);
            }
        });
        getContentPane().add(botaoListarCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 110, -1));

        iconResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultados.png"))); // NOI18N
        getContentPane().add(iconResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 70, 90));

        resultados.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        resultados.setForeground(new java.awt.Color(255, 255, 255));
        resultados.setText("CENTROS DE RESULTADOS");
        getContentPane().add(resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        retangulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retangulo.png"))); // NOI18N
        getContentPane().add(retangulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        botaoVerFuncionarios.setText("+ Novo");
        botaoVerFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerFuncionariosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVerFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 110, 50));

        botaoNovoRelatorio.setText("+ Novo");
        botaoNovoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNovoRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 110, -1));

        botaoListarRelatorios.setText("Listar");
        botaoListarRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarRelatoriosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoListarRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 110, -1));

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
        getContentPane().add(botaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, 216, -1));

        iconAprovarHoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aprovar.png"))); // NOI18N
        getContentPane().add(iconAprovarHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 100, 90));

        resultados2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        resultados2.setForeground(new java.awt.Color(255, 255, 255));
        resultados2.setText("APROVAR HORAS");
        getContentPane().add(resultados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        retangulo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retangulo.png"))); // NOI18N
        getContentPane().add(retangulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        iconRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/relatorios.png"))); // NOI18N
        getContentPane().add(iconRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 80, 90));

        resultados3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        resultados3.setForeground(new java.awt.Color(255, 255, 255));
        resultados3.setText("RELATÓRIOS");
        getContentPane().add(resultados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        retangulo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retangulo.png"))); // NOI18N
        getContentPane().add(retangulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        jPanel2.setBackground(new java.awt.Color(1, 30, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel2.setRequestFocusEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADMINISTRAÇÃO");

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
                .addGap(195, 195, 195)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoListarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarFuncionariosActionPerformed
        TelaListarFuncionarios listarFuncionarios = new TelaListarFuncionarios(this.usuario);
        this.setVisible(false);
        listarFuncionarios.setVisible(true);
    }//GEN-LAST:event_botaoListarFuncionariosActionPerformed

    private void botaoNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoFuncionarioActionPerformed
        TelaAddFuncionario funcionario = new TelaAddFuncionario(this.usuario);
        this.setVisible(false);
        funcionario.setVisible(true);
    }//GEN-LAST:event_botaoNovoFuncionarioActionPerformed

    private void botaoListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarClientesActionPerformed
        TelaListarClientes listarClientes = new TelaListarClientes(this.usuario);
        this.setVisible(false);
        listarClientes.setVisible(true);

    }//GEN-LAST:event_botaoListarClientesActionPerformed

    private void botaoNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoClienteActionPerformed
        TelaNovoCliente novoCliente = new TelaNovoCliente(this.usuario);
        this.setVisible(false);
        novoCliente.setVisible(true);
    }//GEN-LAST:event_botaoNovoClienteActionPerformed

    private void botaoListarCrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarCrActionPerformed
        TelaListarCr listarCr = new TelaListarCr(this.usuario);
        this.setVisible(false);
        listarCr.setVisible(true);

    }//GEN-LAST:event_botaoListarCrActionPerformed

    private void botaoNovoCrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoCrActionPerformed
        TelaNovoCr novoCr = new TelaNovoCr(this.usuario);
        this.setVisible(false);
        novoCr.setVisible(true);
    }//GEN-LAST:event_botaoNovoCrActionPerformed

    private void botaoVerFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerFuncionariosActionPerformed
        TelaAprovarHoras aprovarHoras = new TelaAprovarHoras(this, this.usuario);
        this.setVisible(false);
        aprovarHoras.setVisible(true);
    }//GEN-LAST:event_botaoVerFuncionariosActionPerformed

    private void botaoListarRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarRelatoriosActionPerformed
        TelaListarRelatorios listarRelatorios = new TelaListarRelatorios();
        this.setVisible(false);
        listarRelatorios.setVisible(true);
    }//GEN-LAST:event_botaoListarRelatoriosActionPerformed

    private void botaoNovoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoRelatorioActionPerformed
        TelaNovoRelatorio novoRelatorio = new TelaNovoRelatorio();
        this.setVisible(false);
        novoRelatorio.setVisible(true);
    }//GEN-LAST:event_botaoNovoRelatorioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoListarClientes;
    private javax.swing.JButton botaoListarCr;
    private javax.swing.JButton botaoListarFuncionarios;
    private javax.swing.JButton botaoListarRelatorios;
    private javax.swing.JButton botaoNovoCliente;
    private javax.swing.JButton botaoNovoCr;
    private javax.swing.JButton botaoNovoFuncionario;
    private javax.swing.JButton botaoNovoRelatorio;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoVerFuncionarios;
    private javax.swing.JLabel clientes;
    private javax.swing.JLabel funcionarios;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel iconAprovarHoras;
    private javax.swing.JLabel iconClientes;
    private javax.swing.JLabel iconPerson;
    private javax.swing.JLabel iconRelatorios;
    private javax.swing.JLabel iconResultados;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel resultados;
    private javax.swing.JLabel resultados2;
    private javax.swing.JLabel resultados3;
    private javax.swing.JLabel retangulo;
    private javax.swing.JLabel retangulo1;
    private javax.swing.JLabel retangulo2;
    private javax.swing.JLabel retangulo4;
    private javax.swing.JLabel retangulo5;
    // End of variables declaration//GEN-END:variables
}
