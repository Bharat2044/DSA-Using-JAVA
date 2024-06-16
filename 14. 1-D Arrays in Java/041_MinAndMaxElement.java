import java.util.Arrays;

public class MinAndMaxElement {

    // 1st Approach: Method to find the minimum and maximum elements of an array using sorting
    // Time Complexity: O(n * log(n)), Space Complexity: O(1)
    /*
    public static int[] getMinMax(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // The minimum element is the first element and the maximum element is the last element
        return new int[] { arr[0], arr[arr.length - 1] };
    }
    */
  

    // 2nd Approach: Method to find the minimum and maximum elements of an array using a single pass
    // Time Complexity: O(n), Space Complexity: O(1)
    public static int[] getMinMax(int[] arr) {
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value
        int min = Integer.MAX_VALUE; // Initialize min to the largest possible integer value

        // Iterate through the array to find the min and max elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if the current element is greater than max
            }
            if (arr[i] < min) {
                min = arr[i]; // Update min if the current element is less than min
            }
        }

        // Return an array containing the minimum and maximum elements
        return new int[] { min, max };
    }

    public static void main(String[] args) {
        int[] arr = { 10, 40, 50, -60, 20, 90, 70, -80 }; // Example array

        // Get the minimum and maximum elements of the array
        int[] ans = getMinMax(arr);

        // Print the minimum and maximum elements
        System.out.println("Minimum Element = " + ans[0]);
        System.out.println("Maximum Element = " + ans[1]);
    }
}
