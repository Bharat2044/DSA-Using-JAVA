import java.util.Arrays;  // Importing Arrays class from java.util package

public class VarArgsEx3 {

    // Method with varargs for integers
    public static void demo(int ...v) {
        System.out.println("Length inside demo function = " + v.length);  // Print the length of varargs array v
        System.out.println(Arrays.toString(v));  // Print the contents of varargs array v as a string
        System.out.println();  // Print an empty line for separation
    }
    
    // static void multiple(int a, String ...v, int b) {} // VarArgsEx3.java:12: error: varargs parameter must be the last parameter

    // Method with varargs for strings, with regular parameters before varargs
    public static void multiple(int a, int b, String ...v) {
        System.out.println("Length inside multiple function = " + v.length);  // Print the length of varargs array v
        System.out.println("a * b = " + (a * b));  // Print the result of multiplying parameters a and b
        System.out.println(Arrays.toString(v));  // Print the contents of varargs array v as a string
        
        // Iterate through varargs array v and print each element followed by two spaces
        for(int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "  ");
        }
        
        System.out.println();  // Print an empty line for separation
        System.out.println();  // Print an empty line for separation
    }

    // Method with varargs for integers
    public static void fun(int ...v) {
        System.out.println("Length inside fun function = " + v.length);  // Print the length of varargs array v
        System.out.println();  // Print an empty line for separation
    }
    
    public static void main(String[] args) {
        fun();  // Call fun() method with no arguments
        fun(1, 2, 3);  // Call fun() method with arguments 1, 2, 3
        multiple(2, 3, "Bharat", "Rahul", "Deepak");  // Call multiple() method with arguments 2, 3, "Bharat", "Rahul", "Deepak"
        demo();  // Call demo() method with no arguments
    }
}
 
