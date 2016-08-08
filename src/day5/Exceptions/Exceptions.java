package day5.Exceptions;


import java.util.Scanner;

public class Exceptions {
    public enum MONTHS{
        January,        February,        March,        April,        May,
        June,           July,           August,        September,    October,
        November,       December
    }
    public static int[] DAYS = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};

    private static class BadMonth extends Exception  {
        public BadMonth(String msg) {
            System.out.println("BadMonth Exception message:" + msg);
        }
        public BadMonth(Throwable cause) {
            super(cause);
        }

        private BadMonth(String msg,Throwable cause) {
            super(msg,cause);
        }

    }

    private static class BadDay extends Exception {

        private BadDay(String msg) {
            System.out.println("BadDay Exception message:" + msg);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mnth = null;
        int dys = 0;
        do {
            try {
                System.out.println("Enter a Month:");
                mnth = sc.nextLine();
                System.out.println("Enter days:");
                dys = Integer.parseInt(sc.nextLine());
                Exp(mnth, dys);
            } catch(BadMonth bme) {
                System.out.println(bme.getMessage());
            } catch (BadDay bde) {
                System.out.println(bde.getMessage());
            }

        } while(!mnth.equalsIgnoreCase("Quit"));

    }

    public static void Exp(String msg, int  num) throws BadMonth, BadDay {
        try {
            int daysIndex = MONTHS.valueOf(msg).ordinal();
            if(num != DAYS[daysIndex]) {
                throw new BadDay("The entered number isn't number of days of the Month!");
            }
            System.out.println("Valid Combination");
        } catch (IllegalArgumentException iae) {
            throw new BadMonth("thrown BadMonth\n",iae);
        }
    }
}
