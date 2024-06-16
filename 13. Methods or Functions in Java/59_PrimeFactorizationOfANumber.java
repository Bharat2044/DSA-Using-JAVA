// i/p: n = 1440,   o/p: 2 2 2 2 2 3 3 4
// i/p: n = 46,   o/p: 2 23


import java.util.Scanner;

public class PrimeFactorizationOfANumber {

    /**
     * Function to print the prime factorization of a number.
     *
     * Time Complexity: O(sqrt(n))
     * Space Complexity: O(1)
     */
    public static void printPrimeFactorization(int n) {
        // Iterate through all potential factors from 2 upwards
        for (int f = 2; f * f <= n; f++) {
            // Check if f is a divisor of n
            while (n % f == 0) {
                // If true, f is a prime factor; print it and divide n by f
                System.out.print(f + "  ");
                n /= f;
            }
        }
        
        // If there is any prime factor greater than sqrt(n) left
        // (which would be prime and greater than 1), print it
        if (n != 1)
            System.out.print(n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        // Input the number
        int n = sc.nextInt();

        // Print the prime factorization
        printPrimeFactorization(n);
        
        sc.close();
    }
}
