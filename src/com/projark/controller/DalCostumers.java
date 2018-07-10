
package com.projark.controller;

import com.projark.connection.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.projark.model.CustomerModel;


public class DalCostumers {
    CustomerModel mod = new CustomerModel();
    ConnectionDB connect = new ConnectionDB();
    
    
     public void save(CustomerModel mod){
        connect.connection();
        try {
            PreparedStatement pst= connect.con.prepareStatement("INSERT INTO cliente (customer, customer_type, city, identification_type, identification_number, tel, email, neighborhood)values(?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getCustomer());
            pst.setString(2, mod.getCustomer_type());
            pst.setString(3, mod.getCity());
            pst.setString(4, mod.getIdentification_type());
             pst.setString(5, mod.getIdentification_number());
              pst.setString(6, mod.getTel());
               pst.setString(7, mod.getEmail());
                pst.setString(8, mod.getNeighborhood());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Cliente Inserido Com Sucesso!","Cadastro Completo!",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Erro ao Inserir Novo Cliente "+ ex);
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

