/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginregistrationproject;

//import com.sun.jdi.connect.spi.Connection;
//import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

/**
 *
 * @author sahil
 */
// This is responsible for getting the MySql Connection
public class MySqlConnect 
{
    Connection conn;
    public Connection getConn() 
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase" , "root" , "Harshit@8756");
        JOptionPane.showMessageDialog(null,"Database Connection Successfull mysqlConnect getconn method");
        return conn; 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error in MySqlConnect getconn method" + e);
        }
        return conn;
        
    }

    
}
