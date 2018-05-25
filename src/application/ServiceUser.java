/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import model.User;

/**
 *
 * @author ronald
 */
public class ServiceUser {

    User user = new User();
    ArrayList<User> arrayListUser = new ArrayList<User>();

    public ServiceUser() {

    }

    public void ini() {
        User user = new User(1, "ronaldfox2015@gmail.com", "12345678");
        arrayListUser.add(user);

    }

    public int generateCode() {
        return arrayListUser.size() + 1;
    }
    
    public boolean isValid(String mail, String pasword) {
        boolean valid = false ;
        for (int i = 0; i < arrayListUser.size(); i++) {
            if (arrayListUser.get(i).getCorreo().equals(mail) &&
                    arrayListUser.get(i).getPasword().equals(pasword) ) {
                valid = true;
            }
        }
        return valid;
    }

}
