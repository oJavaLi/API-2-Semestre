package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados;
import com.fullmadagilists.api2semestre.entidades.Apontamentos;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;




public class TelaApontamentos extends javax.swing.JFrame {


    public TelaApontamentos(Usuario usuarioLogado) {
        initComponents();
        String user = usuarioLogado.getNome();
        labelnomeuser.setText(user);
        
        tabelaApontamentos.setFillsViewportHeight(true); // hackzinho pra tabela ficar do tamanho do componente
        carregarApontamentos();
    }
    
    public void carregarApontamentos(){
        DefaultTableModel tabelaModel = (DefaultTableModel) tabelaApontamentos.getModel();
        tabelaModel.setRowCount(0);

        List<Apontamentos> listaApontamentos = ConexaoBancoDeDados.apontamentos();

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
                u.getCategoria(),
                u.getProjeto(),
                u.getData_hora_fim(),
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaApontamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA", "TIPO", "PROJETO", "HORAS APONTADAS", "AÇÕES"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 81, 756, 510));

        botaoApontarHoraExtra.setBackground(new java.awt.Color(49, 117, 185));
        botaoApontarHoraExtra.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoApontarHoraExtra.setForeground(new java.awt.Color(242, 242, 242));
        botaoApontarHoraExtra.setText("+ APONTAR HORA EXTRA");
        botaoApontarHoraExtra.setPreferredSize(new java.awt.Dimension(200, 40));
        botaoApontarHoraExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApontarHoraExtraActionPerformed(evt);
            }
        });
        getContentPane().add(botaoApontarHoraExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 216, -1));

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
        getContentPane().add(botaoApontarSobreaviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, 216, -1));

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
        getContentPane().add(botaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, 216, -1));

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APONTAMENTOS");

        labelnomeuser.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(labelnomeuser, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelnomeuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 45));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoApontarHoraExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApontarHoraExtraActionPerformed
        TelaApontarHoraExtra horaExtra = new TelaApontarHoraExtra(this);
        this.setVisible(false);
        horaExtra.setVisible(true);
    }//GEN-LAST:event_botaoApontarHoraExtraActionPerformed

    private void botaoApontarSobreavisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApontarSobreavisoActionPerformed
        TelaApontarSobreAviso sobreAviso = new TelaApontarSobreAviso(this);
        this.setVisible(false);
        sobreAviso.setVisible(true);
    }//GEN-LAST:event_botaoApontarSobreavisoActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoApontarHoraExtra;
    private javax.swing.JButton botaoApontarSobreaviso;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelnomeuser;
    private javax.swing.JTable tabelaApontamentos;
    // End of variables declaration//GEN-END:variables
}
