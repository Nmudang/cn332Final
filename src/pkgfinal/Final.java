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
import java.util.Scanner;

public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // login
        ILogin thirdParty = new ThirdParty();
        ILogin detecFace = new DetecFace();
        ILogin Normal = new Normal();
        Login login = Login.getLogin();
        Expend pay = new Expend();
        String typeLogin = "0";

        Scanner input = new Scanner(System.in);
        while (!typeLogin.equalsIgnoreCase("1") & !typeLogin.equalsIgnoreCase("2") & !typeLogin.equalsIgnoreCase("3")) {
            System.out.print("Lonin type 1 thirdParty, 2 detecFace, 3 Normal : ");
            typeLogin = input.next();
        }
        if (typeLogin.equalsIgnoreCase("1")) {
            login.Login(thirdParty, "Mingyu", "Kim");
        } else if (typeLogin.equalsIgnoreCase("2")) {
            login.Login(detecFace, "Mingyu", "Kim");
        } else if (typeLogin.equalsIgnoreCase("3")) {
            login.Login(Normal, "Mingyu", "Kim");
        }

        if (login.getClogin()) {
            typeLogin = "0";
            // เลือกpromotion
            System.out.println("My promotion");
            Promotion promotion = new Promotion();
            System.out.println("1 : " + promotion.promotion1());
            System.out.println("2 : " + promotion.promotion2());

            while (!typeLogin.equalsIgnoreCase("1") & !typeLogin.equalsIgnoreCase("2") & !typeLogin.equalsIgnoreCase("3")) {
                System.out.print("Select Promotion(1) or Not(2) :");
                typeLogin = input.next();
            }
            if (typeLogin.equalsIgnoreCase("1")) {
                typeLogin = "0";
                while (!typeLogin.equalsIgnoreCase("1") & !typeLogin.equalsIgnoreCase("2")) {
                    System.out.print("Type Promotion(1) or (2) :");
                    typeLogin = input.next();
                }
                if (typeLogin.equalsIgnoreCase("1")) {
                    Service room = new VIP();
                    System.out.println(room.getDesc());
        
                    
                } else if (typeLogin.equalsIgnoreCase("2")) {
                    Service room = new Low();
                    System.out.println(room.getDesc());
                } 

            } else if (typeLogin.equalsIgnoreCase("2")) {
                typeLogin = "0";
                while (!typeLogin.equalsIgnoreCase("1") & !typeLogin.equalsIgnoreCase("2") & !typeLogin.equalsIgnoreCase("3")) {
                    System.out.print("Room type 1 VIP, 2 Low, 3 Standard : ");
                    typeLogin = input.next();
                }
                if (typeLogin.equalsIgnoreCase("1")) {
                    Service room = new VIP();
                    System.out.println(room.getDesc());
        
                    
                } else if (typeLogin.equalsIgnoreCase("2")) {
                    Service room = new Low();
                    System.out.println(room.getDesc());
                } else if (typeLogin.equalsIgnoreCase("3")) {
                    Service room = new Standard();
                    System.out.println(room.getDesc());
                }
                
                

            }

        }
    }

}
