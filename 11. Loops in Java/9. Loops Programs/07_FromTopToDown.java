/*
Problem Description:
Write a program to print all Natural numbers from 1 to N where you have to take N as input from user.

Problem Constraints:
1 <= N <= 1000000

Input Format:
A single line representing N

Output Format:
N space separated integers from 1 to N.

Example Input:
Input 1:
5
Input 2:
10

Example Output:
Output 1:
1 2 3 4 5 
Output 2:
1 2 3 4 5 6 7 8 9 10 
*/


import java.util.Scanner;

class FromTopToDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Using for loop
        for(int i=1; i<=n; i++) {
            System.out.print(i + "  ");
        }
        
        // Using while loop
        /*
        int i = 1;
        while(i <= n) {
            System.out.print(i + "  ");
            i++;
        }
        */
        
        // Using do-while loop
        /*
        int i = 1;
        do {
            System.out.print(i + "  ");
            i++;
        } while(i <= n);
        */
    }
}
