/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package worshipflow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhon Zechariah
 */
public class DatabaseConnection {
    public static Connection conn()throws SQLException, ClassNotFoundException{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/worshipflow";
            String username = "admin";
            String password = "042505";
            Connection conn = DriverManager.getConnection(url, username, password);
       
        
        return conn;
        
    };
}
