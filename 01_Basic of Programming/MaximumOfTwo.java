/*
Problem Description:
Write a program to input two numbers(A & B) from user and print the maximum element among A & B in each line.

Problem Constraints:
1 <= A <= 1000000
1 <= B <= 1000000

Input Format:
First line is a single integer A.
Second line is a single integer B.

Output Format:
One line containing the greater integer A or B.

Example Input:
Input 1:
5 
6
Input 2: 
1000 
10000
 
Example Output:
Output 1:
6
Output 2:
10000
 
Example Explanation:
Explanation 1:
Clearly, among 5 and 6, 6 is maximum.
Explanation 2:
Clearly, among 1000 and 10000, 10000 is maximum.
*/



import java.util.Scanner;

public class MaximumOfTwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
