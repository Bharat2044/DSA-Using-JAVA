public class LoopScopeEx3 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Value of a before the for loop = " + a);
        
        for(int i=1; i<=2; i++) {
            if(true) {
                // int a = 2; // LoopScopeEx3.java:8: error: variable a is already defined in method main(String[])
                int num = 10;
                a = 2;
                System.out.println("Value of num inside the for loop and inside the if block = " + num);
            }
            
            if(false) {
                // int a = 2;  // LoopScopeEx3.java:15: error: variable a is already defined in method main(String[])
                a = 3;
            }
            
            // System.out.println("Value of num inside the for loop and outside the if block = " + num);  // LoopScopeEx3.java:19: error: cannot find symbol    =>   symbol:   variable num    location: class LoopScopeEx3  
        }
        
        int num = 100;
        System.out.println("Value of num outside the for loop = " + num);
        
        System.out.println("Value of a after the for loop = " + a);
    }
}