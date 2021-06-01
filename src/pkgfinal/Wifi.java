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
public class Wifi extends ServiceDecorator {
    
    private float price;
    private String type;

    public Wifi(Service service) {
        super(service);
        price = 5;
        type = "Wifi";
    }
    public float getPrice() {
        return super.service.getPrice() + this.price;
    }

    public String getType() {
        return type;
    }

         public String getDesc() {
         return super.service.getDesc()+ " "+type;
    }
}