/*
Q. Inverse of an Array

Problem Description:
You are given an integer array A of size N. The array contains all integers
from 0 to N−1 exactly once (i.e., all elements are distinct).
Your task is to find the inverse of the given array.

The inverse of an array is defined as an array inv such that:
inv[A[i]] = i for every index i.

In other words, the index of each element in the original array becomes
the value at that element’s position in the inverse array.

Example:
If A = [2, 0, 1]
- Element 2 is at index 0 → inv[2] = 0
- Element 0 is at index 1 → inv[0] = 1
- Element 1 is at index 2 → inv[1] = 2

So, the inverse array is: [1, 2, 0]

Problem Constraints:
1 ≤ N ≤ 10^5
0 ≤ A[i] < N
All elements of A are distinct.

Input Format:
The first line contains an integer N representing the size of the array.
The second line contains N space-separated integers representing the array A.

Output Format:
Print the inverse of the given array.

Example Input:
Input 1:
3
2 0 1
Input 2:
4
3 1 0 2

Example Output:
Output 1:
1 2 0
Output 2:
2 1 3 0

Explanation:
For Input 1:
Index of 0 is 1, index of 1 is 2, and index of 2 is 0.
For Input 2:
Index of 0 is 2, index of 1 is 1, index of 2 is 3, and index of 3 is 0.
*/



import java.util.Scanner;   // Import Scanner class for taking input from user

public class Main {  

    // Method to find and print the inverse of the array
    // Time Cmmplextity = O(n), Space Complexity = O(n)
    public static void InverseOfTheArray(int[] arr) {

        int n = arr.length;     // Store length of the input array

        int[] ans = new int[n]; // Create an array to store the inverse result

        // Loop through the original array
        for (int i = 0; i < n; i++) {
            int val = arr[i];   // Get value at index i
            ans[val] = i;       // Place index i at position 'val' in inverse array
        }

        // Print the inverse array
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " "); // Print each element followed by space
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        int n = sc.nextInt();   // Read size of the array

        int[] arr = new int[n]; // Declare array of size n

        // Loop to take array elements as input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Store each input value in array
        }

        inverseOfArray(arr);   // Call method to find inverse of array
    }
}
