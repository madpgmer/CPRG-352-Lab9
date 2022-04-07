package services;

import dataaccess.UserDB;
import java.util.HashMap;
import models.User;

public class AccountService {
    
    public User login(String email, String password) {
        UserDB userDB = new UserDB();
        
        try {
            User user = userDB.get(email);
            if (password.equals(user.getPassword())) {
                return user;
            }
        } catch (Exception e) {
            
        }        
        return null;
    }
    
    public static boolean forgotPassword(String email, String path){
        UserDB userDB = new UserDB();
        try {
                User user = userDB.get(email);        
                //following code imported from Project JavaMailDemo/src/java/services/AccountService
                String to = user.getEmail();
                String subject = "Notes App Login";
                String template = path + "/emailtemplates/login.html";
                
                HashMap<String, String> tags = new HashMap<>();
                tags.put("firstname", user.getFirstName());
                tags.put("lastname", user.getLastName());
                tags.put("password", user.getPassword());
                //tags.put("date", (new java.util.Date()).toString());
                
                GmailService.sendMail(to, subject, template, tags);
                
        } catch (Exception e) {
                return false;
        }   
                return true;
    }
}
