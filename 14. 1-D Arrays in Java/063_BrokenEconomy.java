/*
Broken Economy
In a country with a novice government, the economic system uses coins with various denominations. 
Foreign visitors use a money exchanger to get local currency. The exchanger provides the nearest maximum and minimum 
denominations if the exact one isn't guessed. Denominations are in ascending order.

Examples
Example 1:
Given denominations: [5, 10, 15, 22, 33, 40, 42, 55]
Foreign request: 25 
Response: Denominations 33 and 22 are available.

Example 2: 
Given denominations: [7, 14, 18, 25, 30]
Foreign request: 18
Response: Denomination 18 is available.

Requirements
1. Input a number n for the size of array a.
2. Input n numbers for array a.
3. Input another number d.
4. Print the ceiling and floor of d in array a.
*/


import java.util.Scanner;

public class BrokenEconomy {
  
    // TC = O(log(n)), SC = O(1)
    public static void brokenEconomy(int[] arr, int data) {
      
        // Initialize pointers for binary search
        int left = 0, right = arr.length - 1; 
        
        // Variables to store floor and ceiling values
        int floor = -1, ceil = -1; 

        // Perform binary search to find floor and ceiling
        while (left <= right) {
          
            int mid = (left + right) / 2; // Calculate middle index
            
            // Check if mid element is equal to the target data
            if (arr[mid] == data) {
                floor = arr[mid];
                ceil = arr[mid];
              
                break; // Exit loop if exact match is found
            } else if (arr[mid] > data) {
                right = mid - 1; // Search in the left half
                ceil = arr[mid]; // Update ceiling
            } else {
                left = mid + 1; // Search in the right half
                floor = arr[mid]; // Update floor
            }
        }
        
        // Output the ceiling and floor
        System.out.println(ceil + "  " + floor);
    }
    
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in); 
        
        // Input the size of the array
        int n = sc.nextInt(); // Read array size
        int[] arr = new int[n]; // Initialize the array
        
        // Input elements of the array in sorted order
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Read each element
        }
        
        // Input the target data value
        int data = sc.nextInt(); 
        
        // Call the function to find floor and ceiling
        brokenEconomy(arr, data); 
        
        sc.close(); // Close the scanner
    }
}
