/*
Problem Description:
Given two numbers A and B. Print the floor of A/B.

Problem Constraints:
1 <= A, B <= 104

Input Format:
here are two input lines
The first line has a single integer A.
The second line has a single integer B.</div>

Output Format:
Print the floor of A/B in a single line.

Example Input:
Input 1:
4 
5
Input 2:
16 
2

Example Output:
Output 1:
0
Output 2:
8

Example Explanation:
Explanation 1:
floor(4/5) = 0
Explanation 2:
floor(16/2) = 8
*/



import java.util.Scanner;

public class FloorOfAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(a / b);
    }
}
