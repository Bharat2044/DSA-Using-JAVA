public class BlockScopeEx3 {
  
    int a = 10;
    // System.out.println("Value outside main method = " + a);  // BlockScopeEx3.java:4: error: illegal start of type
    
    {
        int a = 20;
        System.out.println("Value outside main method and inside instance block = " + a);
        
        {
          // int a = 99;   // BlockScopeEx3.java:11: error: variable a is already defined in instance initializer of class BlockScopeEx1
        }
    }
    
    static {
        int a = 30;
        System.out.println("Value outside main method and inside static block = " + a);
    
          {
            // int a = 999;  // BlockScopeEx3.java:20: error: variable a is already defined in static initializer of class BlockScopeEx1
          }
    }
    
    
    public static void main(String[] args) {
        int a = 1;
        
        System.out.println("Value inside main method = " + a);
    }
}
