//Question Link: https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any-base-addition-official/ojquestion


import java.util.Scanner;

public class AnyBaseAddition {
    
    public static int getSum(int n1, int n2, int b) {
        int ans = 0, pow = 1, carry = 0;
        
        while(n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10; // d1 = (n1 > 0) ? (n1 % 10) : 0;
            int d2 = n2 % 10; // d2 = (n2 > 0) ? (n2 % 10) : 0;
            
            n1 /= 10;
            n2 /= 10;
            
            int sum = (d1 + d2 + carry);
            carry = sum / b;
            int digit = sum % b;
            
            ans += digit * pow;
            pow *= 10;
        }
        
        return ans;
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

