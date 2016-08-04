package day4.CasinoMachine;

import java.util.concurrent.ThreadLocalRandom;

public class CasinoMachine {

    public enum Casino{
        BAR, MEDAL, COIN, TRIPLEBAR, CHERRY;
    }

    public static void main(String[] args) {
        int random[] = new int[3];
        for (int i = 0; i < random.length; i++){
            random[i]= ThreadLocalRandom.current().nextInt(0, Casino.values().length);
        }
        for(int j=0; j< random.length;j++){
            System.out.print(Casino.values()[random[j]]);
            if(j==random.length-1) break;
            else System.out.print(" ");

        }
    }
}
