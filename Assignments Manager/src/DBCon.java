
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vt
 */
public class DBCon {
    public static Connection con(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manager","root","");
              return con;
        } catch (ClassNotFoundException | SQLException ex) {
            //Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
         
            JOptionPane.showMessageDialog(null,ex);
              return null;
        }
       
    }
}
