public class MethodOrFunctionScopeEx3 {
  
    public static void fun() {
        // System.out.println("Value of a inside fun function = " + a); // MethodOrFunctionScopeEx2.java:4: error: cannot find symbol  =>    symbol:   variable a    location: class MethodOrFunctionScopeEx2
        
        int x = 3;
        System.out.println("Value of x inside fun function = " + x);
    }
    
    public static void main(String[] args) {
        int a = 3;
        System.out.println("Value of a inside main function = " + a);
        
        fun();
        
        // System.out.println("Value of x outside fun function = " + x); // MethodOrFunctionScopeEx2.java:16: error: cannot find symbol    =>    symbol:   variable x    location: class MethodOrFunctionScopeEx2
    }
}