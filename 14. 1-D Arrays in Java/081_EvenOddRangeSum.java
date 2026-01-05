/*
Given an array of size n and Q queries. Each queries can be two types:
If type 1: Find the sum of elements present at even indices between index s and e (inclusive).
If type 2: Find the sum of elements present at odd indices between index s and e (inclusive).

Input
arr = {2, 3, 1, -1, 0, 8, 5, 4}
q = 2
  s = 3, e = 6, type = 1
  s = 1, e = 5, type = 2

Output
5
10
*/



import java.util.*; // Imports utility classes like Scanner

public class EvenOddRangeSum {

    /*
    ----------------------------------------------------
    Approach 1: Brute Force
    ----------------------------------------------------
    For each query, traverse from index s to e
    and calculate the sum based on index parity.
    ----------------------------------------------------
    Time Complexity  : O(q * n)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    /*
    public static int rangeIndexSum(int[] arr, int s, int e, int type) {

        int sum = 0; // To store sum for current query

        // Traverse from start index to end index
        for (int i = s; i <= e; i++) {

            // If query type is 1 and index is even
            if (type == 1 && i % 2 == 0) {
                sum += arr[i];
            }

            // If query type is 2 and index is odd
            if (type == 2 && i % 2 != 0) {
                sum += arr[i];
            }
        }

        return sum; // Return computed sum
    }
    */

    /*
    ----------------------------------------------------
    Approach 2: Better Solution - Using Prefix Sum
    ----------------------------------------------------
    Precompute prefix sums for even and odd indices
    to answer each query in O(1) time.
    ----------------------------------------------------
    Time Complexity  : O(n + q)
    Space Complexity : O(n)
    ----------------------------------------------------
    */
    public static int rangeIndexSum(int[] arr, int s, int e, int type) {

        int n = arr.length; // Size of array

        // Prefix sum for even indices
        int[] pfEven = new int[n];

        // Prefix sum for odd indices
        int[] pfOdd = new int[n];

        // Initialization for index 0
        pfEven[0] = arr[0]; // Index 0 is even
        pfOdd[0] = 0;       // No odd index at 0

        // Build prefix sum arrays
        for (int i = 1; i < n; i++) {

            // If index is even
            if (i % 2 == 0) {
                pfEven[i] = pfEven[i - 1] + arr[i];
                pfOdd[i] = pfOdd[i - 1];
            }
            // If index is odd
            else {
                pfOdd[i] = pfOdd[i - 1] + arr[i];
                pfEven[i] = pfEven[i - 1];
            }
        }

        // Query for even indices
        if (type == 1) {
            if (s != 0) {
                return pfEven[e] - pfEven[s - 1];
            } else {
                return pfEven[e];
            }
        }

        // Query for odd indices
        else if (type == 2) {
            if (s != 0) {
                return pfOdd[e] - pfOdd[s - 1];
            } else {
                return pfOdd[e];
            }
        }

        return -1; // Invalid query type
    }
  

    /*
    ----------------------------------------------------
    main method
    ----------------------------------------------------
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner for input

        // Read array size
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Declare array

        // Read array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read number of queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        System.out.println("Enter queries (s e type):");

        // Process each query
        for (int i = 0; i < q; i++) {

            int s = sc.nextInt();    // Start index
            int e = sc.nextInt();    // End index
            int type = sc.nextInt(); // Query type

            // Call the rangeIndexSum method and store the result in a result variable
            int result = rangeIndexSum(arr, s, e, type);

            // Print result
            System.out.println(result);
        }
    }
}
