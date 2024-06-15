import java.util.Scanner;

public class MoveToHeadLinearSearch {
  
    // Function to perform Move-to-Head Linear Search
    // Time Complexity: O(n) - linear search through the array
    // Space Complexity: O(1) - constant space used (excluding input space)
    public static int moveToHeadLinearSearch(int[] arr, int key) {
        // Iterate through the array
        for(int i = 0; i < arr.length; i++) {
            // If the current element matches the key
            if(arr[i] == key) {
                // Swap the element found with the first element (move-to-head operation)
                int temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
                
                // Return the index where the element was found
                return i;
            }
        }
        
        // If element is not found, return -1
        return -1;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of the array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input array elements
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Input element to find in array
        System.out.print("Enter element to find in array: ");
        int key = sc.nextInt();
        
        // Perform Move-to-Head Linear Search and get the result
        int result = moveToHeadLinearSearch(arr, key);
        
        // Output the result based on search outcome
        if(result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
        
        // Close the scanner object
        sc.close();
    }
}
