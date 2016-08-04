package day3.MethodArgumentsLab4;

public class MethodArgumentsLab4 {

    private static String[] NUM = {"zero","one","two","three","four","five",
            "six","seven","eight","nine","ten"};

    public static void main(String[] args) {
        System.out.println(addUp(3.2, 2.2,5.6));
        System.out.println(addUp(1, 4,6));
        System.out.println(addUp("one", "three", "five"));
        System.out.println(addUp(2, 3.5, 6.1));
        //this one can't be complied because there is no method take
        //in int and string
        //System.out.println(addUp(1, "three"));
    }

    public static int addUp(int... args){
        System.out.println("Adding Int");
        int total = 0;
        for (int arg : args) {
            total += arg;
        }
        return total;
    }
    public static double addUp(double... args){
        System.out.println("Adding Double");
        double total = 0;
        for (double arg : args) {
            total += arg;
        }
        return total;
    }
    public static int addUp(String... args){
        System.out.println("Adding String");
        int total = 0;
        for (String  arg : args) {
            total += toNumber(arg);
        }
        return total;
    }

    private static int toNumber(String word){
        int num = 0;
        switch (word){
            case "zero":  num = 0;
                break;
            case "one":  num = 1;
                break;
            case "two":  num = 2;
                break;
            case "three":  num = 3;
                break;
            case "four":  num = 4;
                break;
            case "five":  num = 5;
                break;
            case "six":  num = 6;
                break;
            case "seven":  num = 7;
                break;
            case "eight":  num = 8;
                break;
            case "nine":  num = 9;
                break;
            case "ten": num = 10;
                break;
        }
        return num;
    }


}
