package day6.Photographers;

/**
 * Created by honle on 8/8/2016.
 */
public class FamilyCamera implements Photographers {
    @Override
    public void prepareScene() {
        System.out.println("Ready!!");
    }

    @Override
    public String takePhotograph() {
        return "Say Chesse";
    }
}
