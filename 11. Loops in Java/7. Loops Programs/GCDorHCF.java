/*
Problem Description:
Write a program to input an integer T which represents the number of test cases. For each test case input two integers A and B in two different lines. 
For each pair of A and B print the HCF of the given two numbers.

Problem Constraints:
1 <= T <= 1000
1 <= A,B <= 1000000

Input Format:
The first line of input contains T which means number of test cases.
Next 2T lines contains input A and B for each testcase.
First line of each testcase contain an integer A and second line of the testcase contains input B.

Output Format:
T lines each containing an integer representing HCF of A & B.

Example Input:
Input 1:
2
15 105 
24 36

Example Output:
Output 1:
15
12
*/



import java.util.Scanner;

public class GCDorHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        /*
        // 1st Approach => TC = O(t* min(a, b)), SC = O(1)
        for(int m=1; m<=t; m++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = 1;
            int x = Math.min(a, b);
        
            for (int i = 2; i <= x; i++) {
                if (a % i == 0 && b % i == 0) 
                    ans = i;
            }
            
            System.out.println(ans);
        }
        */
        
        
        // 2nd Approach => TC = O(t * sqrt(min(a, b))), SC = O(1)
        for(int m=1; m<=t; m++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int ans = 1;
            int x = Math.min(a, b);
        
            for (int i = 1; i * i <= x; i++) {
                if (a % i == 0 && b % i == 0) 
                    ans = i;
        
                if (a % (x/i)==0 && b % (x/i) == 0) {
                    ans = x/i;
                    break;
                }
            }
            
            System.out.println(ans);
        }
    }
}
