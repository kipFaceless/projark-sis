
package com.projark.view;

import com.projark.connection.ConnectionDB;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import com.projark.model.CustomerModel;
import com.projark.model.TableModel;
import com.projark.controller.DalCostumers;

public class FrameCustomers extends javax.swing.JInternalFrame {

    ConnectionDB connect = new ConnectionDB();
    CustomerModel mod = new CustomerModel();
    DalCostumers dal = new DalCostumers();
    int flag=0;
    public FrameCustomers() {
        initComponents();
        jTextFieldId.setVisible(false);
        fillTable("SELECT *FROM cliente ORDER BY customer ");
        connect.connection();
               
        /*connect.executeSql("SELECT *FROM cities ORDER BY name");
        jComboBoxCidade.removeAllItems();
        try {
            connect.rs.first();
            do{
                jComboBoxCidade.addItem(connect.rs.getString("city"));
            }while(connect.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(FormCustomers.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelCustomer = new javax.swing.JPanel();
        jPanelButtons = new javax.swing.JPanel();
        jButtonDelete = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelIdentification = new javax.swing.JLabel();
        jLabelNumber = new javax.swing.JLabel();
        jTextFieldIdentNumber = new javax.swing.JTextField();
        jComboBoxIdentType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxCustomerType = new javax.swing.JComboBox<>();
        jPanelAddress = new javax.swing.JPanel();
        jComboBoxCity = new javax.swing.JComboBox<>();
        jButtonAddCity = new javax.swing.JButton();
        jLabelCity = new javax.swing.JLabel();
        jLabelNeighbour = new javax.swing.JLabel();
        jTextFieldNeighbour = new javax.swing.JTextField();
        jPanelContacts = new javax.swing.JPanel();
        jLabelTel = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jFormattedTextFieldTel = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsers = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanelMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanelCustomer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanelCustomer.setName(""); // NOI18N

        jPanelButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonDelete.setToolTipText("Clique aqui para apagar cliente");
        jButtonDelete.setEnabled(false);
        jButtonDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDelete.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonSave.setToolTipText("");
        jButtonSave.setEnabled(false);
        jButtonSave.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonEdit.setEnabled(false);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("Novo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Salvar");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("Editar");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 204));
        jLabel12.setText("Excluir");

        jButtonCancel.setText("Cancelar");
        jButtonCancel.setEnabled(false);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificação"));

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelName.setText("Nome:");

        jTextFieldName.setEnabled(false);
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jLabelIdentification.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelIdentification.setText("Identificação:");

        jLabelNumber.setText("Número:");

        jTextFieldIdentNumber.setEnabled(false);
        jTextFieldIdentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentNumberActionPerformed(evt);
            }
        });

        jComboBoxIdentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bilhete", "Cédula", "Passaporte", "Outro", " " }));
        jComboBoxIdentType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIdentTypeActionPerformed(evt);
            }
        });

        jLabel1.setText("Pessoa:");

        jComboBoxCustomerType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física ", "Pessoa Jurídica", " " }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldName))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxIdentType, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNumber)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldIdentNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 280, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentification)
                    .addComponent(jLabelNumber)
                    .addComponent(jTextFieldIdentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxIdentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jComboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luanda", "Benguela", "Huambo", "Uíge", "Huíla" }));
        jComboBoxCity.setEnabled(false);

        jButtonAddCity.setText("+");

        jLabelCity.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCity.setText("Cidade:");

        jLabelNeighbour.setText("Bairro:");

        javax.swing.GroupLayout jPanelAddressLayout = new javax.swing.GroupLayout(jPanelAddress);
        jPanelAddress.setLayout(jPanelAddressLayout);
        jPanelAddressLayout.setHorizontalGroup(
            jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNeighbour))
                .addGap(18, 18, 18)
                .addGroup(jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAddressLayout.createSequentialGroup()
                        .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAddCity))
                    .addComponent(jTextFieldNeighbour))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelAddressLayout.setVerticalGroup(
            jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddressLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNeighbour)
                    .addComponent(jTextFieldNeighbour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelContacts.setBorder(javax.swing.BorderFactory.createTitledBorder("Contactos"));

        jLabelTel.setText("Tel:");

        jLabelEmail.setText("E-mail:");

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jFormattedTextFieldTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContactsLayout = new javax.swing.GroupLayout(jPanelContacts);
        jPanelContacts.setLayout(jPanelContactsLayout);
        jPanelContactsLayout.setHorizontalGroup(
            jPanelContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContactsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContactsLayout.createSequentialGroup()
                        .addComponent(jLabelTel)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addGroup(jPanelContactsLayout.createSequentialGroup()
                        .addComponent(jLabelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail)))
                .addContainerGap())
        );
        jPanelContactsLayout.setVerticalGroup(
            jPanelContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContactsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTel)
                    .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCustomerLayout = new javax.swing.GroupLayout(jPanelCustomer);
        jPanelCustomer.setLayout(jPanelCustomerLayout);
        jPanelCustomerLayout.setHorizontalGroup(
            jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCustomerLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCustomerLayout.createSequentialGroup()
                        .addContainerGap(180, Short.MAX_VALUE)
                        .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                                .addComponent(jPanelContacts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelCustomerLayout.setVerticalGroup(
            jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCustomerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelContacts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCustomerLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11)
                        .addGap(100, 100, 100)))
                .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jTableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsers);

        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTextFieldId.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Pesquisar");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel5.setText("CADASTRO DE CLIENTES");

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 936, Short.MAX_VALUE)
            .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelMainLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMainLayout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelMainLayout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelMainLayout.createSequentialGroup()
                            .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
            .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelMainLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMainLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jPanelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fillTable (String sql){
        ArrayList items = new ArrayList();
        
        String []columns = new String []{"Código", "Nome", "Cidade", "Identificação"  };  
        connect.connection();
        
        connect.executeSql(sql);
        try {
            connect.rs.first();
            do{
                items.add( new Object[]{connect.rs.getInt("id"), connect.rs.getString("customer"), connect.rs.getString("city"), connect.rs.getString("identification_number")});
            }while(connect.rs.next());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Busque Por Outro Cliente");
        }
        
        TableModel model = new TableModel(items, columns);
        
        jTableUsers.setModel(model);
        jTableUsers.getColumnModel().getColumn(0).setPreferredWidth(23);
        jTableUsers.getColumnModel().getColumn(0).setResizable(false);
         jTableUsers.getColumnModel().getColumn(1).setPreferredWidth(180);
        jTableUsers.getColumnModel().getColumn(1).setResizable(false);
         jTableUsers.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTableUsers.getColumnModel().getColumn(2).setResizable(false);
         jTableUsers.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableUsers.getColumnModel().getColumn(3).setResizable(false);
        
        jTableUsers.getTableHeader().setReorderingAllowed(false);
        jTableUsers.setAutoResizeMode(jTableUsers.AUTO_RESIZE_OFF);
        jTableUsers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        connect.disconnect();
       
    }
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int resposta=0;
        resposta=JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Excluir Este Cliente?","Excluindo Cliente", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resposta==JOptionPane.YES_OPTION) {
            mod.setId(Integer.parseInt(jTextFieldId.getText()));
            dal.excluir(mod);
            fillTable("SELECT *FROM cliente ORDER BY customer ");
    }//GEN-LAST:event_jButtonDeleteActionPerformed
    }
    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        flag=1;
        jTextFieldId.setText("");
        jTextFieldName.requestFocus();
        jTextFieldName.setText("");
        jTextFieldIdentNumber.setText("");
        jTextFieldName.setEnabled(true);
        jTextFieldIdentNumber.setEnabled(true);
        jComboBoxCity.setEnabled(true);
        jButtonSave.setEnabled(true);
        jButtonCancel.setEnabled(true);
        jButtonEdit.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jButtonSearch.setEnabled(false);
        jButtonNew.setEnabled(false);
        jTextFieldSearch.setEnabled(false);

    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if (jTextFieldName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o nome Para continuar!","Cadastrando Cliente",JOptionPane.OK_OPTION);
            jTextFieldName.requestFocus();
        }else{
            if(flag==1) {

                mod.setCustomer(jTextFieldName.getText());
                mod.setCity((String) jComboBoxCity.getSelectedItem());
                mod.setIdentification_type((String) jComboBoxIdentType.getSelectedItem());
                mod.setIdentification_number(jTextFieldIdentNumber.getText());
                mod.setEmail(jTextFieldEmail.getText());
                mod.setNeighborhood(jTextFieldNeighbour.getText());
                mod.setTel(jFormattedTextFieldTel.getText());
                dal.save(mod);
                jButtonSave.setEnabled(false);
                jButtonCancel.setEnabled(false);
                jComboBoxCity.setEnabled(false);
                jTextFieldName.setEnabled(false);
                jTextFieldIdentNumber.setEnabled(false);
                jTextFieldId.setText("");
                jTextFieldName.setText("");
                jTextFieldIdentNumber.setText("");
                fillTable("SELECT *FROM cliente ORDER BY customer ");
                jButtonNew.setEnabled(true);
            }
            else {

                mod.setId(Integer.parseInt(jTextFieldId.getText()));
                mod.setCustomer(jTextFieldName.getText());
                mod.setCity((String) jComboBoxCity.getSelectedItem());
                mod.setIdentification_type(jTextFieldIdentNumber.getText());
                dal.editar(mod);
                jButtonNew.setEnabled(true);
                jButtonCancel.setEnabled(false);
                jButtonSave.setEnabled(false);
                jTextFieldName.setEnabled(false);
                jTextFieldIdentNumber.setEnabled(false);
                jComboBoxCity.setEnabled(false);
                jTextFieldId.setText("");
                jTextFieldName.setText("");
                jTextFieldIdentNumber.setText("");
                fillTable("SELECT *FROM cliente ORDER BY customer ");
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        flag=2;
        jButtonSave.setEnabled(true);
        jTextFieldName.setEnabled(true);
        jTextFieldIdentNumber.setEnabled(true);
        jComboBoxCity.setEnabled(true);
        jButtonEdit.setEnabled(false);
        jButtonCancel.setEnabled(true);
        jButtonNew.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jButtonSearch.setEnabled(false);
        jTextFieldSearch.setEnabled(false);

    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        jButtonCancel.setEnabled(false);
        jButtonSave.setEnabled(false);
        jTextFieldId.setText("");
        jTextFieldName.setText("");
        jTextFieldIdentNumber.setText("");
        jTextFieldName.setEnabled(false);
        jTextFieldIdentNumber.setEnabled(false);
        jComboBoxCity.setEnabled(false);
        jButtonNew.setEnabled(true);
        jButtonSearch.setEnabled(true);
        jTextFieldSearch.setEnabled(true);
        jButtonEdit.setEnabled(false);
        jButtonDelete.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        //jTextFieldNome.transferFocus();
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
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldIdentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentNumberActionPerformed
        jTextFieldIdentNumber.transferFocus();
    }//GEN-LAST:event_jTextFieldIdentNumberActionPerformed

    private void jComboBoxIdentTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIdentTypeActionPerformed
        jComboBoxIdentType.transferFocus();
    }//GEN-LAST:event_jComboBoxIdentTypeActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        //jTextFieldEmail.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jFormattedTextFieldTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelActionPerformed
        jFormattedTextFieldTel.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelActionPerformed

    private void jTableUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsersMouseClicked
        String customer_name ="" +jTableUsers.getValueAt(jTableUsers.getSelectedRow(), 1);
        connect.connection();
        connect.executeSql("SELECT *FROM cliente WHERE customer ='"+customer_name+"'");
        try {
            connect.rs.first();
            jTextFieldId.setText(String.valueOf(connect.rs.getInt("id")));
            jTextFieldName.setText(connect.rs.getString("customer"));
            jComboBoxCity.setSelectedItem(connect.rs.getString("city"));
            jTextFieldIdentNumber.setText(connect.rs.getString("identification_type"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao seleccionar os dados!" +ex);

        }
        connect.disconnect();
        jButtonEdit.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonSave.setEnabled(false);
        jButtonCancel.setEnabled(true);
    }//GEN-LAST:event_jTableUsersMouseClicked

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        mod.setSearch(jTextFieldSearch.getText());
        CustomerModel model= dal.searchCustomer(mod);
        jTextFieldId.setText(String.valueOf(model.getId()));
        jTextFieldName.setText(model.getCustomer());
        jComboBoxCity.setSelectedItem(model.getCity());
        jTextFieldIdentNumber.setText(model.getIdentification_type());
        jButtonEdit.setEnabled(false);
        jButtonDelete.setEnabled(false);
        fillTable("SELECT *FROM cliente WHERE customer LIKE '%"+mod.getSearch()+"%'");
    }//GEN-LAST:event_jButtonSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCity;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JComboBox<String> jComboBoxCustomerType;
    private javax.swing.JComboBox<String> jComboBoxIdentType;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelIdentification;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNeighbour;
    private javax.swing.JLabel jLabelNumber;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelAddress;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelContacts;
    private javax.swing.JPanel jPanelCustomer;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsers;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIdentNumber;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNeighbour;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
