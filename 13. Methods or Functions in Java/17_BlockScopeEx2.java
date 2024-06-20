public class BlockScopeEx2 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Value of a before the block = " + a);
        
        {
            System.out.println("Value of a inside block = " + a);
            // int a = 5;  // BlockScopeEx2.java:8: error: variable a is already defined in method main(String[])
        
            a = 100;
            System.out.println("Value of a inside block after modifing = " + a);
            
            int b = 20;
            System.out.println("Value of b inside block = " + b);
        }
        
        int b = 99;
        System.out.println("Value of b outside the block = " + b);  
        
        System.out.println("Value of a after the block = " + a);
    }
}
