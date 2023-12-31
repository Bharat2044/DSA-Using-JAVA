public class RoundValue {
    public static void main(String[] args) {
      
        System.out.println(Math.round(5.1));   
        System.out.println(Math.round(5.5));   
        System.out.println(Math.round(5.9)); 
        
        System.out.println(Math.round(-5.1));   
        System.out.println(Math.round(-5.5));   
        System.out.println(Math.round(-5.9));    
        
        System.out.println(Math.round(-0.25));   
        System.out.println(Math.round(0.0));   
        System.out.println(Math.round(-1.0 / 0));   
        
        System.out.println(Math.round(Double.MIN_VALUE));   
        System.out.println(Math.round(Double.MAX_VALUE));   
    }
}