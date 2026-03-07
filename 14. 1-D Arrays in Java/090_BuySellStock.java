/*
Best Time to Buy and Sell Stocks I

Problem Description
Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
Return the maximum possible profit.

Problem Constraints
0 <= A.size() <= 700000
1 <= A[i] <= 10^7

Input Format
The first and the only argument is an array of integers, A.

Output Format
Return an integer, representing the maximum possible profit.

Example Input
Input 1:
A = [1, 2]
Input 2:
A = [1, 4, 5, 2, 4]

Example Output
Output 1:
1
Output 2:
4

Example Explanation
Explanation 1:
Buy the stock on day 0, and sell it on day 1.
Explanation 2:
Buy the stock on day 0, and sell it on day 2.
*/



import java.util.Scanner; // Import Scanner class to read input from user

public class Main {

    /*
    ----------------------------------------------------
    Approach 1: Brute Force (Two Loops)
    ----------------------------------------------------
    Idea:
    Try every possible pair of buy and sell days.

    For every day i:
        Buy on day i
        Sell on every later day j

    Calculate profit = price[j] - price[i]

    Time Complexity  : O(n²)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    /*
    public static int maxProfit(int[] arr) {

        int n = arr.length; // Store length of array

        int maxProfit = 0; // Variable to store maximum profit

        // Try buying on each day
        for (int i = 0; i < n; i++) {

            // Try selling on every later day
            for (int j = i + 1; j < n; j++) {

                int profit = arr[j] - arr[i]; // Calculate profit

                maxProfit = Math.max(maxProfit, profit); // Update maximum profit
            }
        }

        return maxProfit; // Return maximum profit
    }
    */


    /*
    ----------------------------------------------------
    Approach 2: Running Minimum (Optimal)
    ----------------------------------------------------
    Idea:
    Track the minimum price seen so far.

    Profit if sold today = currentPrice - minimumPrice

    Update maximum profit accordingly.

    Time Complexity  : O(n)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    public static int maxProfit(int[] arr) {

        int minPrice = Integer.MAX_VALUE; // Track lowest price so far

        int maxProfit = 0; // Track maximum profit

        // Traverse array
        for (int price : arr) {

            if (price < minPrice) { // If new minimum price found
                minPrice = price; // Update minimum price
            } else {
                int profit = price - minPrice; // Profit if sold today

                maxProfit = Math.max(maxProfit, profit); // Update maximum profit
            }
        }

        return maxProfit; // Return best profit
    }


    /*
    ----------------------------------------------------
    Main Method
    ----------------------------------------------------
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create scanner object

        int n = sc.nextInt(); // Read number of days

        int[] arr = new int[n]; // Create array to store stock prices

        // Read stock prices
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Store each price
        }

        // Call all methods
        int result = maxProfit(arr);

        // Print results
        System.out.println(result);
    }
}
