/*
i/p: 
n1 = 4
arr1 = 4 5 6 2
n2 = 3
arr2 = 9 3 4
o/p: 2 -4 3 -2

n1 != n2   &&   arr1 - arr2

------------------
  4 | 5 | 6 | 2
-   | 9 | 3 | 4
------------------
   3  6   2   8
*/


import java.util.Scanner;

public class DifferenceOfTwoArraysHard {
    
    // Method to calculate the difference between two arrays
    // Time Complexity = O(max(n1, n2)), Space Complexity = O(max(n1, n2))
    public static int[] difference(int[] arr1, int[] arr2) {
        // Determine the length of the result array
        int n = Math.max(arr1.length, arr2.length);
        int[] result = new int[n];
        
        int i = arr1.length - 1; // Pointer for arr1 starting from the end
        int j = arr2.length - 1; // Pointer for arr2 starting from the end
        int k = result.length - 1; // Pointer for the result array starting from the end
        
        int borrow = 0; // Initialize borrow
        
        // Loop through both arrays from end to start
        while (k >= 0) {
            int d = 0; // Initialize digit difference
            
            // Subtract the borrow and element from arr1 if available
            if (i >= 0) {
                d = arr1[i] - borrow;
            }
            
            // Subtract the element from arr2 if available
            if (j >= 0) {
                d = d - arr2[j];
                
                // Additional borrow adjustment if arr2 is longer than arr1
                if (arr2.length > arr1.length) {
                    d = d - borrow;
                }
            }
            
            // Adjust borrow and normalize the digit
            if (d < 0) {
                borrow = 1;
                d = d + 10;
            } else {
                borrow = 0;
            }
            
            // Store the digit difference in the result array
            result[k] = d;
            
            i--; // Move to the previous element in arr1
            j--; // Move to the previous element in arr2
            k--; // Move to the previous position in the result array
        }
        
        // Handle the sign of the result if arr2 is larger than arr1 or they are equal but arr1[0] <= arr2[0]
        if ((arr2.length > arr1.length) || ((arr1.length == arr2.length) && (arr1[0] <= arr2[0]))) {
            result[0] = -result[0];
        }
        
        return result;
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        // Read the length of the first array
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        
        // Read elements of the first array
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        
        // Read the length of the second array
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        
        // Read elements of the second array
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        
        // Call the difference method to get the result array
        int[] result = difference(arr1, arr2);
        
        // Skip leading zeroes in the result
        int idx = 0;
        while (idx < result.length && result[idx] == 0) {
            idx++;
        }
        
        // Print the result array
        for (int i = idx; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        
        sc.close(); // Close the scanner to free resources
    }
}
