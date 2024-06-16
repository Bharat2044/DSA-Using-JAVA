// Question Link: https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any-base-addition-official/ojquestion

import java.util.Scanner;

public class AnyBaseAddition {
    
    /**
     * Function to compute the sum of two numbers in a given base.
     * 
     * Time Complexity: O(d), where d is the number of digits in the larger number between n1 and n2.
     * Space Complexity: O(1), excluding the space required for input and output.
     */
    public static int getSum(int n1, int n2, int b) {
        int sum = 0, pow = 1, carry = 0;
        
        while(n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10;   // extracting last digit of n1
            int d2 = n2 % 10;   // extracting last digit of n2 
            
            n1 /= 10;      // removing last digit of n1
            n2 /= 10;      // removing last digit of n2
            
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
        
        int n1 = sc.nextInt();  // input first number
        int n2 = sc.nextInt();  // input second number
        int base = sc.nextInt();  // input base
        
        int result = getSum(n1, n2, base);
        
        System.out.println(result);  // printing the result
        
        sc.close();  // closing scanner
    }
}
