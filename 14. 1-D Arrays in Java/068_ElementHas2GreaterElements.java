/*
Elements which have at-least two greater elements

Problem Description:
You are given an array of distinct integers A, you have to find and return all elements in array which have at-least two greater elements than themselves.
NOTE: The result should have the order in which they are present in the original array.

Problem Constraints:
3 <= |A| <= 10^5
-10^9 <= A[i] <= 10^9

Input Format:
First and only argument is an integer array A.
Output Format:
Return an integer array containing the elements of A which have at-least two greater elements than themselves in A.

Example Input:
Input 1:
 A = [1, 2, 3, 4, 5]
Input 2:
 A = [11, 17, 100, 5]

Example Output:
Output 1:
 [1, 2, 3]
Output 2:
 [11, 5]

Example Explanation:
Explanation 1:
 Number of elements greater than 1: 4
 Number of elements greater than 2: 3
 Number of elements greater than 3: 2
 Number of elements greater than 4: 1
 Number of elements greater than 5: 0
 Elements 1, 2 and 3 have atleast 2 elements strictly greater than themselves.
 
Explanation 2:
 Number of elements greater than 11: 2
 Number of elements greater than 17: 1
 Number of elements greater than 100: 0
 Number of elements greater than 5: 3
 Elements 5 and 11 have atleast 2 elements strictly greater than themselves.
*/



// Import utility classes like Scanner
import java.util.*;  

// Define the class
public class ElementHas2GreaterElements {

    /*
    // Method to find all elements that have at least 2 greater elements in the array
    // 1st Approach: Brute Force Solution - Time Complexity = O(n^2), Space Complexity = O(n)
    public static int[] solve(int[] A) {

        // Create an array to store the result, size will be (N-2) because at most (N-2) elements can have 2 greater elements
        int[] ans = new int[A.length - 2];

        // Initialize result array index
        int k = 0;

        // Iterate through each element of the array
        for (int i = 0; i < A.length; i++) {

            // Initialize count of greater elements for A[i]
            int count = 0;

            // Compare A[i] with every other element in the array
            for (int j = 0; j < A.length; j++) {

                // If A[j] is greater than A[i], increment count
                if (A[i] < A[j]) {
                    count++;
                }

                // If we have already found 2 greater elements, add A[i] to result and move to next element
                if (count == 2) {
                    ans[k] = A[i];  // Add A[i] to ans array
                    k++;            // Increment result array index
                    break;          // No need to check further for A[i]
                }
            }
        }

        // Return the final result array
        return ans;
    }
    */

    // Method to find all elements that have at least 2 greater elements in the array
    // 2nd Approach: Optimal Solution - Time Complexity = O(n), Space Complexity = O(n)
    public static int[] solve(int[] A) {

        // Get the length of the array
        int n = A.length;  

        // Initialize firstMax and secondMax with smallest possible integer value
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Find first and second maximum elements in a single pass
        for (int i = 0; i < n; i++) {
            if (A[i] > firstMax) {
                // If current element is greater than firstMax,
                // update secondMax before updating firstMax
                secondMax = firstMax;
                firstMax = A[i];
            } else if (A[i] > secondMax) {
                // If current element is less than firstMax but greater than secondMax
                secondMax = A[i];
            }
        }

        // Create an answer array to store result
        int[] ans = new int[n - 2];
        int j = 0;  // Index for ans array

        // Iterate through array and pick elements less than both firstMax and secondMax
        for (int i = 0; i < n; i++) {
            if (A[i] < firstMax && A[i] < secondMax) {
                ans[j] = A[i];  // Add eligible element to result array
                j++;            // Increment index
            }
        }

        // Return the result array
        return ans;
    }

    // Main method — program's entry point
    public static void main(String[] args) {

        // Create a Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();  // Read number of elements

        // Create an array of size n
        int[] A = new int[n];

        // Prompt user to input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();  // Read each element into array
        }

        // Call solve method and store the result in 'result' array
        int[] result = solve(A);

        // Print the result array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");  // Print each element
        }
    }
}
