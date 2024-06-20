import java.util.Arrays;

public class VarArgsEx4 {

    // Method to print integer varargs
    public static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    // Method to print string varargs
    public static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
    
    public static void main(String[] args) {
        // demo();  // VarArgsEx4.java:16: error: reference to demo is ambiguous
        
        demo(1, 2, 3);  // Calls demo(int ...v) with arguments 1, 2, 3
        demo("Ram", "Mohan", "Deepak");  // Calls demo(String ...v) with arguments "Ram", "Mohan", "Deepak"
        
        // demo(1, 2, 3, "Deepak"); // VarArgsEx4.java:21: error: no suitable method found for demo(int,int,int,String)
    }
}
