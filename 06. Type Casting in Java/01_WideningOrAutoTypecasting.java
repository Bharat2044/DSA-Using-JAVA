public class WideningOrAutoTypecasting {
    public static void main(String args[]) {
        byte a = 100;
        System.out.println(a + "\n");
        
        short b1 = a;
        short b2 = 800;
        System.out.println(b1);
        System.out.println(b2 + "\n");
        
        char c1 = 'a';
        char c2 = 101;
        System.out.println(c1);
        System.out.println(c2 + "\n");
        
        int d1 = a;
        int d2 = b2;
        int d3 = c1;
        int d4 = 88879;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4 + "\n");
        
        long e1 = a;
        long e2 = b2;
        long e3 = c1;
        long e4 = d4;
        long e5 = 12345678L;
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5 + "\n");
        
        float f1 = a;
        float f2 = b2;
        float f3 = c1;
        float f4 = d4;
        float f5 = e5;
        float f6 = 10.5f;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6 + "\n");
        
        double g1 = a;
        double g2 = b2;
        double g3 = c1;
        double g4 = d4;
        double g5 = e5;
        double g6 = 103.5;
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g5);
        System.out.println(g6 + "\n");
    }
}
