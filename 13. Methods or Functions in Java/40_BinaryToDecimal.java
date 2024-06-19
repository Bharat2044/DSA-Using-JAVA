/*
Problem Description:
Take a number A as input in binary format (Base = 2). You have to print the number in decimal format (Base = 10).

Problem Constraints:
1 <= A <= 210

Input Format:
First and only line contains a single binary number A.

Output Format:
Print in a single line, a decimal integer.

Example Input:
Input 1:
11 
Input 2:
1011 

Example Output:
Output 1:
3 
Output 2:
11 

Example Explanation:
Explanation 1:
(0011)2 = (21 + 20)10 = (3)10 
Explanation 2:
(1011)2 = (23+ 21 + 20)10 = (11)10 
*/


import java.util.Scanner;

public class BinaryToDecimal { 

    /*
     * 1st Approach
     * This method converts a binary number (given as an integer) to its decimal equivalent.
     *
     * Time Complexity: O(log(n)) - The loop runs as many times as there are digits in the binary number.
     * Space Complexity: O(1) - Uses a constant amount of space.
     *
     * @param a the binary number to convert
     * @return the decimal equivalent of the binary number
     */
    /*
    public static int binaryToDecimal(int a) {
        int x = 0;  // Initialize the exponent of 2
        int ans = 0;  // Initialize the result

        // Process each digit of the binary number from right to left
        while (a > 0) {
            int d = a % 10;  // Extract the last digit
            ans = ans + (int)(d * Math.pow(2, x));  // Add the contribution of the digit to the result
            
            x++;  // Increment the exponent of 2
            a /= 10;  // Remove the last digit from the binary number
        }

        return ans;  // Return the final decimal number
    }
    */

    /*
     * 2nd Approach
     * This method converts a binary number (given as an integer) to its decimal equivalent.
     *
     * Time Complexity: O(log(n)) - The number of iterations is determined by the number of digits in the binary number.
     * Space Complexity: O(1) - Uses a constant amount of space.
     *
     * @param a the binary number to convert
     * @return the decimal equivalent of the binary number
     */
    public static int binaryToDecimal(int a) {
        int pow = 1;  // Initialize power of 2
        int ans = 0;  // Initialize the result

        // Process each digit of the binary number from right to left
        while (a > 0) {
            int d = a % 10;  // Extract the last digit
            ans = ans + d * pow;  // Add the contribution of the digit to the result
            
            a /= 10;  // Remove the last digit from the binary number

            // pow *= 2; // Multiply the power of 2 by 2 for the next higher power
            pow <<= 1;  // Multiply the power of 2 by 2 for the next higher power
        }

        return ans;  // Return the final decimal number
    }
    
    
    public static void main(String[] args) {   
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Read the binary number input
        int a = sc.nextInt(); 
        
        // Convert the binary number to decimal using Approach 1 and print the result
        int ans = binaryToDecimalApproach1(a);
        System.out.println(ans);

        // Close the Scanner object to avoid resource leaks
        sc.close();
    }
}
