/*
i/p: 
n = 5
arr = 2 3 1 4 5
 
o/p:
* * * * *
* *   * *
  *   * *
      * *
        *
*/
 
 
import java.util.Scanner;

public class InvertedBarChart {
  
    // Function to find the maximum height in the array - TC = O(n), SC = O(1)
    public static int maxHeight(int[] arr) {
     
        int max = arr[0]; // Initialize max with the first element
        
        // Traverse the array to find the maximum value
        for (int i = 1; i < arr.length; i++) {
         
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger value is found
            }
        }
        
        return max; // Return the maximum height
    }

    // Function to print the inverted bar chart - TC = O(n * maxHeight), SC = O(1)
    public static void printInvertedBarChart(int[] arr) {
        int max = maxHeight(arr); // Get the maximum height
        
        // Loop from 1 to maximum height
        for (int ht = 1; ht <= max; ht++) {
            // Check each bar at the current height level
            for (int i = 0; i < arr.length; i++) {
             
                if (arr[i] >= ht) // If bar height is at least current height level
                    System.out.print("* "); // Print a star
                else
                    System.out.print("  "); // Otherwise, print spaces
            }
            
            System.out.println(); // Move to the next line after each height level
        }
    }

    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        // Read the number of bars in the bar chart
        int n = sc.nextInt();
        
        // Create an array to store the heights of the bars
        int[] arr = new int[n];
        
        // Populate the array with bar heights from user input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        printInvertedBarChart(arr); // Call function to print the inverted bar chart
        
        sc.close(); // Close the scanner to prevent resource leak
    }
}
