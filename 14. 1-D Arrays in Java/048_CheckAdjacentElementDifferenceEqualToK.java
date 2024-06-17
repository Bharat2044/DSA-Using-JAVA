// i/p: n = 5, arr[] = {3, 8, 4, 2, 9}, k = -7
// o/P: true    -> 2, 9 => 2 - 9 = -7
// i/p: n = 4, arr[] = {1, 3, 4, 1}, k = 1
// o/P: false
// i/p: n = 8, arr[] = {2, 3, 2, 1, 4, 2, 9, 2}, k = 2
// o/P: true    -> 4, 2 => 4 - 2 = 2

// arr[i] - arr[i + 1] == k


import java.util.Scanner;

public class CheckAdjacentElementDifferenceEqualToK {
    
    /**
     * Checks if there exists two adjacent elements in the array such that their difference is equal to k.
     * 
     * @param arr The array to check
     * @param k The target difference
     * @return true if such a pair exists, false otherwise
     * 
     * Time Complexity: O(n) - where n is the length of the array
     * Space Complexity: O(1) - constant space usage
     */
    public static boolean hasAdjacentDifferenceEqualToK(int[] arr, int k) {
        // Iterate through each element in the array except the last one
        for (int i = 0; i < arr.length - 1; i++) {
            // Check if the difference between current element and next element is equal to k
            if (arr[i] - arr[i + 1] == k) {
                return true; // Return true if such a pair is found
            }
        }
        
        return false; // Return false if no such pair is found
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Initialize the array with the given size
        
        System.out.println("Enter array elements: ");
        // Read each element of the array from user input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter element to find the difference in array: ");
        int k = sc.nextInt(); // Read the target difference
        
        // Call the function to check if any adjacent elements have the given difference
        boolean result = hasAdjacentDifferenceEqualToK(arr, k);
        
        // Print the result
        System.out.println(result);
        
        sc.close(); // Close the Scanner object
    }
}
