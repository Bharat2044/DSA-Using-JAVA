import java.util.Scanner;

public class UpdateSpecificPositionElementOfAnArray {
    
    // Function to update the element at a specific position in the array with the given value
    // Time Complexity: O(1), Space Complexity: O(1)
    public static void updateSpecificPositionElement(int[] arr, int pos, int x) {
        arr[pos - 1] = x; // Update the element at the specified position (1-based index)
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
        
        // Prompt user to enter the position and the new value for the specified position
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        
        System.out.print("Enter the element: ");
        int x = sc.nextInt();
        
        // Check if the position is valid (1-based index)
        if(pos <= 0 || pos > arr.length) {
            System.out.println("Enter a valid position");
            return;
        }
        
        // Print the array elements before the update
        System.out.print("Before update array elements are: ");
        printArray(arr);
        
        // Update the element at the specified position with the new value
        updateSpecificPositionElement(arr, pos, x);
        
        // Print the array elements after the update
        System.out.print("After update array elements are: ");
        printArray(arr);
    }
}
