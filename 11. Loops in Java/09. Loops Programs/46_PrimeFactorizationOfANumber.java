// i/p: n = 1440,   o/p: 2 2 2 2 2 3 3 4
// i/p: n = 46,   o/p: 2 23



import java.util.Scanner;

public class PrimeFactorizationOfANumber {
    /**
     * Finds prime factors of a given number n and prints them.
     * 
     * Time Complexity: O(sqrt(n))
     * Space Complexity: O(1)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object to read input
      
        int n = sc.nextInt();  // Input the number to factorize

        // Loop through all numbers from 2 upwards until the square root of n
        for(int f = 2; f * f <= n; f++) {
            // Check if f is a factor of n
            while(n % f == 0) {
                System.out.print(f + "  ");  // Print the factor
                n /= f;  // Divide n by f repeatedly until f is no longer a factor
            }
        }        
        
        if(n != 1)
            System.out.print(n);  // If n is still greater than 1, it is a prime number itself
        
        sc.close();  // Close the scanner
    }
}
