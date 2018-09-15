/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirlineSM.com;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Syed Faraz
 */ 
public class loginClass {
    
    String username;
    String password;
     
    
    public loginClass(String user,String pass) {
        
        username = user;
        password = pass;
        
    }
    
    public Boolean checkCredentials(String username,String password) {
        if(username.equalsIgnoreCase("admin") && password.equals("123456")) {
            return true;
        } else {
            return false;
        }
    }

    
    
}
