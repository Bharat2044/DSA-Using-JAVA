public class CharDatatype {
        
    public static void main(String args[]) {
        System.out.println("Size of char datatype = " +  Character.SIZE + "bits  or  " + Character.SIZE/8 + "bytes");
        System.out.println("Max Value char datatype = " + Character.MAX_VALUE);
        System.out.println("Min Value char datatype = " + Character.MIN_VALUE);
        
        System.out.println("Max Value char datatype = " + (int)Character.MAX_VALUE);
        System.out.println("Min Value char datatype = " + (int)Character.MIN_VALUE);
        
        char a = 'a';
        char b = '@';
        char c = '0';
        char d = 'x';
        
        char e = 100;
        char f = 65;
        
        char g = '\u0000';
        char h = '\uFFFF';
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
    }
}
