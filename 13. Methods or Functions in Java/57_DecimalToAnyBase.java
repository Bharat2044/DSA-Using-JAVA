import java.util.Scanner;

public class DecimalToAnyBase {
    public static int decimalToAnyBase(int n, int b) {
        int p = 1;
        int ans = 0;
        
        while(n != 0) {
            int r = n % b;
            
            ans += r * p;
            
            p *= 10;
            n /= b;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        int result = decimalToAnyBase(n, b);
        
        System.out.println(result);
    }
}
