// Armstrong Numbers : A number is called Armstrong number when the sum of the nth power of each digit is equal to the given number.
// For example 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371 407, 1634, 8208 and 9474 are the Armstrong numbers.

// i/p: 153
// o/p: 153 is an Armstrong number      => 1^3 + 5^3 + 3^3 = 153

// i/p: 1634
// o/p: 1634 is an Armstrong number     => 1^4 + 6^4 + 3^4 + 4^4 = 1634


import java.util.Scanner;

public class CheckArmstrongNumber {

    /**
     * This method checks if a given number n is an Armstrong number.
     * 
     * Time Complexity (TC): O(d * log(c)), where d is the number of digits in the input number n, and c is the value of the digits.
     * Space Complexity (SC): O(1), as we are using a constant amount of extra space.
     * 
     * @param n the number to check
     * @return true if n is an Armstrong number, false otherwise
     */
    public static boolean isArmstrong(int n) {
        int sum = 0; // Initialize sum to store the sum of digits raised to the power of the number of digits
        int temp = n; // Temporary variable to hold the value of n
        
        // Count the number of digits in n
        int count = (int)(Math.log10(n) + 1);

        // Loop through each digit of n
        while(temp != 0) {
            int rem = temp % 10; // Get the last digit of temp
    
            sum += (int)(Math.pow(rem, count)); // Add the digit raised to the power of count to the sum
            temp /= 10; // Remove the last digit from temp
        }
        
        // If the sum of the digits raised to the power of count is equal to n, return true
        return (sum == n);
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Read an integer input from the user
        
        // Check if the entered number is an Armstrong number and print the result
        if(isArmstrong(n))
            System.out.println(n + " is an armstrong number.");
        else
            System.out.println(n + " is not an armstrong number.");
        
        sc.close(); // Close the Scanner object
    }
}
