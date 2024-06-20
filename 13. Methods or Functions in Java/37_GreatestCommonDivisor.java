/*
Problem Description:
Given 2 non-negative integers A and B, find gcd(A, B)

GCD of 2 integers A and B is defined as the greatest integer 'g' such that 'g' is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.

Note: DO NOT USE LIBRARY FUNCTIONS.

Problem Constraints:
0 <= A, B <= 10^9

Input Format
First argument is an integer A.
Second argument is an integer B.

Output Format:
Return an integer denoting the gcd(A, B).

Example Input:
Input 1:
A = 4 B = 6
Input 2:
A = 6  B = 7

Example Output:
Output 1:
2
Output 2:
1

Example Explanation:
Explanation 1:
2 divides both 4 and 6
Explanation 2:
1 divides both 6 and 7
*/



import java.util.Scanner;

public class GreatestCommonDivisor { 

    /*
     * 1st Approach
     * Brute-force approach from 1 to min(a, b)
     * Time Complexity: O(min(a, b))
     * Space Complexity: O(1)
     */
    /*
    public static int gcd(int a, int b) {
        int ans = 1; // Initialize ans to 1
        int x = Math.min(a, b); // Find the smaller of the two numbers
    
        // Loop from 2 to x to find the greatest common divisor
        for (int i = 2; i <= x; i++) {
	    // Check if i is a common divisor
            if (a % i == 0 && b % i == 0) { 
                ans = i; // Update ans if i is a common divisor
            }
        }
            
        return ans; // Return the greatest common divisor found
    }
    */

    /*
     * 2nd Approach
     * Brute-force approach from min(a, b) to 1
     * Time Complexity: O(min(a, b))
     * Space Complexity: O(1)
     */
    /*
    public static int gcd(int a, int b) {
        int ans = 1; // Initialize ans to 1
        int x = Math.min(a, b); // Find the smaller of the two numbers
    
        // Loop from x to 1 to find the greatest common divisor
        for (int i = x; i >= 1; i--) {
	    // Check if i is a common divisor
            if (a % i == 0 && b % i == 0) { 
                ans = i; // Update ans if i is a common divisor
                break; // Break the loop as soon as we find the GCD
            }
        }
        
        return ans; // Return the greatest common divisor found
    }
    */

    /*
     * 3rd Approach
     * Brute-force with square root optimization
     * Time Complexity: O(sqrt(min(a, b)))
     * Space Complexity: O(1)
     */
    /*
    public static int gcd(int a, int b) {
        int ans = 1; // Initialize ans to 1
        int x = Math.min(a, b); // Find the smaller of the two numbers
    
        // Loop from 1 to sqrt(x) to find the greatest common divisor
        for (int i = 1; i * i <= x; i++) {
	    // Check if i is a common divisor
            if (a % i == 0 && b % i == 0) { 
                ans = i; // Update ans if i is a common divisor
            }
	    
	    // Check if (x/i) is a common divisor
            if (a % (x / i) == 0 && b % (x / i) == 0) {
                ans = x / i; // Update ans if (x/i) is a common divisor
                break; // Break the loop as soon as we find the GCD
            }
        }
        
        return ans; // Return the greatest common divisor found
    }
    */

    /*
     * 4th Approach
     * Euclidean algorithm approach to calculate the greatest common divisor (GCD)
     * Time Complexity: O(log(min(a, b))) because the Euclidean algorithm reduces the problem size logarithmically
     * Space Complexity: O(1) as it uses a constant amount of extra space
     */
    public static int gcd(int a, int b) {
        // Ensure a >= b, if not, swap them
        if (b == 0) {
            // Base case: GCD(a, 0) is a
            return a;
        }
	    
        // Loop until b becomes 0
        while (b != 0) {
            // Find the remainder when a is divided by b
            int r = a % b;
            
            a = b; // Update a to b            
            b = r; // Update b to the remainder r
        }
        
        return a; // The GCD is in a
    }
    
    public static void main(String[] args) {   
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // Read integer A        
        int b = sc.nextInt(); // Read integer B
        
        // Compute GCD of A and B using the gcd method
        int ans = gcd(a, b);
        
        // Output the result
        System.out.println(ans);
        
        // Close the scanner
        sc.close();
    }
}
