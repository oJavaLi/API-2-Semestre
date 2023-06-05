
package com.fullmadagilists.api2semestre.telas;

import com.fullmadagilists.api2semestre.comum.Autenticacao;
import com.fullmadagilists.api2semestre.comum.ConexaoBancoDeDados;
import com.fullmadagilists.api2semestre.entidades.Parametro;
import com.fullmadagilists.api2semestre.entidades.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaNovoParametro extends javax.swing.JFrame {
    Usuario usuario;
    Parametro parametroEditar;

    
    public TelaNovoParametro() {
        this.usuario = Autenticacao.getUsuarioLogado();
        initComponents();
        String user = usuario.getNome();
        jLabel2.setText(user);
        jLabel2.setForeground(Color.WHITE);
    }
    
    public TelaNovoParametro(Parametro parametroEditar){
        this();
        this.parametroEditar = parametroEditar;
        verbaTextField.setText(parametroEditar.getVerba());
        verbaTextField.setEditable(false);
        horasTextField.setText(parametroEditar.getHoras());
        porcentagemTextField.setText(parametroEditar.getPorcentagem());
        descricaoTextField.setText(parametroEditar.getDescricao());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        verbaTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        horasTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        porcentagemTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        descricaoTextField = new javax.swing.JTextField();
        botaoSubmeterParametro = new javax.swing.JButton();
        botaoCancelarParametro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 30, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PARAMETRIZAÇÃO");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person.png"))); // NOI18N

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logo)
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addGap(125, 125, 125)
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo)
                            .addComponent(icon)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        verbaTextField.setEditable(false);
        verbaTextField.setBackground(new java.awt.Color(255, 255, 255));
        verbaTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Verba:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Horas:");

        horasTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Porcentagem:");

        porcentagemTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Descrição:");

        descricaoTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botaoSubmeterParametro.setBackground(new java.awt.Color(49, 117, 185));
        botaoSubmeterParametro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoSubmeterParametro.setForeground(new java.awt.Color(255, 255, 255));
        botaoSubmeterParametro.setText("Submeter Parâmetros");
        botaoSubmeterParametro.setActionCommand("Submeter Parâmetros");
        botaoSubmeterParametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubmeterParametroActionPerformed(evt);
            }
        });

        botaoCancelarParametro.setBackground(new java.awt.Color(46, 44, 45));
        botaoCancelarParametro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoCancelarParametro.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancelarParametro.setText("Cancelar");
        botaoCancelarParametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarParametroActionPerformed(evt);
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
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botaoCancelarParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSubmeterParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(verbaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15))
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(horasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(porcentagemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(verbaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(porcentagemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(botaoSubmeterParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCancelarParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSubmeterParametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubmeterParametroActionPerformed
        parametroEditar.setVerba(verbaTextField.getText());
        parametroEditar.setHoras(horasTextField.getText());
        parametroEditar.setPorcentagem(porcentagemTextField.getText());
        parametroEditar.setDescricao(descricaoTextField.getText());
        ConexaoBancoDeDados.atualizarParametro(parametroEditar);
        
        JOptionPane.showMessageDialog(this, "Parâmetro atualizado com sucesso!");
        
        this.setVisible(false);
        new TelaListarParametrizacao().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoSubmeterParametroActionPerformed

    private void botaoCancelarParametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarParametroActionPerformed
        this.setVisible(false);
        new TelaListarParametrizacao().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCancelarParametroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarParametro;
    private javax.swing.JButton botaoSubmeterParametro;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JTextField horasTextField;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField porcentagemTextField;
    private javax.swing.JTextField verbaTextField;
    // End of variables declaration//GEN-END:variables
}
