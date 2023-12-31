public class RandomValue {
    public static void main(String[] args) {
        // It returns a pseudorandom double value greater than or equal to 0.0 and less than 1.0. 
      
        System.out.println(Math.random());   
        System.out.println(Math.random());  
        
        // Generate random number between 0 to 20  
        double a = Math.random() * 20;  
        System.out.println(a);  

        // Generate random number between 5 to 30  
        double b = 5 + (Math.random() * 30);  
        System.out.println(b);  

        // Generate random number between 1 to 100  
        int c = (int)((Math.random() * 100) + 1);  
        System.out.println(c);  
    }
}