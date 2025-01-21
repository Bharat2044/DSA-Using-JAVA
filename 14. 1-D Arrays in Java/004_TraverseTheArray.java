import java.util.*;

public class TraverseTheArray {
  
    //  1st Approach: Using for loop => TC = O(n), SC = O(1)
    /*
     * Method to traverse and print array elements using a for loop.
     * Time Complexity: O(n) where n is the number of elements in the array.
     * Space Complexity: O(1) (constant space used).
     */
    public static void traverseArray(int[] arr) {
        System.out.println("Array elements are: ");
        
        // Iterate through the array using a for loop
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  "); // Print each element followed by a space
        }

        // Print a newline for formatting
        System.out.println(); 
    }
    
    
    //  2nd Approach: Using for-each loop => TC = O(n), SC = O(1)
    /*
     * Method to traverse and print array elements using a for-each loop.
     * Time Complexity: O(n) where n is the number of elements in the array.
     * Space Complexity: O(1) (constant space used).
     */
    public static void traverseArrayForEach(int[] arr) {
        System.out.println("Array elements are: ");
        
        // Iterate through the array using a for-each loop
        for(int ele : arr) {
            System.out.print(ele + "  "); // Print each element followed by a space
        }

        // Print a newline for formatting
        System.out.println(); 
    }
    
    
    //  3rd Approach: Using toString() method => TC = O(n), SC = O(1)
    /*
     * Method to traverse and print array elements using Arrays.toString() method.
     * Time Complexity: O(n) where n is the number of elements in the array.
     * Space Complexity: O(1) (constant space used).
     */
    public static void traverseArrayUsingToString(int[] arr) {
        System.out.println("Array elements are: ");
        
        // Print the entire array as a string
        System.out.print(Arrays.toString(arr));

        // Print a newline for formatting
        System.out.println();
    }
    
    
    //  4th Approach: Using Spliterator Iterator => TC = O(n), SC = O(1)
    /*
     * Method to traverse and print array elements using Spliterator Iterator.
     * Time Complexity: O(n) where n is the number of elements in the array.
     * Space Complexity: O(1) (constant space used).
     */
    public static void traverseArrayUsingSpliterator(int[] arr) {
        System.out.println("Array elements are: ");
        
        // Create a Spliterator for the array and iterate through it
        Spliterator<Integer> sp = Arrays.spliterator(arr);
        sp.forEachRemaining((k) -> {
            System.out.print(k + "  "); // Print each element followed by a space
        });

        // Print a newline for formatting
        System.out.println();
    }
  
    public static void main(String[] args) {

        // Create the Scanner Object
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Choose which method to use for traversing and printing array elements
        // Uncomment one of the following lines based on the desired method
        
        traverseArray(arr);
        traverseArrayForEach(arr);
        traverseArrayUsingToString(arr);
        traverseArrayUsingSpliterator(arr);

        // Close the scanner object
        sc.close(); 
    }
}
