/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package worshipflow;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhon Zechariah
 */
public class songLoader {
       public static DefaultTableModel loadSong(){
           DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(new String[]{ 
                    "Song Title", 
                    "Song Artist", 
                    "Song Key", 
                    "Song ID"
                });
                
            try{
                Connection conn = DatabaseConnection.conn();

                String query = "SELECT * FROM song";
                PreparedStatement stmt = conn.prepareStatement(query);
                ResultSet rs = stmt.executeQuery();

                

                while(rs.next()){
                   model.addRow(new Object[]{
                       rs.getString("title"),
                       rs.getString("artist"),
                       rs.getString("song_key"),
                        rs.getInt("id"),
                   }); 
                }

                conn.close();

            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error loading songs: " + e.getMessage());
            }
            return model;
    }
}
