/*
Count ways to make sum of odd and even indexed elements equal by removing an array element

Problem Description
Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

Problem Constraints
1 <= N <= 10^5
-10^5 <= A[i] <= 10^5
Sum of all elements of A <= 10^9

Input Format
First argument contains an array A of integers of size N

Output Format
Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

Example Input
Input 1:
A = [2, 1, 6, 4]
Input 2:
A = [1, 1, 1]

Example Output
Output 1:
1
Output 2:
3

Example Explanation
Explanation 1:
Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1]. 
Therefore, the required output is 1. 

Explanation 2:
Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Therefore, the required output is 3.
*/



import java.util.Scanner; // Import Scanner class to read input from user

public class CountSpecialIndex { 

    /*
    ----------------------------------------------------
    Approach 1: Brute Force (Two Loops)
    ----------------------------------------------------
    Idea:
    Remove each element and recalculate even/odd sums.

    Time Complexity  : O(n^2)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    /*
    public static int specialIndex(int[] arr) { // Method to count special indices using brute force

        int n = arr.length; // Store length of the array
        int count = 0; // Variable to count number of special indices

        // Try removing every index one by one
        for (int i = 0; i < n; i++) {

            int evenSum = 0; // Sum of elements at even positions after removal
            int oddSum = 0;  // Sum of elements at odd positions after removal
            int newIndex = 0; // Tracks new index after removing element

            // Traverse the array again
            for (int j = 0; j < n; j++) {

                // Skip the removed element
                if (j == i) continue;

                // Check parity of new index
                if (newIndex % 2 == 0)
                    evenSum += arr[j]; // Add element to even sum
                else
                    oddSum += arr[j]; // Add element to odd sum

                newIndex++; // Increase new index for shifted array
            }

            // If even and odd sums are equal, it is a special index
            if (evenSum == oddSum)
                count++; // Increase count
        }

        return count; // Return total special indices
    }
    */


    /*
    ----------------------------------------------------
    Approach 2: Prefix Sum Arrays
    ----------------------------------------------------
    Idea:
    Precompute prefix sums for even and odd indices.

    When removing index i:
    Left side parity stays same
    Right side parity flips.

    Time Complexity  : O(n)
    Space Complexity : O(n)
    ----------------------------------------------------
    */
    /*
    public static int specialIndexPrefix(int[] arr) { // Method using prefix sums

        int n = arr.length; // Store array length

        int[] evenPrefix = new int[n]; // Prefix array storing sum of even index elements
        int[] oddPrefix = new int[n];  // Prefix array storing sum of odd index elements

        evenPrefix[0] = arr[0]; // First element belongs to even index
        oddPrefix[0] = 0; // No odd index element at position 0

        // Build prefix arrays
        for (int i = 1; i < n; i++) {

            if (i % 2 == 0) { // If index is even
                evenPrefix[i] = evenPrefix[i - 1] + arr[i]; // Add current element to even sum
                oddPrefix[i] = oddPrefix[i - 1]; // Odd prefix stays same
            } else { // If index is odd
                oddPrefix[i] = oddPrefix[i - 1] + arr[i]; // Add element to odd sum
                evenPrefix[i] = evenPrefix[i - 1]; // Even prefix remains same
            }
        }

        int count = 0; // Count of special indices

        // Check each index for special condition
        for (int i = 0; i < n; i++) {

            int evenSum = oddPrefix[n - 1] - oddPrefix[i]; // Even sum after parity flip
            int oddSum = evenPrefix[n - 1] - evenPrefix[i]; // Odd sum after parity flip

            // Add left side sums if index is not 0
            if (i != 0) {
                evenSum += evenPrefix[i - 1]; // Add even elements from left side
                oddSum += oddPrefix[i - 1]; // Add odd elements from left side
            }

            // Check if sums are equal
            if (evenSum == oddSum)
                count++; // Increment count
        }

        return count; // Return number of special indices
    }
    */


    /*
    ----------------------------------------------------
    Approach 3: Running Sum (Optimal Space)
    ----------------------------------------------------
    Idea:
    Instead of prefix arrays, keep track of
    total even/odd sums and update running left sums.

    Time Complexity  : O(n)
    Space Complexity : O(1)
    ----------------------------------------------------
    */

    public static int specialIndex(int[] arr) { // Optimal solution using running sums

        int n = arr.length; // Store array length

        int totalEvenSum = 0; // Total sum of elements at even indices
        int totalOddSum = 0; // Total sum of elements at odd indices

        // Calculate total even and odd sums
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0)
                totalEvenSum += arr[i]; // Add element to even sum
            else
                totalOddSum += arr[i]; // Add element to odd sum
        }

        int count = 0; // Count special indices
        int evenLeft = 0; // Sum of even indices to the left
        int oddLeft = 0; // Sum of odd indices to the left

        // Traverse array to check each index
        for (int i = 0; i < n; i++) {

            int evenRight; // Sum of even elements on right
            int oddRight; // Sum of odd elements on right

            if (i % 2 == 0) { // If index is even
                evenRight = totalEvenSum - evenLeft - arr[i]; // Remove current element from even total
                oddRight = totalOddSum - oddLeft; // Odd right stays same
            } else { // If index is odd
                oddRight = totalOddSum - oddLeft - arr[i]; // Remove current element from odd total
                evenRight = totalEvenSum - evenLeft; // Even right remains same
            }

            int evenSum = evenLeft + oddRight; // Even sum after removal
            int oddSum = oddLeft + evenRight; // Odd sum after removal

            if (evenSum == oddSum) // Check special index condition
                count++; // Increase count

            if (i % 2 == 0)
                evenLeft += arr[i]; // Update even left sum
            else
                oddLeft += arr[i]; // Update odd left sum
        }

        return count; // Return total special indices
    }



    /*
    ----------------------------------------------------
    Main Method
    ----------------------------------------------------
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        int n = sc.nextInt(); // Read size of array

        int[] arr = new int[n]; // Create array of size n

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Store elements into array
        }


        // Call the method
        int result1 = specialIndex(arr);

        System.out.println(result);
    }
}
