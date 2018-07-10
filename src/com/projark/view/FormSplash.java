/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projark.view;

import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuneHendrix
 */
public class FormSplash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public FormSplash() {
        initComponents();
          this.setLocationRelativeTo(null);
        
        
        new Thread(){
            public void run(){
                for(int i=0; i<101 ; i++){
                    try {
                        sleep(100);
                         jProgressBar1.setValue(i);
                         if(jProgressBar1.getValue()<=40){
                             jLabel2.setText("Carregando tabelas");
                             }else
                             if(jProgressBar1.getValue()<=70) {
                                     jLabel2.setText("Carregando o Banco de Dados");
                                     }
                             else{
                                     jLabel2.setText("Carregando o Sistema");
                                     
                                     }
                             
                         
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(com.sun.javafx.applet.Splash.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
               
            }
                FormLogin tela = new FormLogin();
                    tela.setVisible(true);
                    dispose();
       }  
    }.start();
    }
 public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagens/icone.png"));
 return retValue;   
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 20, 400, 230);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 270, 180, 20);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jProgressBar1.setBorderPainted(false);
        jProgressBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jProgressBar1.setDoubleBuffered(true);
        jProgressBar1.setOpaque(true);
        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(0, 250, 420, 19);

        setSize(new java.awt.Dimension(398, 309));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSplash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
