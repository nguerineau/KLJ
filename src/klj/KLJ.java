/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package klj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.*;

//Kid Land Java
/**
 * @author nicolasguerineau
 **/
public class KLJ {
    //test upload
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        String sql="SELECT * FROM account WHERE type=2";
        String username ="root";
        String password ="root";
        String url="jdbc:mysql://localhost:8889/KLJ?zeroDateTimeBehavior=CONVERT_TO_NULL";
        Connection con = DriverManager.getConnection(url,username,password);
        Statement stmt=con.createStatement(); 
        ResultSet rs=stmt.executeQuery(sql); 
        
        while(rs.next()){ 
        System.out.println(rs.getString(1)+"  "+rs.getInt(2)); 
        String test1 = rs.getString(1);
        System.out.println(test1);
        
        }
        
        PreparedStatement stmt2 = con.prepareStatement("INSERT INTO account(username, type) VALUES (?, ?)");
        stmt2.setString(1,"test5");
        stmt2.setInt(2, 0);
        stmt2.executeUpdate();
        
        //String rud="insert into account (username,type,password,email,date,country) \n" +"values \n" +"('test3',0,null,null,null,null);";
        //stmt.executeQuery(rud); 
        
        
        
    }
    
}
