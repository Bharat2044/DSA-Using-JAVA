/*
Problem Description:
Given an integer in the input print its last digit.

Input Format:
Single line containing an integer.

Output Format:
Print in a single line the last digit of input integer.

Problem Constraints:
1 <= N <= 1000

Example Input:
Input 1:-
3
Input 2:-
29

Example Output:
Output 1:-
3
Output 2:-
9
*/



import java.util.Scanner;
public class PrintLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(n % 10);
    }
}
