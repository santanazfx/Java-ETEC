
package com.mycompany.conversor;


import javax.swing.*;
import java.awt.event.*;





public class ConverView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConverView.class.getName());
    
    public ConverView() {
        initComponents();
        configurarTeclas();
 
    }
    
    public String getGrausText(){
        return txtCelcius.getText();
    }
    
    public void setHistorico(String hist){
        txtHistorico.setText(hist);
    }
    
    public void setResposta(String texto){
        labelResult.setText(texto);
    }
    
    public void limparDisplay(){
        txtCelcius.setText("");
        labelResult.setText("");
        txtHistorico.setText("");
    }

    public void setTxtCelcius(String txt) {
       txtCelcius.setText(txt);
    }
    
    
    

    public void exibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(
                this,
                mensagem,
                "ERRO",
                JOptionPane.ERROR_MESSAGE
        );
    }
    
    public void addConverListener(java.awt.event.ActionListener listener){
        btnConverF.addActionListener(listener);
        btnConverC.addActionListener(listener);
        btnLimpar.addActionListener(listener);
    }

    private void configurarTeclas() {
        txtCelcius.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F) {
                    btnConverF.doClick();
                    
                }
                if(e.getKeyCode() == KeyEvent.VK_G){
                    btnConverC.doClick();
                    
                }
                if(e.getKeyCode() == KeyEvent.VK_L){
                    btnLimpar.doClick();
                }
            }
        });
    }
    
      

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTemp = new javax.swing.JLabel();
        txtCelcius = new javax.swing.JTextField();
        btnConverF = new javax.swing.JButton();
        labelResult = new javax.swing.JLabel();
        btnConverC = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorico = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTemp.setText("Temperatura:");

        txtCelcius.addActionListener(this::txtCelciusActionPerformed);

        btnConverF.setText("Tranformar F");
        btnConverF.addActionListener(this::btnConverFActionPerformed);

        btnConverC.setText("Transformar C");
        btnConverC.addActionListener(this::btnConverCActionPerformed);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(this::btnLimparActionPerformed);

        txtHistorico.setColumns(20);
        txtHistorico.setRows(5);
        jScrollPane1.setViewportView(txtHistorico);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnConverF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnConverC)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(labelTemp)
                .addGap(18, 18, 18)
                .addComponent(txtCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar))
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTemp)
                    .addComponent(txtCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConverF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConverC, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelciusActionPerformed

    }//GEN-LAST:event_txtCelciusActionPerformed

    private void btnConverFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConverFActionPerformed

    private void btnConverCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConverCActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ConverView().setVisible(true));
    }

    public JButton getBtnConverC() {
        return btnConverC;
    }

    public JButton getBtnConverF() {
        return btnConverF;
    }
    public JButton getBtnLimpar() {
        return btnLimpar;
    }

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConverC;
    private javax.swing.JButton btnConverF;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelResult;
    private javax.swing.JLabel labelTemp;
    private javax.swing.JTextField txtCelcius;
    private javax.swing.JTextArea txtHistorico;
    // End of variables declaration//GEN-END:variables

}
