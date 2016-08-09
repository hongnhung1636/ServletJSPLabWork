package day7.Builder;

import com.sun.media.sound.InvalidDataException;

public class Main {
    public static void main(String[] args) throws InvalidDataException {
        System.out.println("Create valid data");
        Target.Builder  builderObj = new Target.Builder(111, "Tom", "CA", 30, "USA");
        builderObj.build();
        System.out.println("Create invalid data");
        Target.Builder  builderObj2 = new Target.Builder(222, "Davis", "Hanoi", 17, "VN ");
        builderObj2.build();

    }
}
