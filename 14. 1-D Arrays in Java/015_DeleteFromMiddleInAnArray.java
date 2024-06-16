import java.util.Scanner;

public class DeleteFromMiddleInAnArray {
    
    // Function to delete the middle element from the array
    // Time Complexity: O(n), Space Complexity: O(n)
    public static int[] deleteFromMiddle(int[] arr) {
        // Create a new array with one less element than the original array
        int[] newArr = new int[arr.length - 1];
        int mid = arr.length / 2; // Determine the middle index of the array
        
        // Copy elements from the original array to the new array, excluding the middle element
        for (int i = 0; i < newArr.length; i++) {
            if (i < mid) {
                newArr[i] = arr[i]; // Copy elements before the middle element
            } else {
                newArr[i] = arr[i + 1]; // Copy elements after the middle element
            }
        }
        
        return newArr; // Return the new array after deletion
    }

    // Function to print the elements of the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  "); // Print each element followed by two spaces
        }
        System.out.println(); // Move to the next line after printing all elements
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        
        // Prompt user for the size of the array and read the input
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n]; // Initialize the array with the specified size
        
        // Prompt user to enter the array elements and read them
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Print the array elements before deletion
        System.out.print("Before delete array elements are: ");
        printArray(arr);
        
        // Delete the middle element from the array
        arr = deleteFromMiddle(arr);
        
        // Print the array elements after deletion
        System.out.print("After delete array elements are: ");
        printArray(arr);
    }
}
