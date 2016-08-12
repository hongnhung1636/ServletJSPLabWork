package day9.GenericClothing;

import java.awt.*;

public class Fabric implements Colored {

    public Color color;

    public Fabric(Color color){
        this.color = color;
    }

    @Override
    public Color getColor(){
        return color;}

}