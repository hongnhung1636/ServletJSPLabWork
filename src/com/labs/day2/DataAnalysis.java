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
        //find max/min value
        Arrays.sort(items);
        int min = items[0];
        int max = items[items.length - 1];

        mean = (double) sum/items.length;
        System.out.println("Mean value of array element is " + mean);
        System.out.println("Max value of array element is " + max);
        System.out.println("Min value of array element is " + min);

    }
}
