package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados;
import com.fullmadagilists.api2semestre.entidades.Apontamentos;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class TelaListarApontamentosParaAprovacao extends javax.swing.JFrame {
    Usuario avaliador;
    Usuario usuario;
    List<Apontamentos> listaApontamentos;
    Apontamentos apontamentoSelecionado;
    TelaAprovarHoras telaAprovarHoras;


    public TelaListarApontamentosParaAprovacao(Usuario avaliador, Usuario usuario, TelaAprovarHoras telaAprovarHoras) {
        this.avaliador = avaliador;
        this.usuario = usuario;
        this.telaAprovarHoras = telaAprovarHoras;
        initComponents();
        String user = usuario.getNome();
        labelnomeuser.setText(user);
        labelnomeuser.setForeground(Color.WHITE);

        tabelaApontamentos.setFillsViewportHeight(true); // hackzinho pra tabela ficar do tamanho do componente
        carregarApontamentos();
        
        botaoAprovarHora.setEnabled(false);
        tabelaApontamentos.getSelectionModel().addListSelectionListener((e) -> {
            if(tabelaApontamentos.getSelectedRowCount() == 1) {
                botaoAprovarHora.setEnabled(true);
                apontamentoSelecionado = listaApontamentos.get(tabelaApontamentos.getSelectedRow());
            } else {
                botaoAprovarHora.setEnabled(false);
            }
        });
    }

    public void carregarApontamentos(){
        DefaultTableModel tabelaModel = (DefaultTableModel) tabelaApontamentos.getModel();
        tabelaModel.setRowCount(0);

        listaApontamentos = ConexaoBancoDeDados.apontamentos(this.usuario);

        for (Apontamentos a: listaApontamentos){
            Object[] novoApontamento = new Object[]{
                a.getData_hora_inicio(),
                a.getCategoria(),
                a.getProjeto(),
                a.getData_hora_fim(),
                a.getAvaliacaoStatus(),
                a.getAvaliacaoJustificativa(),
                a.getAvaliadorMatricula()
            };
            tabelaModel.addRow(novoApontamento);
        }

        tabelaApontamentos.setModel(tabelaModel);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaApontamentos = new javax.swing.JTable();
        botaoVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelnomeuser = new javax.swing.JLabel();
        botaoReprovarHora = new javax.swing.JButton();
        botaoAprovarHora = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaApontamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA", "TIPO", "PROJETO", "HORAS APONTADAS", "STATUS", "JUSTIFICATIVA", "AVALIADOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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

        botaoVoltar.setBackground(new java.awt.Color(46, 44, 45));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(242, 242, 242));
        botaoVoltar.setText("VOLTAR");
        botaoVoltar.setPreferredSize(new java.awt.Dimension(200, 40));
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, 216, -1));

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APONTAMENTOS");

        labelnomeuser.setText("localiza");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(labelnomeuser, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelnomeuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 45));

        botaoReprovarHora.setBackground(new java.awt.Color(255, 51, 51));
        botaoReprovarHora.setForeground(new java.awt.Color(255, 255, 255));
        botaoReprovarHora.setText("Reprovar Hora");
        botaoReprovarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReprovarHoraActionPerformed(evt);
            }
        });
        getContentPane().add(botaoReprovarHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 216, 40));

        botaoAprovarHora.setText("Aprovar Hora");
        botaoAprovarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAprovarHoraActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAprovarHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 216, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.setVisible(false);
        this.telaAprovarHoras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoReprovarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReprovarHoraActionPerformed
        String justificativa = JOptionPane.showInputDialog("Justificativa:", null);
        apontamentoSelecionado.setAvaliadorMatricula(avaliador.getMatricula());
        apontamentoSelecionado.setAvaliacaoStatus("REPROVADO");
        apontamentoSelecionado.setAvaliacaoJustificativa(justificativa);
        
        ConexaoBancoDeDados.atualizarAvaliacaoApontamento(apontamentoSelecionado);
        this.carregarApontamentos();
        this.apontamentoSelecionado = null;
    }//GEN-LAST:event_botaoReprovarHoraActionPerformed

    private void botaoAprovarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAprovarHoraActionPerformed
        String justificativa = JOptionPane.showInputDialog("Justificativa:", null);
        apontamentoSelecionado.setAvaliadorMatricula(avaliador.getMatricula());
        apontamentoSelecionado.setAvaliacaoStatus("APROVADO");
        apontamentoSelecionado.setAvaliacaoJustificativa(justificativa);
        
        ConexaoBancoDeDados.atualizarAvaliacaoApontamento(apontamentoSelecionado);
        this.carregarApontamentos();
        this.apontamentoSelecionado = null;
    }//GEN-LAST:event_botaoAprovarHoraActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAprovarHora;
    private javax.swing.JButton botaoReprovarHora;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelnomeuser;
    private javax.swing.JTable tabelaApontamentos;
    // End of variables declaration//GEN-END:variables
}
