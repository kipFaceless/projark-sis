
package com.projark.connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionDB {
   public Statement stm;
   public ResultSet rs;
   private String driver=" com.mysql.jdbc.Driver";
   private String path="jdbc:mysql://localhost/projark";
   private String user="root";
    private String password=""; 
     public Connection con;
  /** private String caminho ="https://databases-auth.000webhost.com/db_structure.php?server=1&db=id1656952_projark&token=3c4442e1979b509317f391f4f01e4ca6";
   private String usuario="id1656952_root";
      private String senha="makarenko"; */
  
   
 public void connection()  {
   
       try {
             System.setProperty("jdbc.Drivers", driver);
           con = DriverManager.getConnection(path, user, password);
          //JOptionPane.showMessageDialog(null,"conexão efectuada com Sucesso");
       } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Erro ao se conectar com a Base de Dados"+ex);
          
       }
 } 
 public void executeSql (String sql){
        try {
            stm=con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs= stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ExecutaSql !"+ ex.getMessage());
        }
    }
       
 public void disconnect(){
       try {
           con.close();
          // JOptionPane.showMessageDialog(null,"desconectado com Sucesso");
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Desconectar com a Base de Dados"+ex);
       }
 } 
}
