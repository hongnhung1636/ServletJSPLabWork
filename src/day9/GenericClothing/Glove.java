package day9.GenericClothing;

import java.awt.*;

public class Glove implements Colored,Sized {
    public Color color;
    public int size;

    public Glove(Color color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Glove{" +
                "color=" + color +
                ", size=" + size +
                '}';
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public int getSize() {
        return size;
    }
}
