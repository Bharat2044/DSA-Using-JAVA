public class VarArgsEx1 {

    // Method with varargs for integers
    static void fun(int... a) {
        System.out.println("a = " + a);  // Print the reference of array 'a' (not useful for displaying contents)
        System.out.println("Number of arguments: " + a.length);  // Print the number of arguments passed as varargs

        // Using a for-each loop to iterate through the varargs array 'a' and print each integer
        for (int i : a)
            System.out.print(i + " ");

        System.out.println();  // Print an empty line for separation
    }

    public static void main(String args[]) {
        // Calling the varargs method with different number of parameters

        // Calling fun() with one parameter
        fun(100); 

        // Calling fun() with four parameters
        fun(1, 2, 3, 4); 

        // Calling fun() with no(0) parameters
        fun(); 
    }
}
