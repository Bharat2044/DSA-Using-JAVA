public class TwoDArrayDeclarationAndInitialization {

    // Function to print elements of a 2D integer array
    public static void print2DArray(int[][] arr) {

        // Iterate through rows
        for (int i = 0; i < arr.length; i++) {

            // Iterate through columns
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // ===== Method 1: Separate declaration and initialization =====
        int[][] arr1;            // Declaration
        arr1 = new int[2][3];    // Initialization with 2 rows and 3 columns

        // Assigning values manually
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;


        // ===== Method 2: Declaration and initialization in one line =====
        int[][] arr2 = {
            {10, 20, 30},
            {40, 50, 60}
        };


        // ===== Method 3: Using 'new' keyword with initializer =====
        int[][] arr3 = new int[][] {
            {70, 80, 90},
            {100, 110, 120}
        };


        // ===== Method 4: Declaration with explicit size (default values = 0) =====
        int[][] arr4 = new int[2][3];   // All elements initialized to 0


        // ===== Printing arrays =====
        System.out.println("Array arr1 elements are:");
        print2DArray(arr1);

        System.out.println("\nArray arr2 elements are:");
        print2DArray(arr2);

        System.out.println("\nArray arr3 elements are:");
        print2DArray(arr3);

        System.out.println("\nArray arr4 elements are:");
        print2DArray(arr4);
    }
}
