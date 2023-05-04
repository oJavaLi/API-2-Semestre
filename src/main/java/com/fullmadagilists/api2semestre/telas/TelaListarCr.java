package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados;
import com.fullmadagilists.api2semestre.entidades.CentroResultado;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class TelaListarCr extends javax.swing.JFrame {


    public TelaListarCr() {
        initComponents();
        tabelaCR.setFillsViewportHeight(true);
        carregarCentroResultado();
    
    }
    
    public void carregarCentroResultado(){
        DefaultTableModel tabelaModel = (DefaultTableModel) tabelaCR.getModel();
        tabelaModel.setRowCount(0);
   
        List<CentroResultado> listaCentroResultado = ConexaoBancoDeDados.centroresultado();
        
        for (CentroResultado u: listaCentroResultado){
            String codigoCR = u.getCodigocr();
            String nomeCR = u.getNomecr();
            String siglaCR = u.getSiglacr();
           
        }
        
        tabelaCR.setModel(tabelaModel);

    
    }
    


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCR = new javax.swing.JTable();
        botaoApontarCR = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CENTRO DE RESULTADOS");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(150, 150, 150)
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
                .addContainerGap(7, Short.MAX_VALUE))
        );

        tabelaCR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código CR", "Nome CR", "Sigla CR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaCR.setPreferredSize(new java.awt.Dimension(500, 80));
        jScrollPane1.setViewportView(tabelaCR);

        botaoApontarCR.setBackground(new java.awt.Color(49, 117, 185));
        botaoApontarCR.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoApontarCR.setForeground(new java.awt.Color(242, 242, 242));
        botaoApontarCR.setText("+ APONTAR CR");
        botaoApontarCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApontarCRActionPerformed(evt);
            }
        });

        botaoSair.setBackground(new java.awt.Color(46, 44, 45));
        botaoSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(242, 242, 242));
        botaoSair.setText("SAIR");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(botaoApontarCR, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 657, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoApontarCR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoApontarCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApontarCRActionPerformed
        TelaNovoCr novoCR = new TelaNovoCr(this);
        this.setVisible(false);
        novoCR.setVisible(true);
    }//GEN-LAST:event_botaoApontarCRActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListarCr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoApontarCR;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tabelaCR;
    // End of variables declaration//GEN-END:variables
}
