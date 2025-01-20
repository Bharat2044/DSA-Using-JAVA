public class LeftRotateByOnePosition {

    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
      
        System.out.println();
    }
 
    // Method to left rotate an array by one position
    // Time Complexity: O(n), Space Complexity: O(1)
    public static void leftRotateByOne(int[] arr) {
        int n = arr.length;
        int x = arr[0]; // Store the first element to be moved to the end

        // Shift each element one position to the left
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = x; // Move the stored element to the last position
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        System.out.println("Before left rotate by 1 position array:");
        printArray(arr);

        leftRotateByOne(arr); // Rotate the array by one position

        System.out.println("\nAfter left rotate by 1 position array:");
        printArray(arr);
    }
}
