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
public class Expend {
    
    private boolean cExpend = false;
     private static Expend instance;
    
    public Expend(){}
//     
//    public static Expend getLogin(){
//        if (instance == null){
//            instance = new Expend();
//        }
//        return instance;
//    }
    
    public void ExpendService(IPayment payment,float amount) {
        
        payment.Payment(amount);
    }
}
