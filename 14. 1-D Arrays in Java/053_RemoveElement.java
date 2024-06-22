/*
Problem Description:
Write a program to input N numbers array from user and an integer X and print the array by deleting element at specified position X.

Problem Constraints:
1 <= N <= 100
1 <= A[i] <= 1000
1 <= X <= N

Input Format:
First line is N which means number of elements.
Second line contains N space separated integers.
Third line is X position which has to be deleted.

Output Format:
N-1 space separated integers of the input array after deleting the element at required position.

Example Input:
5
2 3 1 4 2
3

Example Output:
2 3 4 2

Example Explanation:
Clearly after removing A[3] = 1, remaining array is 2 3 4 2.
*/



import java.util.Scanner;

public class RemoveElement {

    /**
     * Removes the element at position x in the array arr.
     * 
     * @param arr The input array of integers.
     * @param x The 1-based position of the element to be removed.
     * @return A new array with the element at position x removed.
     *
     * Time Complexity: O(n), where n is the length of the input array.
     * Space Complexity: O(n), for storing the new array with the element removed.
     */
    public static int[] removeElement(int[] arr, int x) {
        // Initialize a new array with size one less than the input array
        int[] ans = new int[arr.length - 1];
        
        // Copy elements up to position x-1 from the original array to the new array
        for (int i = 0; i < x - 1; i++) {
            ans[i] = arr[i];
        }
        
        // Copy the remaining elements from the original array to the new array
        for (int i = x; i < arr.length; i++) {
            ans[i - 1] = arr[i];
        }
        
        return ans;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements in the array
        int n = sc.nextInt();
        
        // Initialize the array with the given number of elements
        int[] arr = new int[n];
        
        // Read each element of the array from the input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Read the position of the element to be removed
        int x = sc.nextInt();
        
        // Call removeElement to get the new array with the element removed
        int[] ans = removeElement(arr, x);
        
        // Print the new array
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        
        // Close the Scanner object
        sc.close();
    }
}
