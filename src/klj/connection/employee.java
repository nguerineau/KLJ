/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klj.connection;

/**
 *
 * @author nicolasguerineau
 */
public final class employee extends connection {
    String usr;
    public employee(String username){
    
        accestype=1;
    // image de profil
    String usr = username;
    password = "employee";
    
    }
    
    public String changePassword(){
        String newPassword = "";//inserée le code de reseption de mot de passe
        
        return newPassword;
    }
    
}
