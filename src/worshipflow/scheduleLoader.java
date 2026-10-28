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
public class scheduleLoader {
       public static DefaultTableModel loadSchedule(){
           DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(new String[]{
                    "Schedule ID", 
                    "Song Leader ID", 
                    "Song Leader Name", 
                    "Schedule Date", 
                });
                
            try{
                Connection conn = DatabaseConnection.conn();

                String query = "SELECT * FROM schedule";
                PreparedStatement stmt = conn.prepareStatement(query);
                ResultSet rs = stmt.executeQuery();

                

                while(rs.next()){
                   model.addRow(new Object[]{
                       rs.getInt("id"),
                       rs.getInt("song_leader_id"),
                       rs.getString("song_leader_name"),
                       rs.getDate("schedule_date"),
                   }); 
                }

                conn.close();

            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error loading users: " + e.getMessage());
            }
            return model;
    }
}
