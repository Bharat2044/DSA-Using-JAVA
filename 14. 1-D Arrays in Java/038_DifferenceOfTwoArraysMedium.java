/*
i/p: 
n1 = 4
arr1 = 4 5 6 2
n2 = 3
arr2 = 9 3 4
o/p: 4 -4 3 -2

arr1 - arr2  &&  n1 != n2

------------------
  4 | 5 | 6 | 2
-   | 9 | 3 | 4
------------------
  4  -4   3  -2
*/


import java.util.Scanner;

public class DifferenceOfTwoArraysEasy {
  
    // Approach - 1: TC = O(max(n1, n2)), SC = O(max(n1, n2))
    // This approach calculates the difference by directly subtracting elements from both arrays.
    // It handles cases where the arrays are of different lengths by initializing the result array to the larger length,
    // and processing each array's elements starting from the end.
    /*
    public static int[] difference(int[] arr1, int[] arr2) {
      
        int n = Math.max(arr1.length, arr2.length); // Determine the length of the result array
        int[] result = new int[n]; // Initialize the result array
        
        int i = arr1.length - 1; // Pointer for arr1 starting from the end
        int j = arr2.length - 1; // Pointer for arr2 starting from the end
        int k = result.length - 1; // Pointer for result array starting from the end
        
        // Loop through both arrays from the end to the start
        while (i >= 0 && j >= 0) {
            result[k] = arr1[i] - arr2[j]; // Calculate the difference and store in the result array
            
            i--; // Move to the previous element in arr1
            j--; // Move to the previous element in arr2
            k--; // Move to the previous position in the result array
        }
        
        // If arr1 is longer, copy remaining elements to result
        while (i >= 0) {
            result[k] = arr1[i];
            i--;
            k--;
        }
        
        // If arr2 is longer, copy remaining elements to result
        while (j >= 0) {
            result[k] = arr2[j];
            j--;
            k--;
        }
        
        return result; // Return the result array containing differences
    }
    */
  
    
    // Approach - 2: TC = O(max(n1, n2)), SC = O(max(n1, n2))
    // This approach also handles arrays of different lengths by subtracting elements from both arrays,
    // but it first initializes the result array with elements from arr1 and then subtracts elements from arr2.
    public static int[] difference(int[] arr1, int[] arr2) {
      
        int n = Math.max(arr1.length, arr2.length); // Determine the length of the result array
        int[] result = new int[n]; // Initialize the result array
        
        int i = arr1.length - 1; // Pointer for arr1 starting from the end
        int j = arr2.length - 1; // Pointer for arr2 starting from the end
        int k = result.length - 1; // Pointer for result array starting from the end
        
        // Loop through both arrays from the end to the start
        while (k >= 0) {
            if (i >= 0) { // If there are elements left in arr1
                result[k] = arr1[i];
            }
            
            if (j >= 0) { // If there are elements left in arr2
                result[k] -= arr2[j];
            }
            
            i--; // Move to the previous element in arr1
            j--; // Move to the previous element in arr2
            k--; // Move to the previous position in the result array
        }
        
        return result; // Return the result array containing differences
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
        
        // Call the difference function to get the result array
        int[] result = difference(arr1, arr2);
        
        // Print the result array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        
        sc.close(); // Close the scanner to free resources
    }
}
