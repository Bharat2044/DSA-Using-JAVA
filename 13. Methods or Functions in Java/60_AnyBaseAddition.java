//Question Link: https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any-base-addition-official/ojquestion


import java.util.Scanner;

public class AnyBaseAddition {
    
    public static int getSum(int n1, int n2, int b) {
        int sum = 0, pow = 1, carry = 0;
        
        while(n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10;   // extracting last digit of n1
            int d2 = n2 % 10;   // extracting last digit of n2 
            
            n1 /= 10;      // removing last diging of n1
            n2 /= 10;      // removing last diging of n1
            
            // adding last digit of n1 and n2 and carry
            int d = (d1 + d2 + carry);
            
            carry = d / b;  // extracting carry
            d = d % b;      // extracting last digit
            
            sum += d * pow;
            pow *= 10;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int base = sc.nextInt();
        
        int result = getSum(n1, n2, base);
        
        System.out.println(result);
    }
}

