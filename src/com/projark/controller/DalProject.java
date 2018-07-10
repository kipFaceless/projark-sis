
package com.projark.controller;

import com.projark.connection.ConnectionDB;
import com.projark.model.CustomerModel;
import com.projark.model.ProjectModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DalProject {
DalCostumers proj = new DalCostumers();
    ConnectionDB connect = new ConnectionDB();
    ConnectionDB connectCustomer = new ConnectionDB();
    ProjectModel mod = new ProjectModel();
    
    int customerId;
    
    public void save(ProjectModel mod){
        connect.connection();
        try {
            PreparedStatement pst= connect.con.prepareStatement("UPDATE  projects SET customer_id=?, project_name=?, price=?, project_type=?, payment_type=?, length=?, width=?, state=?, project_status=?, neighbour=?, date=? WHERE id=?");
            pst.setInt(1,mod.getCustomerId() );
            pst.setString(2, mod.getProjectName());
            pst.setFloat(3, mod.getPrice());
            pst.setString(4, mod.getProjectType());
            pst.setString(5, mod.getPaymentType());
             pst.setFloat(6, mod.getLength());
              pst.setFloat(7, mod.getWidth());
               pst.setString(8, mod.getState());
                pst.setString(9, mod.getProjectStatus());
                pst.setString(10, mod.getNeighbour());
                pst.setString(11, mod.getDate());
                pst.setInt(12, mod.getId());
                
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Novo Projecto Inserido Com Sucesso!","Sucesso!",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Erro ao Inserir Novo Projecto "+ ex);
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
    
    public void getCustomerId(String name ){
        connectCustomer.connection();
        
        try {connectCustomer.executeSql("SELECT *FROM customers WHERE nome='"+name+"'");
            connectCustomer.rs.first();
            customerId = connectCustomer.rs.getInt("id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Paciente não Encontrado!"+ex);
        }
        connectCustomer.disconnect();
    }
    
}
