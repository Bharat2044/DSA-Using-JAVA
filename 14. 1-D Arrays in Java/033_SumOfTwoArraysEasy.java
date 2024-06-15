/*
i/p: 
n = 3
arr1 = 5 6 2
arr2 = 1 4 7
o/p:  6 10 9

------------------
  | 5 | 6 | 2
+ | 1 | 4 | 7
------------------
    4  10   9
*/


import java.util.Scanner;

public class SumOfTwoArraysEasy {
  
    // TC = O(n), SC = O(n)
    // Function to compute the sum of two arrays
    public static int[] sum(int[] arr1, int[] arr2) {
        int n = arr1.length; // Length of the arrays
        int[] result = new int[n]; // Initialize an array to store the sum
        
        // Compute element-wise sum of arr1 and arr2
        for(int i = 0; i < n; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        
        return result; // Return the resulting array
    }
    
    // Main method for input and output
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        // Input size of the arrays
        int n = sc.nextInt();
        
        // Initialize array arr1 and input its elements
        int[] arr1 = new int[n];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        
        // Initialize array arr2 and input its elements
        int[] arr2 = new int[n];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        
        // Compute the sum of arr1 and arr2 using the sum function
        int[] result = sum(arr1, arr2);
        
        // Print the resulting array
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        
        // Close the scanner object to prevent resource leak
        sc.close();
    }
}
