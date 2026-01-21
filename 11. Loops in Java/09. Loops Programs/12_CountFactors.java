/*
Problem Description:
Take an integer N as input and print the count of its factors.
The factor of a number is the number that divides it perfectly leaving no remainder.

Example: 1, 2, 3, and 6 are factors of 6

Problem Constraints:
1 <= N <= 300

Input Format:
The first and only line of input contains a single integer N.</div>

Output Format:
Print the count of factors of N.

Example Input:
Input 1:
5
Input 2:
10

Example Output:
Output 1:
2
Output 2:
4

Example Explanation:
Explanation 1:
Factors of 5 are 1 and 5.
Explanation 2:
Factors of 10 are 1, 2, 5 and 10.
*/


import java.util.Scanner; // Import Scanner class for input

public class CountFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object
        int n = sc.nextInt(); // Read input number

        /*
        ----------------------------------------------------
        1st Approach: Brute Force
        ----------------------------------------------------
        Idea:
        - Check every number from 1 to n
        - Count how many numbers divide n
        ----------------------------------------------------
        Time Complexity  : O(n)
        Space Complexity : O(1)
        ----------------------------------------------------
        */
        /*
        int count = 0; // Variable to store factor count

        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            if (n % i == 0) { // If i divides n
                count++; // Increase factor count
            }
        }

        System.out.println(count); // Print total factors
        */


        /*
        ----------------------------------------------------
        2nd Approach: Optimized using sqrt(n)
        ----------------------------------------------------
        Idea:
        - Factors come in pairs (i, n / i)
        - Iterate only till sqrt(n)
        - Count both factors in one step
        ----------------------------------------------------
        Time Complexity  : O(sqrt(n))
        Space Complexity : O(1)
        ----------------------------------------------------
        */

        int count = 0; // Stores total number of factors

        for (int i = 1; i * i <= n; i++) { // Loop till sqrt(n)

            if (n % i == 0) { // If i is a factor
                count++; // Count factor i

                if (i * i != n) { // If paired factor is different
                    count++; // Count factor n / i
                }
            }
        }

        System.out.println(count); // Print total number of factors
        sc.close(); // Close Scanner
    }
}
