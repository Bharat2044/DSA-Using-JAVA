/*
i/p: n = 3
O/p: 1
i/p: n = 10
O/p: 3
*/



// Import Scanner class for user input
import java.util.Scanner; 
 
public class SquareRootOfANumber {

    /**
     * 1st Approach - Calculate square root using the iterative approach.
     * TC: O(sqrt(n)), SC: O(1)
     */
    public static int squareRootIterative(int n) {
        // Initialize a variable to store the square root result
        int ans = 0; 
        
        // Iterate from 1 upwards until i*i exceeds n
        for (int i = 1; i * i <= n; i++) { 
            // Increment the result for each valid i
            ans++; 
        }
        
        // Return the ans
        return ans; 
    }

    /**
     * 2nd Approach - Calculate square root using the binary search approach.
     * TC: O(log(n)), SC: O(1)
     */
    public static int squareRootBinarySearch(int n) {
        int st = 0; // Initialize the start of the search range
        int end = n; // Initialize the end of the search range
        
        int ans = 0; // Initialize a variable to store the square root result

        // Perform binary search until the start pointer crosses the end pointer
        while (st <= end) {
            // Calculate the middle of the current range
            int mid = st + (end - st) / 2; 
            
            // Calculate the square of the mid-point
            long square = (long) mid * mid; 

            // If the square of mid equals n
            if (square == n) { 
                return mid; // Return mid as the square root
            } else if (square > n) { // If the square of mid is greater than n
                end = mid - 1; // Move the end pointer to the left of mid
            } else { // If the square of mid is less than n
                ans = mid; // Update ans to the current mid
                st = mid + 1; // Move the start pointer to the right of mid
            }
        }
        
        // Return the ans after the search completes
        return ans; 
    }

    /**
     * 3rd Approach - Calculate square root using the predefined Math.sqrt method.
     * TC: O(1), SC: O(1)
     */
    public static int squareRootPredefined(int n) {
      
        // Use Math.sqrt() to calculate the square root and cast it to an integer
        int ans = (int) Math.sqrt(n); 
        
        // Return the ans
        return ans; 
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a Number: "); // Prompt the user to enter a number
        int n = sc.nextInt(); // Read the integer input from the user

        // Calculate and print the square root using the iterative approach
        int iterativeResult = squareRootIterative(n); // Call the iterative approach function
        System.out.println("Square Root of " + n + " using Iterative Approach = " + iterativeResult); // Display the result

        // Calculate and print the square root using the binary search approach
        int binarySearchResult = squareRootBinarySearch(n); // Call the binary search approach function
        System.out.println("Square Root of " + n + " using Binary Search Approach = " + binarySearchResult); // Display the result

        // Calculate and print the square root using the predefined Math.sqrt method
        int predefinedResult = squareRootPredefined(n); // Call the predefined method function
        System.out.println("Square Root of " + n + " using Math.sqrt() = " + predefinedResult); // Display the result
    }
}
