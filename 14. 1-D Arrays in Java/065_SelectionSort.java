import java.util.Scanner;

public class SelectionSort { 
    
    // Method to print elements of the array
    static void printArrayElements(int[] arr) {
        // Iterate through the array elements
        for (int i = 0; i < arr.length; i++) {
            // Print each element followed by a space
            System.out.print(arr[i] + " ");
        }
        // Print a newline after printing all elements
        System.out.println();
    }
    
    /*
    // Method to perform selection sort on the array
    // 1st Approach: Using Loops - Time Complexity = O(n^2), Space Complexity = O(1)
    static void selectionSort(int[] arr) {
        // Iterate over each element except the last
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the current position is the minimum
            int minIdx = i;
            
            // Iterate through the unsorted elements
            for (int j = i + 1; j < arr.length; j++) {
                // Update minIdx if a smaller element is found
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            
            // Swap the smallest element with the minIdx index value if minIdx is not equal to i
            if (minIdx != i) {
                int temp = arr[minIdx]; 
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
    }
    */
    
    
    // Recursive helper method to perform selection sort
    private static void selectionSortHelper(int[] arr, int startIdx) {
        // Base case: If startIdx reaches the end of the array, return
        if (startIdx >= arr.length - 1) {
            return;
        }
        
        // Assume the current position is the minimum
        int minIdx = startIdx;
        
        // Iterate through the unsorted elements
        for (int j = startIdx + 1; j < arr.length; j++) {
            // Update minIdx if a smaller element is found
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }
        
        // Swap the smallest element with the minIdx index value if minIdx is not equal to startIdx
        if (minIdx != startIdx) {
            int temp = arr[minIdx]; 
            arr[minIdx] = arr[startIdx];
            arr[startIdx] = temp;
        }
        
        // Recursively call selectionSortHelper for the next starting index
        selectionSortHelper(arr, startIdx + 1);
    }
    
    // Public method to initiate selection sort
    // 2nd Approach: Using Recursion - Time Complexity = O(n^2), Space Complexity = O(n) due to recursion stack
    static void selectionSort(int[] arr) {
        
        // Call the helper method starting from index 0
        selectionSortHelper(arr, 0); 
    }

    public static void main(String args[]) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter size of the array: "); 
        int n = sc.nextInt(); // Read the size of the array

        int[] arr = new int[n]; // Initialize the array with the specified size
        
        System.out.print("Enter array elements: "); 
        // taking array user input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Before selection sort:"); 
        // Print array before sorting
        printArrayElements(arr); 
        
        // Sort the array using selection sort
        selectionSort(arr); 
        
        System.out.println("After selection sort:"); 
        // Print array after sorting
        printArrayElements(arr);
        
        sc.close(); // Close the Scanner to free resources
    }
}



// Note: Selection Sort is Inplace Sorting, but not Stable Algorithm.
// Inplace Sorting: Not taking any extra space
// Stable Algorithm: Order Precedence not follow if 2 same elements here.
