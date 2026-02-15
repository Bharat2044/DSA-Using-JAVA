import java.util.*;

public class Traverse2DArray {

    // 1️⃣ Using normal for loop => TC = O(n*m), SC = O(1)
    public static void traverse2DArray(int[][] arr) {
        System.out.println("2D Array elements are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }


    // 2️⃣ Using for-each loop => TC = O(n*m), SC = O(1)
    public static void traverse2DArrayForEach(int[][] arr) {
        System.out.println("2D Array elements are:");

        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + "  ");
            }
            System.out.println();
        }
    }


    // 3️⃣ Using Arrays.deepToString() => TC = O(n*m), SC = O(1)
    public static void traverse2DArrayUsingDeepToString(int[][] arr) {
        System.out.println("2D Array elements are:");
        System.out.println(Arrays.deepToString(arr));
    }


    // 4️⃣ Using Spliterator => TC = O(n*m), SC = O(1)
    public static void traverse2DArrayUsingSpliterator(int[][] arr) {
        System.out.println("2D Array elements are:");

        Spliterator<int[]> sp = Arrays.spliterator(arr);

        sp.forEachRemaining(row -> {
            for (int val : row) {
                System.out.print(val + "  ");
            }
            System.out.println();
        });
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter 2D array elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Calling traversal methods
        traverse2DArray(arr);
        traverse2DArrayForEach(arr);
        traverse2DArrayUsingDeepToString(arr);
        traverse2DArrayUsingSpliterator(arr);

        sc.close();
    }
}
