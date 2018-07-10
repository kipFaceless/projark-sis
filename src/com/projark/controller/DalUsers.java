
package com.projark.controller;

import com.projark.connection.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.projark.model.UserModel;


public class DalUsers {
    
    ConnectionDB connect = new ConnectionDB();
    UserModel mod = new UserModel();
    
    public void salvar(UserModel mod){
        connect.connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("INSERT INTO users (full_name,  user_name, password, profile, email) VALUES (?,?,?, ?, ?)");
          
            pst.setString(1, mod.getFullname());
            pst.setString(2, mod.getUsername());
            pst.setString(3, mod.getPassword());
            pst.setString(4, mod.getProfile());
            pst.setString(5, mod.getEmail());
            
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário Inserido Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir novo Usuário!\n"+ex.getMessage());
        }
        connect.disconnect();
    }
    
    public void editar (UserModel mod){
        connect.connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("UPDATE users SET full_name=?, user_name=?, password=?, profile=?, email=?  WHERE id=? ");
            pst.setString(1, mod.getFullname());
            pst.setString(2, mod.getUsername());
            pst.setString(3, mod.getPassword());
            pst.setString(4, mod.getProfile());
            pst.setString(5, mod.getEmail());
            pst.setInt(6, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário Alterado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar Usuário");
        }
        
        connect.disconnect();
        
    }
    
    public void excluir(UserModel mod){
        
        connect.connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("DELETE FROM users WHERE id=?");
            
            pst.setInt(1, mod.getId());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Usuário Excluído com Sucesso!");
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Erro ao Excluir Usuário!");
        }
        
        connect.disconnect();
    }
    
    public UserModel getUser(UserModel mod) {
        
        connect.connection();
        connect.executeSql("SELECT *FROM users WHERE user_name LIKE '%"+mod.getSearch()+"%'");
        try {
            connect.rs.first();
            mod.setId(connect.rs.getInt("id"));
            mod.setUsername(connect.rs.getString("user_name"));
            mod.setPassword(connect.rs.getString("password"));
            mod.setProfile(connect.rs.getString("profile"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não Cadastarado!");
        }
        connect.disconnect();
        return mod;
    }
    
}
