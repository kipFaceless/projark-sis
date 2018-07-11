
package com.projark.view;

import com.projark.connection.ConnectionDB;
import com.projark.controller.DalProject;
import com.projark.model.CustomerModel;
import com.projark.model.ProjectModel;
import com.projark.model.TableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class FrameProject extends javax.swing.JInternalFrame {
    ConnectionDB connect = new ConnectionDB();
    CustomerModel custom = new CustomerModel();
    ProjectModel mod = new ProjectModel();
    DalProject dal = new DalProject();
    int flag=0, projId;
    public FrameProject() {
        initComponents();
        connect.connection();
        try {
            PreparedStatement pst = connect.con.prepareStatement("INSERT into projects(	price,payment_type)VALUES(?,?)");
            pst.setFloat(1, 0);
            pst.setString(2, "nenhum");
            pst.execute();
            connect.executeSql("SELECT *FROM projects");
            connect.rs.last();
            projId = connect.rs.getInt("id");
         
        } catch (SQLException ex) {
            Logger.getLogger(FrameProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        fillTable("SELECT customer, city, identification_number FROM cliente ORDER BY customer ");
        fillProjTable("SELECT c.customer, p.project_name FROM projects p JOIN cliente c ON c.id=p.customer_id ORDER BY c.customer ");
    }

   public void fillTable (String sql){
        ArrayList dados = new ArrayList();
        
        String []colunas = new String []{ "Nome", "Cidade", "Identificação"  };  
        connect.connection();
        
        connect.executeSql(sql);
        try {
            connect.rs.first();
            do{
                dados.add( new Object[]{connect.rs.getString("customer"), connect.rs.getString("city"), connect.rs.getString("identification_number")});
            }while(connect.rs.next());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Busque Por Outro Cliente");
        }
        
        TableModel modelo = new TableModel(dados, colunas);
        
        jTableCostumers.setModel(modelo);
       
         jTableCostumers.getColumnModel().getColumn(0).setPreferredWidth(180);
        jTableCostumers.getColumnModel().getColumn(0).setResizable(false);
         jTableCostumers.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTableCostumers.getColumnModel().getColumn(1).setResizable(false);
         jTableCostumers.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableCostumers.getColumnModel().getColumn(2).setResizable(false);
        jTableCostumers.getTableHeader().setReorderingAllowed(false);
        jTableCostumers.setAutoResizeMode(jTableCostumers.AUTO_RESIZE_OFF);
        jTableCostumers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        connect.disconnect();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCustomer = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCostumers = new javax.swing.JTable();
        jTextFieldCustomerId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldProjName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxProjType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jTextFieldLength = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxPaymentType = new javax.swing.JComboBox<>();
        jTextFieldWidth = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldState = new javax.swing.JTextField();
        jTextFieldMuni = new javax.swing.JTextField();
        jTextFieldNeighbour = new javax.swing.JTextField();
        jTextFieldProjId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jFormattedTextFieldDate = new javax.swing.JFormattedTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProj = new javax.swing.JTable();
        jTextFieldSearchProj = new javax.swing.JTextField();
        jButtonSearchProj = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Cliente:");

        jTextFieldCustomer.setEditable(false);

        jButtonSearch.setText("Buscar");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTableCostumers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCostumers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCostumersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCostumers);

        jTextFieldCustomerId.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSearch)
                        .addGap(45, 45, 45)
                        .addComponent(jTextFieldCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch)
                    .addComponent(jTextFieldCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 170));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Nome do Projecto:");

        jLabel4.setText("Tipo de Projecto");

        jComboBoxProjType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Residencia", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Preço:");

        jLabel8.setText("Comprimento:");

        jLabel9.setText("Largura:");

        jLabel5.setText("Formas de Pagamento");

        jComboBoxPaymentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Parcelas" }));

        jLabel10.setText("Província");

        jLabel11.setText("Município");

        jLabel12.setText("Bairro");

        jTextFieldProjId.setEnabled(false);

        jLabel13.setText("Id:");

        jLabel14.setText("Data:");

        try {
            jFormattedTextFieldDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonSave.setText("Adicionar Projecto");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonNew.setText("Novo Projecto");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel10)))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldLength)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldState, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldMuni, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNeighbour, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldProjId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonSave)
                                .addGap(54, 54, 54)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonCancel))
                            .addComponent(jFormattedTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBoxProjType, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldProjName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonNew)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldProjName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxProjType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNeighbour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldProjId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jFormattedTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSave)
                            .addComponent(jButtonNew)
                            .addComponent(jButtonCancel))
                        .addContainerGap())))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, 220));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listagem de Projectos"));

        jTableProj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableProj);

        jButtonSearchProj.setText("Buscar");

        jButtonEdit.setText("Editar");

        jButtonDelete.setText("Eliminar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEdit)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldSearchProj, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearchProj)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearchProj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchProj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEdit)
                            .addComponent(jButtonDelete))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 570, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed

        custom.setSearch(jTextFieldCustomer.getText());
        CustomerModel model= dal.searchCustomer(custom);
        jButtonEdit.setEnabled(false);
        jButtonDelete.setEnabled(false);
        fillTable("SELECT *FROM cliente WHERE customer LIKE '%"+custom.getSearch()+"%'");
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTableCostumersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCostumersMouseClicked
        
        String customer_name ="" +jTableCostumers.getValueAt(jTableCostumers.getSelectedRow(), 0);
        connect.connection();
        connect.executeSql("SELECT *FROM cliente WHERE customer ='"+customer_name+"'");
        try {
            connect.rs.first();
            jTextFieldCustomer.setText(String.valueOf(connect.rs.getString("customer")));
            jTextFieldCustomerId.setText(String.valueOf(connect.rs.getInt("id")));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Seleccionar os Dados!" +ex);

        }
        connect.disconnect();
        jButtonEdit.setEnabled(true);
        jButtonDelete.setEnabled(true);
      //  jButtonSave.setEnabled(false);
        jButtonCancel.setEnabled(true);
    }//GEN-LAST:event_jTableCostumersMouseClicked

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
         if (jTextFieldCustomer.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione um Cliente  Para continuar!","Cadastrando Projecto",JOptionPane.OK_OPTION);
            jTextFieldCustomer.requestFocus();
        }else{
             
                        if(flag==1) {
                            if( jComboBoxPaymentType.getSelectedItem().equals("Cash")){
                               

                                mod.setCustomer(jTextFieldCustomer.getText());
                                mod.setProjectName(jTextFieldProjName.getText());
                                mod.setPrice(Float.parseFloat(jTextFieldPrice.getText()));
                                mod.setProjectType((String) jComboBoxProjType.getSelectedItem());
                                mod.setPaymentType((String) jComboBoxPaymentType.getSelectedItem());
                                mod.setLength(Float.parseFloat(jTextFieldLength.getText()));
                                mod.setWidth(Float.parseFloat(jTextFieldWidth.getText()));
                                mod.setState(jTextFieldState.getText());
                                mod.setCustomerId(Integer.parseInt(jTextFieldCustomerId.getText()));
                                mod.setNeighbour(jTextFieldNeighbour.getText());
                                mod.setDate(jFormattedTextFieldDate.getText());
                                mod.setId(projId);
                
                
                                    dal.save(mod);
                                    jButtonSave.setEnabled(false);
                                    jButtonCancel.setEnabled(false);
                
                                     fillProjTable("SELECT c.customer, p.project_name FROM projects p JOIN cliente c ON c.id=p.customer_id ORDER BY c.customer ");
                            }else{
                              
                                mod.setCustomer(jTextFieldCustomer.getText());
                                mod.setProjectName(jTextFieldProjName.getText());
                                mod.setPrice(Float.parseFloat(jTextFieldPrice.getText()));
                                mod.setProjectType((String) jComboBoxProjType.getSelectedItem());
                                mod.setPaymentType((String) jComboBoxPaymentType.getSelectedItem());
                                mod.setLength(Float.parseFloat(jTextFieldLength.getText()));
                                 mod.setWidth(Float.parseFloat(jTextFieldWidth.getText()));
                                mod.setState(jTextFieldState.getText());
                                 mod.setCustomerId(Integer.parseInt(jTextFieldCustomerId.getText()));
                                mod.setNeighbour(jTextFieldNeighbour.getText());
                                mod.setDate(jFormattedTextFieldDate.getText());
                                mod.setId(projId);
               
                                   dal.save(mod);
                                   FormParcel parcel = new FormParcel(projId);
                                   parcel.setVisible(true);
                                    
                                    jButtonSave.setEnabled(false);
                                    jButtonCancel.setEnabled(false);
                
                                     fillProjTable("SELECT c.customer, p.project_name FROM projects p JOIN cliente c ON c.id=p.customer_id ORDER BY c.customer  ");
                            
                                                       
                            }
            }
            else {

                mod.setId(Integer.parseInt(jTextFieldProjId.getText()));
                mod.setCustomer(jTextFieldCustomer.getText());
                mod.setPrice(Float.parseFloat(jTextFieldPrice.getText()));
                mod.setProjectType((String) jComboBoxProjType.getSelectedItem());
                mod.setPaymentType((String) jComboBoxPaymentType.getSelectedItem());
                mod.setLength(Float.parseFloat(jTextFieldLength.getText()));
                 mod.setWidth(Float.parseFloat(jTextFieldWidth.getText()));
                mod.setState(jTextFieldState.getText());
               
                mod.setNeighbour(jTextFieldNeighbour.getText());
                mod.setDate(jFormattedTextFieldDate.getText());
               
               
               // dal.editar(mod);
                jButtonNew.setEnabled(true);
                jButtonCancel.setEnabled(false);
                jButtonSave.setEnabled(false);
                
                fillProjTable("SELECT c.customer, p.project_name FROM projects p JOIN cliente c ON c.id=p.customer_id ORDER BY c.customer  ");
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        flag=1;
    }//GEN-LAST:event_jButtonNewActionPerformed

    public void fillProjTable (String sql){
        ArrayList items = new ArrayList();
        
        String []columns = new String []{ "Cliente",  "Projecto"  };  
        connect.connection();
        
        connect.executeSql(sql);
        try {
            connect.rs.first();
            do{
                items.add( new Object[]{connect.rs.getString("c.customer"), connect.rs.getString("p.project_name")});
            }while(connect.rs.next());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não existem Projectos");
        }
        
        TableModel modelo = new TableModel(items, columns);
        
        jTableProj.setModel(modelo);
       
         jTableProj.getColumnModel().getColumn(0).setPreferredWidth(180);
        jTableProj.getColumnModel().getColumn(0).setResizable(false);
         jTableProj.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTableProj.getColumnModel().getColumn(1).setResizable(false);
        jTableProj.getTableHeader().setReorderingAllowed(false);
        jTableProj.setAutoResizeMode(jTableProj.AUTO_RESIZE_OFF);
        jTableProj.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        connect.disconnect();
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonNew;
    public static javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSearchProj;
    private javax.swing.JComboBox<String> jComboBoxPaymentType;
    private javax.swing.JComboBox<String> jComboBoxProjType;
    private javax.swing.JFormattedTextField jFormattedTextFieldDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCostumers;
    private javax.swing.JTable jTableProj;
    private javax.swing.JTextField jTextFieldCustomer;
    private javax.swing.JTextField jTextFieldCustomerId;
    private javax.swing.JTextField jTextFieldLength;
    private javax.swing.JTextField jTextFieldMuni;
    private javax.swing.JTextField jTextFieldNeighbour;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldProjId;
    private javax.swing.JTextField jTextFieldProjName;
    private javax.swing.JTextField jTextFieldSearchProj;
    private javax.swing.JTextField jTextFieldState;
    private javax.swing.JTextField jTextFieldWidth;
    // End of variables declaration//GEN-END:variables
}
