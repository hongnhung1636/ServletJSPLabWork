package day3.MethodArguments;

public class MethodArguments {

    private static String[] NUM = {"zero","one","two","three","four","five",
            "six","seven","eight","nine","ten"};

    public static void main(String[] args) {
        System.out.println(addUp(3.2, 2.2));
        System.out.println(addUp(1, 4));
        System.out.println(addUp("one", "three"));
        System.out.println(addUp(2, 3.5));
        //this one can't be complied because there is no method take
        //in int and string
        //System.out.println(addUp(1, "three"));
    }

    public static int addUp(int args1, int args2){
        System.out.println("Adding Int");
        return args1+ args2;
    }
    public static double addUp(double args1, double args2){
        System.out.println("Adding Double");
        return args1+ args2;
    }
    public static int addUp(String args1, String args2){
        System.out.println("Adding String");
        return toNumber(args1) + toNumber(args2);
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
