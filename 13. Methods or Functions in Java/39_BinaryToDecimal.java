/*
Problem Description:
Take a number A as input in binary format (Base = 2). You have to print the number in decimal format (Base = 10).

Problem Constraints:
1 <= A <= 210

Input Format:
First and only line contains a single binary number A.

Output Format:
Print in a single line, a decimal integer.

Example Input:
Input 1:
11 
Input 2:
1011 

Example Output:
Output 1:
3 
Output 2:
11 

Example Explanation:
Explanation 1:
(0011)2 = (21 + 20)10 = (3)10 
Explanation 2:
(1011)2 = (23+ 21 + 20)10 = (11)10 
*/


import java.util.Scanner;

public class BinaryToDecimal { 

    // 1st Approach
    /*
    public static int binaryToDecimal(int a) {
      
        int x = 0;
        int ans = 0;
        
        while(a > 0) {
            int d = a % 10;
            ans = ans + (int)(d * Math.pow(2, x));
            x++;
            a /= 10;
        }
            
        return ans;
    }
    */
    
    // 2nd Approach
    public static int binaryToDecimal(int a) {
      
        int pow = 1;
        int ans = 0;
        
        while(a > 0) {
            int d = a % 10;
            ans = ans + d * pow;
            a /= 10;
            // pow *= 2;
            pow <<= 1;
        }
            
        return ans;
    }
    
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
          int a = sc.nextInt(); 
          
          int ans = binaryToDecimal(a);
            
          System.out.println(ans);
    }
}
