package pl.sdacademy.java7krk;

import java.util.LinkedList;
import java.util.List;

public class Printer {

    public static void main(String[] args) {
        List<User> users = new LinkedList<>(); //linked lista jak robimy durzo insertow, wagoniki
                                            // do arraylista cizko cos wsadzic, trzba wszystko przesowac
        
        User developer = new Developer();
        User admin = new Admin();
        User guest = new Guest();
        
        users.add(developer);
        users.add(admin);
        users.add(guest);

        for (User user : users) { // skrot iter (to samo co fori petla)
            user.printMyRole();
            
        }
        
    }


}
