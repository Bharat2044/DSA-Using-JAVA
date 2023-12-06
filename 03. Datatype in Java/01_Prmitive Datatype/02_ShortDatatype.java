public class ShortDatatype {
        
    public static void main(String args[]) {
        System.out.println("Size of short datatype = " + Short.SIZE + "bits  or  " + Short.SIZE/8 + "bytes");
        System.out.println("Max Value short datatype = " + Short.MAX_VALUE);
        System.out.println("Min Value short datatype = " + Short.MIN_VALUE);
        
        Short a = 10;
        Short b = -100;
        
        Short c = 32767;
        Short d = -32768;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        // Short e = 32768;    // ByteDataType.java:19: error: incompatible types: int cannot be converted to Short
        // Short f = -32769;   // ByteDataType.java:20: error: incompatible types: int cannot be converted to Short
    }
}
