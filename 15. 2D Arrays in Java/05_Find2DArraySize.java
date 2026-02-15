public class Find2DArraySize {

    public static void main(String[] args) {

        // Initialize a 2D integer array
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // Number of rows
        int rows = arr.length;

        // Number of columns (from first row)
        int cols = arr[0].length;

        // Total number of elements
        int totalElements = rows * cols;

        // Print sizes
        System.out.println("Number of rows = " + rows);
        System.out.println("Number of columns = " + cols);
        System.out.println("Total elements in 2D array = " + totalElements);
    }
}
