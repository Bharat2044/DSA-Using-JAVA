import java.util.Scanner;

public class InsertAtSpecificPositionInAnArray {
    
    // Function to insert an element at a specific position in the array
    // Time Complexity: O(n), Space Complexity: O(n)
    public static int[] insertAtSpecificPosition(int[] arr, int pos, int x) {
        int[] newArr = new int[arr.length + 1]; // Create a new array with one extra space
        
        // Iterate over the new array to populate it with the elements from the old array and the new element
        for (int i = 0; i < newArr.length; i++) {
            if (i == pos - 1) { 
                newArr[i] = x; // Insert the new element at the specific position
            } else if (i < pos - 1) {
                newArr[i] = arr[i]; // Copy elements before the specific position
            } else {
                newArr[i] = arr[i - 1]; // Copy elements after the specific position (shifting right by one)
            }
        }
        
        return newArr; // Return the new array with the inserted element
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
        
        // Prompt user to enter the position where the new element should be inserted
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        
        // Prompt user to enter the element to be inserted at the specified position
        System.out.print("Enter the element you want to insert at specific position: ");
        int x = sc.nextInt();
        
        // Validate the position entered by the user
        if (pos <= 0 || pos > arr.length) {
            System.out.println("Enter a valid position");
            return; // Exit the program if the position is invalid
        }
        
        // Print the array elements before insertion
        System.out.print("Before insert array elements are: ");
        printArray(arr);
        
        // Insert the element at the specific position in the array
        arr = insertAtSpecificPosition(arr, pos, x);
        
        // Print the array elements after insertion
        System.out.print("After  insert array elements are: ");
        printArray(arr);
    }
}
