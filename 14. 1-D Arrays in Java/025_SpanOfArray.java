/*
Span of Array -> pan is defined as difference of maximum value and minimum value.
i/p: 
n = 5
arr = 5 12 6 7 4
o/p: 8 
Explanation: max = 12, min = 4 => 12 - 4 = 8
*/

 
import java.util.Scanner;

public class SpanOfArray {
    // Method to get the largest element in the array
    // Time Complexity (TC) = O(n), Space Complexity (SC) = O(1)
    public static int getLargestElement(int[] arr) {
        int max = arr[0]; // Initialize max with the first element
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) // Update max if the current element is larger
                max = arr[i];
        }
        
        return max; // Return the largest element
    }
    
    // Method to get the smallest element in the array
    // Time Complexity (TC) = O(n), Space Complexity (SC) = O(1)
    public static int getSmallestElement(int[] arr) {
        int min = arr[0]; // Initialize min with the first element
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) // Update min if the current element is smaller
                min = arr[i];
        }
        
        return min; // Return the smallest element
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        
        int n = sc.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Create an array of the given size
        
        // Read the elements of the array from the user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Get the largest and smallest elements in the array
        int maxi = getLargestElement(arr);
        int mini = getSmallestElement(arr);
        
        // Print the span of the array (difference between the largest and smallest elements)
        System.out.println(maxi - mini);
        
        sc.close(); // Close the Scanner object
    }
}
