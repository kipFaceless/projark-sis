
package com.projark.view;

import com.projark.connection.ConnectionDB;
import java.util.Properties;
import javax.swing.JFrame;


public class FormHome extends javax.swing.JFrame {
    ConnectionDB connect = new ConnectionDB();
  
    FrameUsers usucad = new FrameUsers();
 // FundoTela tela;
    public FormHome() {
        initComponents();
        connect.connection();
        //jLabelUsuario.setText(usuario);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setLayout(new GridLayout());
        //tela = new FundoTela("imagens/projarkBlack.jpg");
        //getContentPane().add(tela);
    }

   /* private FormHome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
/* public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagens/icone.png"));
 return retValue;   
}*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuario = new javax.swing.JLabel();
        jDesktopPaneFrames = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemCustomers = new javax.swing.JMenuItem();
        jMenuItemUsers = new javax.swing.JMenuItem();
        jMenuNewProj = new javax.swing.JMenu();
        jMenuItemNewProj = new javax.swing.JMenuItem();
        jMenuReports = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projark ARQ 1.0");
        setIconImage(getIconImage());
        getContentPane().setLayout(null);
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(230, 790, 130, 20);
        getContentPane().add(jDesktopPaneFrames);
        jDesktopPaneFrames.setBounds(10, 40, 990, 620);

        jMenuFile.setText("Cadastro");

        jMenuItemCustomers.setText("Cadastro de Clientes ");
        jMenuItemCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCustomersActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemCustomers);

        jMenuItemUsers.setText("Cadastro de Usuários");
        jMenuItemUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsersActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemUsers);

        jMenuBar1.add(jMenuFile);

        jMenuNewProj.setText("Projectos");

        jMenuItemNewProj.setText("Novo Projecto");
        jMenuItemNewProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewProjActionPerformed(evt);
            }
        });
        jMenuNewProj.add(jMenuItemNewProj);

        jMenuBar1.add(jMenuNewProj);

        jMenuReports.setText("Relatórios");
        jMenuBar1.add(jMenuReports);

        jMenu1.setText("Parcelamento");

        jMenuItem1.setText("Pagar Parcela");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Pagar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1042, 881));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCustomersActionPerformed

        FrameCustomers customers = new FrameCustomers();
        customers.setVisible(true);
        jDesktopPaneFrames.add(customers);
        
        /*(if(cadcliente==null) 
       { cadcliente = new FormCustomers();
        cadcliente.setVisible(true);
        cadcliente.setResizable(false);
       }else {
               cadcliente.setVisible(true);
        cadcliente.setResizable(false);
       }*/
       


    }//GEN-LAST:event_jMenuItemCustomersActionPerformed

    private void jMenuItemUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsersActionPerformed
              
        FrameUsers users = new FrameUsers();
       users.setVisible(true);
        jDesktopPaneFrames.add(users);
        
        /**  try {
            conecta.executeSql("SELECT * FROM tb_usuario WHERE uso_nome ='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("uso_tipo").equals("Administrador")){
                if(usucad==null) 
       { usucad = new FrameUsers();
      usucad.setVisible(true);
        usucad.setResizable(false);
       }else {
               usucad.setVisible(true);
        usucad.setResizable(false);
       }
                
            }
            else{
                jMenuItemCadUsu.setEnabled(false);
               // jMenuItemCadUsu.setToolTipText("Você não tem Permissão para esta funcionalidade!");
                 //JOptionPane.showMessageDialog(null, "Você não tem permissão para esta funcionalidade!\n Contacte o Administrador do Sistema.");
            }
        } catch (SQLException ex) {
             
            JOptionPane.showMessageDialog(null, "Você não tem permissão para esta funcionalidade!\n Contacte o Administrador do Sistema.");
        }
      */
    }//GEN-LAST:event_jMenuItemUsersActionPerformed

    private void jMenuItemNewProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewProjActionPerformed
        
          FrameProject project  = new FrameProject();
       project.setVisible(true);
        jDesktopPaneFrames.add(project);
        
    }//GEN-LAST:event_jMenuItemNewProjActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         FrameParcelPayment payment = new FrameParcelPayment();
        payment.setVisible(true);
        jDesktopPaneFrames.add(payment);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Pay payment = new Pay();
        payment.setVisible(true);
        jDesktopPaneFrames.add(payment);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
   
     
 public static void main(String args[]) {
        
try {
Properties props = new Properties();

props.put("menuForegroundColor", "0 204 255");
props.put("frameColor", "255 255 255");
props.put("menuSelectionBackgroundColor", "255 255 255");
props.put("rolloverColorDark", "255 255 255");
props.put("rolloverColorLight", "255 255 255");

com.jtattoo.plaf.noire.NoireLookAndFeel.setCurrentTheme(props);
javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
} catch (Exception ex) {
ex.printStackTrace();
}
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPaneFrames;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCustomers;
    private javax.swing.JMenuItem jMenuItemNewProj;
    private javax.swing.JMenuItem jMenuItemUsers;
    private javax.swing.JMenu jMenuNewProj;
    private javax.swing.JMenu jMenuReports;
    // End of variables declaration//GEN-END:variables
}
