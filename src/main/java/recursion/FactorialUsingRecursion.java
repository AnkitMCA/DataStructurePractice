package main.java.recursion;

import java.util.Scanner;

/**
 * The type Factorial using recursion.
 */
public class FactorialUsingRecursion {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        int number;
        int factorial = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        number = scanner.nextInt();
        FactorialUsingRecursion obj = new FactorialUsingRecursion();

        if (number < 0) {
            System.out.println("Enter a valid positive number...");
        } else {
            System.out.println("Factorial of " + number + " is : " + obj.findFactorial(number));
        }
    }

    /**
     * Find factorial int.
     *
     * @param number the number
     * @return the int
     */
    public int findFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * findFactorial(number - 1);
        }
    }

}
