/*
Problem Description:
You are given a function that takes an integer argument A. Return 1 if A is a perfect square otherwise return 0.

Problem Constraints:
1 <= A <= 108

Input Format:
First argument is an integer A.

Output Format:
Return an integer (0 or 1) based upon the question.

Example Input:
Input 1:
A = 4
Input 2:
A = 1001

Example Output:
Output 1:
1
Output 2:
0

Example Explanation
Explanation 1:
sqrt(4) = 2
Explanation 2:
1001 is not a perfect square.
*/



import java.util.Scanner;

/**
 * This class contains methods to check if a given number is a perfect square.
 */
public class IsPerfectSquare {

    /**
     * Approach 1: This method checks if the given number is a perfect square using iteration.
     *
     * Time Complexity: O(sqrt(n)) - In the worst case, the loop runs sqrt(n) times.
     * Space Complexity: O(1) - Uses a constant amount of space.
     *
     * @param n the number to check
     * @return true if the number is a perfect square, false otherwise
     */
    public static boolean isPerfectSquare1(int n) {
        // Iterate from 1 up to the integer square root of n
        for (int i = 1; i * i <= n; i++) {
            // Check if i * i equals n, meaning n is a perfect square
            if ((n % i == 0) && (n / i == i)) {
                return true;  // Found an integer whose square is n
            }
        }
      
        return false;  // No integer square root found
    }

    /**
     * Approach - 2: This method checks if the given number is a perfect square using Math.sqrt.
     *
     * Time Complexity: O(1) - Constant time operation for calculating square root and checking its integer part.
     * Space Complexity: O(1) - Uses a constant amount of space.
     */
    /*
    public static boolean isPerfectSquare2(int n) {
        // Calculate the square root of n
        double sq = Math.sqrt(n);
        // Check if the square root is an integer
        return ((sq - (int)(sq)) == 0);
    }
    */

    /**
     * Approach 3: Using Bitwise AND
     *
     * Time Complexity: O(1) - Constant time operation for bitwise check.
     * Space Complexity: O(1) - Uses a constant amount of space.
     */
    /*
    public static boolean isPerfectSquare(int n) {
        return (n & (n - 1));  
    }
    */
  
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Read the integer input
        int a = sc.nextInt();

        // Check if the number is a perfect square using the first method and print the result
        if (isPerfectSquare(a)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        // Close the Scanner object to avoid resource leaks
        sc.close();
    }
}
