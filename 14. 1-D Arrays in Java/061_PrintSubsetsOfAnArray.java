/*
i/p: 
n = 3
arr = 10 20 30
o/p: 
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30
*/


import java.util.Scanner; // Import the Scanner class for user input

public class PrintSubsetsOfAnArray {
    
    // Method to print all subsets of the array
    // Time Complexity (TC): O(n * 2^n), Space Complexity (SC): O(n)
    public static void printSubArrays(int[] arr) {
        int n = arr.length; // Get the length of the array
        
        int limit = (1 << n); // Calculate 2^n for total subsets
        
        // Loop over all possible subsets
        for (int i = 0; i < limit; i++) {
            int dec = i; // Decimal representation of the subset
            
            String ans = ""; // String to store the current subset
            
            // Loop over each element in the array - Binary of the `dec` and if the remainder is 0 then don't print else print
            for (int j = 0; j < n; j++) {
                int rem = dec % 2; // Get the last bit (0 or 1)
                dec >>= 1; // Right shift to process the next bit
                
                // If bit is 0, add '-' to the subset, else add the element to the subset
                if (rem == 0) {
                    ans = "-\t" + ans;
                } else {
                    ans = arr[n - 1 - j] + "\t" + ans;
                }
            }
            
            // Print the current subset
            System.out.println(ans);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        
        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n]; // Initialize the array with the given size
        
        // Read the elements of the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Print all subsets of the input array
        printSubArrays(arr);
        
        sc.close(); // Close the scanner to free resources
    }
}
