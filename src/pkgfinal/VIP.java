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
public class VIP implements Service {
    
    private float price;
    private String type;
    private LocalDateTime dateIn;
    private LocalDateTime dateOut;
    
    public VIP() {
        price = 50;
        type = "VIP";
        dateIn = LocalDateTime.now();
    }
    
    public VIP(LocalDateTime dateOut) {
        price = 50;
        type = "VIP";
        dateIn = LocalDateTime.now();
        dateOut = dateOut;
    }

    public float getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    public String getDesc(){
        return "Room : VIP";
    }

    
}
