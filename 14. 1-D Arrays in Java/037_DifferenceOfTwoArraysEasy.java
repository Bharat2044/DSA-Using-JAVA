/*
i/p: 
n = 3
arr1 = 5 6 2
arr2 = 1 3 4
o/p:  4 3 -2

------------------
  | 5 | 6 | 2
- | 1 | 3 | 4
------------------
    4   3   -2
*/
 

import java.util.Scanner;

public class DifferenceOfTwoArraysEasy {
  
    // Function to calculate the element-wise difference between two arrays of the same length
    // Time Complexity: O(n), where n is the length of the arrays
    // Space Complexity: O(n), for storing the result array
    public static int[] difference(int[] arr1, int[] arr2) {
      
        int n = arr1.length; // Assume both arrays are of the same length
        int[] result = new int[n]; // Initialize the result array
        
        // Iterate through each element and compute the difference
        for (int i = 0; i < n; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        
        return result; // Return the result array
    }
    
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        // Read the length of the arrays
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        
        // Read elements of the first array
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        
        int[] arr2 = new int[n];
        
        // Read elements of the second array
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        
        // Call the difference function to get the result array
        int[] result = difference(arr1, arr2);
        
        // Print the result array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        
        sc.close(); // Close the scanner to free resources
    }
}
