/*
Problem Description:
Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive.

Problem Constraints:
1 <= N <= 2000000

Input Format:
A single line representing N

Output Format:
All odd numbers from 1 to N separated by spaces.

Example Input:
Input 1:
5
Input 2:
10

Example Output:
Output 1:
1 3 5 
Output 2:
1 3 5 7 9 
*/


import java.util.Scanner;

class OddGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            if(i%2 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}
