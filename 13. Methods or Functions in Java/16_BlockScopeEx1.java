public class BlockScopeEx1 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Value of a before the block = " + a);
        
        {
            System.out.println("Value of a inside block = " + a);
            // int a = 5;  // BlockScopeEx1.java:8: error: variable a is already defined in method main(String[])
        
            a = 10;
            int b = 20;
            System.out.println("Value of b inside block = " + b);
        }
        
        // System.out.println("Value of b outside the block = " + b);  // BlockScopeEx1.java:15: error: cannot find symbol  =>   symbol: variable b       location: class BlockScopeEx1
        
        System.out.println("Value of a after the block = " + a);
    }
}
