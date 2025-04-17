/*
MINIMUM PICKS

Problem Description:
You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.

Problem Constraints:
2 <= N <= 1e5
-1e9 <= A[i] <= 1e9
There is atleast 1 odd and 1 even number in A

Input Format:
The first argument given is the integer array, A.
Output Format:
Return maximum among all even numbers of A - minimum among all odd numbers in A.

Example Input:
Input 1:
 A = [0, 2, 9]
Input 2:
 A = [5, 17, 100, 1]

Example Output:
Output 1:
-7
Output 2:
99

Example Explanation:
Explanation 1:
Maximum of all even numbers = 2
Minimum of all odd numbers = 9
ans = 2 - 9 = -7

Explanation 2:
Maximum of all even numbers = 100
Minimum of all odd numbers = 1
ans = 100 - 1 = 99
*/



// Import Scanner class for input
import java.util.Scanner;  

public class MinimumPicks {

    // Method to find the difference between the maximum even and minimum odd numbers
    // Time Complexity = O(n), SPace Complexity = O(1)
    public static int solve(int[] A) {

        // Initialize maxi to the smallest possible integer value
        int maxi = Integer.MIN_VALUE;  

        // Initialize mini to the largest possible integer value
        int mini = Integer.MAX_VALUE; 

        // Loop through the array to find the maximum even number and the minimum odd number
        for (int i = 0; i < A.length; i++) {

            // If the number is even and greater than current maxi, update maxi
            if (A[i] % 2 == 0 && A[i] > maxi) {
                maxi = A[i];
            }

            // If the number is odd and smaller than current mini, update mini
            if (A[i] % 2 != 0 && A[i] < mini) {
                mini = A[i];
            }
        }

        // Calculate the difference between the maximum even number and the minimum odd number
        int ans = maxi - mini;

        // Return the answer
        return ans;
    }

    // Main method - Program's entry point
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();  // Read the size of the array

        // Create an array of the given size
        int[] A = new int[n];

        // Prompt user to input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();  // Read each element into the array
        }

        // Call solve method to find the result
        int result = solve(A);

        // Print the result
        System.out.println(result);
        
        // Close the scanner to avoid resource leak
        sc.close();
    }
}
