public class VarArgsEx2 {
  
    // Method with a string argument followed by varargs for integers
    static void fun(String str, int... a) {
        System.out.println("String: " + str);  // Print the string argument passed to the method
        System.out.println("Number of arguments is: " + a.length);  // Print the number of integers passed as varargs
        
        // Using a for-each loop to iterate through the varargs array 'a' and print each integer
        for (int i : a)
            System.out.print(i + " ");
 
        System.out.println();  // Print an empty line for separation
        System.out.println();  // Print an empty line for separation
    }
 
    public static void main(String args[]) {
        // Calling fun() with different parameters
        fun("Bharat", 100, 200);  // Calls fun() with "Bharat" as the string argument and 100, 200 as varargs
        fun("Raju", 1, 2, 3, 4, 5);  // Calls fun() with "Raju" as the string argument and 1, 2, 3, 4, 5 as varargs
        fun("Deepak");  // Calls fun() with "Deepak" as the string argument and no varargs
    }
}
