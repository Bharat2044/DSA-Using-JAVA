/*
Given an array of size n, find all equilibrium indices.

An index is called an equilibrium index if the sum of all elements to the left of that index is equal to the sum of all elements to the right of that index.

Input: arr[] = {1, 2, 3, 4, 8, 10}
Output: 4
Explanation:
For index 4 (value = 8):
Left side elements = {1, 2, 3, 4} → sum = 10
Right side elements = {10} → sum = 10
Since both sums are equal, index 4 is an equilibrium index.

Input: arr[] = {-7, 1, 5, 2, -4, 3, 0}
Output: 3, 6
Explanation:
For index 3 (value = 2):
Left side elements = {-7, 1, 5} → sum = -1
Right side elements = {-4, 3, 0} → sum = -1
Both sums are equal, so index 3 is an equilibrium index.

For index 6 (value = 0):
Left side elements = {-7, 1, 5, 2, -4, 3} → sum = 0
Right side elements = {} → sum = 0
Both sums are equal, so index 6 is also an equilibrium index
*/



import java.util.*; // Imports utility classes like Scanner

public class FindEquilibriumIndex {

    /*
    ----------------------------------------------------
    Approach - 1: Using 2 for loop - Brute Force
    ----------------------------------------------------
    For each index, calculate left sum and right sum
    separately and compare them.
    ----------------------------------------------------
    Time Complexity  : O(n^2)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    /*
    public static void equilibriumIndex(int[] arr) {

        int n = arr.length; // Get size of the array

        // Traverse each index of the array
        for (int i = 0; i < n; i++) {

            int leftSum = 0;   // Sum of elements on the left
            int rightSum = 0;  // Sum of elements on the right

            // Calculate sum of elements before index i
            for (int l = 0; l < i; l++) {
                leftSum += arr[l];
            }

            // Calculate sum of elements after index i
            for (int r = i + 1; r < n; r++) {
                rightSum += arr[r];
            }

            // If left sum and right sum are equal
            if (leftSum == rightSum) {
                System.out.println(i); // Print equilibrium index
            }
        }
    }
    */


    /*
    ----------------------------------------------------
    Approach - 2: Using Prefix sum and postfix sum
    ----------------------------------------------------
    Time Complexity  : O(n)
    Space Complexity : O(n)
    ----------------------------------------------------
    */
    /*
    public static void equilibriumIndex(int[] arr) {

        int n = arr.length; // Get array size

        int[] preSum = new int[n];   // Prefix sum array
        int[] postSum = new int[n];  // Postfix sum array

        // Build prefix sum array
        preSum[0] = arr[0]; // First prefix sum is first element
        for (int i = 1; i < n; i++) {
            preSum[i] = preSum[i - 1] + arr[i];
        }

        // Build postfix sum array
        postSum[n - 1] = arr[n - 1]; // Last postfix sum is last element
        for (int i = n - 2; i >= 0; i--) {
            postSum[i] = postSum[i + 1] + arr[i];
        }

        // Traverse each index
        for (int i = 0; i < n; i++) {

            int leftSum = 0;   // Sum of elements before index i
            int rightSum = 0;  // Sum of elements after index i

            // If index is not 0, take prefix sum
            if (i > 0) {
                leftSum = preSum[i - 1];
            }

            // If index is not last, take postfix sum
            if (i < n - 1) {
                rightSum = postSum[i + 1];
            }

            // Check equilibrium condition
            if (leftSum == rightSum) {
                System.out.println(i); // Print equilibrium index
            }
        }
    }
    */


    /*
    ----------------------------------------------------
    Approach - 3: Using Prefix sum
    ----------------------------------------------------
    Time Complexity  : O(n)
    Space Complexity : O(n)
    ----------------------------------------------------
    */
    /*
    public static void equilibriumIndex(int[] arr) {

        int n = arr.length; // Get array size

        int[] preSum = new int[n]; // Prefix sum array

        // Build prefix sum array
        preSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            preSum[i] = preSum[i - 1] + arr[i];
        }

        int leftSum = 0;   // Sum of elements before index i
        int rightSum = 0;  // Sum of elements after index i

        // Traverse each index
        for (int i = 0; i < n; i++) {

            // Calculate left sum
            if (i > 0) {
                leftSum = preSum[i - 1];
            }

            // Calculate right sum using total sum
            rightSum = preSum[n - 1] - preSum[i];

            // Check equilibrium condition
            if (leftSum == rightSum) {
                System.out.println(i); // Print equilibrium index
            }
        }
    }
    */


    /*
    ----------------------------------------------------
    Approach - 4: Optimal
    ----------------------------------------------------
    Time Complexity  : O(n)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    public static void equilibriumIndex(int[] arr) {

        int n = arr.length; // Get array size

        int totalSum = 0; // Variable to store total sum

        // Calculate total sum of array
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;   // Sum of elements before index i
        int rightSum = 0;  // Sum of elements after index i

        // Traverse array
        for (int i = 0; i < n; i++) {

            // Calculate right sum
            rightSum = totalSum - leftSum - arr[i];

            // Check equilibrium condition
            if (leftSum == rightSum) {
                System.out.println(i); // Print equilibrium index
            }

            // Add current element to left sum
            leftSum += arr[i];
        }
    }


    /*
    ----------------------------------------------------
    main method
    ----------------------------------------------------
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner for input

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt(); // Read array size

        int[] arr = new int[n]; // Create array

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read elements
        }

        // Call equilibrium index method
        equilibriumIndex(arr);
    }
}
