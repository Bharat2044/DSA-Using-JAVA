import java.util.Arrays;

public class CopyArrayElements {

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
        // Original array 'a'
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Method 1: Copying elements using a for loop
        System.out.println("Iterating each element of the given original array and copy one element at a time:");
        // Create an array 'b' of the same size as 'a'
        int[] b = new int[a.length];

        // Copying elements of 'a' to 'b'
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        // Changing 'b' to verify that 'b' is different from 'a'
        b[0]++;

        // Print contents of 'a' and 'b'
        System.out.println("Contents of a[]: ");
        printArray(a);
        System.out.println("Contents of b[]: ");
        printArray(b);


        // Method 2: Using clone() method
        System.out.println("\n\nUsing clone() method:");
        // Copying elements of 'a' to 'c'
        int[] c = a.clone();

        // Changing 'c' to verify that 'c' is different from 'a'
        c[0]++;

        // Print contents of 'a' and 'c'
        System.out.println("Contents of a[]: ");
        printArray(a);
        System.out.println("Contents of c[]: ");
        printArray(c);


        // Method 3: Using arraycopy() method
        System.out.println("\n\nUsing arraycopy() method:");
        // Creating an array 'd' of the same size as 'a'
        int[] d = new int[a.length];

        // Copying elements of 'a' to 'd'
        System.arraycopy(a, 0, d, 0, a.length);

        // Changing 'd' to verify that 'd' is different from 'a'
        d[0]++;

        // Print contents of 'a' and 'd'
        System.out.println("Contents of a[]: ");
        printArray(a);
        System.out.println("Contents of d[]: ");
        printArray(d);


        // Method 4: Using copyOf() method of Arrays class
        System.out.println("\n\nUsing copyOf() method of Arrays class:");
        // Create an array 'e' of the same size as 'a' and Copy elements of 'a' to 'e'
        int[] e = Arrays.copyOf(a, a.length);

        // Changing 'e' to verify that 'e' is different from 'a'
        e[0]++;

        // Print contents of 'a' and 'e'
        System.out.println("Contents of a[]: ");
        printArray(a);
        System.out.println("Contents of e[]: ");
        printArray(e);


        // Method 5: Using copyOfRange() method of Arrays class
        System.out.println("\n\nUsing copyOfRange() method of Arrays class:");
        // Create an array 'f' of the same size as 'a' and Copy elements of 'a' from index 2 to 8 to 'f'
        int[] f = Arrays.copyOfRange(a, 2, 9);

        // Changing 'f' to verify that 'f' is different from 'a'
        f[0]++;

        // Print contents of 'a' and 'f'
        System.out.println("Contents of a[]: ");
        printArray(a);
        System.out.println("Contents of f[]: ");
        printArray(f);


        // Method 6: Copy array reference
        System.out.println("\n\nCopy array reference:");
        // Create an array 'g' of the same size as 'a'
        int[] g = new int[a.length];

        // Doesn't copy elements of 'a' to 'g', only makes 'g' refer to the same location as 'a'
        g = a;

        // Change to 'g' will also reflect in 'a', as 'a' and 'g' refer to the same location
        g[0]++;

        // Print contents of 'a' and 'g'
        System.out.println("Contents of a[]: ");
        printArray(a);
        System.out.println("Contents of g[]: ");
        printArray(g);
    }
}
