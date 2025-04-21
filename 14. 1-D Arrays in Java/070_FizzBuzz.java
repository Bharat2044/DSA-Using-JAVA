/*
FizzBuzz

Problem Description:
Given a positive integer A, return an array of strings with all the integers from 1 to N. But for multiples of 3 the array should have “Fizz” instead of the number. For the multiples of 5, the array should have “Buzz” instead of the number. For numbers which are multiple of 3 and 5 both, the array should have "FizzBuzz" instead of the number.
Look at the example for more details.

Problem Constraints:
1 <= A <= 500000

Input Format:
The first argument has the integer A.

Output Format:
Return an array of string.

Example Input:
Input 1:
 A = 5

Example Output:
Output 1:
 [1 2 Fizz 4 Buzz]

Example Explanation:
Explanation 1:
 3 is divisible by 3 so it is replaced by "Fizz".
 Similarly, 5 is divisible by 5 so it is replaced by "Buzz".
*/



// Import the Scanner class for user input
import java.util.Scanner; 

// Declare a public class named 'FizzBuzz'
public class FizzBuzz { 

    // Method to generate FizzBuzz sequence up to number A
    // Time Complexity = O(A), Space Complexity = O(A)
    public static String[] fizzBuzz(int A) {
        
        // Create a String array of size A to store results
        String[] ans = new String[A]; 

        // Loop from 1 to A
        for (int i = 1; i <= A; i++) {
            // If the number is divisible by both 3 and 5
            if (i % 15 == 0) { // (i % 3 == 0 && i % 5 == 0)
                ans[i - 1] = "FizzBuzz"; // Set "FizzBuzz" at position (i-1)
            } 
            // If the number is divisible by 3 only
            else if (i % 3 == 0) {
                ans[i - 1] = "Fizz"; // Set "Fizz" at position (i-1)
            } 
            // If the number is divisible by 5 only
            else if (i % 5 == 0) {
                ans[i - 1] = "Buzz"; // Set "Buzz" at position (i-1)
            } 
            // If the number is not divisible by 3 or 5
            else {
                ans[i - 1] = "" + i; // Convert number to string and store it
            }
        }

        // Return the final String array
        return ans; 
    }

    // Main method — starting point of program execution
    public static void main(String[] args) {
        
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a number for FizzBuzz: "); // Prompt user for input
        int input = sc.nextInt(); // Read an integer input from the user

        // Call fizzBuzz method with input value
        String[] result = fizzBuzz(input); 

        // Loop through the result array and print each value
        for (String val : result) {
            System.out.println(val); // Print each value on a new line
        }

        // Close the Scanner object to free resources
        sc.close(); 
    }
}
