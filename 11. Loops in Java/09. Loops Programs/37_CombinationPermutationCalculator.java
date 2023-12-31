// Find Ncr & Npr

import java.util.Scanner;

public class CombinationPermutationCalculator {

    // Factorial function
    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for(int i=2; i<=n; i++) 
            fact *= i;
            
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for n and r
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        // Calculate n!
        long nFactorial = factorial(n);

        // Calculate r!
        long rFactorial = factorial(r);

        // Calculate (n-r)!
        long nMinusRFactorial = factorial(n - r);

        // Calculate nCr and nPr
        long nCr = nFactorial / (rFactorial * nMinusRFactorial);
        long nPr = nFactorial / nMinusRFactorial;

        // Display the result
        System.out.println("nCr (Combination): " + nCr);
        System.out.println("nPr (Permutation): " + nPr);

        sc.close();
    }
}

