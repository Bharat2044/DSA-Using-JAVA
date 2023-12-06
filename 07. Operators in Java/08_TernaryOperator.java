public class TernaryOperator {
    public static void main(String[] args) {
        int x = true ? 10 : 5;
        System.out.println(x);
        
        int y = false ? 10 : 5;
        System.out.println(y);
        
        int n1 = 5, n2 = 10;
        int max = (n1 > n2) ? n1 : n2;
 
        System.out.println("Maximum is = " + max);
    }
}
