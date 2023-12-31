public class SignumValue {
    public static void main(String[] args) {
        /*
          The java.lang.Math.signum () is used to find the sign of a given value.
            If the argument is positive or negative Zero, this method will return Zero.
            If the argument is positive value, this method will return Positive 1.
            If the argument is Negative value, this method will return Negative 1.
            If the argument is NaN, this method will return NaN.
        */
      
        System.out.println(Math.signum(57));  
        System.out.println(Math.signum(57));  
        System.out.println(Math.signum(-57));  
        System.out.println(Math.signum(0));  
        System.out.println(Math.signum(-0));  
        
        System.out.println(Math.signum(0.0));  
        System.out.println(Math.signum(66.5));  
        System.out.println(Math.signum(16.9f));
        
        System.out.println(Math.signum(-0.0));  
        System.out.println(Math.signum(-66.5));  
        System.out.println(Math.signum(-16.9f));  
        
        System.out.println(Math.signum(1.0/0));  
        System.out.println(Math.signum(0.0/0));  
    }
}