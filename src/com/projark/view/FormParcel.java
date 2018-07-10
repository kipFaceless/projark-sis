
package com.projark.view;

import com.projark.connection.ConnectionDB;
import com.projark.controller.DalParcels;
import com.projark.model.ParcelModel;
import com.projark.model.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;


public class FormParcel extends javax.swing.JFrame {
    ConnectionDB connect = new ConnectionDB();
    int qtyParcels, i=1;
    int cont = 1; //To Count The Number Of Parcels Created
        float percentage, price, parcelValue;
    ParcelModel mod = new ParcelModel();
    DalParcels dal = new DalParcels();
    
    public FormParcel(int id) {
        initComponents();
        connect.connection();
        
        try {
            connect.executeSql("SELECT *FROM projects WHERE id ="+id);
            connect.rs.first();
            jTextFieldProjId.setText(String.valueOf(id)); 
            jTextFieldPrice.setText(String.valueOf(connect.rs.getFloat("price")));
            jLabelDate.setText(connect.rs.getString("date"));
       
        } catch (SQLException ex) {
            Logger.getLogger(FormParcel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private FormParcel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   public void fillTable (){
        ArrayList items = new ArrayList();
        
        String []columns = new String []{"Código","Data","Parcela"  };  
        float newParcel, totalAfter=0;
       newParcel = parcelValue+(parcelValue*(percentage/100));
        String datePar = jLabelDate.getText();
        String day, month, year;
        day =""+ datePar.charAt(0)+ datePar.charAt(1)+"/";
        month =""+ datePar.charAt(3)+ datePar.charAt(4);
        year ="/"+ datePar.charAt(6)+ datePar.charAt(7)+ datePar.charAt(8)+ datePar.charAt(9);
        int intYear = Integer.parseInt(""+ datePar.charAt(6)+ datePar.charAt(7)+ datePar.charAt(8)+ datePar.charAt(9));
        int intMonth= Integer.parseInt(month);
           
            while(i<=qtyParcels){
                totalAfter = totalAfter+newParcel;
                if(intMonth<10){
                 items.add( new Object[]{i,day+"0" + intMonth + "/" + intYear,newParcel});   
                }else{
                  items.add( new Object[]{i,day + intMonth + "/" + intYear,newParcel});  
                }
                
            intMonth++;// Increment of each parcel
            if(intMonth >12){// New Year
                intYear++; //Increment of new Year
                intMonth = 1;
            }
            i++;
            cont++;
            }
         
       jTextFieldTotalAfter.setText(String.valueOf(totalAfter));// Show Total After
        
        TableModel model = new TableModel(items, columns);
        
        jTableParcels.setModel(model);
        jTableParcels.getColumnModel().getColumn(0).setPreferredWidth(23);
        jTableParcels.getColumnModel().getColumn(0).setResizable(false);
         jTableParcels.getColumnModel().getColumn(1).setPreferredWidth(180);
        jTableParcels.getColumnModel().getColumn(1).setResizable(false);
         jTableParcels.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTableParcels.getColumnModel().getColumn(2).setResizable(false);
       
        
        jTableParcels.getTableHeader().setReorderingAllowed(false);
        jTableParcels.setAutoResizeMode(jTableParcels.AUTO_RESIZE_OFF);
        jTableParcels.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        connect.disconnect();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldProjId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxQtyParcels = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableParcels = new javax.swing.JTable();
        jTextFieldTax = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTotalAfter = new javax.swing.JTextField();
        jButtonParcelar = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldOwner = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Cód Proj");

        jLabel2.setText("Preço");

        jLabelDate.setText("Data");

        jLabel4.setText("Quantidades de Parcelas:");

        jComboBoxQtyParcels.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "2", " " }));

        jLabel5.setText("Juro Por Par");

        jTableParcels.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableParcels);

        jLabel6.setText("Total");

