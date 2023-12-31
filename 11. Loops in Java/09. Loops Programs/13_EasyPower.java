/*
Problem Description:
You are given two integers A and B. You have to find the value of A^B.
NOTE: The value of A^B will always be less than or equal to 10^9.

Problem Constraints:
1 <= A, B <= 1000 

Input Format:
First line of the input contains a single integer A.
Second line of the input contains a single integer B.

Output Format:
Print a single integer in single line.

Example Input:
Input 1:
2 3 
Input 2:
1 10 

Example Output:
Output 1:
8 
Output 2:
1 

Example Explanation:
Explanation 1:
For A = 2 and B = 3, the value of 23 = 2 * 2 * 2 = 8. 
Explanation 2:
For A = 1 and B = 10, the value of 110 = 1.
*/


import java.util.Scanner;

public class EasyPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = 1;
        
        // 2nd Approach => TC = O(log(b)), SC = O(1)
        System.out.println((int)Math.pow(a, b));
        
        /*
        // 1st Approach => TC = O(b), SC = O(1)
        for(int i=1; i<=b; i++) {
            ans *= a;
        }
        System.out.println(ans);
        */
    }
}
