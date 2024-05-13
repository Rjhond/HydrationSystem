/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Dbconnect {
    
    public static Connection connectDbase(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");         
            String host = "jdbc:mysql://localhost:4306/hydrationsystem";
            String uname = "root"; //mysql username by default
            String pwd = ""; //mysql password by default
            return 
                    DriverManager.getConnection(host, uname, pwd);        
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }
}