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

// อาจจะไม่ใช้ ให้เป็นค่าเริ่มต้น
public class Alone extends ServiceDecorator {
    
    private float price;
    private String type;

    public Alone(Service service) {
        super(service);
        price = 10;
        type = "Alone";
    }
    public float getPrice() {
        return super.service.getPrice() + this.price;
    }
    
     public String getDesc() {
         return super.service.getDesc()+type;
    }
    public String getType() {
        return type;
    }

    
}