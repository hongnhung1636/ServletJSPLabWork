package day9.GenericClothing;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Glove g1 = new Glove(Color.pink, 7);
        Glove g2 = new Glove(Color.pink, 7);
        Sock s1 = new Sock(Color.pink, 7);
        Sock s2 = new Sock(Color.pink, 7);
        Sock s3 = new Sock(Color.pink, 8);
        Sock s4 = new Sock(Color.pink, 7);
        Glove g3 = new Glove(Color.blue, 8);
        Glove g4 = new Glove(Color.black, 8);
        Fabric f1 = new Fabric(Color.green);
        GlassVase gv1 = new GlassVase(5);
        ClothingPair[] pairs = {
                new ClothingPair<Glove>(g1,g2),
                new ClothingPair<Sock>(s1,s2),
                new ClothingPair<>(s1,g2)
        };
        System.out.println("Lab1: ");
        for (ClothingPair pair : pairs) {

            System.out.println(pair.isMatched());
        }

        ClothingPair[] pairs2 = {
                new ClothingPair<Glove>(g1,g2),
                new ClothingPair<Sock>(s1,s2),
                new ClothingPair(s1,g2),
                new ClothingPair<Sock>(s3,s4),
                new ClothingPair(g2,gv1)
        };
        System.out.println("Lab2: ");
        for(int p=0;p<pairs.length;p++){
            System.out.println(pairs2[p].isMatched());
        }
    }
}
