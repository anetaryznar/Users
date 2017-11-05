package pl.sdacademy.java7krk;

import java.util.Date;

public class Guest extends User {

    private Date getLoginTime() {
        return loginTime;
    }

    private Date loginTime;


    @Override
    void printMyRole() {
        System.out.println("jestem guestem");
    }
}