        jButtonParcelar.setText("Gerar Parcelas");
        jButtonParcelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParcelarActionPerformed(evt);
            }
        });

        jButtonSave.setText("Salvar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jLabel7.setText("Propritário:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(522, 522, 522)
                        .addComponent(jLabelDate))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonParcelar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(jTextFieldTotalAfter)
                                .addComponent(jTextFieldProjId))
                            .addGap(45, 45, 45)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(23, 23, 23)
                                    .addComponent(jTextFieldOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(34, 34, 34)
                                    .addComponent(jComboBoxQtyParcels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProjId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxQtyParcels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldTotalAfter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButtonParcelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("GERANDO PARCELAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(735, 494));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonParcelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParcelarActionPerformed
       
        
        
        price = Float.parseFloat(jTextFieldPrice.getText());
        qtyParcels = Integer.parseInt((String) jComboBoxQtyParcels.getSelectedItem());
        percentage = Float.parseFloat(jTextFieldTax.getText());
        parcelValue = price/qtyParcels;
        fillTable();
        while(i<qtyParcels){
          
            i++;
        }
        
        
       /* if(jComboBoxQtyParcels.getSelectedItem().equals(2)){
            percentage =2/100;
        }else{
            percentage =5/100;
        }*/
    }//GEN-LAST:event_jButtonParcelarActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        int j=1;
        String payDate = jLabelDate.getText();
        String []columns = new String []{"Código","Data","Parcela"  };  
        float newParcel, totalAfter=0;
       newParcel = parcelValue+(parcelValue*(percentage/100));
        String datePar = jLabelDate.getText();
        String day, month, year;
        day =""+ datePar.charAt(0)+ datePar.charAt(1)+"/";
        month =""+ datePar.charAt(3)+ datePar.charAt(4);
        year ="/"+ datePar.charAt(6)+ datePar.charAt(7)+ datePar.charAt(8)+ datePar.charAt(9);
        int intYear = Integer.parseInt(""+ datePar.charAt(6)+ datePar.charAt(7)+ datePar.charAt(8)+ datePar.charAt(9));
        int intMonth= Integer.parseInt(month);
        
        while(j < cont){// To Control The Inserion Of Parcels In Database
            if(intMonth <10){
            mod.setProj_id(Integer.parseInt(jTextFieldProjId.getText()));
            mod.setParcelValue(parcelValue+(parcelValue*(percentage/100)));
            mod.setTotalAfter(Float.parseFloat(jTextFieldTotalAfter.getText()));
            mod.setProjectPrice(Float.parseFloat(jTextFieldPrice.getText()));
            mod.setParcelOrder(j);
            mod.setParcelQty(Integer.parseInt((String) jComboBoxQtyParcels.getSelectedItem()));
            mod.setPayDate(day+"0" + intMonth + "/" + intYear);
            dal.save(mod);  
            }
             
            else{
                
            mod.setProj_id(Integer.parseInt(jTextFieldProjId.getText()));
            mod.setParcelValue(parcelValue+(parcelValue*(percentage/100)));
            mod.setTotalAfter(Float.parseFloat(jTextFieldTotalAfter.getText()));
            mod.setProjectPrice(Float.parseFloat(jTextFieldPrice.getText()));
            mod.setParcelOrder(j);
            mod.setParcelQty(Integer.parseInt((String) jComboBoxQtyParcels.getSelectedItem()));
            mod.setPayDate(day + intMonth + "/" + intYear);
            dal.save(mod); 
                }
             intMonth++;// Increment of each parcel
            if(intMonth >12){// New Year
                intYear++; //Increment of new Year
                intMonth = 1;
            }
            j++;
            
        }
        
    }//GEN-LAST:event_jButtonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(FormParcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormParcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormParcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormParcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormParcel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonParcelar;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxQtyParcels;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableParcels;
    private javax.swing.JTextField jTextFieldOwner;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldProjId;
    private javax.swing.JTextField jTextFieldTax;
    private javax.swing.JTextField jTextFieldTotalAfter;
    // End of variables declaration//GEN-END:variables
}
