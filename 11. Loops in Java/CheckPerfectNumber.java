/*
Problem Description:
Take T (number of test cases) as input.
For each test case, take integer N as input, you have to tell whether it is a perfect number or not.

A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself). 
A positive proper divisor divides a number without leaving any remainder.

Problem Constraints:
1 <= T <= 10
1 <= N <= 10^6

Input Format:
The first line of the input contains a single integer T.
Each of the next T lines contains a single integer N.

Output Format:
In a separate line, print YES if a given integer is perfect, else print NO.

Example Input:
Input 1:
 2 
 4
 6 
Input 2:
1 
3 

Example Output:
Output 1:
NO
YES 
Output 2:
NO 

Example Explanation:
Explanation 1:
For A = 4, the answer is "NO" as sum of its proper divisors = 1 + 2 = 3, is not equal to 4.  For A = 6, the answer is "YES" as sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6. 
Explanation 2:
For A = 3, the answer is "NO" as sum of its proper divisors = 1, is not equal to 3.
*/



import java.util.Scanner;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        /*
        // 1st Approach => TC = O(n), SC = O(1)
        for(int m=1; m<=t; m++) {
            int n = sc.nextInt();
            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) 
                    sum += i;
            }
        
            if (sum == n) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        */
        
        
        // 2nd Approach => TC = O(sqrt(n)), SC = O(1)
        for(int m=1; m<=t; m++) {
            int n = sc.nextInt();
            int sum = 1;

            for (int i=2; i*i<=n; i++) {
                if (n%i == 0) {
                    sum += i;
                    
                    if (i*i != n)
                        sum += n/i;
                }
            }
        
            if (sum == n) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
