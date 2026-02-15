public class Updating2DArrayElements {

    // Function to print elements of a 2D integer array
    public static void print2DArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // ================= Example 1 =================
        // Initialize 2D array arr1
        int[][] arr1 = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // Print before updating
        System.out.println("Printing arr1 before updating:");
        print2DArray(arr1);

        // Updating specific elements
        arr1[0][0] = 11; // first row, first column
        arr1[0][2] = 33; // first row, third column
        arr1[1][1] = 55; // second row, second column

        // Print after updating
        System.out.println("Printing arr1 after updating:");
        print2DArray(arr1);


        // ================= Example 2 =================
        // Initialize another 2D array arr2
        int[][] arr2 = {
            {25, 26, 27},
            {28, 29, 30}
        };

        // Print before updating
        System.out.println("\nPrinting arr2 before updating:");
        print2DArray(arr2);

        // Updating all elements using nested for loop
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = arr2[i][j] + 10;
            }
        }

        // Print after updating
        System.out.println("Printing arr2 after updating:");
        print2DArray(arr2);
    }
}
