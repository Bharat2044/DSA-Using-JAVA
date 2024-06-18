// Armstrong Numbers : A number is called Armstrong number when the sum of the nth power of each digit is equal to the given number.
// For example 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371 407, 1634, 8208 and 9474 are the Armstrong numbers.

// i/p: 153
// o/p: 153 is an Armstrong number      => 1^3 + 5^3 + 3^3 = 153

// i/p: 370
// o/p: 1634 is an Armstrong number     => 3^3 + 7^3 + 0^3 = 370


import java.util.Scanner;

public class CheckArmstrongFor3DigitNumbers {

    /**
     * Function to check if a number is an Armstrong number
     * Time Complexity (TC): O(d), where d is the number of digits in the input number.
     * Space Complexity (SC): O(1), uses a constant amount of extra space.
     */
    public static boolean isArmstrong(int n) {
        int sum = 0; // Initialize sum of powered digits
        int temp = n; // Temporary variable to store the original number
        
        // Count the number of digits in the number
        int count = (int)(Math.log10(n) + 1); // TC: O(1), SC: O(1)
        
        // Loop through each digit of the number
        while(temp != 0) {
            int rem = temp % 10; // Get the last digit
            sum += Math.pow(rem, count); // Add the digit raised to the power of 'count' to sum
            temp /= 10; // Remove the last digit
        }
        
        // Return true if sum equals the original number, otherwise false
        return (sum == n); // TC: O(d), SC: O(1) where d is the number of digits
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Read the user input number

        // Check if the input number is an Armstrong number and print the result
        if(isArmstrong(n))
            System.out.println(n + " is an armstrong number.");
        else
            System.out.println(n + " is not an armstrong number.");
    }
}
