/*
Problem Description:
Given a number A. Return square of the number.

Problem Constraints:
1 <= A <= 104

Input Format:
First argument is an integer A.

Output Format:
Return an integer which is the square of A.

Example Input:
Input 1:
A = 4
Input 2:
A = 14

Example Output:
Output 1:
16
Output 2:
196

Example Explanation:
Explanation 1:
square(4) = 16
Explanation 2:
square(14) = 196
*/


import java.util.Scanner;

public class SquareOfANumber {
    
    /**
     * This method returns the square of the given number.
     *
     * Time Complexity: O(1) - Constant time operation for multiplication.
     * Space Complexity: O(1) - Uses a constant amount of space.
     */
    public static int squareOfANumber(int n) {
        // Return the square of the number
        return n * n;
    }
  
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Read the integer input
        int a = sc.nextInt();

        // Calculate the square of the number and print the result
        System.out.println(squareOfANumber(a));
        
        // Close the Scanner object to avoid resource leaks
        sc.close();
    }
}
