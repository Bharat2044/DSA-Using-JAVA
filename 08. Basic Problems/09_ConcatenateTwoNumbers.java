/*
Problem Description:
Given two numbers A and B. Concatenate the two numbers and print it.

Problem Constraints:
1 <= A, B <= 104

Input Format:
There are two input lines
The first line has a single integer A.
The second line has a single integer B.

Output Format:
Print in a single line the concatenated number.

Example Input:
Input 1:-
4 5
Input 2:-
16 2

Example Output:
Output 1:-
45
Output 2:-
162

Example Explanation:
Explanation 1:-
Concatenation of 4 and 5 is 45.
Explanation 2:-
Concatenation of 16 and 2 is 162.
*/


import java.util.Scanner;
public class ConcatenateTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(a + "" + b);
    }
}
