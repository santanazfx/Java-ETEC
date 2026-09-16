
package com.mycompany.conversor;

import javax.swing.JButton;
import javax.swing.JOptionPane;





public class ConverView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConverView.class.getName());
    
    public ConverView() {
        initComponents();
    }
    
    public String getGrausText(){
        return txtCelcius.getText();
    }
    
    public void setResposta(String texto){
        labelResult.setText(texto);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTemp.setText("Temperatura:");

        txtCelcius.addActionListener(this::txtCelciusActionPerformed);

        btnConverF.setText("Tranformar F");
        btnConverF.addActionListener(this::btnConverFActionPerformed);

        labelResult.setText("Resultado");

        btnConverC.setText("Transformar C");
        btnConverC.addActionListener(this::btnConverCActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConverF)
                        .addGap(32, 32, 32)
                        .addComponent(btnConverC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTemp)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTemp)
                    .addComponent(txtCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConverF)
                    .addComponent(btnConverC))
                .addGap(34, 34, 34)
                .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelciusActionPerformed

    private void btnConverFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConverFActionPerformed

    private void btnConverCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConverCActionPerformed

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

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConverC;
    private javax.swing.JButton btnConverF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelResult;
    private javax.swing.JLabel labelTemp;
    private javax.swing.JTextField txtCelcius;
    // End of variables declaration//GEN-END:variables
}
