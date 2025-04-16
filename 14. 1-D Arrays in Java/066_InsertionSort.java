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
    
    // Method to perform insertion sort on the array
    // 1st Approach: Using Loops - Shift one by one - Time Complexity = O(n^2), Space Complexity = O(1)
    public static void insertionSort(int[] arr) {
        
        // Iterate through each element in the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            
            // Store the current element to be positioned
            int currentValue = arr[i];
            
            // Initialize the previous index
            int j = i - 1;
            
            // Shift elements of the sorted segment forward to make room for the current element
            while (j >= 0 && currentValue < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            // Place the current element in its correct position
            arr[j + 1] = currentValue;
        }
    }
    
    /*
    // Method to perform insertion sort on the array
    // 2nd Approach: Using Loops - Swap one by one - Time Complexity = O(n^2), Space Complexity = O(1)
    public static void insertionSort(int[] arr) {
        
        // Iterate through each element in the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            
            // Store the current index
            int j = i;
            
            // Swap elements of the sorted segment to the left until the correct position for arr[i] is found
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    // Method to swap two elements in the array - Time Complexity = O(1), Space Complexity = O(1)
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    */

    /*
    // Public method to initiate insertion sort
    // 3rd Approach: Using Recursion - Time Complexity = O(n^2), Space Complexity = O(n) due to recursion stack
    public static void insertionSort(int[] arr) {
    
        // Start the recursive sorting process from the first index
        helperInsertionSort(arr, arr.length);
    }

    // Recursive method to perform insertion sort
    private static void helperInsertionSort(int[] arr, int n) {
    
        // Base case: If the array size is 1 or less, it's already sorted
        if (n <= 1) {
            return;
        }
        
        // Recursively sort the first n-1 elements
        helperInsertionSort(arr, n - 1);
        
        // Insert the nth element into its correct position in the sorted portion
        int lastElement = arr[n - 1];
        int j = n - 2;
        
        // Shift elements of the sorted segment forward to make room for the last element
        while (j >= 0 && arr[j] > lastElement) {
            arr[j + 1] = arr[j];
            j--;
        }
        
        // Place the last element in its correct position
        arr[j + 1] = lastElement;
    }
    */
    

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
        
        System.out.println("Before insertion sort:"); 
        // Print array before sorting
        printArrayElements(arr); 
        
        // Sort the array using selection sort
        insertionSort(arr); 
        
        System.out.println("After insertion sort:"); 
        // Print array after sorting
        printArrayElements(arr);
        
        // Close the Scanner to free resources
        sc.close(); 
    }
}


// Note: Insertion Sort is both an in-place sorting and a stable algorithm.
// In-place Sorting: Does not take any extra space for sorting
// Stable Algorithm: Maintains the relative order of elements with equal keys or Order Precedence not follow if 2 same elements here.
