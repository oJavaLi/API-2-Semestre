
package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class TelaListarFuncionarios extends javax.swing.JFrame {

    public TelaListarFuncionarios() {
        initComponents();
        tabelaUsuario.setFillsViewportHeight(true); // hackzinho pra tabela ficar do tamanho do componente
        carregarUsuarios();
    }
    public void carregarUsuarios(){
        DefaultTableModel tabelaModel = (DefaultTableModel) tabelaUsuario.getModel();
        tabelaModel.setRowCount(0);

        List<Usuario> listaUsuarios = ConexaoBancoDeDados.usuarios();

        for (Usuario u: listaUsuarios){
            String nome = u.getNome();
            String categoria = u.getCategoria();

            Object[] novoApontamento = new Object[]{
                nome,
                categoria
            };
            tabelaModel.addRow(novoApontamento);
        }
        
        tabelaUsuario.setModel(tabelaModel);
    }
    public void buscarUsuario(String busca){
        DefaultTableModel tabelaModel = (DefaultTableModel) tabelaUsuario.getModel();
        tabelaModel.setRowCount(0);

        List<Usuario> buscarUsuario = ConexaoBancoDeDados.buscarUsuarioLista(busca);
        
        for (Usuario u: buscarUsuario){
            String nome = u.getNome();
            String categoria = u.getCategoria();

            Object[] novoApontamento = new Object[]{
                nome,
                categoria
            };
            tabelaModel.addRow(novoApontamento);
        }
        
        tabelaUsuario.setModel(tabelaModel);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        textoPesquisar = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        botaoAddFuncionario = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 800));

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Matrícula"
            }
        ));
        tabelaUsuario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaUsuario);
        if (tabelaUsuario.getColumnModel().getColumnCount() > 0) {
            tabelaUsuario.getColumnModel().getColumn(0).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FUNCIONÁRIOS");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logo)
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textoPesquisar.setMinimumSize(new java.awt.Dimension(636, 40));
        textoPesquisar.setPreferredSize(new java.awt.Dimension(636, 40));
        textoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPesquisarActionPerformed(evt);
            }
        });

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pesquisar.png"))); // NOI18N
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        botaoSair.setBackground(new java.awt.Color(47, 45, 46));
        botaoSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(255, 255, 255));
        botaoSair.setText("SAIR");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoAddFuncionario.setBackground(new java.awt.Color(49, 118, 187));
        botaoAddFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoAddFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        botaoAddFuncionario.setText("+ Adicionar Funcionário");
        botaoAddFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddFuncionarioActionPerformed(evt);
            }
        });

        botaoVoltar.setBackground(new java.awt.Color(47, 45, 46));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(textoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(botaoPesquisar))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoAddFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAddFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPesquisarActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        buscarUsuario(textoPesquisar.getText());
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoAddFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddFuncionarioActionPerformed

        TelaAddFuncionario funcionario = new TelaAddFuncionario();
        this.setVisible(false);
        funcionario.setVisible(true);
    }//GEN-LAST:event_botaoAddFuncionarioActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed

        TelaAdmin telaAdmin = new TelaAdmin();
        this.setVisible(false);
        telaAdmin.setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaListarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListarFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAddFuncionario;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField textoPesquisar;
    // End of variables declaration//GEN-END:variables
}
