// Question Link: https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/decimal-to-any-base-official/ojquestion

import java.util.Scanner;

public class DecimalToAnyBase {
    
    /**
     * Function to convert a decimal number to any base.
     * 
     * Time Complexity: O(log(n)), where n is the decimal number.
     *                   The number of iterations in the while loop depends on the number of times n is divided by b.
     * Space Complexity: O(1), excluding the space required for input and output.
     */
    public static int decimalToAnyBase(int n, int b) {
        int p = 1;  // power variable to calculate each digit position
        int ans = 0;  // result variable to store the converted number
        
        while(n != 0) {
            int r = n % b;  // calculate remainder when n is divided by base b
            
            ans += r * p;  // accumulate the digit multiplied by its position
            
            p *= 10;  // increase the position by a power of 10
            n /= b;  // divide n by base b to process the next digit
        }
        
        return ans;  // return the converted number in base b
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // input decimal number
        int b = sc.nextInt();  // input base
        
        int result = decimalToAnyBase(n, b);  // convert decimal number n to base b
        
        System.out.println(result);  // print the converted number
        
        sc.close();  // close scanner
    }
}
