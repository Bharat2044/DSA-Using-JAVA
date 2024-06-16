import java.util.Scanner;

public class InsertAtBeginInAnArray {
  
    // Function to insert an element at the beginning of an array
    // Time Complexity: O(n) - where n is the number of elements in the original array
    // Space Complexity: O(n) - since we create a new array of size n+1
    public static int[] insertAtBegin(int[] arr, int x) {
        // Create a new array with size one more than the original array
        int[] newArr = new int[arr.length + 1];

        // Insert the new element x at the beginning of the new array
        newArr[0] = x;

        // Copy elements from the original array 'arr' to 'newArr'
        // Start from index 1 in newArr and copy from index 0 in arr
        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        // Return the new array with the inserted element
        return newArr;
    }

    // Function to print elements of an array
    public static void printArray(int[] arr) {
        // Iterate through the array and print each element followed by a space
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        // Print a newline after printing all elements
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from console
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter size of the array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        
        // Create an array of size n to store elements
        int[] arr = new int[n];
        
        // Prompt user to enter array elements
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Prompt user to enter the element to insert at the beginning
        System.out.print("Enter the element you want to insert at beginning: ");
        int x = sc.nextInt();
        
        // Print the array elements before insertion
        System.out.print("Before insert array elements are: ");
        printArray(arr);
        
        // Insert element x at the beginning of the array 'arr'
        arr = insertAtBegin(arr, x);
        
        // Print the array elements after insertion
        System.out.print("After insert array elements are: ");
        printArray(arr);
        
        // Close the scanner object to prevent resource leak
        sc.close();
    }
}
