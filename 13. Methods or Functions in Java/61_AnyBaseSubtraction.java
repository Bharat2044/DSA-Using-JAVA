// Question Link: https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any-base-subtraction-official/ojquestion


/*
i/p: n1 = 2000
     n2 = 999
     b = 10
o/p: 1001
*/


import java.util.Scanner;

public class AnyBaseSubtraction {
    
    public static int getDifference(int n1, int n2, int b) {
        int ans = 0, pow = 1, borrow = 0;
        
        while(n1 > 0) {
            int d1 = n1 % 10;   // extracting last digit of n1
            int d2 = n2 % 10;   // extracting last digit of n2 
            
            n1 /= 10;      // removing last diging of n1
            n2 /= 10;      // removing last diging of n1
            
            int d = (d1 - d2 - borrow);
            
            if(d < 0) {
                borrow = 1;
                d = d + b;
            }
            else {
                borrow = 0;
            }
            
            ans += d * pow;
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

