import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(power(2, 2));
    }

    private static int power(int base, int exponent) {

        if (exponent < 1) return 1; //base case

        return base * power(base, exponent - 1); //recursive case
    }

    private static void walk(int steps) {
        if (steps < 1) return;
        System.out.println("You walked..");
    }


    private static int factorial(int num) {
        if (num < 1) return 1; // base case
        return num * factorial(num -1); // recursive case
    }




}