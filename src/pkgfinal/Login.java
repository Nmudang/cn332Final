/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author User
 */
public class Login {
    
    private boolean clogin = false;
     private static Login instance;
     
    private Login(){}
     
    public static Login getLogin(){
        if (instance == null){
            instance = new Login();
        }
        return instance;
    }
    
    public void Login(ILogin login,String user,String password){
        if (!clogin) {
        login.login(user,password);
        clogin = true;
        }
    }
    public void logout(){
        System.out.println("U logout");
        clogin = false;
    }
    public boolean getClogin(){
        return clogin;
    }
}
