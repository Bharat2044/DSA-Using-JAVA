/*
Problem Description:
Given the Number of Test Cases as T,
For each test case, take an integer N as input, you have to tell whether it is a perfect number or not.

A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself). 
A positive proper divisor divides a number without leaving any remainder.

Problem Constraints:
1 <= T <= 10
1 <= N <= 10^6

Input Format:
The first line of the input contains a single integer T. 
Each of the next T lines contains a single integer N.

Output Format:
For each testcase, print YES if the given integer is perfect, else print NO, in a separate line
    
Example Input:
Input 1:
2
4
6
Input 2:
1
3

Example Output:
Output 1:
NO
YES 
Output 2:
NO

Example Explanation:
Explanation 1:
For the first test case A = 4, the answer is "NO" as sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
For the second test case A = 6, the answer is "YES" as sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
Explanation 2:
For the first test case A = 3, the answer is "NO" as sum of its proper divisors = 1, is not equal to 3.
*/


    
import java.util.Scanner; // Import Scanner class for taking input

public class CheckPerfectNumber { // Class declaration
    public static void main(String[] args) { // Main method start
        Scanner sc = new Scanner(System.in); // Create Scanner object
        int t = sc.nextInt(); // Read number of test cases
        
        /*
        ----------------------------------------------------
        1st Approach: Brute Force
        ----------------------------------------------------
        Idea:
        - For each number, check all values from 1 to n-1
        - Sum all divisors except the number itself
        ----------------------------------------------------
        Time Complexity  : O(t * n)
        Space Complexity : O(1)
        ----------------------------------------------------
        */
        /*
        for(int m = 1; m <= t; m++) { // Loop through test cases
            int n = sc.nextInt(); // Read number
            int sum = 0; // Store sum of divisors

            for (int i = 1; i < n; i++) { // Check all numbers from 1 to n-1
                if (n % i == 0) // If i is a divisor
                    sum += i; // Add divisor to sum
            }
        
            if (sum == n) { // If sum of divisors equals n
                System.out.println("YES"); // Perfect number
            }
            else {
                System.out.println("NO"); // Not a perfect number
            }
        }
        */
        
        
        /*
        ----------------------------------------------------
        2nd Approach: Optimized Brute Force
        ----------------------------------------------------
        Idea:
        - A number cannot have a divisor greater than n/2
        - Reduce unnecessary iterations
        ----------------------------------------------------
        Time Complexity  : O(t * n/2) ≈ O(t * n)
        Space Complexity : O(1)
        ----------------------------------------------------
        */
        /*
        for(int m = 1; m <= t; m++) { // Loop through test cases
            int n = sc.nextInt(); // Read number
            int sum = 0; // Store sum of divisors

            for (int i = 1; i <= n / 2; i++) { // Check till n/2
                if (n % i == 0) // If i divides n
                    sum += i; // Add divisor
            }
        
            if (sum == n) { // Check perfect number condition
                System.out.println("YES"); // Perfect number
            }
            else {
                System.out.println("NO"); // Not perfect
            }
        }
        */
        
        
        /*
        ----------------------------------------------------
        3rd Approach: Optimized using sqrt(n)
        ----------------------------------------------------
        Idea:
        - Divisors come in pairs (i, n/i)
        - Loop only till sqrt(n)
        - Add both divisors at once
        ----------------------------------------------------
        Time Complexity  : O(t * sqrt(n))
        Space Complexity : O(1)
        ----------------------------------------------------
        */
        for(int m = 1; m <= t; m++) { // Loop through test cases
            int n = sc.nextInt(); // Read number
            int sum = 1; // Start with 1 (1 is always a divisor)

            for (int i = 2; i * i <= n; i++) { // Loop till sqrt(n)
                if (n % i == 0) { // If i is a divisor
                    sum += i; // Add divisor i
                    
                    if (i * i != n) // If paired divisor is different
                        sum += n / i; // Add paired divisor
                }
            }
        
            if (sum == n) { // Check perfect number condition
                System.out.println("YES"); // Perfect number
            }
            else {
                System.out.println("NO"); // Not perfect
            }
        }
    }
}
