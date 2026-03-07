/*
Pick from both sides!

Problem Description
You are given an integer array A of size N.
You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
Find and return the maximum possible sum of the B elements that were removed after the B operations.

NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.

Problem Constraints
1 <= N <= 10^5
1 <= B <= N
-10^3 <= A[i] <= 10^3

Input Format
First argument is an integer array A.
Second argument is an integer B.

Output Format
Return an integer denoting the maximum possible sum of elements you removed.

Example Input
Input 1:
 A = [5, -2, 3 , 1, 2]
 B = 3
Input 2:
 A = [ 2, 3, -1, 4, 2, 1 ]
 B = 4

Example Output
Output 1:
 8
Output 2:
 9

Example Explanation
Explanation 1:
 Remove element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
Explanation 2:
 Remove the first element and the last 3 elements. So we get 2 + 4 + 2 + 1 = 9
*/



import java.util.Scanner; // Import Scanner class for user input

public class MaxSumFromEnds { // Class declaration

    /*
    ----------------------------------------------------
    Approach 1: Brute Force (Two Loops)
    ----------------------------------------------------
    Idea:
    Try every possible combination of removing B elements from the front and back.

    Example:
    B front + 0 back
    B-1 front + 1 back
    ...
    0 front + B back

    Time Complexity  : O(B²)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    /*
    public static int maxSum(int[] arr, int B) {

        int n = arr.length; // Store length of array

        int ans = Integer.MIN_VALUE; // Store maximum sum

        // Try all combinations
        for (int i = 0; i <= B; i++) { // i elements from front

            int sum = 0; // Current sum

            // Take i elements from front
            for (int j = 0; j < i; j++) {
                sum += arr[j]; // Add front elements
            }

            // Take B-i elements from back
            for (int j = 0; j < B - i; j++) {
                sum += arr[n - 1 - j]; // Add elements from end
            }

            ans = Math.max(ans, sum); // Update maximum sum
        }

        return ans; // Return result
    }
    */



    /*
    ----------------------------------------------------
    Approach 2: Prefix + Suffix Arrays
    ----------------------------------------------------
    Idea:
    Precompute prefix and suffix sums.

    prefix[i] = sum of first i elements
    suffix[i] = sum of last i elements

    Then combine them.

    Time Complexity  : O(B)
    Space Complexity : O(B)
    ----------------------------------------------------
    */
    /*
    public static int maxSum(int[] arr, int B) {

        int n = arr.length; // Store array length

        int[] prefix = new int[B + 1]; // Store front sums
        int[] suffix = new int[B + 1]; // Store back sums

        // Build prefix sums
        for (int i = 1; i <= B; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1]; // Add element from front
        }

        // Build suffix sums
        for (int i = 1; i <= B; i++) {
            suffix[i] = suffix[i - 1] + arr[n - i]; // Add element from back
        }

        int ans = Integer.MIN_VALUE; // Store maximum sum

        // Try all combinations
        for (int i = 0; i <= B; i++) {

            int sum = prefix[i] + suffix[B - i]; // Combine front and back

            ans = Math.max(ans, sum); // Update maximum
        }

        return ans; // Return result
    }
    */



    /*
    ----------------------------------------------------
    Approach 3: Running Sum (Optimal)
    ----------------------------------------------------
    Idea:
    1. First take B elements from front.
    2. Then gradually remove one element from front
       and add one element from back.

    No extra arrays required.

    Time Complexity  : O(B)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    public static int maxSum(int[] arr, int B) {

        int n = arr.length; // Store array length

        int sum = 0; // Current sum

        // Take first B elements from front
        for (int i = 0; i < B; i++) {
            sum += arr[i];
        }

        int ans = sum; // Initialize answer

        // Swap front elements with back elements
        for (int i = 1; i <= B; i++) {

            sum -= arr[B - i]; // Remove element from front
            sum += arr[n - i]; // Add element from back

            ans = Math.max(ans, sum); // Update maximum
        }

        return ans; // Return result
    }



    /*
    ----------------------------------------------------
    Main Method
    ----------------------------------------------------
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object

        int n = sc.nextInt(); // Read size of array

        int[] arr = new int[n]; // Create array

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int B = sc.nextInt(); // Read B operations

        // Call methods
        int result = maxSum(arr, B);

        // Print results
        System.out.println(maxSum);
    }
}
