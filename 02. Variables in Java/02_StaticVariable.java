public class StaticVariable {
    static int x = 10;     // static variable
    static double y;       // static variable
        
    public static void main(String args[]) {
        System.out.println("Accessing inside main method");
        
        // Accessing static variable
        System.out.println(x);
        System.out.println(y); 
        
        System.out.println(StaticVariable.x); 
        
        StaticVariable refVar1 = new StaticVariable();
        System.out.println(refVar1.x);   // not a good practice
        
        
        StaticVariable.test();
    }
    
    public static void test() {
        System.out.println("Accessing inside test method");
        
        System.out.println(x);
        System.out.println(StaticVariable.x);
        
        StaticVariable refVar2 = new StaticVariable();
        System.out.println(refVar2.x);   // not a good practice
    }

}
