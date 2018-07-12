
package com.projark.controller;


import com.projark.connection.ConnectionDB;
import com.projark.model.ParcelQtyModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DalParcelQties {
     ConnectionDB connect = new ConnectionDB();
     ParcelQtyModel qty = new ParcelQtyModel();
    
    
     public void insert(ParcelQtyModel mod) {
    connect.connection();
        try {
            PreparedStatement pst= connect.con.prepareStatement("INSERT into parcelqties (parcel_qties ) values(?)");
             pst.setInt(1, mod.getParcel_qty());
                                 
            pst.execute();
            JOptionPane.showMessageDialog(null, "Introduzido Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!\n"+ex.getMessage());
        }
        connect.disconnect();
    }
     
     public void delete(ParcelQtyModel mod){
        
        connect.connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("DELETE FROM parcelqties WHERE id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Excluído com Sucesso!");
                    } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Excluir!\n");
        }
        connect.disconnect();
        }
}
