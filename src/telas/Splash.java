/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.ComponentOrientation;

/**
 *
 * @author Pichau
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Splash() {
        initComponents();
    jProgressBar2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
        
Thread t = new Thread(new Runnable() {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                jProgressBar1.setValue(i);
                jProgressBar2.setValue(i);

                // Verificar se a porcentagem está entre 40% e 60%
                if (i >= 40 && i <= 60) {
                    Thread.sleep(100); // Pausa maior entre 40% e 60%
                } else {
                    Thread.sleep(40); // Pausa normal para outras porcentagens
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            if (i == 100){
                new Login().setVisible(true);
                dispose();
            }
        }
    }
});
t.start();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pb1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setBackground(new java.awt.Color(175, 176, 232));
        jProgressBar1.setForeground(new java.awt.Color(234, 76, 137));
        jProgressBar1.setBorderPainted(false);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 830, 16));

        jProgressBar2.setBackground(new java.awt.Color(175, 176, 232));
        jProgressBar2.setForeground(new java.awt.Color(234, 76, 137));
        jProgressBar2.setBorderPainted(false);
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 16));

        jPanel1.setBackground(new java.awt.Color(175, 176, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(175, 176, 232));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, 430));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 413, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 419, -1, -1));

        pb1.setBackground(new java.awt.Color(175, 176, 232));
        pb1.setForeground(new java.awt.Color(234, 76, 137));
        pb1.setBorderPainted(false);
        jPanel1.add(pb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 610, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/loadingpink3.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 560, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar pb1;
    // End of variables declaration//GEN-END:variables
}