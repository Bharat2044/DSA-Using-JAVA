/*
Problem Description:
Write a program to input an integer T and then for each test case input two integers A and B in two different lines and then print T lines containing Least Common Multiple (LCM) of two given 2 numbers A and B.
LCM of two integers is the smallest positive integer divisible by both.

Problem Constraints:
1 <= T <= 1000
1 <= A, B <= 1000

Input Format:
The first line contains T which means number of test cases.
Next 2T lines contains input A and B for each testcase.
First line of each testcase contain an integer A and second line of the testcase contains input B.

Output Format:
T lines each containing an integer representing LCM of A & B.

Example Input:
Input 1:
3
2  3
9  6
2  6

Example Output:
Output 1:
6
18
6

Example Explanation:
Explanation:
In first testcase 6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 3 (3 * 2 = 6).
In second testcase 18 is the smallest positive integer which is divisible by both 9 (9 * 2 = 18) and 6 (6 * 3 = 18).
In third testcase  6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 6 (6 * 1 = 6).
*/


import java.util.Scanner;

public class LeastCommonMultiple { 

    public static int gcd(int a, int b) {
        int ans = 1;
        int x = Math.min(a, b);
    
        for (int i=2; i<=x; i++) {
            if (a % i == 0 && b % i == 0) 
                ans = i;
        }
            
        return ans;
    }
    
    // 2nd Approach
    /*
    public static int lcm(int a, int b) {
        // LCM(a, b) = (a x b) / GCD(a, b)
        return ((a *b) / gcd(a, b));
    }
    */
    
    // 1st Approach
    public static int lcm(int a, int b) {
        int ans = Math.max(a, b);
        
        while(true) {
            if((ans % a == 0) && (ans % b == 0)) {
                break;
            }
            ans++;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); 
        
        for(int i=1; i<=t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int ans = lcm(a, b);
            
            System.out.println(ans);
        }
    }
}
