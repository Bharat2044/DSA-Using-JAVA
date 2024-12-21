/*
Problem Description:
Write a program to input N numbers array, a number X and a number Y from user and insert an element Y in it at specified position X. X is based on 1-based indexing.

Note: When an element is inserted at position X, all elements that were already present at position >= X, gets shifted to one position right, not replaced.

Problem Constraints:
1 <= N <= 100
1 <= A[i] <= 1000
1 <= X <= N
1 <= Y <= 1000

Input Format:
First line is N which represents number of elements.
Second line contains N space separated integers.
Third line is X position where Y has to be inserted.
Fourth line is Y which is the value to be inserted.

Output Format:
N+1 space separated integers of the input array after inserting the element at required position.

Example Input:
Input 1:
5
2 8 1 4 2
3
5

Example Output:
Output 1:
2 8 5 1 4 2

Example Explanation:
Explanation 1:
Clearly after inserting 5 at 3rd position, new array is 2 8 5 1 4 2.
*/



import java.util.Scanner;

public class InsertElement {

    /**
     * Inserts the element y at position x in the array arr.
     * 
     * @param arr The input array of integers.
     * @param x The 1-based position where the element y needs to be inserted.
     * @param y The element to be inserted.
     * @return A new array with the element y inserted at position x.
     *
     * Time Complexity: O(n), where n is the length of the input array.
     * Space Complexity: O(n), for storing the new array with the inserted element.
     */
    public static int[] insertElement(int[] arr, int x, int y) {
        
        // Initialize a new array with size one more than the input array
        int[] ans = new int[arr.length + 1];
        
        // Copy elements up to position x-1 from the original array to the new array
        for (int i = 0; i < x - 1; i++) {
            ans[i] = arr[i];
        }
        
        // Insert the new element at position x-1
        ans[x - 1] = y;
        
        // Copy the remaining elements from the original array to the new array
        for (int i = x; i <= arr.length; i++) {
            ans[i] = arr[i - 1];
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
        
        // Read the position where the new element should be inserted
        int x = sc.nextInt();
        
        // Read the element to be inserted
        int y = sc.nextInt();
        
        // Call insertElement to get the new array with the element inserted
        int[] ans = insertElement(arr, x, y);
        
        // Print the new array
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        
        // Close the Scanner object
        sc.close();
    }
}
