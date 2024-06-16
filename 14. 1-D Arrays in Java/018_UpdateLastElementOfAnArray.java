import java.util.Scanner;

public class UpdateLastElementOfAnArray {
    
    // Function to update the last element of the array with the given value
    // Time Complexity: O(1), Space Complexity: O(1)
    public static void updateLastElement(int[] arr, int x) {
        arr[arr.length - 1] = x; // Update the last element of the array
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
        
        // Prompt user to enter the new value for the last element
        System.out.print("Enter the element: ");
        int x = sc.nextInt();
        
        // Print the array elements before the update
        System.out.print("Before update array elements are: ");
        printArray(arr);
        
        // Update the last element of the array with the new value
        updateLastElement(arr, x);
        
        // Print the array elements after the update
        System.out.print("After update array elements are: ");
        printArray(arr);
    }
}
