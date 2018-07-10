
package com.projark.view;



import com.projark.connection.ConnectionDB;
import javax.swing.JOptionPane;
import com.projark.model.UserModel;
import com.projark.controller.DalUsers;

public class FrameUsers extends javax.swing.JInternalFrame {

DalUsers dal = new DalUsers();
ConnectionDB connect = new ConnectionDB();
UserModel mod = new UserModel();

int flag=0; 
    public FrameUsers() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsers = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxProfile = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButtonNew = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jTextFieldUsuer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jPasswordFieldConfPassword = new javax.swing.JPasswordField();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Usuários");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Usuário: ");

        jLabel3.setText("Senha:");

        jTableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableUsers);

        jLabel4.setText("Tipo:");

        jComboBoxProfile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Denttista", "Recepcionista", "Funcionario" }));
        jComboBoxProfile.setEnabled(false);

        jLabel5.setText("Confirmar Senha:");

        jButtonNew.setText("Novo");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonSave.setText("Salvar");
        jButtonSave.setEnabled(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.setEnabled(false);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Editar");
        jButtonEdit.setEnabled(false);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Excluir");
        jButtonDelete.setEnabled(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonSearch.setText("Procurar");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTextFieldUsuer.setEnabled(false);

        jLabel6.setText("Cod:");

        jTextFieldId.setEnabled(false);

        jPasswordFieldPassword.setEnabled(false);

        jPasswordFieldConfPassword.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordFieldPassword)
                            .addComponent(jTextFieldUsuer, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxProfile, 0, 135, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldConfPassword)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldSearch)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSearch))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(174, 194, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldUsuer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSearch)
                            .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldConfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        flag=1;
        jTextFieldId.setText("");
        jTextFieldUsuer.setText("");
        jPasswordFieldPassword.setText("");
        jPasswordFieldConfPassword.setText("");
        jTextFieldUsuer.setEnabled(true);
        jPasswordFieldPassword.setEnabled(true);
        jPasswordFieldConfPassword.setEnabled(true);
        jComboBoxProfile.setEnabled(true);
        jTextFieldSearch.setEnabled(false);
        jButtonSave.setEnabled(true);
        jButtonEdit.setEnabled(false);
         jButtonCancel.setEnabled(true);
          jButtonNew.setEnabled(false);
          jButtonDelete.setEnabled(false);
          
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if(jTextFieldUsuer.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o NOME de Usuário para continuar...","Nome de Usuário", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldUsuer.requestFocus();
        }else if  (jPasswordFieldPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Introduza uma SENHA para continuar...","SENHA de Usuário", JOptionPane.INFORMATION_MESSAGE);
            jPasswordFieldPassword.requestFocus();

        }
        else if  (jPasswordFieldPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "confirme a SENHA para continuar...","Confirmar SENHA de Usuário", JOptionPane.INFORMATION_MESSAGE);
            jPasswordFieldConfPassword.requestFocus();
        }
        else if(jPasswordFieldPassword.getText().equals(jPasswordFieldConfPassword.getText())){
            if(flag==1){
                mod.setUsername(jTextFieldUsuer.getText());
                mod.setProfile((String) jComboBoxProfile.getSelectedItem());
                mod.setPassword(jPasswordFieldPassword.getText());

                dal.salvar(mod);
                jTextFieldId.setText("");
                jTextFieldUsuer.setText("");
                jPasswordFieldPassword.setText("");
                jPasswordFieldConfPassword.setText("");
                jComboBoxProfile.setEnabled(false);
                jTextFieldUsuer.setEnabled(false);
                jPasswordFieldPassword.setEnabled(false);
                jPasswordFieldConfPassword.setEnabled(false);
                jButtonSave.setEnabled(false);
                jButtonEdit.setEnabled(false);
            }
            else {
                //mod.setIdUsuario(Integer.parseInt(jTextFieldId.getText()));
                mod.setUsername(jTextFieldUsuer.getText());
                mod.setProfile((String)(jComboBoxProfile.getSelectedItem()));
                mod.setPassword(jPasswordFieldPassword.getText());

                dal.editar(mod);
                 jButtonSave.setEnabled(false);
                jButtonEdit.setEnabled(true);
            }
        }
        else{JOptionPane.showMessageDialog(null, "As senhas não correspondem!\n Tente novamente");
            jPasswordFieldPassword.requestFocus();
        }

    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        flag=2;
        jTextFieldUsuer.setEnabled(true);
        jComboBoxProfile.setEnabled(true);
        jPasswordFieldPassword.setEnabled(true);
        jPasswordFieldConfPassword.setEnabled(true);
        jButtonEdit.setEnabled(false);
        jButtonSave.setEnabled(true);
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

        int resposta= 0;
        resposta =JOptionPane.showConfirmDialog(null, "Deseja Realmente Excluir este Usuário?","Excluindo Usuário",JOptionPane.YES_NO_CANCEL_OPTION);
        if (resposta == JOptionPane.YES_OPTION){

            mod.setId(Integer.parseInt(jTextFieldId.getText()));
            dal.excluir(mod);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed

        mod.setSearch(jTextFieldSearch.getText());
        UserModel model = dal.getUser(mod);
        jTextFieldUsuer.setText(model.getUsername());
        jTextFieldId.setText(String.valueOf(model.getId()));
        jPasswordFieldPassword.setText(model.getPassword());
        jPasswordFieldConfPassword.setText(model.getPassword());
        jComboBoxProfile.setSelectedItem(model.getProfile());

        jButtonDelete.setEnabled(true);
        jButtonEdit.setEnabled(true);
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        jButtonCancel.setEnabled(false);
        jButtonNew.setEnabled(true);
        jButtonSave.setEnabled(false);
        jTextFieldId.setText("");
                jTextFieldUsuer.setText("");
                jPasswordFieldPassword.setText("");
                jPasswordFieldConfPassword.setText("");
                jComboBoxProfile.setEnabled(false);
                jTextFieldUsuer.setEnabled(false);
                jPasswordFieldPassword.setEnabled(false);
                jPasswordFieldConfPassword.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldConfPassword;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsers;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldUsuer;
    // End of variables declaration//GEN-END:variables
}
