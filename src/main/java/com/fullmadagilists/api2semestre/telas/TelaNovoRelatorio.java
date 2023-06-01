
package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados;
import com.fullmadagilists.api2semestre.entidades.Apontamentos;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import com.opencsv.CSVWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaNovoRelatorio extends javax.swing.JFrame {
    Usuario usuario;
    List<Usuario> usuarios;

    
    
    public TelaNovoRelatorio(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        String user = usuario.getNome();
        //jLabel2.setText(user);
        //jLabel2.setForeground(Color.WHITE);
        tabelaUsuario.setFillsViewportHeight(true);
        carregarUsuarios();
            
    }


    private void carregarUsuarios() {
    usuarios = ConexaoBancoDeDados.usuarios();

    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(new Object[]{"Matrícula", "Nome"});

    for (Usuario u : usuarios) {
        model.addRow(new Object[]{u.getMatricula(), u.getNome()});
    }

    tabelaUsuario.setModel(model);
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

    
    private void gerarRelatorio(String text) {
        int selectedRow = tabelaUsuario.getSelectedRow();
        
        if (selectedRow != -1) {
        Usuario usuarioSelecionado = usuarios.get(selectedRow);
        List<Apontamentos> apontamentos = ConexaoBancoDeDados.apontamentos(usuarioSelecionado);

        
        // Transformar a lista em um arquivo CSV usando OpenCSV
        try {
            File arquivo = new File("relatorio_" + usuarioSelecionado.getMatricula() + ".csv");
            FileWriter escritor = new FileWriter(arquivo);
            CSVWriter csvWriter = new CSVWriter(escritor);

            // Escrever o cabeçalho do arquivo
            String[] cabecalho = {"Solicitante", "Categoria", "Data Hora Inicio", "Data Hora Fim", "Justificativa"};
            csvWriter.writeNext(cabecalho);

            // Escrever os dados da lista no arquivo
            for (Apontamentos apontamento : apontamentos) {
                String[] linha = {
                    apontamento.getSolicitante(),
                    apontamento.getCategoria(),
                    apontamento.getData_hora_inicio(),
                    apontamento.getData_hora_fim(),
                    apontamento.getJustificativa()
                };
                csvWriter.writeNext(linha);
            }
            
            csvWriter.flush();
            csvWriter.close();
            JOptionPane.showMessageDialog(null, "Relatório do funcionário " 
                    + usuarioSelecionado.getNome() + " gerado com sucesso!");
        } catch(Exception e){
            e.printStackTrace();
        }
        
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        textoPesquisar = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOVO RELATORIO");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person.png"))); // NOI18N

        jLabel3.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logo)
                .addGap(181, 181, 181)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(49, 117, 185));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Gerar relatório");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Funcionário", "Matrícula"
            }
        ));
        jScrollPane1.setViewportView(tabelaUsuario);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(textoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        gerarRelatorio(textoPesquisar.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.setVisible(false);
        new TelaAdmin(usuario).setVisible(true);
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void textoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPesquisarActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        buscarUsuario(textoPesquisar.getText());
    }//GEN-LAST:event_botaoPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField textoPesquisar;
    // End of variables declaration//GEN-END:variables
}
