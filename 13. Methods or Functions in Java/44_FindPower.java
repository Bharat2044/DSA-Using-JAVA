/*
Problem Description:
You are given two integers N and M, find the value of N raised to the power of M i.e. NM

Problem Constraints:
1 <= N <= 10
0 <= M <= 9

Input Format:
First line of input contains an integer N.
Second line of input contains an integer M.

Output Format:
Print the value of NM.

Example Input:
Input 1:
2 2
Input 2:
3 1
 
Example Output:
Output 1:
4
Output 2:
3

Example Explanation:
Explanation 1:
N = 2, M = 2, 22 = 4.
Explanation 2:
N = 3, M = 1, 31 = 3
*/



import java.util.Scanner;

public class FindPower { 
    
    public static int power(int n, int m) {
        // return (int)(Math.pow(n, m));
        
        int ans = 1;
        
        for(int i=1; i<=m; i++) {
            ans = ans * n;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println(power(n, m));
    }
}
