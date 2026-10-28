/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package worshipflow;

/**
 *
 * @author Jhon Zechariah
 */
public class TableUser {
    private int id;
    private String username, email, role, password;
    
    TableUser(int id, String username, String email, String role, String password){
        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
        this.password = password;
    }
    
    public int getID(){return id;}
    public String getUsername(){return username;}
    public String getEmail(){return email;}
    public String getRole(){return role;}
    public String getPassword(){return password;}
}
