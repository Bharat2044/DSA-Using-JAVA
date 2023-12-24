import java.util.Arrays;

public class VarArgsEx3 {

    static void demo(int ...v) {
        System.out.println("Length inside demo function = " + v.length);
        System.out.println(Arrays.toString(v));
        System.out.println();
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println("Length inside multiple function = " + v.length);
        
        System.out.println(Arrays.toString(v));
        
        for(int i=0; i<v.length; i++) {
            System.out.print(v[i] + "  ");
        }
        
        System.out.println();
        System.out.println();
    }

    static void fun(int ...v) {
        System.out.println("Length inside fun function = " + v.length);
        System.out.println();
    }
    
    public static void main(String[] args) {
        fun();
        fun(1, 2, 3);
        multiple(2, 3, "Bharat", "Rahul", "Deepak");
        demo();
    }
}