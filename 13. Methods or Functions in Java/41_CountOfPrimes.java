/*
Problem Description:
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.

Problem Constraints:
0 <= n <= 10^3

Input Format:
Single input parameter n in function.

Output Format:
Return the count of prime numbers less than or equal to n.

Example Input:
Input 1: 19
Input 2: 1


Example Output:
Output 1: 8
Output 2: 0

Example Explanation:
Explanation 1: Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19Explanation 2: There are no primes <= 1 
*/


import java.util.Scanner;

public class CountOfPrimes {

    /**
     * This method checks if a given number is prime.
     *
     * Time Complexity: O(sqrt(n)) - The loop runs up to the square root of n.
     * Space Complexity: O(1) - Uses a constant amount of space.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        
        // Check for factors from 2 up to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a factor, so n is not prime
            }
        }
        
        return true; // No factors found, so n is prime
    }

    /**
     * This method counts the number of prime numbers less than or equal to a given number.
     *
     * Time Complexity: O(n * sqrt(n)) - For each number up to n, the isPrime method runs in O(sqrt(n)) time.
     * Space Complexity: O(1) - Uses a constant amount of space.
     */
    public static int countOfPrimes(int n) {
        int count = 0;
        
        // Check each number from 1 to n to see if it is prime
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                count++; // Increment count if the number is prime
            }
        }
        
        return count; // Return the total count of prime numbers
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Read the integer input
        int n = sc.nextInt();
        
        // Count the number of primes up to n and print the result
        int ans = countOfPrimes(n);
        System.out.println(ans);
        
        // Close the Scanner object to avoid resource leaks
        sc.close();
    }
}
