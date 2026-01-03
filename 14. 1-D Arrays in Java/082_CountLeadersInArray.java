/*
Leaders in an Array

Given an array of size n, your task is to count the number of leaders in the array.

An element is called a leader if it is strictly greater than all the elements to its right.
The rightmost element of the array is always considered a leader because there are no elements to its right.

Example 1
Input: arr[] = {15, -1, 7, 2, 5, 4, 2, 3}
Output: 5

Input: arr[] = {16, 17, 4, 3, 5, 2}
Output: 3

Input: arr[] = {5, 4, 3, 2, 1}
Output: 5
*/



import java.util.*; // Imports all utility classes like Scanner, Stack, etc.

public class CountLeadersInArray { 

    /*
    ----------------------------------------------------
    Approach 1: Using two loops (Brute Force)
    ----------------------------------------------------
    Time Complexity  : O(n^2)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    /*
    public static int leadersCount(int[] arr) { // Method to count leaders using brute force

        int n = arr.length; // Store the size of the array
        int count = 0; // Variable to count leaders

        // Loop through each element of the array
        for (int i = 0; i < n; i++) {

            boolean isLeader = true; // Assume current element is a leader

            // Check all elements to the right of current element
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) { // If any right element is greater or equal
                    isLeader = false; // Current element is not a leader
                    break; // Exit inner loop
                }
            }

            // If current element is a leader
            if (isLeader) {
                count++; // Increase leader count
            }
        }

        return count; // Return total leaders
    }
    */

    /*
    ----------------------------------------------------
    Approach 2: Using Stack (Better Approach)
    ----------------------------------------------------
    Time Complexity  : O(n)
    Space Complexity : O(n)
    ----------------------------------------------------
    */
    /*
    public static int leadersCount(int[] arr) { // Method to count leaders using stack
        Stack<Integer> stack = new Stack<>(); // Stack to store leader elements

        // Traverse array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {

            // Push element if stack is empty or current element is greater than top
            if (stack.isEmpty() || arr[i] > stack.peek()) {
                stack.push(arr[i]); // Push leader into stack
            }
        }

        return stack.size(); // Number of leaders is stack size
    }
    */


    /*
    ----------------------------------------------------
    Approach 3: Using 1 for loop - Traverse from Right (Optimal Approach)
    ----------------------------------------------------
    Time Complexity  : O(n)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    public static int leadersCount(int[] arr) { 

        int n = arr.length; // Store array length
        int max = arr[n - 1]; // Last element is always a leader, initialize max

        int count = 1; // Count starts from 1 because last element is a leader

        // Traverse array from second last element to first
        for (int i = n - 2; i >= 0; i--) {

            // If current element is greater than max element on right
            if (arr[i] > max) {
                count++; // Increase leader count
                max = arr[i]; // Update max to current element
            }
        }

        return count; // Return total number of leaders
    }


    /*
    ----------------------------------------------------
    main method
    ----------------------------------------------------
    */
    public static void main(String[] args) { // Program execution starts here

        Scanner sc = new Scanner(System.in); // Scanner object for user input

        // Read array size from user
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt(); // Store array size

        int[] arr = new int[n]; // Declare array of size n

        // Read array elements from user
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Store each element in array
        }

        int result = leadersCount(arr); // Call method to count leaders

        // Print the result
        System.out.println("Number of leaders: " + result);
    }
}
