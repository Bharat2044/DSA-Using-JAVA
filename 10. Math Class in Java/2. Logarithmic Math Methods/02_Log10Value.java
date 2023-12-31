public class Log10Value {
    public static void main(String[] args) {

        System.out.println(Math.log10(5)); 
        System.out.println(Math.log10(-5)); 
        System.out.println(Math.log10(0)); 

        System.out.println(Math.log10(68)); 
        System.out.println(Math.log10(100)); 

        System.out.println(Math.log10(38.9)); 
        System.out.println(Math.log10(-70.4)); 

        System.out.println(Math.log10(1.0/0)); 
        System.out.println(Math.log10(0.0/0)); 
        
        System.out.println((int)Math.log10(10)); 
        System.out.println((int)Math.log10(85)); 
        System.out.println((int)Math.log10(110)); 
    }
}