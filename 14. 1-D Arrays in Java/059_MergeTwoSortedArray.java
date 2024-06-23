/*
Problem Description:
You are given an integer T (Number of test cases). For each test case, You are given two sorted arrays A and B.
You have to merge the given arrays into a single sorted array.

Problem Constraints:
1 <= T <= 10
1 <= n1, n2 <= 10^5
-10^9 <= A[i], B[i] <= 10^9

Input Format:
First line of the input contains a single integer T.
Next, each of the test case consists of 4 lines:
First line consists integer is an integer n1 denoting the length of array A
Second line consists of n1 elements of array A
Third line consists integer is an integer n2 denoting the length of array B
Fourth line consists of n2 elements of array B

Output Format:
For each test case, return a sorted integer array having length n1 + n2.

Example Input:
Input 1:
 1 
 3  
 -1 2 4 
 5  
 -1 -1 1 3 5
Input 2:
 1 
 1  
 1 
 4  
 2 3 4 5 

Example Output:
Output 1:
 -1 -1 -1 1 2 3 4 5
Output 2:
 1 2 3 4 5

Example Explanation:
Explanation 1:
 Each element in Sorted array [-1, -1, -1, 1, 2, 3, 4, 5] comes either from A or B.
Explanation 2:
 Each element in Sorted array [1, 2, 3, 4, 5] comes either from A or B.
*/




import java.util.Scanner;

public class MergeTwoSortedArrays {

    /*
     * Merge two sorted arrays into a single sorted array
     * Time Complexity: O(n1 + n2)
     * - We traverse both arrays once, which means the number of operations is proportional to the sum of the lengths of the arrays.
     * Space Complexity: O(n1 + n2)
     * - We create a new array to hold the merged result, which requires space proportional to the sum of the lengths of the input arrays.
     */
    public static int[] mergeArrays(int[] arr, int[] brr) {
        int n1 = arr.length; // Length of array arr
        int n2 = brr.length; // Length of array brr
        
        int[] mergedArray = new int[n1 + n2]; // Array to hold the merged result

        int i = 0, j = 0, k = 0; // Initialize pointers for arrays arr, brr, and mergedArray

        // Merge arrays arr and brr
        while (i < n1 && j < n2) { // Continue until we reach the end of one array
            if (arr[i] <= brr[j]) { // Compare elements from both arrays
                mergedArray[k++] = arr[i++]; // Add smaller element to mergedArray and increment pointers
            } else {
                mergedArray[k++] = brr[j++]; // Add smaller element to mergedArray and increment pointers
            }
        }

        // Copy remaining elements of arr, if any
        while (i < n1) {
            mergedArray[k++] = arr[i++]; // Add remaining elements of arr to mergedArray
        }

        // Copy remaining elements of brr, if any
        while (j < n2) {
            mergedArray[k++] = brr[j++]; // Add remaining elements of brr to mergedArray
        }

        return mergedArray; // Return the merged array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        // Read the number of test cases
        int t = sc.nextInt(); // Read number of test cases

        // Iterate through each test case
        for (int x = 0; x < t; x++) { 
            // Read the size of array arr
            int n1 = sc.nextInt(); 
            
            // Create array arr
            int[] arr = new int[n1]; 

            // Read elements of array arr
            for (int i = 0; i < n1; i++) {
                arr[i] = sc.nextInt(); // Read each element of array arr
            }

            // Read the size of array brr
            int n2 = sc.nextInt(); 
            
            // Create array brr
            int[] brr = new int[n2]; 

            // Read elements of array brr
            for (int j = 0; j < n2; j++) {
                brr[j] = sc.nextInt(); // Read each element of array brr
            }

            // Merge arrays arr and brr
            int[] mergedArray = mergeArrays(arr, brr); // Call mergeArrays method to merge arr and brr

            // Print the merged array
            for (int i = 0; i < mergedArray.length; i++) {
                System.out.print(mergedArray[i] + " "); // Print each element of mergedArray
            }
            System.out.println(); 
        }
    }
}
