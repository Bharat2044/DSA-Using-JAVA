/*
Problem Description:
Write a program to print all even numbers from 1 to N where you have to take N as input from the user. Note: Use while-loop OR for-loop, according to session flow.

Problem Constraints:
1 <= N <= 1000000

Input Format:
A single line representing N

Output Format:
All even numbers from 1 to N are separated by spaces.

Example Input:
Input 1:
5
Input 2:
10

Example Output:
Output 1:  
2 4 
Output 2:
2 4 6 8 10
*/


import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            if(i%2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
