/*
Problem Description:
Write a program to print all Natural numbers from N to 1 where you have to take N as input from user.

Problem Constraints:
1 <= N <= 10000000

Input Format:
A single line representing N.

Output Format:
N space separated integers from N to 1.

Example Input:
Input 1:
5
Input 2:
10

Example Output:
Output 1:
5 4 3 2 1 
Output 2:
10 9 8 7 6 5 4 3 2 1 
*/


import java.util.Scanner;

class FromDownToTop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Using for loop
        for(int i=n; i>=1; i--) {
            System.out.print(i + "  ");
        }
        
        // Using while loop
        /*
        int i = n;
        while(i >= 1) {
            System.out.print(i + "  ");
            i--;
        }
        */
        
        // Using do-while loop
        /*
        int i = n;
        do {
            System.out.print(i + "  ");
            i--;
        } while(i >= 1);
        */
    }
}
