package day6.Photographers;


public class Main {
    public static void main(String[] args) {
        Photographers[] cameras = new Photographers[3];
        cameras[0] = new FamilyCamera();
        cameras[1] = new SecurityCamera();
        cameras[2] = new TrafficCamera();
        for (Photographers camera : cameras) {
            camera.prepareScene();
            System.out.println(camera.takePhotograph());
            System.out.println();
        }
    }
}
