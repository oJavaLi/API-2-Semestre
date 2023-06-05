
package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.comum.Autenticacao;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.awt.Color;


public class TelaAdmin extends javax.swing.JFrame {
    Usuario usuario;

    public TelaAdmin() {
        this.usuario = Autenticacao.getUsuarioLogado();
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
        botaoVerParametros = new javax.swing.JButton();
        iconAprovarHoras1 = new javax.swing.JLabel();
        resultados4 = new javax.swing.JLabel();
        retangulo6 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(800, 770));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoNovoFuncionario.setBackground(new java.awt.Color(153, 204, 255));
        botaoNovoFuncionario.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        botaoNovoFuncionario.setText("Cadastrar Funcionário");
        botaoNovoFuncionario.setToolTipText("");
        botaoNovoFuncionario.setAlignmentX(0.5F);
        botaoNovoFuncionario.setBorder(null);
        botaoNovoFuncionario.setPreferredSize(new java.awt.Dimension(72, 32));
        botaoNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNovoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 130, 30));

        botaoListarFuncionarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoListarFuncionarios.setText("Listar Funcionários");
        botaoListarFuncionarios.setAlignmentX(0.5F);
        botaoListarFuncionarios.setBorder(null);
        botaoListarFuncionarios.setPreferredSize(new java.awt.Dimension(80, 32));
        botaoListarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarFuncionariosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoListarFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 130, -1));

        iconPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/users-solid 1.png"))); // NOI18N
        iconPerson.setAlignmentX(0.5F);
        getContentPane().add(iconPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 110, -1));

        funcionarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        funcionarios.setForeground(new java.awt.Color(255, 255, 255));
        funcionarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        funcionarios.setText(" FUNCIONÁRIOS");
        funcionarios.setAlignmentX(0.5F);
        getContentPane().add(funcionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 150, -1));

        retangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retangulo.png"))); // NOI18N
        retangulo.setAlignmentX(0.5F);
        getContentPane().add(retangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        botaoNovoCliente.setBackground(new java.awt.Color(153, 204, 255));
        botaoNovoCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoNovoCliente.setText("Cadastrar Clientes");
        botaoNovoCliente.setAlignmentX(0.5F);
        botaoNovoCliente.setBorder(null);
        botaoNovoCliente.setPreferredSize(new java.awt.Dimension(72, 32));
        botaoNovoCliente.setRequestFocusEnabled(false);
        botaoNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNovoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 130, -1));

        botaoListarClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoListarClientes.setText("Listar Clientes");
        botaoListarClientes.setAlignmentX(0.5F);
        botaoListarClientes.setBorder(null);
        botaoListarClientes.setPreferredSize(new java.awt.Dimension(72, 32));
        botaoListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(botaoListarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 130, -1));

        iconClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes.png"))); // NOI18N
        iconClientes.setAlignmentX(0.5F);
        iconClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(iconClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 150, 90));

        clientes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clientes.setForeground(new java.awt.Color(255, 255, 255));
        clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientes.setText("CLIENTES");
        clientes.setAlignmentX(0.5F);
        getContentPane().add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 140, -1));

        retangulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retangulo.png"))); // NOI18N
        retangulo1.setAlignmentX(0.5F);
        getContentPane().add(retangulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        botaoNovoCr.setBackground(new java.awt.Color(153, 204, 255));
        botaoNovoCr.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoNovoCr.setText("Cadastrar C.R");
        botaoNovoCr.setAlignmentX(0.5F);
        botaoNovoCr.setBorder(null);
        botaoNovoCr.setPreferredSize(new java.awt.Dimension(72, 32));
        botaoNovoCr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoCrActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNovoCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 130, -1));

        botaoListarCr.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoListarCr.setText("Listar C.Rs");
        botaoListarCr.setAlignmentX(0.5F);
        botaoListarCr.setBorder(null);
        botaoListarCr.setPreferredSize(new java.awt.Dimension(72, 32));
        botaoListarCr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarCrActionPerformed(evt);
            }
        });
        getContentPane().add(botaoListarCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 130, 30));

        iconResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultados.png"))); // NOI18N
        iconResultados.setAlignmentX(0.5F);
        getContentPane().add(iconResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 70, 90));

        resultados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        resultados.setForeground(new java.awt.Color(255, 255, 255));
        resultados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultados.setText("CENTRO DE RESULTADOS");
        resultados.setAlignmentX(0.5F);
        getContentPane().add(resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 170, -1));

        retangulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retangulo.png"))); // NOI18N
        retangulo2.setAlignmentX(0.5F);
        getContentPane().add(retangulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        botaoVerFuncionarios.setBackground(new java.awt.Color(153, 204, 255));
        botaoVerFuncionarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoVerFuncionarios.setText("+ Novo");
        botaoVerFuncionarios.setAlignmentX(0.5F);
        botaoVerFuncionarios.setBorder(null);
        botaoVerFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerFuncionariosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVerFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 110, 50));

        botaoNovoRelatorio.setBackground(new java.awt.Color(153, 204, 255));
        botaoNovoRelatorio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoNovoRelatorio.setText("Novo Relatório");
        botaoNovoRelatorio.setAlignmentX(0.5F);
        botaoNovoRelatorio.setBorder(null);
        botaoNovoRelatorio.setPreferredSize(new java.awt.Dimension(72, 32));
        botaoNovoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNovoRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 130, -1));

        botaoListarRelatorios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoListarRelatorios.setText("Listar Relatórios");
        botaoListarRelatorios.setAlignmentX(0.5F);
        botaoListarRelatorios.setBorder(null);
        botaoListarRelatorios.setPreferredSize(new java.awt.Dimension(72, 32));
        botaoListarRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarRelatoriosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoListarRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 130, -1));

        botaoSair.setBackground(new java.awt.Color(46, 44, 45));
        botaoSair.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(242, 242, 242));
        botaoSair.setText("SAIR");
        botaoSair.setAlignmentX(0.5F);
        botaoSair.setPreferredSize(new java.awt.Dimension(200, 40));
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 216, -1));

        iconAprovarHoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aprovar.png"))); // NOI18N
        iconAprovarHoras.setAlignmentX(0.5F);
        getContentPane().add(iconAprovarHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 100, 90));

        resultados2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        resultados2.setForeground(new java.awt.Color(255, 255, 255));
        resultados2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultados2.setText("APROVAR HORAS");
        resultados2.setAlignmentX(0.5F);
        getContentPane().add(resultados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 150, -1));

        retangulo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retangulo.png"))); // NOI18N
        retangulo4.setAlignmentX(0.5F);
        getContentPane().add(retangulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        iconRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/relatorios.png"))); // NOI18N
        iconRelatorios.setAlignmentX(0.5F);
        getContentPane().add(iconRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 80, 90));

        resultados3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        resultados3.setForeground(new java.awt.Color(255, 255, 255));
        resultados3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultados3.setText("RELATÓRIOS");
        resultados3.setAlignmentX(0.5F);
        getContentPane().add(resultados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 150, -1));

        retangulo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retangulo.png"))); // NOI18N
        retangulo5.setAlignmentX(0.5F);
        getContentPane().add(retangulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

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

        botaoVerParametros.setBackground(new java.awt.Color(153, 204, 255));
        botaoVerParametros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoVerParametros.setText("Listar Parâmetros");
        botaoVerParametros.setAlignmentX(0.5F);
        botaoVerParametros.setBorder(null);
        botaoVerParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerParametrosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVerParametros, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 130, 50));
        botaoVerParametros.getAccessibleContext().setAccessibleName("Listar Parâmetros");

        iconAprovarHoras1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconAprovarHoras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configuracao.png"))); // NOI18N
        iconAprovarHoras1.setAlignmentX(0.5F);
        iconAprovarHoras1.setMaximumSize(new java.awt.Dimension(90, 80));
        iconAprovarHoras1.setMinimumSize(new java.awt.Dimension(90, 80));
        iconAprovarHoras1.setPreferredSize(new java.awt.Dimension(90, 80));
        getContentPane().add(iconAprovarHoras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 100, 90));

        resultados4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        resultados4.setForeground(new java.awt.Color(255, 255, 255));
        resultados4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultados4.setText("PARAMETRIZAÇÃO");
        resultados4.setAlignmentX(0.5F);
        getContentPane().add(resultados4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 150, -1));

        retangulo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retangulo.png"))); // NOI18N
        retangulo6.setAlignmentX(0.5F);
        getContentPane().add(retangulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoListarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarFuncionariosActionPerformed
        this.setVisible(false);
        new TelaListarFuncionarios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoListarFuncionariosActionPerformed

    private void botaoNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoFuncionarioActionPerformed
        this.setVisible(false);
        new TelaAddFuncionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoNovoFuncionarioActionPerformed

    private void botaoListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarClientesActionPerformed
        this.setVisible(false);
        new TelaListarClientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoListarClientesActionPerformed

    private void botaoNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoClienteActionPerformed
        this.setVisible(false);
        new TelaNovoCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoNovoClienteActionPerformed

    private void botaoListarCrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarCrActionPerformed
        this.setVisible(false);
        new TelaListarCr().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoListarCrActionPerformed

    private void botaoNovoCrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoCrActionPerformed
        this.setVisible(false);
        new TelaNovoCr().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoNovoCrActionPerformed

    private void botaoVerFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerFuncionariosActionPerformed
        this.setVisible(false);
        new TelaAprovarHoras().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVerFuncionariosActionPerformed

    private void botaoListarRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarRelatoriosActionPerformed
        this.setVisible(false);
        new TelaListarRelatorios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoListarRelatoriosActionPerformed

    private void botaoNovoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoRelatorioActionPerformed
        this.setVisible(false);
        new TelaNovoRelatorio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoNovoRelatorioActionPerformed

    private void botaoVerParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerParametrosActionPerformed
        this.setVisible(false);
        new TelaListarParametrizacao().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVerParametrosActionPerformed

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
    private javax.swing.JButton botaoVerParametros;
    private javax.swing.JLabel clientes;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel funcionarios;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel iconAprovarHoras;
    private javax.swing.JLabel iconAprovarHoras1;
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
    private javax.swing.JLabel resultados4;
    private javax.swing.JLabel retangulo;
    private javax.swing.JLabel retangulo1;
    private javax.swing.JLabel retangulo2;
    private javax.swing.JLabel retangulo4;
    private javax.swing.JLabel retangulo5;
    private javax.swing.JLabel retangulo6;
    // End of variables declaration//GEN-END:variables
}
