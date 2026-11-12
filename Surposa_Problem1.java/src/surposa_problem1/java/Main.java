package surposa_problem1.java;

import java.util.Scanner;

public class Main {

    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }

        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int number = in.nextInt();
            
            System.out.println(sumOfDigits(number));
        }
    }
}
