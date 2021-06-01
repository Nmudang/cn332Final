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
public class Cash implements IPayment {

    public void Payment(float amount) {
        System.out.println("Pay by Cash " + amount);
    }
    
}
