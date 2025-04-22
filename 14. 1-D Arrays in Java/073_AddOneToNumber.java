/*
 Add One To Number

Problem Description:
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :
Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.

Problem Constraints:
1 <= size of the array <= 1000000

Input Format:
First argument is an array of digits.

Output Format:
Return the array of digits after adding one.

Example Input:
Input 1:
[1, 2, 3]

Example Output:
Output 1:
[1, 2, 4]

Example Explanation:
Explanation 1:
Given vector is [1, 2, 3].
The returned vector should be [1, 2, 4] as 123 + 1 = 124.
*/



import java.util.Scanner;

public class Solution {

    // Helper to remove leading zeros from an array
    private static int[] removeLeadingZeros(int[] arr) {
        
      // Get the length of the array
        int n = arr.length;
        int start = 0;

        // Find the first non-zero element
        while (start < n && arr[start] == 0) {
            start++;
        }

        // If all elements are zero, return [0]
        if (start == n) {
            return new int[]{0};
        }

        // Create a new array without leading zeros
        int[] result = new int[n - start];
        for (int i = start, j = 0; i < n; i++, j++) {
            result[j] = arr[i];
        }

        // return the result array
        return result;
    }

    // Method to add one to the number represented by the array
    // Time Complexity = O(n). Space Complexity = O(n
    public int[] plusOne(int[] A) {

        // Get the length of the array
        int n = A.length;

        // Initialize carry as 1 since we are adding one
        int carry = 1; 

        // Start adding from the last digit and propagate the carry
        for (int i = n - 1; i >= 0; i--) {
            int sum = A[i] + carry;
            A[i] = sum % 10;        // Update the current digit
            carry = sum / 10;       // Update carry
        }

        // If there's still a carry left after processing all digits
        if (carry != 0) {
            // Create a new array of size n+1 to hold the extra carry
            int[] result = new int[n + 1];
            result[0] = carry;  // Set the first digit as the remaining carry

            // Copy the rest of the original array elements to new array
            for (int i = 1; i < result.length; i++) {
                result[i] = A[i - 1];
            }

            // Remove any leading zeros if present and return
            return removeLeadingZeros(result);
        }

        // If no extra carry, just remove leading zeros and return
        return removeLeadingZeros(A);
    }

    // Main method to run the program
    public static void main(String[] args) {
      // Create Scanner object for input
      Scanner sc = new Scanner(System.in);  
      
        // Ask user for size of the array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Declare array of size n
        int[] input = new int[n]; 

        // Read array elements from user
        System.out.print("Enter " + n + " digits (space separated): ");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        // Create Solution object
        Solution sol = new Solution();

        // Call plusOne method to increment the number
        int[] result = sol.plusOne(input);

        // Print the final result array
        System.out.print("Result after adding one: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

        // Close Scanner
        sc.close(); 
    }
}
