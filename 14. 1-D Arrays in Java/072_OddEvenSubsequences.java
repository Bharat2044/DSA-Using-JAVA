/*
 Odd Even Subsequences
 
Given an array of integers A of size, N. Find the longest subsequence of A, which is odd-even.
A subsequence is said to be odd-even in the following cases:
The first element of the subsequence is odd; the second element is even, the third element is odd, and so on. For example: [5, 10, 5, 2, 1, 4], [1, 2, 3, 4, 5]
The first element of the subsequence is even, the second element is odd, the third element is even, and so on. For example: [10, 5, 2, 1, 4, 7], [10, 1, 2, 3, 4]
Return the maximum possible length of odd-even subsequence.

Note: An array B is a subsequence of an array A if B can be obtained from A by deleting several (possibly, zero, or all) elements.


Input Format:
The only argument given is the integer array A.

Output Format:
Return the maximum possible length of odd-even subsequence.

Constraints:
1 <= N <= 100000
1 <= A[i] <= 10^9 

For Example:
Input 1:
    A = [1, 2, 2, 5, 6]
Output 1:
    4
    Explanation 1:
        Maximum length odd even subsequence is [1, 2, 5, 6]

Input 2:
    A = [2, 2, 2, 2, 2, 2]
Output 2:
    1
    Explanation 2:
        Maximum length odd even subsequence is [2]
*/


// Import Scanner class for taking input
import java.util.Scanner;

public class Main {

    /*
    // Function to find maximum length odd-even subsequence
    // 1st Approach: Brute Force Solution - Time Complexity = O(n), Space Complexity = O(1)
    public static int solve(int[] A) {
        int n = A.length; // Get size of array

        // Case 1: subsequence starting with odd
        int count1 = 0;               // To store length of subsequence for case 1
        boolean expectOdd = true;     // First element expected is odd

        // Iterate over the array
        for (int i = 0; i < n; i++) {
            // If expected is odd and current element is odd
            if (expectOdd && A[i] % 2 == 1) {
                count1++;             // Increment subsequence length
                expectOdd = false;    // Next expected element should be even
            }
            // If expected is even and current element is even
            else if (!expectOdd && A[i] % 2 == 0) {
                count1++;             // Increment subsequence length
                expectOdd = true;     // Next expected element should be odd
            }
        }

        // Case 2: subsequence starting with even
        int count2 = 0;               // To store length of subsequence for case 2
        boolean expectEven = true;    // First element expected is even

        // Iterate over the array
        for (int i = 0; i < n; i++) {
            // If expected is even and current element is even
            if (expectEven && A[i] % 2 == 0) {
                count2++;             // Increment subsequence length
                expectEven = false;   // Next expected element should be odd
            }
            // If expected is odd and current element is odd
            else if (!expectEven && A[i] % 2 == 1) {
                count2++;             // Increment subsequence length
                expectEven = true;    // Next expected element should be even
            }
        }

        // Return the maximum of the two subsequences
        return Math.max(count1, count2);
    }
    */
    
    
    // Function to find maximum length odd-even subsequence
    // 2nd Approach: Brute Force Solution - Time Complexity = O(n), Space Complexity = O(1)
    public static int solve(int[] A) {
        int n = A.length;

        // Initialize counters for both cases: starting with odd (ans1) and starting with even (ans2)
        int ans1 = 0, ans2 = 0;

        // Case 1: Start with odd (x = 1)
        int x = 1; // 1 indicates we expect an odd number

        // Case 2: Start with even (y = 0)
        int y = 0; // 0 indicates we expect an even number

        // Iterate over the array to calculate both subsequences
        for (int i = 0; i < n; i++) {
            int it = A[i] & 1; // Extract the least significant bit (1 if odd, 0 if even)

            // Case 1: Start with odd subsequence
            if (it == x) {
                ans1++; // Increment length of odd-even subsequence starting with odd
                x = 1 - x; // Flip the expected number for the next element (1 -> 0 or 0 -> 1)
            }

            // Case 2: Start with even subsequence
            if (it == y) {
                ans2++; // Increment length of odd-even subsequence starting with even
                y = 1 - y; // Flip the expected number for the next element (1 -> 0 or 0 -> 1)
            }
        }

        // Return the maximum length of both subsequences
        return Math.max(ans1, ans2);
    }

    // Main method to take input and call solve()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object for input

        int n = sc.nextInt();          // Read size of array
        int[] A = new int[n];          // Declare array of size n

        // Read n elements into array
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();       // Read element at index i
        }

        int result = solve(A);         // Call function to get result

        System.out.println(result);    // Print the result
    }
}

