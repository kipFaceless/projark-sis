
package com.projark.controller;

import com.projark.connection.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.projark.model.CustomerModel;
import com.projark.model.ParcelModel;


public class DalParcels {
    ParcelModel mod = new ParcelModel();
    ConnectionDB connect = new ConnectionDB();
    
    
     public void save(ParcelModel mod){
        connect.connection();
        try {
            PreparedStatement pst= connect.con.prepareStatement("INSERT INTO parcels (project_id, parcel_order, project_price, total_price_after, each_parcel_value, parcel_quantity, pay_date)values(?,?,?,?,?,?,?)");
            pst.setInt(1, mod.getProj_id());
            pst.setInt(2, mod.getParcelOrder());
            pst.setFloat(3, mod.getProjectPrice());
            pst.setFloat(4, mod.getTotalAfter());
             pst.setFloat(5, mod.getParcelValue());
              pst.setInt(6, mod.getParcelQty());
               pst.setString(7, mod.getPayDate());
               
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Parcelado Com Sucesso!","Salvando Parcelas",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Erro ao Salvar Parcelas "+ ex);
        }
        connect.disconnect();
    }
     
     public void editar (CustomerModel mod){
         
         connect.connection();
         
        try {
            PreparedStatement pst = connect.con.prepareStatement("UPDATE cliente set customer=?, city=?, identification_type=?  WHERE id =?");
            pst.setString(1, mod.getCustomer());
            pst.setString(2, mod.getCity());
            pst.setString(3, mod.getIdentification_type());
            pst.setInt(4,mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!","Alterando cliente", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Erro ao Editar"+ex);
        }
         
         connect.disconnect();
         
     }
      public void excluir(CustomerModel mod){
        connect.connection();
        try {
            PreparedStatement pst= connect.con.prepareStatement("DELETE FROM cliente WHERE id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente Excluído com  Sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Excluir Cliente"+ ex.getMessage());
        }
        connect.disconnect();
    }
        public CustomerModel searchCustomer (CustomerModel mod){
         try {connect.connection();
        connect.executeSql("SELECT *FROM cliente WHERE customer LIKE '%"+mod.getSearch()+"%'");
       
            connect.rs.first();
            mod.setId(connect.rs.getInt("id"));
            mod.setCustomer(connect.rs.getString("customer"));
            mod.setCity(connect.rs.getString("city"));
            mod.setIdentification_type(connect.rs.getString("identification_type"));
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Cliente não Cadastrado!");
        }
        
        connect.disconnect();
        return mod;
    }
        
          
     }