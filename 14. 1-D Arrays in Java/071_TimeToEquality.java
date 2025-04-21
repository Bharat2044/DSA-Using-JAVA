/*
Time to equality

Problem Description:
Given an integer array A of size N. In one second, you can increase the value of one element by 1.
Find the minimum time in seconds to make all elements of the array equal.

Problem Constraints:
1 <= N <= 1000000
1 <= A[i] <= 1000

Input Format:
First argument is an integer N.
Second argument is an integer array A.

Output Format:
Return an integer denoting the minimum time to make all elements equal.

Example Input:
N = 5
A = [2, 4, 1, 3, 2]

Example Output:
8

Example Explanation:
We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
*/



// Import Scanner class to take input from the user
import java.util.Scanner; 

// Declare a public class named 'TimeToEquality'
public class TimeToEquality { 

    // Method to calculate total operations needed to make all elements equal to the largest element
    // Time Complexity = O(n), Space Complexity = O(1)
    public static int solve(int[] A) {
        
        // Initialize largestElement with smallest possible value
        int largestElement = Integer.MIN_VALUE; 

        // Loop to find the largest element in the array
        for (int i = 0; i < A.length; i++) {
            largestElement = Math.max(largestElement, A[i]); // Update largestElement if current element is bigger
        }

        // Initialize ans to store final result
        int ans = 0; 

        // Loop to calculate the total difference from largest element for each element
        for (int i = 0; i < A.length; i++) {
            ans += largestElement - A[i]; // Add difference to ans
        }

        // Return the final result
        return ans; 
    }

    // Main method — entry point of the program
    public static void main(String[] args) {
        
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in); 

        // Prompt user to enter size of array
        System.out.print("Enter size of array: "); 
        
        // Read integer input for array size
        int n = sc.nextInt(); 

        // Declare and create an array of size n
        int[] arr = new int[n]; 

        // Prompt user to enter array elements
        System.out.println("Enter " + n + " array elements:"); 
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each array element from user
        }

        // Call solve method by passing the input array and store the result
        int result = solve(arr); 

        // Print the result to the user
        System.out.println("Total operations needed: " + result); 

        // Close the Scanner object to free up resources
        sc.close(); 
    }
}
