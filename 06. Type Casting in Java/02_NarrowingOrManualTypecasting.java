public class NarrowingOrManualTypecasting {
    public static void main(String args[]) {
        int a = 98;
        float b = 10.5f;
        char c = 'a';
        double d = 105.34;
        
        byte m1 = (byte)a;
        byte m2 = (byte)c;
        byte m3 = (byte)d;
        
        int n1 = (int)b;
        int n2 = (int)d;
        int n3 = (int)10374L;
        
        char o1 = (char)a;
        char o2 = (char)d;
        char o3 = (char)56;
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3 + "\n");
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3 + "\n");
        
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3 + "\n");
    }
}
