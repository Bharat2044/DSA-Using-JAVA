public class DoubleDatatype {
        
    public static void main(String args[]) {
        System.out.println("Size of double datatype = " +  Double.SIZE + "bits  or  " + Double.SIZE/8 + "bytes");
        System.out.println("Max Value double datatype = " + Double.MAX_VALUE);
        System.out.println("Min Value double datatype = " + Double.MIN_VALUE);
        
        double a = 10.5;     
        double b = -10.5;    
        
        double c = 9223372036854775807l;
        double d = -9223372036854775808l;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
