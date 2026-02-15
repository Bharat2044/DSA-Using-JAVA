import java.util.Arrays;

public class Copy2DArrayElements {

    /*
     * Utility method to print elements of a 2D integer array
     */
    public static void print2DArray(int[][] arr) {

        // Traverse each row
        for (int i = 0; i < arr.length; i++) {

            // Traverse each column in the current row
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }

            // Move to next line after printing one row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        /*
         * Original 2D array
         */
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // =====================================================================
        // Method 1: Copy elements using nested for loop (DEEP COPY)
        // Each element is copied individually.
        // Changes in copied array do NOT affect the original array.
        // =====================================================================
        System.out.println("Copy using nested for loop:");

        int[][] b = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j];
            }
        }

        // Modify copied array
        b[0][0]++;

        System.out.println("Contents of a:");
        print2DArray(a);
        System.out.println("Contents of b:");
        print2DArray(b);


        // =====================================================================
        // Method 2: Using clone() on 2D array (SHALLOW COPY)
        // Only row references are copied, not the actual elements.
        // Changes in copied array WILL affect the original array.
        // =====================================================================
        System.out.println("\nUsing clone() method (shallow copy):");

        int[][] c = a.clone();
        c[0][0]++;   // This also modifies original array 'a'

        System.out.println("Contents of a:");
        print2DArray(a);
        System.out.println("Contents of c:");
        print2DArray(c);


        // =====================================================================
        // Method 3: Deep copy using clone() on each row
        // Each row is cloned separately.
        // This is the CORRECT way to deep copy a 2D array.
        // =====================================================================
        System.out.println("\nDeep copy using clone() on each row:");

        int[][] d = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            d[i] = a[i].clone();
        }

        // Modify copied array
        d[0][0]++;   // Does NOT affect original array

        System.out.println("Contents of a:");
        print2DArray(a);
        System.out.println("Contents of d:");
        print2DArray(d);


        // =====================================================================
        // Method 4: Using Arrays.copyOf() (SHALLOW COPY)
        // Copies only the references of rows.
        // Changes in copied array WILL affect the original array.
        // =====================================================================
        System.out.println("\nUsing Arrays.copyOf():");

        int[][] e = Arrays.copyOf(a, a.length);
        e[0][0]++;

        System.out.println("Contents of a:");
        print2DArray(a);
        System.out.println("Contents of e:");
        print2DArray(e);


        // =====================================================================
        // Method 5: Using Arrays.copyOfRange() (SHALLOW COPY)
        // Copies a range of row references.
        // Changes in copied array WILL affect the original array.
        // =====================================================================
        System.out.println("\nUsing Arrays.copyOfRange():");

        int[][] f = Arrays.copyOfRange(a, 0, a.length);
        f[0][0]++;

        System.out.println("Contents of a:");
        print2DArray(a);
        System.out.println("Contents of f:");
        print2DArray(f);


        // =====================================================================
        // Method 6: Copying array reference
        // No copying happens.
        // Both variables point to the SAME memory location.
        // Any change affects both arrays.
        // =====================================================================
        System.out.println("\nCopy reference:");

        int[][] g = a;
        g[0][0]++;

        System.out.println("Contents of a:");
        print2DArray(a);
        System.out.println("Contents of g:");
        print2DArray(g);
    }
}
