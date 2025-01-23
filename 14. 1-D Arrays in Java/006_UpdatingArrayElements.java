public class UpdatingArrayElements {

    // Function to print elements of an integer array
    public static void printArray(int[] arr) {
        
        // Iterate through the array and print each element followed by a space
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
      
        // Print a newline after printing all elements
        System.out.println();
    }

    public static void main(String[] args) {
        // Initialize array arr1 with specific elements
        int[] arr1 = { 10, 20, 30, 40, 50 };

        // Print elements of arr1 before updating
        System.out.println("Printing array arr1 elements before updating: ");
        printArray(arr1);

        // Updating elements in arr1
        arr1[0] = 11; // updating 1st element
        arr1[2] = 33; // updating 3rd element
        arr1[4] = 55; // updating 5th element

        // Print elements of arr1 after updating
        System.out.println("Printing array arr1 elements after updating: ");
        printArray(arr1);

        // Initialize array arr2 with specific elements
        int[] arr2 = { 25, 26, 27, 28, 29 };

        // Print elements of arr2 before updating
        System.out.println("\nPrinting array arr2 elements before updating: ");
        printArray(arr2);

        // Updating elements in arr2 using a for loop
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] + 10;
        }

        // Print elements of arr2 after updating
        System.out.println("Printing array arr2 elements after updating: ");
        printArray(arr2);
    }
}
