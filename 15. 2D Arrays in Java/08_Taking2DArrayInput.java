import java.util.Scanner;

public class Taking2DArrayInput {
    public static void main(String[] args) {

        // Create Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Ask user for number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Ask user for number of columns
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create a 2D integer array with given rows and columns
        int[][] arr = new int[rows][cols];

        // Prompt user to enter matrix elements
        System.out.println("Enter 2D array elements:");

        // Take input row by row
        for (int i = 0; i < rows; i++) {          // iterate over rows
            for (int j = 0; j < cols; j++) {      // iterate over columns
                arr[i][j] = sc.nextInt();         // store element in matrix
            }
        }

        // Print the 2D array in matrix form
        System.out.println("2D Array elements are:");

        for (int i = 0; i < rows; i++) {          // iterate over rows
            for (int j = 0; j < cols; j++) {      // iterate over columns
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println(); // move to next line after each row
        }

        // Close Scanner to prevent memory/resource leak
        sc.close();
    }
}
