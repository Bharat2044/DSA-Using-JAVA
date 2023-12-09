/*
Problem Description:
You are given an integer N and the task is to reverse the digits of the given integer. Return 0 if the result overflows and does not fit in a 32 bit signed integer.
Look at the example for clarification.

Problem Constraints:
N belongs to the Integer limits.

Input Format:
Input an Integer.

Output Format:
Return a single integer denoting the reverse of the given integer.

Example Input:
Input 1:
x = 123
Input 2:
x = -123

Example Output:
Output 1:
321
Ouput 2:
-321

Example Explanation:
If the given integer is negative like -123 the output is also negative -321.
*/


import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        boolean flag = true;
        int rev = 0;
      
        while(x != 0) {
          int temp = x % 10;
          
          if((rev > Integer.MAX_VALUE/10) || (rev < Integer.MIN_VALUE/10)) {
                System.out.println(0);
                flag = false;
                break;
          }
          
          rev = (rev * 10) + temp;
          x /= 10;
        }
        
        if(flag)  {
            System.out.println(rev);
        }
    }
}
