/*
Smaller and Greater

You are given an Array A of size N.
Find for how many elements, there is a strictly smaller element and a strictly greater element.

Input Format:
Given only argument A an Array of Integers.

Output Format:
Return an Integer X, i.e number of elements.

Constraints:
1 <= N <= 1e5
1 <= A[i] <= 1e6

For Example:
Example Input:
    A = [1, 2, 3]
Example Output:
    1

Explanation:
  only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.
Expected Output
  Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
*/



// Import utility classes like Scanner and ArrayList
import java.util.*;  

// Define the class
public class SmallerAndGreater {

    // Method to solve the problem, takes an ArrayList of Integers as input and returns an integer
    // Time Complexity = O(n), Space Complexity = O(1)
    public static int solve(ArrayList<Integer> A) {

        // Initialize 'min' to the largest possible integer value
        int min = Integer.MAX_VALUE;

        // Initialize 'max' to the smallest possible integer value
        int max = Integer.MIN_VALUE;

        // Iterate through the list to find the minimum and maximum values
        for (int i = 0; i < A.size(); i++) {
            // Update 'min' if the current element is smaller
            min = Integer.min(min, A.get(i));

            // Update 'max' if the current element is larger
            max = Integer.max(max, A.get(i));
        }

        // Initialize counter to count elements strictly between 'min' and 'max'
        int count = 0;

        // Iterate through the list again
        for (Integer x : A) {

            // Check if the current element is strictly greater than 'min' and strictly less than 'max'
            if (x > min && x < max) {
                // Increment count if the condition is satisfied
                count++;
            }
        }

        // Return the final count
        return count;
    }

    // Main method — program entry point
    public static void main(String[] args) {
        // Scanner to take input
        Scanner sc = new Scanner(System.in);  
        
        // Create an ArrayList to store numbers
        ArrayList<Integer> A = new ArrayList<>();  

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();  // Read the number of elements

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());  // Read each number and add it to the ArrayList
        }

        // Call the solve method and store the result
        int result = solve(A);  

        System.out.println("Number of elements with both strictly smaller and greater elements: " + result);
    }
}
