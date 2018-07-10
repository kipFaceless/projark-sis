
package com.projark.view;

import com.projark.connection.ConnectionDB;
import com.projark.controller.DalParcelPayment;
import com.projark.model.ParcelPaymentModel;
import com.projark.model.TableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class FrameParcelPayment extends javax.swing.JInternalFrame {
    ParcelPaymentModel mod = new ParcelPaymentModel();
    DalParcelPayment dal = new DalParcelPayment();
    ConnectionDB connect = new ConnectionDB();
   
    public FrameParcelPayment() {
      initComponents();
      connect.connection();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldParcelId = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePayment = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldProjectId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPayDay = new javax.swing.JTextField();
        jTextFieldParcelValue = new javax.swing.JTextField();
        jButtonPayment = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitle.setText("PAGAMENTO DE PARCELAS");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código da Parcela:");

        jButtonSearch.setText("Buscar");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTablePayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTablePayment);

        jLabel2.setText("Código do Projecto:");

        jLabel3.setText("Data do Pagamento:");

        jLabel4.setText("Valor da Parcela:");

        jButtonPayment.setText("Pagar");
        jButtonPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaymentActionPerformed(evt);
            }
        });

        jLabel5.setText("Proprietário:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldPayDay, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addGap(javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldParcelId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSearch)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldParcelValue, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldProjectId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldParcelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldProjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPayDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldParcelValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPayment)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
       if(!jTextFieldParcelId.getText().equals("")){
        int cod;
        cod = Integer.parseInt(jTextFieldParcelId.getText());
        mod.setParcelId(cod);
        mod = dal.getParcel(mod);
        jTextFieldParcelId.setText(String.valueOf(mod.getParcelId()));
        jTextFieldProjectId.setText(String.valueOf(mod.getProjId()));
        jTextFieldParcelValue.setText(String.valueOf(mod.getParcelValue()));
        jTextFieldPayDay.setText(mod.getPayDate());
           fillTable("SELECT *FROM parcels ");
       }else{
            JOptionPane.showMessageDialog(null, "Preencha o Código para Continuar...");
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaymentActionPerformed
        // TODO add your handling code here:
        mod.setParcelId(Integer.parseInt(jTextFieldParcelId.getText()));
        dal.reduceParcel(mod);
    }//GEN-LAST:event_jButtonPaymentActionPerformed
 public void fillTable (String sql){
        ArrayList items = new ArrayList();
        
        String []columns = new String []{"Cód.Parcela", "Cód do Projecto", "Valor", "Estado"  };  
        connect.connection();
        
        connect.executeSql(sql);
        try {
            connect.rs.first();
            do{
                items.add( new Object[]{connect.rs.getInt("id"), connect.rs.getInt("project_id"), connect.rs.getFloat("each_parcel_value"), connect.rs.getString("status")});
            }while(connect.rs.next());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Busque Por Outro Cliente");
        }
        
        TableModel model = new TableModel(items, columns);
        
        jTablePayment.setModel(model);
        jTablePayment.getColumnModel().getColumn(0).setPreferredWidth(23);
        jTablePayment.getColumnModel().getColumn(0).setResizable(false);
         jTablePayment.getColumnModel().getColumn(1).setPreferredWidth(180);
        jTablePayment.getColumnModel().getColumn(1).setResizable(false);
         jTablePayment.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTablePayment.getColumnModel().getColumn(2).setResizable(false);
         jTablePayment.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTablePayment.getColumnModel().getColumn(3).setResizable(false);
        
        jTablePayment.getTableHeader().setReorderingAllowed(false);
        jTablePayment.setAutoResizeMode(jTablePayment.AUTO_RESIZE_OFF);
        jTablePayment.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        connect.disconnect();
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPayment;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePayment;
    private javax.swing.JTextField jTextFieldParcelId;
    private javax.swing.JTextField jTextFieldParcelValue;
    private javax.swing.JTextField jTextFieldPayDay;
    private javax.swing.JTextField jTextFieldProjectId;
    // End of variables declaration//GEN-END:variables
}
