package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

 public class DBConnection 
 {
    private String URL="jdbc:mysql://localhost:3306/DoAn1";
    private String User="root";
    private String Pass="19091998";
    public DBConnection(){
        
    }
     public   Connection getConection(){
        Connection con= null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, User, Pass);
            System.out.println("Connect Sucess");
            
        } catch (SQLException ex) {
           
             System.out.println("Connect Failed");
        } catch (ClassNotFoundException ex) {
            
        }
        return con;
    }
 
 public ResultSet GetData(String query)
 {
     Connection conn = getConection();
     if(conn==null) //nếu không thể mở kết nối
     {
         CloseConnection(conn); //Đóng kết nối
         return null;
     }
     Statement stm;
     try
     {
         stm = conn.createStatement();
         ResultSet rs = stm.executeQuery(query);
         return rs;
     }
     catch (SQLException ex)
     {
         Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE,null,ex);
         CloseConnection(conn); //đóng kết nối
         return null;
     }
 }
 public boolean UpdateData(String query)
 {
     Connection conn = GetConnection();
     if(conn==null)
     return false;
     Statement stm;
     try
     {
         stm = conn.createStatement();
         stm.executeUpdate(query);
         return true;
     } 
     catch (SQLException ex) 
     {
         Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE,null,ex);
         return false;
     }
 }
 public void CloseConnection(Connection conn)
 {
     try
     {
         conn.close();
     } 
     catch (SQLException ex) 
     {
         Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE,null,ex);
     }
 }
    private Connection GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }
