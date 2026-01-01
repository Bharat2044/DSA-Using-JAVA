/*
Given an array of N integers, count the number of elements that have at least one element greater than themselves present in the array.

Input:  arr = {-3, -2, 6, 8, 4, 8, 5}
Output: 5

Input:  arr = {8, 8, 8, 8}
Output: 0
*/



import java.util.*; // Import all utility classes like Scanner, Arrays, etc.

public class CountGreaterThanItself {

    /*
    // Approach - 1: Using 2 nested for loops
    // Time Complexity (TC) = O(n^2)
    // Space Complexity (SC) = O(1)
    public static int countGreater(int[] arr) {

        // Get the length of the array
        int n = arr.length;

        // Variable to store count of elements
        int count = 0;

        // Outer loop to pick each element
        for (int i = 0; i < n; i++) {

            // Inner loop to compare arr[i] with every other element
            for (int j = 0; j < n; j++) {

                // If there exists any element greater than arr[i]
                if (arr[i] < arr[j]) {
                    count++;    // Increment count
                    break;      // Stop checking further for this element
                }
            }
        }

        // Return the final count
        return count;
    }
    */


    /*
    // Approach - 2: Using sorting
    // Time Complexity (TC) = O(n log n)
    // Space Complexity (SC) = O(1)
    public static int countGreater(int[] arr) {

        // Get the length of the array
        int n = arr.length;

        // Sort the array in ascending order
        Arrays.sort(arr);

        // The last element will be the maximum after sorting
        int max = arr[n - 1];

        // Count how many times the maximum element appears
        int count = 0;

        // Traverse from the end of the array
        for (int i = n - 1; i >= 0; i--) {

            // If current element is equal to maximum
            if (arr[i] == max) {
                count++;    // Increment count of max elements
            } else {
                break;      // Stop once a smaller element is found
            }
        }

        // Elements except maximum ones have a greater element
        return n - count;
    }
    */


    /*
    // Approach - 3: Using two separate loops
    // Time Complexity (TC) = O(n)
    // Space Complexity (SC) = O(1)
    public static int countGreater(int[] arr) {

        // Get the length of the array
        int n = arr.length;

        // Assume first element is the maximum initially
        int max = arr[0];

        // First loop to find the maximum element
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger value is found
            }
        }

        // Variable to count occurrences of max
        int count = 0;

        // Second loop to count how many times max appears
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                count++;
            }
        }

        // Total elements minus max elements
        return n - count;
    }
    */


    // Approach - 4: Using a single loop (Optimal)
    // Time Complexity (TC) = O(n)
    // Space Complexity (SC) = O(1)
    public static int countGreater(int[] arr) {

        // Get the length of the array
        int n = arr.length;

        // Initialize max with the smallest possible integer value
        int max = Integer.MIN_VALUE;

        // Variable to count how many times max appears
        int count = 0;

        // Single loop to find max and count its occurrences
        for (int i = 0; i < n; i++) {

            // If current element is greater than current max
            if (arr[i] > max) {
                max = arr[i]; // Update max
                count = 1;    // Reset count since new max found
            }

            // If current element is equal to max
            else if (arr[i] == max) {
                count++;     // Increment count of max elements
            }
        }

        // Return number of elements having at least one greater element
        return n - count;
    }

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt(); // Read array size

        // Create array of size n
        int[] arr = new int[n];

        // Ask user to enter array elements
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element
        }

        // Call countGreater method and store result
        int result = countGreater(arr);

        // Print the result
        System.out.println(result);
    }
}
