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
public class Low implements Service {
    
    private float price;
    private String type;
    private LocalDateTime dateIn;

    
    public Low() {
        price = 10;
        type = "Low";
        dateIn = LocalDateTime.now();
    }

    public float getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    
    public String getDesc(){
        return "Room : Low";
    }

    
}
