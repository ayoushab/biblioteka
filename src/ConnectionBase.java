
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zen Pro
 */
public class ConnectionBase {
    
    ResultSet rs = null;
    PreparedStatement pst = null;
 
    
    public static Connection ConnectBase(){      
        
            
    try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/biblioteka","root","");
         
       // JOptionPane.showMessageDialog(null, "Konekcija uspostavljena");
       return con;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
          return null;
    }
   
     
    }
}    
    
//    public boolean userExists(String u, String p)
//    {
//        boolean userExists = false; 
//        con = ConnectBase();
//        try
//        {
//            String SQL = "SELECT * FROM login WHERE username = ? AND password = ?";
//            pst = con.prepareStatement(SQL);
//            pst.setString(1, u);
//            pst.setString(2, p);
//            
//            rs = pst.executeQuery();
//            if(rs.next())
//            {
//                userExists = true;
//                
//            }
//            return userExists;
//        }
//        catch(SQLException e)
//        {
//            JOptionPane.showMessageDialog(null,"SQL Error\n"+e, "SQL ERROR", JOptionPane.ERROR_MESSAGE);
//        }
//        return false;
//    }
//    
//    
//}
