// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.

import java.util.Scanner;

public class NumberSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter a list of numbers. Enter 0 to finish.");

        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if(number < 0) {
                sumNegative += number;
            } 
            else if(number > 0) {
                
                if(number % 2 == 0) {
                    sumPositiveEven += number;
                } 
                else {
                    sumPositiveOdd += number;
                }
            }

        } while(number != 0);

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);

        sc.close();
    }
}
