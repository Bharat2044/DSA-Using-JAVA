public class VarArgsEx2 {
  
  	// Takes string as a argument followed by varargs
    static void fun(String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Number of arguments is: " + a.length);
 
        // using for each loop to display contents of a
        for (int i : a)
            System.out.print(i + " ");
 
        System.out.println();
        System.out.println();
    }
 
    public static void main(String args[]) {
        // Calling fun() with different parameter
        fun("Bharat", 100, 200);
        fun("Raju", 1, 2, 3, 4, 5);
        fun("Deepak");
    }
}
