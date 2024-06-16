import java.util.Scanner;

/**
 * This program calculates the sum of the first 'n' natural numbers using different approaches.
 * It demonstrates three methods: using loops, recursion, and a direct mathematical formula.
 */
public class SumOfFirstNNaturalNumber {
  
    /**
     * 1st Approach: Using Loops
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    /*
    public static int naturalSum(int n) {
        int sum = 0;
        
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        
        return sum;
    }
    */
    
    /**
     * 2nd Approach: Using Recursion
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(n) - due to recursion stack
     */
    /*
    public static int naturalSum(int n) {
        if(n == 0) {
            return 0;
        }
        
        return (n + naturalSum(n-1));
    }
    */
    
    /**
     * 3rd Approach: Using Formula
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static int naturalSum(int n) {
        return ((n * (n + 1)) / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Approach 1: Using Loops
        // System.out.println("Sum = " + naturalSum(n));
        
        // Approach 2: Using Recursion
        // System.out.println("Sum = " + naturalSum(n));
        
        // Approach 3: Using Formula
        System.out.println("Sum = " + naturalSum(n));
        
        sc.close();
    }
}
