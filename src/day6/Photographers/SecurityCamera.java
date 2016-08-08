package day6.Photographers;

public class SecurityCamera implements Photographers{
    @Override
    public void prepareScene() {
        System.out.println("Checking!!");
    }

    @Override
    public String takePhotograph() {
        return "Caught!";
    }
}
