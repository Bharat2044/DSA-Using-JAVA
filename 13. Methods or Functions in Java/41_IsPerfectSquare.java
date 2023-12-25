/*
Problem Description:
You are given a function that takes an integer argument A. Return 1 if A is a perfect square otherwise return 0.

Problem Constraints:
1 <= A <= 108

Input Format:
First argument is an integer A.

Output Format:
Return an integer (0 or 1) based upon the question.

Example Input:
Input 1:
A = 4
Input 2:
A = 1001

Example Output:
Output 1:
1
Output 2:
0

Example Explanation
Explanation 1:
sqrt(4) = 2
Explanation 2:
1001 is not a perfect square.
*/


import java.util.Scanner;

public class IsPerfectSquare {
  
    public static boolean isPerfectSquare(int n) {
        // 1st Approach
        for (int i=1; i*i<=n; i++) {   
            if((n%i==0) && (n/i==i)) {   
                return true;   
            }   
        }   

        return false;
      
        // 2nd Approach
        /*
        double sq = Math.sqrt(n);
        return ((sq - (int)(sq)) == 0);
        */
        
        // 3rd Approach
        // return ((n & (n-1)) == 0);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        if(isPerfectSquare(a))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
