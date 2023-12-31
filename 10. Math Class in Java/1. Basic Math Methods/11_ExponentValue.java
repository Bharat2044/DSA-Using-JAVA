public class ExponentValue {
    public static void main(String[] args) {
      
        System.out.println(Math.getExponent(57));  
        System.out.println(Math.getExponent(729));  
        System.out.println(Math.getExponent(-57));  
        
        System.out.println(Math.getExponent(0.0));  
        System.out.println(Math.getExponent(66.5));  
        System.out.println(Math.getExponent(16.9f));  
        
        System.out.println(Math.getExponent(1.0/0));  
        System.out.println(Math.getExponent(0.0/0));  
    }
}