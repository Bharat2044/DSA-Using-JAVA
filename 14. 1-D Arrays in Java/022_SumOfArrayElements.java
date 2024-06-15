import java.util.Scanner;

public class SumOfArrayElements {
    
    // Time Complexity (TC) = O(n), Space Complexity (SC) = O(1)
    // Method to calculate the sum of array elements
    public static int arraySum(int[] arr) {
        int sum = 0; // Initialize sum to 0
        
        // Loop through each element in the array and add it to sum
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        return sum; // Return the calculated sum
    }
  
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Create an array of the given size
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Read each element into the array
        }
        
        // Calculate and print the sum of the array elements
        System.out.println("Sum of array elements = " + arraySum(arr));
        
        // Close the Scanner object
        sc.close();
    }
}
