import java.util.*;

public class PrintingArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30 , 40, 50};
        
        // 1. Printing array arr elements using for loop
        System.out.println("Printing array arr elements using for loop: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  "); // Print each element followed by a space
        }
        
        System.out.println("\n"); // Print a newline for formatting
        
        
        // 2. Printing array arr elements using for-each loop
        System.out.println("Printing array arr elements using for-each loop: ");
        for(int i : arr) {
            System.out.print(i + "  "); // Print each element followed by a space
        }
        System.out.println("\n"); // Print a newline for formatting
        
        
        // 3. Printing array arr elements using toString() method of Arrays class
        System.out.println("Printing array arr elements using toString() method: ");
        System.out.println(Arrays.toString(arr)); // Prints the entire array as a string
        System.out.println(); // Print a newline for formatting
        
        
        // 4. Printing array arr elements using Spliterator Iterator
        System.out.println("Printing array arr elements using Spliterator Iterator: ");
        Spliterator<Integer> sp = Arrays.spliterator(arr); // Create a Spliterator for the array
        sp.forEachRemaining((k) -> {
            System.out.print(k + "  "); // Print each element using forEachRemaining method of Spliterator
        });
        System.out.println(); // Print a newline for formatting
    }
}
