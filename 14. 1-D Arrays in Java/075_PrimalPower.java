/*
Primal Power

Problem Description:
"Primal Power" of an array is defined as the count of prime numbers present in it.
Given an array of integers A of length N, you have to calculate its Primal Power.

Problem Constraints:
1 <= N <= 10^3

-10^6 <= A[i] <= 10^6

Input Format:
First and only argument is an integer array A.

Output Format:
Return the Primal Power of array A.

Example Input:
Input 1:
 A = [-6, 10, 12]
Input 2:
 A = [-11, 7, 8, 9, 10, 11]

Example Output:
Output 1:
 0
Output 2:
 2

Example Explanation:
Explanation 1:
 -6 is not a prime number, as prime numbers are always natural numbers(by definition). 
  Also, both 10 and 12 are composite numbers.
Explanation 2:
 7 and 11 are prime numbers. Hence, Primal Power = 2.
*/


import java.util.Scanner;

public class PrimalPower {

    // Function to check if a number is prime
    public static boolean isPrime(int x) {

        // Loop from 2 to sqrt(x)
        for (int i = 2; i * i <= x; i++) { 

            // If divisible, then not prime
            if (x % i == 0) {  
                return false;
            }
        }

        // If no divisors found, it's prime
        return true; 
    }

    // Function to calculate primal power of array
    // Time Complexity = O(n * sqrt(max(A[i]))), Space Complexity = O(1)
    public static int solve(int[] A) {
     
        // Initialize counter for prime numbers
        int count = 0; 

        for (int i = 0; i < A.length; i++) {
            // Only consider numbers greater than 1
            if (A[i] > 1) { 

                // Check if number is prime
                if (isPrime(A[i])) { 
                    count++; // Increment count if prime
                }
            }
        }

        // Return final count of primes
        return count; 
    }

    // Main method to read input and call solve function
    public static void main(String[] args) {

        // Scanner for input
        Scanner sc = new Scanner(System.in); 

        // Ask for number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Declare array of size n
        int[] A = new int[n]; 

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt(); // Read each element
        }

        // Call solve method and print the result
        int primalPower = solve(A);
        System.out.println("Primal Power of the array: " + primalPower);

        // Close the scanner
        sc.close(); 
    }
}
