import java.util.*;

public class Printing2DArrayElements {

    public static void main(String[] args) {

        // 2D Array of integers
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // 1. Printing using normal for loop
        System.out.println("Printing 2D array using for loop:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();


        // 2. Printing using for-each loop
        System.out.println("Printing 2D array using for-each loop:");
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + "  ");
            }
            System.out.println();
        }
        System.out.println();


        // 3. Printing using Arrays.deepToString()
        System.out.println("Printing 2D array using deepToString():");
        System.out.println(Arrays.deepToString(arr));
        System.out.println();


        // 4. Printing using Spliterator
        System.out.println("Printing 2D array using Spliterator:");

        Spliterator<int[]> sp = Arrays.spliterator(arr);

        sp.forEachRemaining((row) -> {
            for (int val : row) {
                System.out.print(val + "  ");
            }
            System.out.println();
        });

        System.out.println();
    }
}
