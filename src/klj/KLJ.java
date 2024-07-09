/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package klj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Kid Land Java
/**
 *
 * @author nicolasguerineau
 */
public class KLJ {
    //test upload
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        String username="tux";
        String password="kantor";
        String url="jdbc:mysql://localhost:8889/KLJ";
        Connection con = DriverManager.getConnection(url,username,password);
        
    }
    
}
