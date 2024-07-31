import java.util.Scanner;

public class BubbleSort { 
    
    // Method to print elements of the array - Time Complexity = O(n), Space Complexity = O(1)
    public static void printArrayElements(int[] arr) {
        // Iterate through the array elements
        for (int i = 0; i < arr.length; i++) {
            // Print each element followed by a space
            System.out.print(arr[i] + " ");
        }
        // Print a newline after printing all elements
        System.out.println();
    } 
    
    // Helper method to swap two elements in the array - Time Complexity = O(1), Space Complexity = O(1)
    public static void swap(int[] arr, int i, int j) {
        // Swap by using a temporary variable
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    
        // Alternative swap method without a temporary variable
        // arr[i] = arr[i] ^ arr[j];
        // arr[j] = arr[i] ^ arr[j];
        // arr[i] = arr[i] ^ arr[j];
    } 
    
    /*
    // Method to perform bubble sort on the array
    // 1st Approach: Using Loops - Time Complexity = O(n^2), Space Complexity = O(1)
    public static void bubbleSort(int[] arr) {
        
        // Outer loop for iterating over the entire array. Each pass sorts the next largest element.
        for (int i = 0; i < arr.length - 1; i++) {
            
            // Initialize a flag to monitor if a swap has occurred in this pass.
            boolean swapped = false;
            
            // Inner loop for comparing adjacent elements. The range decreases with each pass.
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Compare the current element with the next element.
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements if they are in the wrong order.
                    swap(arr, j, j + 1);
                    
                    // Set the flag to true indicating a swap has occurred.
                    swapped = true;
                }
            }
            
            // If no swaps occurred in the inner loop, the array is already sorted. Break out of the loop.
            if (swapped == false) {
                break;
            }
        }
    }
    */

    
    // Public method to initiate bubble sort
    // 2nd Approach: Using Recursion - Time Complexity = O(n^2), Space Complexity = O(n) due to recursion stack
    public static void bubbleSort(int[] array) {
        // Call the helper method starting from index 0
        bubbleSortHelper(array, 0); 
    }
    
    // Recursive helper method to perform bubble sort
    private static void bubbleSortHelper(int[] array, int currentIndex) {
        // Base case: If currentIndex reaches the end of the array, return
        if (currentIndex >= array.length - 1) {
            return;
        }
        
        // Initialize a flag to monitor if a swap has occurred in this pass
        boolean swapped = false;
        
        // Iterate through the unsorted elements
        for (int j = 0; j < array.length - currentIndex - 1; j++) {
            // Compare the current element with the next element
            if (array[j] > array[j + 1]) {
                // Swap the elements if they are in the wrong order
                swap(array, j, j + 1);
                swapped = true;
            }
        }
        
        // If no swaps occurred in this pass, the array is already sorted
        if (!swapped) {
            return;
        }
        
        // Recursively call bubbleSortHelper for the next starting index
        bubbleSortHelper(array, currentIndex + 1);
    }

    public static void main(String args[]) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter size of the array: "); 
        int n = sc.nextInt(); // Read the size of the array

        // Initialize the array with the specified size
        int[] arr = new int[n]; 
        
        System.out.println("Enter array elements: "); 
        // taking array user input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Before bubble sort:"); 
        // Print array before sorting
        printArrayElements(arr); 
        
        // Sort the array using selection sort
        bubbleSort(arr); 
        
        System.out.println("After bubble sort:"); 
        // Print array after sorting
        printArrayElements(arr);
        
        // Close the Scanner to free resources
        sc.close(); 
    }
}



// Note: Bubble Sort is both an in-place sorting and a stable algorithm.
// In-place Sorting: Does not take any extra space for sorting
// Stable Algorithm: Maintains the relative order of elements with equal keys or Order Precedence not follow if 2 same elements here.
