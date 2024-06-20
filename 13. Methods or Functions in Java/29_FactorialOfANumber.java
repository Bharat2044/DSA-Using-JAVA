import java.util.Scanner;

public class FactorialOfANumber {
  
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
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        
        if(num < 0) {
            System.out.println("Factorial of negative number is not defined 😜");  // Inform user about negative input
            // System.exit(0);  // Exit program (alternative)
            return;  // Return from main method
        }
        
        int ans = factorial(num);  // Calculate factorial
        
        System.out.println(num + "! = " + ans);  // Print the result
    }
}
