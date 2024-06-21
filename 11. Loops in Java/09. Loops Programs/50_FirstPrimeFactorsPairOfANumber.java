// This program finds and prints the first pair of prime factors (p, q) such that p * q = n, where n is a user-provided integer greater than 3.

// i/p: 4,      o/p: 2, 2
// i/p: 8,      o/p: 3, 5
// i/p: 16,     o/p: 3, 13
// i/p: 12      o/p: 5, 7
// constraints: n > 3


import java.util.Scanner;

public class FirstPrimeFactorsPairOfANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Input number 

        // Handle constraint: n must be greater than 3
        if (n <= 3) {
            System.out.println("Please enter a number greater than 3");
            System.exit(0); // Exit program if constraint is not met
        }

        // Find the first pair of prime factors (p, q) such that p * q = n
        for (int i = 2; i <= n / 2; i++) {
            boolean isPrimeI = true;      // Flag to check if i is prime
            boolean isPrimeNMinusI = true; // Flag to check if (n - i) is prime

            // Check if i is prime
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrimeI = false; // i is not prime
                    break; // Exit the loop early
                }
            }

            // Check if (n - i) is prime
            int nMinusI = n - i;
            for (int j = 2; j * j <= nMinusI; j++) {
                if (nMinusI % j == 0) {
                    isPrimeNMinusI = false; // (n - i) is not prime
                    break; // Exit the loop early
                }
            }

            // If both i and (n - i) are prime, print the pair and terminate
            if (isPrimeI && isPrimeNMinusI) {
                System.out.println(i + ", " + nMinusI);
                break;
            }
        }   

        sc.close(); // Close scanner
    }
}



/**
 * Time Complexity: O(n * sqrt(n))
 * - For each candidate i from 2 to n/2, the program checks if both i and n-i are prime.
 * - Checking if a number is prime takes O(sqrt(k)), where k is the number being checked.
 * - Therefore, the overall time complexity is O(n * sqrt(n)).
 * 
 * Space Complexity: O(1)
 * - The program uses a constant amount of extra space, regardless of the input size.
 * - The only variables used are scalars.
 */
