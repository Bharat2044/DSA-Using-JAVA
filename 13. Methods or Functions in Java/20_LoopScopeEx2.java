public class LoopScopeEx2 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Value of a before the for loop = " + a);
        
        for(int i=1; i<=2; i++) {
            // int a = 10; // LoopScopeEx1.java:7: error: variable a is already defined in method main(String[])
            int num = 200;
            a = 99;
            System.out.println("a = " + a + "   num = " + num);
            
            for(int j=1; j<=3; j++) {
                // int a = 20;  // LoopScopeEx2.java:13: error: variable a is already defined in method main(String[])
                // int num = 300; // LoopScopeEx2.java:14: error: variable num is already defined in method main
                a = 500;
                System.out.println("a = " + a + "   j = " + j);
            }
        }
        
        int num = 999;
        System.out.println("num = " + num);
        
        System.out.println("Value of a after the for loop = " + a);
    }
}
