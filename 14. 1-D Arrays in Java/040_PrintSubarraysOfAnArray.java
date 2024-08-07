/*
i/p: 
n = 3
arr = 10 20 30
o/p: 
10	
10  20	
10	20	30	
20	
20	30	
30	
*/


import java.util.Scanner;

public class PrintSubarraysOfAnArray {
    
    // Method to print all subarrays of the given array
    /*
    // 1st Approach - Time Complexity = O(n^3), Space Complexity = O(1)
    public static void printSubarrays(int[] arr) {
        
        // Iterate over all starting points of subarrays
        for(int i = 0; i < arr.length; i++) {
            // Iterate over all ending points of subarrays starting from i
            for(int j = i; j < arr.length; j++) {
                
                // Print elements from the current subarray arr[i..j]
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "  ");
                }
                
                // Move to the next line after printing a subarray
                System.out.println();
            }
        }
    }
    */
    
    // 2nd Approach: Time Complexity O(n^2), Space Complexity = O(1)
    public static void printSubarrays(int[] arr) {
        int n = arr.length;
        
        // Iterate over all starting points of subarrays
        for(int i = 0; i < n; i++) {
            // Initialize an empty string to store subarray elements
            String subarray = "";
            
            // Iterate over all ending points of subarrays starting from i
            for(int j = i; j < n; j++) {
                // Add the current element to the subarray
                subarray += arr[j] + " ";
                
                // Print the current subarray
                System.out.println(subarray.trim());
            }
        }
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read the elements of the array
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Print all subarrays of the input array
        printSubarrays(arr);
        
        sc.close(); // Close the scanner to free resources
    }
}
