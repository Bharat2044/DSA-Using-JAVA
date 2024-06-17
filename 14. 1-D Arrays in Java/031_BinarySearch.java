import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
  
    /**
     * Approach - 1: Using Loops => TC = O(log(n)), SC = O(1)
     * This approach uses a while loop to perform binary search iteratively.
     * Time Complexity: O(log(n)) - efficient for large sorted arrays
     * Space Complexity: O(1) - uses constant space for variables
     */
    /*
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1; // Initialize left and right pointers

        while (left <= right) {
            int mid = (left + right) / 2; // Calculate mid point
      
            if (arr[mid] == key) {
                return mid; // Element found, return index
            } else if (arr[mid] > key) {
                right = mid - 1; // If key is smaller, search in the left half
            } else {
                left = mid + 1; // If key is larger, search in the right half
            }
        }
        
        return -1; // Element not found
    }
    */
    
    /**
     * Approach - 2: Using Recursions => TC = O(log(n)), SC = O(log(n))
     * This approach uses recursion to perform binary search.
     * Time Complexity: O(log(n)) - efficient for large sorted arrays
     * Space Complexity: O(log(n)) - due to recursive calls on the stack
     */
    /*
    public static int helper(int[] arr, int left, int right, int key) {
        // Base condition: if left pointer exceeds right pointer, element not found
        if (left <= right) {
            int mid = (left + right) / 2; // Calculate mid point
            
            if (arr[mid] == key) {
                return mid; // Element found, return index
            } else if (arr[mid] > key) {
                return helper(arr, left, mid - 1, key); // Search in the left half
            } else {
                return helper(arr, mid + 1, right, key); // Search in the right half
            }
        }
        
        return -1; // Element not found
    }
    
    // Wrapper method to initiate binary search using recursion
    public static int binarySearch(int[] arr, int key) {
        return helper(arr, 0, arr.length - 1, key); // Call recursive helper function
    }
    */
    
    /**
     * Approach - 3: Using Predefined Methods => TC = O(log(n)), SC = O(1)
     * This approach uses Java's built-in Arrays.binarySearch method.
     * Time Complexity: O(log(n)) - efficient for large sorted arrays
     * Space Complexity: O(1) - uses constant space
     */
    public static int binarySearch(int[] arr, int key) {
        return Arrays.binarySearch(arr, key); // Use predefined method for binary search
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        
        // Input size of the array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Initialize array
        
        // Input array elements in sorted order
        System.out.println("Enter array elements in sorted order: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Read each element of the array
        }
        
        // Input element to find in array
        System.out.print("Enter element to find in array: ");
        int key = sc.nextInt(); // Read the element to search for
        
        // Perform binary search using predefined method and get the result
        int result = binarySearch(arr, key); // Call the binary search method
        
        // Output the result based on search outcome
        if (result < 0) {
            System.out.println("Element not found"); // If result is negative, element not found
        } else {
            System.out.println("Element found at index: " + result); // Element found, print index
        }
        
        sc.close(); // Close the scanner object
    }
}
