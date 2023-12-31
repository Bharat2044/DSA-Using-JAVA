// program to find the sum of positive numbers
// if the user enters a negative number, the loop ends
// the negative number entered is not added to the sum


import java.util.Scanner;

public class SumOfPositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // takeing input from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
    
        do {
            // add all positive numbers
            sum += num;
    
            // takeing input again if the number is positive
            System.out.print("Enter another number: ");
            num = sc.nextInt();
        } while (num >= 0);
    
        // display the sum
        System.out.println("The sum is " + sum);
    }
}