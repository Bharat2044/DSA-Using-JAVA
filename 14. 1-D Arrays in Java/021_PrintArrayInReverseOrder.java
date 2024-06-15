import java.util.Scanner;

public class PrintArrayInReverseOrder {

    // TC = O(n), SC = O(1)
    // Method to print the array in reverse order
    public static void printArrayInReverse(int[] arr) {
        System.out.println("Array elements are in reverse order: ");
        
        // Loop through the array from the end to the beginning
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();    
    }
  
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for the size of the array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Create an array of the given size
        
        // Prompt user to enter the elements of the array
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Read each element into the array
        }
        
        // Call the method to print the array in reverse order
        printArrayInReverse(arr);
        
        // Close the scanner
        sc.close();
    }
}
