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
public class Promotion {

    private float price;

    public float promotion1() {
        // vip + couple bed + wifi
        Service vip = new VIP();
        Service couple = new Couple(vip);
        Service wifi = new Wifi(couple);
        System.out.println( wifi.getDesc());
        price = (float) (wifi.getPrice() * 0.90);
        return price;
    }

    public float promotion2() {
        // Low + wifi
        Service low = new Low();
        Service wifi = new Wifi(low);
        System.out.println(wifi.getDesc());
        price = (float) (wifi.getPrice() * 0.9);
        return price;

    }
    
}
