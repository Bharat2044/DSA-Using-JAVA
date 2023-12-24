public class FunctionOverloading {
  
    public static void greet() {
        System.out.println("Hi");
    }
    
    public static void greet(String name) {
        System.out.println("Hi " + name);
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        greet();
        greet("Raj");
    }
}