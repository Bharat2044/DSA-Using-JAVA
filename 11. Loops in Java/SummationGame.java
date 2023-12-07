/*
Problem Description:
Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user.

Problem Constraints:
1 <= N <= 1000

Input Format:
A single line representing N

Output Format:
A single integer showing sum of all Natural numbers from 1 to N.

Example Input:
Input 1:
5
Input 2:
10

Example Output:
Output 1:
15
Output 2:
55
*/


import java.util.Scanner;

public class SummationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 2nd Approach => TC = O(1), SC = O(1)
        int sum = n*(n+1)/2;
        System.out.println(sum);
        
        /*
        // 1st Approach =>  TC = O(n), SC = O(1)
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
        */
    }
}
