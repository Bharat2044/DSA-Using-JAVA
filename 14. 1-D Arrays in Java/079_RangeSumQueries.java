/*
Given an array of size n and q queries of the form s to e, return the sum of elements from index s to index e (inclusive).

Input:
arr = {-3, 6, 2, 4, 5, 2, 8, 9, 3, 1}
q = 4
  s = 1, e = 3
  s = 2, e = 7
  s = 4, e = 8
  s = 0, e = 2

Output:
12
12
9
5

Explanation:
For s = 1 to e = 3 → 6 + 2 + 4 = 12
For s = 2 to e = 7 → 2 + 4 + 5 + 2 + 8 + 9 = 12
For s = 4 to e = 8 → 5 + 2 + 8 + 9 + 3 = 9
For s = 0 to e = 2 → -3 + 6 + 2 = 5
*/



import java.util.*; // Import utility classes like Scanner

public class RangeSumQueries {

    /*
    ----------------------------------------------------
    Approach - 1: Brute Force (Direct Sum for Each Query)
    ----------------------------------------------------
    Time Complexity  : O(n * q)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    /*
    public static int rangeSum(int[] arr, int s, int e) {

        int sum = 0; // Variable to store the sum

        // Loop from index s to index e
        for (int i = s; i <= e; i++) {
            sum += arr[i]; // Add each element to sum
        }

        return sum; // Return final sum
    }
    */


    /*
    ----------------------------------------------------
    Approach - 2: Prefix Sum Array (Optimal)
    ----------------------------------------------------
    Time Complexity  : O(n + q)
    Space Complexity : O(n)
    ----------------------------------------------------
    */
    public static int rangeSum(int[] arr, int s, int e) {

        int n = arr.length; // Get size of the array

        // Create prefix array to store cumulative sums
        int[] prefix = new int[n];

        // Store first element as it is
        prefix[0] = arr[0];

        // Build prefix sum array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i]; // Add previous sum
        }

        // If query starts from index 0
        if (s == 0) {
            return prefix[e]; // Directly return prefix sum at e
        }

        // Otherwise subtract prefix sum before s
        return prefix[e] - prefix[s - 1];
    }


    /*
    ----------------------------------------------------
    main method
    ----------------------------------------------------
    */
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for size of array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt(); // Read array size

        // Create array of size n
        int[] arr = new int[n];

        // Ask user to enter array elements
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element
        }

        // Ask user for number of queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt(); // Read number of queries

        // Loop to process each query
        for (int i = 0; i < q; i++) {

            // Ask user for starting index
            System.out.print("Enter s: ");
            int s = sc.nextInt();

            // Ask user for ending index
            System.out.print("Enter e: ");
            int e = sc.nextInt();

            // Call rangeSum method to get sum
            int result = rangeSum(arr, s, e);

            // Print the result
            System.out.println(result);
        }
    }
}
