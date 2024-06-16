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
        
        // Handle constraint
        if (n <= 3) {
            System.out.println("Please enter a number greater than 3");
            System.exit(0); // Exit program
        }

        // Find the first pair of prime factors (p, q) such that p * q = n
        for (int i = 2; i <= n / 2; i++) {
            boolean isPrimeI = true;
            boolean isPrimeNMinusI = true;

            // Check if i is prime
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrimeI = false;
                    break;
                }
            }

            // Check if (n - i) is prime
            int nMinusI = n - i;
            for (int j = 2; j * j <= nMinusI; j++) {
                if (nMinusI % j == 0) {
                    isPrimeNMinusI = false;
                    break;
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
