import java.util.Scanner;

public class InsertAtMiddleInAnArray {

    // Function to print the elements of the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  "); // Print each element followed by two spaces
        }

        // Move to the next line after printing all elements
        System.out.println(); 
    }
    
    // Function to insert an element at the middle of the array
    // Time Complexity: O(n), Space Complexity: O(n)
    public static int[] insertAtMiddle(int[] arr, int x) {
        int mid = arr.length / 2; // Determine the middle index of the array
        int[] newArr = new int[arr.length + 1]; // Create a new array with one extra space
        
        // Iterate over the new array to populate it with the elements from the old array and the new element
        for (int i = 0; i < newArr.length; i++) {
            if (i == mid) {
                newArr[i] = x; // Insert the new element at the middle position
            } else if (i < mid) {
                newArr[i] = arr[i]; // Copy elements before the middle position
            } else {
                newArr[i] = arr[i - 1]; // Copy elements after the middle position (shifting right by one)
            }
        }
        
        return newArr; // Return the new array with the inserted element
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
        
        // Prompt user to enter the element to be inserted in the middle and read the input
        System.out.print("Enter the element you want to insert at middle: ");
        int x = sc.nextInt();
        
        // Print the array elements before insertion
        System.out.print("Before insert array elements are: ");
        printArray(arr);
        
        // Insert the element at the middle of the array
        arr = insertAtMiddle(arr, x);
        
        // Print the array elements after insertion
        System.out.print("After  insert array elements are: ");
        printArray(arr);
    }
}
