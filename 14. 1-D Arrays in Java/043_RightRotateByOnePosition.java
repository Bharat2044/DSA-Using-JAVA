public class RightRotateByOnePosition {

    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
      
        System.out.println();
    }

    // Method to right rotate an array by one position
    // Time Complexity: O(n), Space Complexity: O(1)
    public static void rightRotateByOne(int[] arr) {
        int n = arr.length;
        int x = arr[n - 1]; // Store the last element to be moved to the front

        // Shift each element one position to the right
        for (int i = n - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = x; // Move the stored element to the first position
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        System.out.println("Before right rotate by 1 position array:");
        printArray(arr);

        rightRotateByOne(arr); // Rotate the array by one position to the right

        System.out.println("\nAfter right rotate by 1 position array:");
        printArray(arr);
    }
}
