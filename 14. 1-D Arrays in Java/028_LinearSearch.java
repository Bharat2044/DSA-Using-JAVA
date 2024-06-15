import java.util.Scanner;

public class LinearSearch {
  
    // Approach - 1: Using Loops => TC = O(n), SC = O(1)
    /*
    public static int linearSearch(int[] arr, int key) {
    
        // Traverse the array
        for(int i=0; i<arr.length; i++) {
        
            // Check if the current element is equal to the key
            if(arr[i] == key) {
                // Return the index if found
                return i;
            }
        }
        // Return -1 if the key is not found
        return -1;
    }
    */
    
    // Approach - 2: Using Recursion => TC = O(n), SC = O(n)
    // Helper method for recursion
    public static int helper(int[] arr, int i, int key) {
        // Base case: if index reaches array length, key is not found
        if (i == arr.length) 
            return -1;
        
        // Check if the current element is equal to the key
        if (arr[i] == key) {
            // Return the index if found
            return i;
        }
        
        // Recursive call to check the next element
        return helper(arr, i + 1, key);
    }
    
    // Main method for recursive linear search
    public static int linearSearch(int[] arr, int key) {
        // Start the recursive search from index 0
        return helper(arr, 0, key);
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: Size of the array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input: Array elements
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Input: Element to find in the array
        System.out.print("Enter element to find in array: ");
        int key = sc.nextInt();
        
        // Perform linear search
        int result = linearSearch(arr, key);
        
        // Output: Result of the search
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
        
        sc.close();
    }
}
