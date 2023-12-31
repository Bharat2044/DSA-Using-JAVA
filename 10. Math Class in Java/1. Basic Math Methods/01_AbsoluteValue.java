public class CeilValue {
    public static void main(String[] args) {
      
        System.out.println(Math.abs(75));  
        System.out.println(Math.abs(-75));  
        
        System.out.println(Math.abs(89L));
        System.out.println(Math.abs(-89L));
        
        System.out.println(Math.abs(32.2f));
        System.out.println(Math.abs(-32.2f));
        
        System.out.println(Math.abs(22.265));
        System.out.println(Math.abs(-22.265));
        
        System.out.println(Math.abs(Integer.MIN_VALUE));  
        System.out.println(Math.abs(Integer.MAX_VALUE));  
        System.out.println(Math.abs(7.0 / 0));   
    }
}