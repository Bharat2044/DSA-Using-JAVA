import java.util.Scanner;

public class TransitionLinearSearch {
  
    // Time Complexity = O(n), Space Complexity = O(1)
    public static int transitionLinearSearch(int[] arr, int key) {
        // Traverse the array
        for(int i = 0; i < arr.length; i++) {
            // Check if the current element is equal to the key
            if(arr[i] == key) {
                // If the found element is not the first element, perform a swap
                if(i != 0) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
                // Return the index where the key is found
                return i;
            }
        }
        // Return -1 if the key is not found
        return -1;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: Size of the array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input: Array elements
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Input: Element to find in the array
        System.out.print("Enter element to find in array: ");
        int key = sc.nextInt();
        
        // Perform the transition linear search
        int result = transitionLinearSearch(arr, key);
        
        // Output: Result of the search
        if(result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
        
        sc.close();
    }
}
