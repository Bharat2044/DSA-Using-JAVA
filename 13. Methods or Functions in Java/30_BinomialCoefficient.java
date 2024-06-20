// nCr = (n!) / (r! * (n-r)!)


import java.util.Scanner;

public class BinomialCoefficient {
  
    /* 
     * Method to calculate the factorial of a number n
     * 
     * Time Complexity: O(n), where n is the input number
     * - The method iterates from 2 to n, performing n-1 multiplications.
     * - Therefore, the time complexity is linear with respect to n.
     * 
     * Space Complexity: O(1)
     * - The method uses only a constant amount of extra space for variables.
     */
    public static int factorial(int n) {
        if(n <= 1) {
           return 1;  // Factorial of 0 and 1 is 1
        }
        
        int fact = 1;
        for(int i = 2; i <= n; i++) {  // Iterate from 2 to n
            fact *= i;  // Multiply to calculate factorial
        } 
        
        return fact;  // Return the factorial of n
    }
    
    /* 
     * Method to calculate the binomial coefficient (nCr)
     * 
     * Time Complexity: O(n), where n is the input number
     * - Calls factorial method three times, each with O(n) time complexity.
     * - Multiplication and division operations are constant time.
     * - Overall, the time complexity is dominated by the factorial calculation, O(n).
     * 
     * Space Complexity: O(1)
     * - The method uses only a constant amount of extra space for variables.
     */
    public static int binCoefficient(int n, int r) {
        int fact_n = factorial(n);     // Calculate factorial of n
        int fact_r = factorial(r);     // Calculate factorial of r
        int fact_nr = factorial(n - r); // Calculate factorial of (n - r)
        
        return fact_n / (fact_r * fact_nr);  // Calculate nCr using factorial values
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        int ans = binCoefficient(n, r);  // Calculate nCr
        
        System.out.println("Binomial Coefficient C(" + n + ", " + r + ") = " + ans);  // Print the result
    }
}
