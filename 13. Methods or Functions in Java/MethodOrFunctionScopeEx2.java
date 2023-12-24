public class MethodOrFunctionScopeEx2 {
  
    public static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
        
        System.out.println("Value of a and b inside swap method: " + a + "  " + b);
    }
    
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        
        System.out.println("Value of a and b inside main method before calling swap function: " + a + "  " + b);
        
        swap(a, b);
        
        System.out.println("Value of a and b inside main method after calling swap function: " + a + "  " + b);
    }
}