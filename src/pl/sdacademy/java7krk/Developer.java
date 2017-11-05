package pl.sdacademy.java7krk;

public class Developer extends User {

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    private String programmingLanguage;


    @Override
    void printMyRole() {
        System.out.println("jestem developerem");
    }
}
