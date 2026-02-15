public class TwoDArrayDemo {

    public static void main(String[] args) {

        // Example 1: 2D Array of boolean values
        boolean[][] arr1 = new boolean[2][3];

        arr1[0][0] = true;
        arr1[0][2] = false;
        arr1[1][1] = true;

        System.out.println("2D Array arr1 elements are:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();


        // Example 2: 2D Array of double values
        double[][] arr2 = {
            {5.5, 6.8, 9.2},
            {3.5, 7.1, 8.4}
        };

        System.out.println("2D Array arr2 elements are:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();


        // Example 3: 2D Array of char values
        char[][] arr3 = {
            {'a', 'b', 'c'},
            {'d', 'e', 'f'}
        };

        System.out.println("2D Array arr3 elements are:");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
