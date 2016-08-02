package com.labs.day2;

import java.util.Arrays;
import java.util.Scanner;

public class DataAnalysis {
    public static void main(String[] args) {
        System.out.print("How many data items you would like to provide? ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.valueOf(line);
        int[] items = new int[n];
        System.out.println("Please enter each number followed by enter and type Quit when you are" +
                " done");
        String input = sc.nextLine();

        int count = 0;
        while (!input.equalsIgnoreCase("quit")){
            items[count] = Integer.parseInt(input);
            count++;
            input = sc.nextLine();
        }

        //find mean value
        int sum = 0;
        double mean = 0.0;
        for (int i = 0; i < items.length; i++){
            sum = sum + items[i];
        }
        mean = (double) sum/items.length;

        //find max/min value
        int max = items[0];
        int min = items[0];
        for (int j = 1; j < items.length;j++){
            if (items[j] > max){
                max = items[j];
            }
            if (items[j] < min){
                min = items[j];
            }
        }


        System.out.println("Mean value of array element is " + mean);
        System.out.println("Max value of array element is " + max);
        System.out.println("Min value of array element is " + min);

    }

}
