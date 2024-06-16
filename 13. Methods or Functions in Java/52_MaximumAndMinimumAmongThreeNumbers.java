// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


import java.util.Scanner; // Importing the Scanner class for user input

public class MaximumAndMinimumAmongThreeNumbers { // Defining the main class
  
    /**
     * Method to find the maximum number among three given numbers
     * 
     * Time Complexity (TC): O(1)
     * - The time complexity for the `maximum` method is O(1) because it performs a constant number of comparisons regardless of the input size.
     * 
     * Space Complexity (SC): O(1)
     * - The space complexity is also O(1) since it uses a fixed amount of space for variables.
     * 
     * @param a The first integer
     * @param b The second integer
     * @param c The third integer
     * @return The maximum value among the three integers
     */
    public static int maximum(int a, int b, int c) {
        // Using ternary operators to find the maximum number among a, b, and c
        int ans = (a > b && a > c) ? a : (b > c ? b : c);
        return ans; // Returning the maximum number
    }
  
    /**
     * Method to find the minimum number among three given numbers
     * 
     * Time Complexity (TC): O(1)
     * - The time complexity for the `minimum` method is O(1) because it performs a constant number of comparisons regardless of the input size.
     * 
     * Space Complexity (SC): O(1)
     * - The space complexity is also O(1) since it uses a fixed amount of space for variables.
     * 
     * @param a The first integer
     * @param b The second integer
     * @param c The third integer
     * @return The minimum value among the three integers
     */
    public static int minimum(int a, int b, int c) {
        // Using ternary operators to find the minimum number among a, b, and c
        int ans = (a < b && a < c) ? a : (b < c ? b : c);
        return ans; // Returning the minimum number
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for input

        System.out.print("Enter three numbers: "); // Prompting the user to enter three numbers
        int a = sc.nextInt(); // Reading the first integer input
        int b = sc.nextInt(); // Reading the second integer input
        int c = sc.nextInt(); // Reading the third integer input
        
        // Printing the maximum number by calling the maximum method
        System.out.println("Largest number = " + maximum(a, b, c));
        
        // Printing the minimum number by calling the minimum method
        System.out.println("Smallest number = " + minimum(a, b, c));
        
        sc.close(); // Closing the Scanner object to prevent resource leaks
    }
}
