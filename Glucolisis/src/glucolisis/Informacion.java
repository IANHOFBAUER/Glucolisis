/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glucolisis;

import java.awt.Color;

/**
 *
 * @author 18PROGB0115
 */
public class Informacion extends javax.swing.JFrame {

    /**
     * Creates new form Imagenes
     */
    public Informacion() {
        initComponents();
         this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAyuda = new javax.swing.JButton();
        btnIntroduccion = new javax.swing.JButton();
        btnGlucolisis = new javax.swing.JButton();
        btnFunciones = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnFases = new javax.swing.JButton();
        lblInformacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contenido ");
        setFocusTraversalPolicyProvider(true);
        setName("FrmInformacion"); // NOI18N

        btnAyuda.setText("?");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        btnIntroduccion.setBackground(new java.awt.Color(0, 255, 255));
        btnIntroduccion.setText("Introducción");
        btnIntroduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntroduccionActionPerformed(evt);
            }
        });

        btnGlucolisis.setBackground(new java.awt.Color(0, 204, 204));
        btnGlucolisis.setText("Glucólisis:Un proceso metabólico");
        btnGlucolisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGlucolisisActionPerformed(evt);
            }
        });

        btnFunciones.setBackground(new java.awt.Color(0, 153, 153));
        btnFunciones.setText("Funciones");
        btnFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionesActionPerformed(evt);
            }
        });

        jButton6.setText("Menu Principal ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnFases.setBackground(new java.awt.Color(0, 102, 102));
        btnFases.setText("Fases");
        btnFases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFasesActionPerformed(evt);
            }
        });

        lblInformacion.setBackground(new java.awt.Color(0, 153, 153));
        lblInformacion.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblInformacion.setText("Información");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAyuda)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 190, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIntroduccion, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(btnGlucolisis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFunciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnIntroduccion)
                .addGap(18, 18, 18)
                .addComponent(btnGlucolisis)
                .addGap(18, 18, 18)
                .addComponent(btnFunciones)
                .addGap(18, 18, 18)
                .addComponent(btnFases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButton6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIntroduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntroduccionActionPerformed
        Introduccion intro = new Introduccion();
        intro.setVisible(true);
    }//GEN-LAST:event_btnIntroduccionActionPerformed

    private void btnGlucolisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGlucolisisActionPerformed
         Glucolisis gluco = new Glucolisis();
        gluco.setVisible(true);
    }//GEN-LAST:event_btnGlucolisisActionPerformed

    private void btnFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionesActionPerformed
      Funciones Fun = new Funciones();
        Fun.setVisible(true);
    }//GEN-LAST:event_btnFuncionesActionPerformed

    private void btnFasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFasesActionPerformed
        Fases Etaps = new Fases();
        Etaps.setVisible(true);
    }//GEN-LAST:event_btnFasesActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        Ayuda i=new Ayuda();
i.setVisible(true);
dispose();
    }//GEN-LAST:event_btnAyudaActionPerformed

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
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnFases;
    private javax.swing.JButton btnFunciones;
    private javax.swing.JButton btnGlucolisis;
    private javax.swing.JButton btnIntroduccion;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel lblInformacion;
    // End of variables declaration//GEN-END:variables
}
