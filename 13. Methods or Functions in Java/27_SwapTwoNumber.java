import java.util.Scanner;

public class SwapTwoNumber {

    /* 
     * Method to swap two integers.
     * 
     * Time Complexity: O(1)
     * - The method performs a fixed number of operations (constant time).
     * 
     * Space Complexity: O(1)
     * - The method uses only a constant amount of extra space for variables.
     */
    public static void swap(int a, int b) {
        int t = a;  // Store the value of a in temporary variable t
        a = b;      // Assign the value of b to a
        b = t;      // Assign the value of t (initial a) to b
        
        System.out.println("Inside swap function: ");
        System.out.println("a = " + a + "   b = " + b);        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object for input
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();  // Read the first number from user input
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();  // Read the second number from user input
        
        swap(a, b);  // Call the swap method with values of a and b
        
        System.out.println("Inside main function: ");
        System.out.println("a = " + a + "   b = " + b);  // Print values of a and b after swap
    }
}
