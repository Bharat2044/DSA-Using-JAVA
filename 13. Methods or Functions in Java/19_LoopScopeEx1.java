public class LoopScopeEx1 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Value of a before the for loop = " + a);
        
        for(int i=1; i<=5; i++) {
            // int a = 10; // LoopScopeEx1.java:7: error: variable a is already defined in method main(String[])
            int num = i;
            a = 99;
            
            System.out.println(a + "  " + num);
        }
        
        
        // System.out.println("Value of num after the for loop " + num);   // LoopScopeEx1.java:15: error: cannot find symbol l  =>   symbol: variable num     location: class LoopScopeEx1
        
        System.out.println("Value of a after the for loop = " + a);
    }
}
