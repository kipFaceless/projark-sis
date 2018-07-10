
package com.projark.view;

import com.projark.connection.ConnectionDB;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;


public class FormLogin extends javax.swing.JFrame {

    ConnectionDB login = new ConnectionDB();
    public FormLogin() {
        initComponents();
        jTextFieldNome.setVisible(false);
        fillUsers();
    }

   /** public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagens/icone.png"));
 return retValue;   
} */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonExit = new javax.swing.JButton();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jComboBoxUsers = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonLogin.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Entrar");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin);
        jButtonLogin.setBounds(140, 180, 80, 30);

        jLabel2.setBackground(new java.awt.Color(0, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuário:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 80, 70, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 130, 60, 20);

        jTextFieldNome.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(0, 204, 255));
        jTextFieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextFieldNome.setNextFocusableComponent(jPasswordFieldPassword);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(430, 130, 20, 30);

        jButtonExit.setBackground(new java.awt.Color(0, 0, 0));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Sair");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit);
        jButtonExit.setBounds(250, 180, 80, 30);

        jPasswordFieldPassword.setBackground(new java.awt.Color(102, 102, 102));
        jPasswordFieldPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(0, 204, 255));
        jPasswordFieldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jPasswordFieldPassword);
        jPasswordFieldPassword.setBounds(140, 130, 190, 30);

        jComboBoxUsers.setEditable(true);
        jComboBoxUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUsersActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxUsers);
        jComboBoxUsers.setBounds(140, 80, 190, 30);

        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Versão Registada");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 110, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Projark ARQ 1.0");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 100, 14);
        getContentPane().add(fundo);
        fundo.setBounds(-20, -19, 530, 310);

        setSize(new java.awt.Dimension(475, 282));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
 login.connection();
      
        try {
            login.executeSql("SELECT *FROM users WHERE user_name ='"+jComboBoxUsers.getSelectedItem()+"'");
            login.rs.first();
            if(login.rs.getString("password").equals(jPasswordFieldPassword.getText())){
                FormHome tela = new FormHome();
                tela.setVisible(true);
                dispose();
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Senha Incorrecta!\n Tente novamente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nome de Usuário Incorrecto!\n Tente novamente.");
        }
      login.disconnect();
    
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    
    public void fillUsers(){
        
        login.connection();
        login.executeSql("SELECT *FROM users");
        try {
            login.rs.first();
            jComboBoxUsers.removeAllItems();
            do{
                jComboBoxUsers.addItem(login.rs.getString("user_name"));
            }
            while(login.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Preencher Usuário!");
        }
        
        login.disconnect();
        
    }
    private void jComboBoxUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUsersActionPerformed
        jComboBoxUsers.transferFocus();
    }//GEN-LAST:event_jComboBoxUsersActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JComboBox<String> jComboBoxUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
