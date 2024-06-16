import java.util.Scanner;

public class DeleteFromSpecificPositionInAnArray {

    // Function to print the elements of the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  "); // Print each element followed by two spaces
        }
        System.out.println(); // Move to the next line after printing all elements
    }
    
    // Function to delete an element from a specific position in the array
    // Time Complexity: O(n), Space Complexity: O(n)
    public static int[] deleteFromSpecificPosition(int[] arr, int pos) {
        // Create a new array with one less element than the original array
        int[] newArr = new int[arr.length - 1];
        
        // Copy elements from the original array to the new array, excluding the element at the specified position
        for (int i = 0; i < newArr.length; i++) {
            if (i < pos - 1) {
                newArr[i] = arr[i]; // Copy elements before the specified position
            } else {
                newArr[i] = arr[i + 1]; // Copy elements after the specified position
            }
        }
        
        return newArr; // Return the new array after deletion
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
        
        // Prompt user to enter the position from which the element should be deleted
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        
        // Validate the position entered by the user
        if (pos <= 0 || pos > arr.length) {
            System.out.println("Enter a valid position");
            return; // Exit the program if the position is invalid
        }
        
        // Print the array elements before deletion
        System.out.print("Before delete array elements are: ");
        printArray(arr);
        
        // Delete the element at the specified position from the array
        arr = deleteFromSpecificPosition(arr, pos);
        
        // Print the array elements after deletion
        System.out.print("After delete array elements are: ");
        printArray(arr);
    }
}
