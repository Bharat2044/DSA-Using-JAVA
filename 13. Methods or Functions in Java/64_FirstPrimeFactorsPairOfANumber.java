// i/p: 4,      o/p: 2, 2
// i/p: 8,      o/p: 3, 5
// i/p: 16,     o/p: 3, 13
// i/p: 12      o/p: 5, 7
// constraints: n > 3


import java.util.Scanner;

public class FirstPrimeFactorsPairOfANumber {
    
    /**
     * Checks if a given number is prime.
     * 
     * @param n The number to check
     * @return true if n is prime, false otherwise
     * 
     * Time Complexity: O(sqrt(n))
     * Space Complexity: O(1)
     */
    public static boolean isPrime(int n) {
        // 1 and numbers <= 1 are not prime
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i * i <= n; i++) {
            // If n is divisible by any number other than 1 and itself, not prime
            if (n % i == 0) {
                return false; 
            }
        }
        return true; // n is prime
    }
    
    /**
     * Finds the first pair of prime factors (p, q) such that p * q = n.
     * Prints the pair and terminates as soon as it finds one.
     * 
     * @param n The number to find prime factors for
     * 
     * Time Complexity: O(n * sqrt(n))
     * Space Complexity: O(1)
     */
    public static void primeFactorsPair(int n) {
        // Iterate through numbers from 2 up to n/2
        for (int i = 2; i <= n / 2; i++) {

            // Check if both i and (n - i) are prime
            if (isPrime(i) && isPrime(n - i)) { 
                System.out.println(i + ", " + (n - i)); // Print the prime factors pair
                return; // Found the first pair, terminate the function
            }
        }   
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt(); // Input number 

         // Handle constraint
        if (n <= 3) {
            System.out.println("Please enter a number greater than 3");
            System.exit(0); // Exit program
        }

        // Find and print the first prime factors pair
        primeFactorsPair(n); 
        
        sc.close(); // Close scanner
    }
}
