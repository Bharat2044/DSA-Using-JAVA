import java.util.Scanner;

public class TakingArrayInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt(); // Read the integer input for array size
        
        // Create an integer array 'arr' of size 'n'
        int[] arr = new int[n];
        
        // Prompt the user to enter array elements
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each integer input and store in the array
        }
        
        // Print the array elements
        System.out.print("Array elements are: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  "); // Print each element followed by a space
        }
        
        // Close the Scanner object to prevent resource leak
        sc.close();
    }
}
