package pl.sdacademy.java7krk;

public class Admin extends User {

    public int getExperience() {
        return experience;
    }

    private int experience;


    @Override
    void printMyRole() {
        System.out.println("jestem adminem.");
    }
}
