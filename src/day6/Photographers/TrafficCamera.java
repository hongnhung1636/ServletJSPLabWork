package day6.Photographers;


public class TrafficCamera implements Photographers {
    @Override
    public void prepareScene() {
        System.out.println("Red Light is on!!");

    }

    @Override
    public String takePhotograph() {
        return "Took!";
    }
}
