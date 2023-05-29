package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados;
import com.fullmadagilists.api2semestre.entidades.Apontamentos;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;




public class TelaApontamentos extends javax.swing.JFrame {
    Apontamentos apontamentos;
    Usuario usuario;
    List<Apontamentos> listaApontamentos;

    public TelaApontamentos(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        String user = usuario.getNome();
        labelnomeuser.setText(user);
        labelnomeuser.setForeground(Color.WHITE);
        tabelaApontamentos.setFillsViewportHeight(true); // hackzinho pra tabela ficar do tamanho do componente
        carregarApontamentos();
        
        //botao deletar fica inativo e só ativa quando seleciona 1 ou mais linhas
        botaoDeletar.setEnabled(false);
        tabelaApontamentos.getSelectionModel().addListSelectionListener((e) -> {
            if (tabelaApontamentos.getSelectedRowCount() >= 1) {
                botaoDeletar.setEnabled(true);
            } else {
                botaoDeletar.setEnabled(false);
            }
        });
    }

    public void carregarApontamentos(){
        this.usuario = usuario;
        DefaultTableModel tabelaModel = (DefaultTableModel) tabelaApontamentos.getModel();
        tabelaModel.setRowCount(0);

        listaApontamentos = ConexaoBancoDeDados.apontamentos(this.usuario);

        for (Apontamentos u: listaApontamentos){
            String categoria = u.getCategoria();
            String dataHoraInicio = u.getData_hora_inicio();
            String dataHoraFim = u.getData_hora_fim();
            String justificativa = u.getJustificativa();
            String cliente = u.getCliente();
            String projeto = u.getProjeto();
            String solicitante = u.getSolicitante();
            String cr = u.getCr();

            Object[] novoApontamento = new Object[]{
                u.getData_hora_inicio(),
                u.getData_hora_fim(),
                u.getCategoria(),
                u.getProjeto(),
                u.getTotalHoras(),
                u.getAvaliacaoStatus(),
                ""
            };
            tabelaModel.addRow(novoApontamento);
        }

        tabelaApontamentos.setModel(tabelaModel);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaApontamentos = new javax.swing.JTable();
        botaoApontarHoraExtra = new javax.swing.JButton();
        botaoApontarSobreaviso = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelnomeuser = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        botaoDeletar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaApontamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ENTRADA", "SAÍDA", "TIPO", "PROJETO", "HORAS APONTADAS", "STATUS "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaApontamentos.setPreferredSize(new java.awt.Dimension(500, 80));
        tabelaApontamentos.setShowGrid(true);
        tabelaApontamentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaApontamentos);
        if (tabelaApontamentos.getColumnModel().getColumnCount() > 0) {
            tabelaApontamentos.getColumnModel().getColumn(0).setResizable(false);
            tabelaApontamentos.getColumnModel().getColumn(1).setResizable(false);
            tabelaApontamentos.getColumnModel().getColumn(2).setResizable(false);
            tabelaApontamentos.getColumnModel().getColumn(3).setResizable(false);
            tabelaApontamentos.getColumnModel().getColumn(4).setResizable(false);
        }

        botaoApontarHoraExtra.setBackground(new java.awt.Color(49, 117, 185));
        botaoApontarHoraExtra.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoApontarHoraExtra.setForeground(new java.awt.Color(242, 242, 242));
        botaoApontarHoraExtra.setText("+ APONTAR HORA EXTRA");
        botaoApontarHoraExtra.setPreferredSize(new java.awt.Dimension(180, 40));
        botaoApontarHoraExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApontarHoraExtraActionPerformed(evt);
            }
        });

        botaoApontarSobreaviso.setBackground(new java.awt.Color(49, 117, 185));
        botaoApontarSobreaviso.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoApontarSobreaviso.setForeground(new java.awt.Color(242, 242, 242));
        botaoApontarSobreaviso.setText("+ APONTAR SOBREAVISO");
        botaoApontarSobreaviso.setPreferredSize(new java.awt.Dimension(200, 40));
        botaoApontarSobreaviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApontarSobreavisoActionPerformed(evt);
            }
        });

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

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APONTAMENTOS");

        labelnomeuser.setText("localiza");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(202, 202, 202)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(labelnomeuser, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icon)
                    .addComponent(logo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelnomeuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        botaoDeletar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deletar.png"))); // NOI18N
        botaoDeletar.setText("Deletar");
        botaoDeletar.setPreferredSize(new java.awt.Dimension(200, 40));
        botaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(botaoApontarHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(botaoApontarSobreaviso, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(botaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoApontarHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoApontarSobreaviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoApontarHoraExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApontarHoraExtraActionPerformed
        TelaApontarHoraExtra horaExtra = new TelaApontarHoraExtra(this, usuario,null);
        this.setVisible(false);
        horaExtra.setVisible(true);
    }//GEN-LAST:event_botaoApontarHoraExtraActionPerformed

    private void botaoApontarSobreavisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApontarSobreavisoActionPerformed
        TelaApontarSobreAviso sobreAviso = new TelaApontarSobreAviso(this, usuario);
        this.setVisible(false);
        sobreAviso.setVisible(true);
    }//GEN-LAST:event_botaoApontarSobreavisoActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarActionPerformed
        // TODO add your handling code here:
        Apontamentos apontamentoSelecionado = listaApontamentos.get(tabelaApontamentos.getSelectedRow());
        ConexaoBancoDeDados.deletarApontamentos(apontamentoSelecionado.getId());
        carregarApontamentos();
    }//GEN-LAST:event_botaoDeletarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Apontamentos apontamentoSelecionado = listaApontamentos.get(tabelaApontamentos.getSelectedRow());
       TelaApontarHoraExtra apontamento = new TelaApontarHoraExtra(this,usuario,apontamentoSelecionado);
       this.setVisible(false);
       apontamento.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoApontarHoraExtra;
    private javax.swing.JButton botaoApontarSobreaviso;
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelnomeuser;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tabelaApontamentos;
    // End of variables declaration//GEN-END:variables
}
