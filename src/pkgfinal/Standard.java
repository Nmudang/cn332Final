/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class Standard implements Service {
    
    private float price;
    private String type;
    private LocalDateTime dateIn;

    public Standard() {
        System.out.println("Standard price 25");
        price = 25;
        type = "Standard";
        dateIn = LocalDateTime.now();
    }

    public float getPrice() {
        return price;
    }

    public String getType(){
        return "Standard";
    }

    public String getDesc() {
         return "Room :Standard";
    }


    
}
