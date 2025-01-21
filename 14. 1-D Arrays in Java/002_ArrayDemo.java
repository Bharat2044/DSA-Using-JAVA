public class ArrayDemo {

    public static void main(String[] args) {

        // Example 1: Array of boolean values
        boolean[] arr1 = new boolean[5];
        arr1[0] = true;
        arr1[2] = false;
        arr1[4] = true;

        // Printing elements of arr1
        System.out.print("Array arr1 elements are: ");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "  "); // Print each boolean value followed by a space
        }

        // Print a newline for formatting
        System.out.println("\n"); 


        // Example 2: Array of double values
        double[] arr2 = {5.5, 6.8, 9.2, 3.5};

        // Printing elements of arr2
        System.out.print("Array arr2 elements are: ");
        
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "  "); // Print each double value followed by a space
        }
        
        System.out.println("\n"); // Print a newline for formatting


        // Example 3: Array of char values
        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};

        // Printing elements of arr3
        System.out.print("Array arr3 elements are: ");
        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "  "); // Print each char value followed by a space
        }
        System.out.println("\n"); // Print a newline for formatting
    }
}
