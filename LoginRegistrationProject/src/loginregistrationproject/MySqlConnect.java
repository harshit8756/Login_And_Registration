/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginregistrationproject;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author sahil
 */
// This is responsible for getting the MySql Connection
public class MySqlConnect 
{
    Connection conn;
    public Connection getCon() 
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase","root","root");
        JOptionPane.showMessageDialog(null,"Database Connection Successfull MySqlConnect getconn method");
        return conn; 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error in MySqlConnect getconn method"+e);
        }
        return conn;
        
    }
    
}
