import java.util.Scanner;

public class AnyBaseSubtraction {
    
    public static int getDifference(int n1, int n2, int b) {
        int ans = 0, pow = 1, borrow = 0;
        
        while(n1 > 0) {
            int d1 = n1 % 10; // d1 = (n1 > 0) ? (n1 % 10) : 0;
            int d2 = n2 % 10; // d2 = (n2 > 0) ? (n2 % 10) : 0;
            
            n1 /= 10;
            n2 /= 10;
            
            int sub = borrow + d1 - d2;
            
            if(sub < 0) {
              sub += b;
              borrow = -1;
            }
            else  {
              borrow = 0;
            }
            
            ans += sub * pow;
            pow *= 10;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int base = sc.nextInt();
        
        int x = Math.max(n1, n2);
        int y = Math.min(n1, n2);
        
        int result = getDifference(x, y, base);
        
        if(n1 >= n2)
            System.out.println(result);
        else
            System.out.println(-result);

        sc.close();
    }
}
