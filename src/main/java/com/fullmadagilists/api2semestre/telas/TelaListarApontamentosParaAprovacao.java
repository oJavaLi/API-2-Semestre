package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.comum.Autenticacao;
import com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados;
import com.fullmadagilists.api2semestre.entidades.Apontamentos;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class TelaListarApontamentosParaAprovacao extends javax.swing.JFrame {
    Usuario avaliador;
    Usuario avaliado;
    List<Apontamentos> listaApontamentos;
    Apontamentos apontamentoSelecionado;

    public TelaListarApontamentosParaAprovacao(Usuario avaliado) {
        this.avaliador = Autenticacao.getUsuarioLogado();
        this.avaliado = avaliado;
        initComponents();
        
        String user = avaliado.getNome();
        labelnomeuser.setText(user);
        labelnomeuser.setForeground(Color.BLACK);

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

        listaApontamentos = ConexaoBancoDeDados.apontamentos(this.avaliado);

        for (Apontamentos a: listaApontamentos){
            Object[] novoApontamento = new Object[]{
                a.getData_hora_inicio(),
                a.getData_hora_fim(),
                a.getCategoria(),
                a.getProjeto(),
                a.getTotalHoras(),
                a.getAvaliacaoStatus(),
                a.getAvaliacaoJustificativa(),
                a.getAdministradorMatricula(),
                a.getGestorMatricula()
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
        logo = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        botaoReprovarHora = new javax.swing.JButton();
        botaoAprovarHora = new javax.swing.JButton();
        labelnomeuser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tabelaApontamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ENTRADA", "SAIDA", "TIPO", "PROJETO", "HORAS APONTADAS", "STATUS", "JUSTIFICATIVA", "ADMIN", "GESTOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APONTAMENTOS");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(icon)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icon)
                    .addComponent(logo)
                    .addComponent(jLabel1))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        botaoReprovarHora.setBackground(new java.awt.Color(153, 0, 0));
        botaoReprovarHora.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoReprovarHora.setForeground(new java.awt.Color(255, 255, 255));
        botaoReprovarHora.setText("Reprovar Hora");
        botaoReprovarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReprovarHoraActionPerformed(evt);
            }
        });

        botaoAprovarHora.setBackground(new java.awt.Color(49, 117, 185));
        botaoAprovarHora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoAprovarHora.setForeground(new java.awt.Color(255, 255, 255));
        botaoAprovarHora.setText("Aprovar Hora");
        botaoAprovarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAprovarHoraActionPerformed(evt);
            }
        });

        labelnomeuser.setText("func");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("FUNCIONARIO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(botaoAprovarHora, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(botaoReprovarHora, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelnomeuser, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelnomeuser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAprovarHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoReprovarHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.setVisible(false);
        new TelaAprovarHoras().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoReprovarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReprovarHoraActionPerformed
        String justificativa = JOptionPane.showInputDialog("Justificativa:", apontamentoSelecionado.getAvaliacaoJustificativa());
        if(this.avaliador.getCategoria().equals("administrador")) {
            apontamentoSelecionado.setAdministradorMatricula(avaliador.getMatricula());
            apontamentoSelecionado.setAvaliacaoStatus("REPROVADO PELO ADMINISTRADOR");
        } else if (this.avaliador.getCategoria().equals("gestor")) {
            apontamentoSelecionado.setGestorMatricula(avaliador.getMatricula());
            apontamentoSelecionado.setAvaliacaoStatus("REPROVADO PELO GESTOR");
        }
        apontamentoSelecionado.setAvaliacaoJustificativa(justificativa);
        
        ConexaoBancoDeDados.atualizarAvaliacaoApontamento(apontamentoSelecionado);
        this.carregarApontamentos();
        this.apontamentoSelecionado = null;
    }//GEN-LAST:event_botaoReprovarHoraActionPerformed

    private void botaoAprovarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAprovarHoraActionPerformed
        if(apontamentoSelecionado.getAvaliacaoStatus().equals("APROVADO")) {
            JOptionPane.showMessageDialog(this, "Apontamento já Aprovado!");
            return;
        }
        
        String justificativa = JOptionPane.showInputDialog("Justificativa:", apontamentoSelecionado.getAvaliacaoJustificativa());
        if(this.avaliador.getCategoria().equals("administrador")) {
            apontamentoSelecionado.setAdministradorMatricula(avaliador.getMatricula());
            if (apontamentoSelecionado.getGestorMatricula() != 0 && apontamentoSelecionado.getAvaliacaoStatus().equals("APROVADO PARCIALMENTE")) {
                apontamentoSelecionado.setAvaliacaoStatus("APROVADO");
            } else {
                apontamentoSelecionado.setAvaliacaoStatus("APROVADO PARCIALMENTE");
            }
        } else if (this.avaliador.getCategoria().equals("gestor")) {
            apontamentoSelecionado.setGestorMatricula(avaliador.getMatricula());
            if (apontamentoSelecionado.getAdministradorMatricula() != 0 && apontamentoSelecionado.getAvaliacaoStatus().equals("APROVADO PARCIALMENTE")) {
                apontamentoSelecionado.setAvaliacaoStatus("APROVADO");
            } else {
                apontamentoSelecionado.setAvaliacaoStatus("APROVADO PARCIALMENTE");
            }
        }
        apontamentoSelecionado.setAvaliacaoJustificativa(justificativa);
        
        ConexaoBancoDeDados.atualizarAvaliacaoApontamento(apontamentoSelecionado);
        this.carregarApontamentos();
        this.apontamentoSelecionado = null;
    }//GEN-LAST:event_botaoAprovarHoraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAprovarHora;
    private javax.swing.JButton botaoReprovarHora;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelnomeuser;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tabelaApontamentos;
    // End of variables declaration//GEN-END:variables
}
