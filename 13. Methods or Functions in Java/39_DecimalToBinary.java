/*
Problem Description:
You are given an integer A in decimal (base 10).
Return an integer denoting the binary (base 2) form of the integer A.

Problem Constraints:
1 <= A <= 10^2

Input Format:
Function stub has a single integer A, denoting the integer for that test case.

Output Format:
Return an integer denoting the binary representation of A.

Example Input:
10

Example Output:
1010

Example Explanation:
The binary form of 10 is given by -> 1010
*/


import java.util.Scanner;

public class DecimalToBinary { 
  
    // 1st Approach: Converts a decimal number to binary using an iterative approach.
    // Time Complexity: O(log A) - where A is the input number.
    // Space Complexity: O(1).
    /*
    public static int decimalToBinary(int a) {
        int ans = 0;    // Initialize result accumulator.
        int i = 0;      // Initialize power of 10 multiplier.
        
        // Iterate until the input number becomes zero.
        while(a > 0) {
            int d = a % 2;  // Compute binary digit (remainder when divided by 2).
            
            // Accumulate binary digits using powers of 10.
            ans = ans + (d * (int)(Math.pow(10, i)));
            
            i++;    // Increment power of 10 exponent.
            
            a >>= 1;    // Equivalent to a /= 2; Shift input number right by 1 bit.
        }
            
        return ans; // Return binary representation as an integer.
    }  
    */
  
  
    // 2nd Approach: Converts a decimal number to binary using an alternative iterative approach.
    // Time Complexity: O(log A) - where A is the input number.
    // Space Complexity: O(1).
    /*
    public static int decimalToBinary(int a) {
        int ans = 0;    // Initialize result accumulator.
        int i = 1;      // Initialize binary digit multiplier.
        
        // Iterate until the input number becomes zero.
        while(a > 0) {
            int d = a % 2;  // Compute binary digit (remainder when divided by 2).
            
            // Accumulate binary digits using a multiplier.
            ans = ans + (d * i);
            
            i *= 10;    // Multiply the multiplier by 10 for the next binary digit place.
            
            a >>= 1;    // Equivalent to a /= 2; Shift input number right by 1 bit.
        }
            
        return ans; // Return binary representation as an integer.
    }
    */
    
    
    // 3rd Approach: Converts a decimal number to binary using a recursive approach.
    // Time Complexity: O(log A) - where A is the input number.
    // Space Complexity: O(log A) - due to recursion stack.
    public static int decimalToBinary(int a) {
        // Base case: if the input number is zero, return zero.
        if(a == 0)
            return 0;
        
        // Recursive call to convert the quotient of a divided by 2 to binary,
        // multiply the result by 10, and add the remainder of a divided by 2.
        return (a % 2) + 10 * decimalToBinary(a / 2);
    } 
    
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);  // Initialize scanner to read input.
        
        int a = sc.nextInt();   // Read integer input from standard input.
        int ans = decimalToBinary(a);   // Call the decimalToBinary method to convert a to binary.
            
        System.out.println(ans);    // Print the binary representation.
        
        sc.close(); // Close the scanner to release resources.
    }
}
