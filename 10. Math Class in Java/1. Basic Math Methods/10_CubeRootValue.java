public class CubeRootValue {
    public static void main(String[] args) {
      
        System.out.println(Math.cbrt(57));  
        System.out.println(Math.cbrt(729));  
        System.out.println(Math.cbrt(-57));  
        
        System.out.println(Math.cbrt(0.0));  
        System.out.println(Math.cbrt(66.5));  
        System.out.println(Math.cbrt(16.9f));  
        
        System.out.println(Math.cbrt(1.0/0));  
        System.out.println(Math.cbrt(0.0/0));  
    }
}