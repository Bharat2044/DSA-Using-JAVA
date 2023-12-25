/*
Problem Description:
Given a number A. Return square of the number.

Problem Constraints:
1 <= A <= 104

Input Format:
First argument is an integer A.

Output Format:
Return an integer which is the square of A.

Example Input:
Input 1:
A = 4
Input 2:
A = 14

Example Output:
Output 1:
16
Output 2:
196

Example Explanation:
Explanation 1:
square(4) = 16
Explanation 2:
square(14) = 196
*/


import java.util.Scanner;

public class SquareOfANumber {
  
    public static int squareOfANumber(int n) {
        return n * n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        System.out.println(squareOfANumber(a));
    }
}
