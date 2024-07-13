/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klj.ride;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import klj.display.register;

/**
 *
 * @author nicolasguerineau
 */
public class amusement_ride {
    // ticket adn ticket type
    
    
    public amusement_ride(String ride_name){
        int places=50;
        String url="jdbc:mysql://localhost:8889/KLJ?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        Connection con;
        try {
            con = DriverManager.getConnection(url,"root","root");
            String sql="SELECT password FROM account WHERE username="+"'"+"'";
            
            
            Statement stmt=con.createStatement(); 
            ResultSet rs=stmt.executeQuery(sql); 
        
            
        }
        catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    
    
}
