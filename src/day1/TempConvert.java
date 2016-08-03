package day1;

import java.util.Scanner;
/**
 *  A program that converts Fahrenheit temperatures into Celsius. The program will prompt the
 *  user to enter a Fahrenheit temperature on the console, and will print out the equivalent Celsius value.
 *  The mathematical formula for converting a Fahrenheit temperature into a Celsius temperature is:
 *  C = 5 x ( F – 32 ) / 9
 */
public class TempConvert {

    public static void main(String[] args) {
        System.out.print("Enter Fahrenheit temperatures: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        double f = Double.valueOf(line);
        float c =  5 * ( (float)f - 32 ) / 9;
        System.out.println((double) c);
    }

}
