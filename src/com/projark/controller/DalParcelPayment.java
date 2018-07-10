
package com.projark.controller;

import com.projark.connection.ConnectionDB;
import com.projark.model.ParcelPaymentModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DalParcelPayment {
    
    ConnectionDB connect = new ConnectionDB();
    public ParcelPaymentModel getParcel(ParcelPaymentModel mod){
        connect.connection();
        
        try {
            connect.executeSql("SELECT *FROM parcels WHERE id="+mod.getParcelId());
            connect.rs.first();
            mod.setParcelId(connect.rs.getInt("id"));
            mod.setProjId(connect.rs.getInt("project_id"));
            mod.setPayDate(connect.rs.getString("pay_date"));
            mod.setParcelValue(connect.rs.getFloat("each_parcel_value"));
            return mod;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Parcela!");
        }
        
        connect.disconnect();
        return mod;
        
    }
     public  void reduceParcel(ParcelPaymentModel mod){
         connect.connection();
         connect.executeSql("SELECT *FROM parcels WHERE id ="+mod.getParcelId()+" AND status ='Pago'");
        try {
           if(connect.rs.first()){
               JOptionPane.showMessageDialog(null, "Esta Parcela já foi Paga!");
               
           } else{
                          
        try {
            PreparedStatement pst = connect.con.prepareStatement("UPDATE parcels SET status=? WHERE id=?");
            pst.setString(1, "Pago");
            pst.setInt(2, mod.getParcelId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Pagamento efectuado com Sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, " Erro ao efectuar o Pagamento!");
        }
         connect.disconnect();
          }
     }
         catch (SQLException ex) {
            Logger.getLogger(DalParcelPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
       } 
}
