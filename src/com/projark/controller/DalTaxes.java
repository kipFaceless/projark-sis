
package com.projark.controller;

import com.projark.connection.ConnectionDB;
import com.projark.model.TaxModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DalTaxes {
    ConnectionDB connect = new ConnectionDB();
    TaxModel tax = new TaxModel();
    
     public void insert(TaxModel mod) {
    connect.connection();
        try {
            PreparedStatement pst= connect.con.prepareStatement("INSERT into taxes (tax,parcel_qty_id ) values(?,?)");
            pst.setFloat(1, mod.getTax());
            pst.setInt(2, mod.getPacelQtyId());
                                 
            pst.execute();
            JOptionPane.showMessageDialog(null, "Novo Juro Introduzido Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Juro!\n"+ex.getMessage());
        }
        connect.disconnect();
    }
     
     public void delete(TaxModel mod){
        
        connect.connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("DELETE FROM taxes WHERE id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Juro Excluído com Sucesso!");
                    } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Excluir Juro!\n");
        }
        connect.disconnect();
        
    }
    
}
