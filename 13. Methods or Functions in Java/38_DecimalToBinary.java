/*
Problem Description:
You are given an integer A in decimal (base 10).
Return an integer denoting the binary (base 2) form of the integer A.

Problem Constraints:
1 <= A <= 10^2

Input Format:
Function stub has a single integer A, denoting the integer for that test case.

Output Format:
Return an integer denoting the binary representation of A.

Example Input:
10

Example Output:
1010

Example Explanation:
The binary form of 10 is given by -> 1010
*/


import java.util.Scanner;

public class DecimalToBinary { 
  
    // 1st Approach
    public static int decimalToBinary(int a) {
        int ans = 0;
        int i = 0;
        
        while(a > 0) {
            int d = a % 2;
            
            ans = ans + (d * (int)(Math.pow(10, i)));
            
            i++;
            
            a >>= 1;    // a /= 2;
        }
            
        return ans;
    }  
  
  
    // 2nd Approach
    /*
    public static int decimalToBinary(int a) {
        int ans = 0;
        int i = 1;
        
        while(a > 0) {
            int d = a % 2;
            
            ans = ans + (d * i);
            
            i *= 10;
            
            a >>= 1;    // a /= 2;
        }
            
        return ans;
    }    
    */
    
    
    // 3rd Approach => Using Recursion
    /*public static int decimalToBinary(int a) {
        if(a == 0)
            return 0;
            
        return (a % 2) + 10 * decimalToBinary(a / 2);
    }    
    */
    
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
          int a = sc.nextInt(); 
          
          int ans = decimalToBinary(a);
            
          System.out.println(ans);
    }
}
