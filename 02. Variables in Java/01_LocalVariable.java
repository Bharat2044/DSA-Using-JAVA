public class LocalVariable {
    public static void main(String args[]) {
        int x = 10;     // local variable
        int y;          // local variable
      
        System.out.println(x);
        // System.out.println(y);  // LocalVariable.java:7: error: variable y might not have been initialized
        
        LocalVariable.test();
    }
    
    public static void test() {
        int z = 30;     // local variable
      
        System.out.println(z);
        // System.out.println(x);   // LocalVariable.java:14: error: cannot find symbol
    }

}
