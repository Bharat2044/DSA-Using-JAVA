public class ArrayDeclarationAndInitialization {

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

        // Array declaration and initialization methods

        // Method 1: Separate declaration and initialization
        int[] arr1;          // Declaration of array 'arr1'
        arr1 = new int[5];   // Initialization with size 5
        arr1[0] = 5;         // Assigning values to individual elements
        arr1[1] = 6;
        arr1[2] = 7;

        // Method 2: Declaration and initialization in one line
        int[] arr2 = { 10, 20, 30, 40, 50 };   // Declaration and initialization with specific values

        // Method 3: Declaration with 'new' keyword and initialization using array initializer
        int[] arr3 = new int[] { 60, 70, 80, 90, 100 };   // Declaration with size inferred from initializer

        // Method 4: Declaration with 'new' keyword and explicit size initialization
        int[] arr4 = new int[5];   // Declaration with size 5, elements initialized to default values (0 for int)

        // Printing array elements using the printArray function
        System.out.print("Array arr1 elements are: ");
        printArray(arr1);   // Print elements of arr1

        System.out.print("Array arr2 elements are: ");
        printArray(arr2);   // Print elements of arr2

        System.out.print("Array arr3 elements are: ");
        printArray(arr3);   // Print elements of arr3

        System.out.print("Array arr4 elements are: ");
        printArray(arr4);   // Print elements of arr4
    }
}
