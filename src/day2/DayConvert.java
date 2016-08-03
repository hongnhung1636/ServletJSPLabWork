package day2;

import java.util.Scanner;
/**
 * a program that prompts the user to enter a day, month, and year and prints out the day of the week that that date falls on.
 * The program should repeatedly prompt the user for dates, printing out the day of the week for each, until the user enters
 * the word “quit” instead of the day of the month.
 */
public class DayConvert {
    public static void main(String[] args) {
        System.out.print("Enter month, day, and year(MM/DD/YYYY): ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        //boolean timeToQuit = "quit".equalsIgnoreCase(line);
        while (!"quit".equalsIgnoreCase(line)){
            //get day month year print out
            int month = Integer.parseInt(line.substring(0,2));
            int day = Integer.parseInt(line.substring(3,5));
            int year = Integer.parseInt(line.substring(6,10));
            System.out.println("Date entered: " + month + "/" + day + "/" + year);

            if (month == 1 || month == 2){
                month += 12;
                year -= 1;
            }
            int a = 13 * (month + 1) / 5;
            int b = year / 4;
            int c = 6 * year / 100;
            int d = year / 400;
            int r = ((a + b + c + d + day + year)%7);
            System.out.println(a + " "+ b + " "+  c+ " "+  d);
            if (r == 0) {
                System.out.println("Saturday");
            }else if(r == 1) {
                System.out.println("Sunday");
            }else if(r == 2) {
                System.out.println("Monday");
            }else if (r == 3) {
                System.out.println("Tuesday");
            }else if (r == 4) {
                System.out.println("Wednesday");
            }else if(r == 5) {
                System.out.println("Thursday");
            }else
                System.out.println("Friday");

            System.out.print("Enter Quit If you would like to quit. Else enter next month, day, " +
                    "and year(MM/DD/YYYY):");
            line = sc.nextLine();
        }
        sc.close();
    }
}
