public class Shadowing {
    static int x = 90;  // this will be shadowed at line 10

    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; 
        
        // System.out.println(x); // Shadowing.java:8: error: variable x might not have been initialized
        
        x = 40;
        System.out.println(x); // 40

        fun();
        
        {
            int m = 2;  // this will be shadowed at line 20
            System.out.println("Value of m before the inner block = " + m);
            
            {
                m = 5;
                System.out.println("Value of m inside the inner block = " + m);
            }
            
            System.out.println("Value of m after the inner block = " + m);
        }
    }

    public static void fun() {
        System.out.println(x);
    }
}