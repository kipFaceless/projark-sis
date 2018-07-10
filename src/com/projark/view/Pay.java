
package com.projark.view;

import com.projark.connection.ConnectionDB;
import com.projark.controller.DalParcelPayment;
import com.projark.model.ParcelPaymentModel;
import com.projark.model.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class Pay extends javax.swing.JInternalFrame {
ParcelPaymentModel mod = new ParcelPaymentModel();
    DalParcelPayment dal = new DalParcelPayment();
    ConnectionDB connect = new ConnectionDB();
    public Pay() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSearch = new javax.swing.JButton();
        jTextFieldParcelId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPayDay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldProjectId = new javax.swing.JTextField();
        jTextFieldParcelValue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePayment = new javax.swing.JTable();
        jButtonPayment = new javax.swing.JButton();

        jButtonSearch.setText("Buscar");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Código da Parcela:");

        jLabel5.setText("Proprietário:");

        jLabel3.setText("Data do Pagamento:");

        jLabel2.setText("Código do Projecto:");

        jLabel4.setText("Valor da Parcela:");

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
        jTablePayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePaymentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePayment);

        jButtonPayment.setText("Pagar");
        jButtonPayment.setEnabled(false);
        jButtonPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(548, Short.MAX_VALUE)
                .addComponent(jButtonPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldPayDay, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldParcelId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonSearch)
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel2)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldParcelValue, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldProjectId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(60, 60, 60))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jScrollPane1)))
                    .addGap(68, 68, 68)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(403, Short.MAX_VALUE)
                .addComponent(jButtonPayment)
                .addGap(22, 22, 22))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextFieldParcelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSearch)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldProjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addComponent(jLabel5)
                    .addGap(38, 38, 38)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPayDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldParcelValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(64, 64, 64)))
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
            fillTable("SELECT *FROM parcels WHERE project_id ='"+jTextFieldProjectId.getText()+"'");
        }else{
           JOptionPane.showMessageDialog(null, "Informe um número de Parcela válido!");
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaymentActionPerformed
        // TODO add your handling code here:
        String status="A Pagar";
        mod.setParcelId(Integer.parseInt(jTextFieldParcelId.getText()));
        dal.reduceParcel(mod);
        fillTable("SELECT*FROM parcels WHERE status ='"+status+"'");
    }//GEN-LAST:event_jButtonPaymentActionPerformed

    private void jTablePaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePaymentMouseClicked
        // TODO add your handling code here:
        jButtonPayment.setEnabled(true);
        try {
            String id_parcel=""+jTablePayment.getValueAt(jTablePayment.getSelectedRow(), 0);
            connect.connection();

            connect.executeSql("SELECT *FROM parcels WHERE id ='"+id_parcel+"' ");
            connect.rs.first();
            jTextFieldParcelId.setText(String.valueOf(connect.rs.getInt("id")));
            

            connect.disconnect();
            jButtonPayment.setEnabled(true);
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao seleccionar os Parcela!"+ex);
        }
    }//GEN-LAST:event_jTablePaymentMouseClicked
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
            JOptionPane.showMessageDialog(null, "Não Existem mais Parcelas a Pagar ");
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePayment;
    private javax.swing.JTextField jTextFieldParcelId;
    private javax.swing.JTextField jTextFieldParcelValue;
    private javax.swing.JTextField jTextFieldPayDay;
    private javax.swing.JTextField jTextFieldProjectId;
    // End of variables declaration//GEN-END:variables
}
