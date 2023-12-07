/*
Problem Description:
Write a function that takes a positive number A as an argument and returns the sum of all numbers from 1 to A.

Problem Constraints:
1 <= A <= 109

Input Format:
The first argument is a single integer A.

Output Format:
Return a single integer that is the sum of all numbers from 1 to A.

Example Input:
Input 1:
A = 4
Input 2:
A = 10

Example Output:
Output 1:
10
Output 2:
55

Example Explanation:
Explanation 1:
1 + 2 + 3 + 4 = 10
Explanation 2:
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
*/


import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        // 2nd Approach => TC = O(1), SC = O(1)
        int sum = a*(a+1)/2;
        System.out.println(sum);
        
        /*
        // 1st Approach =>  TC = O(a), SC = O(1)
        int sum = 0;
        for(int i=1; i<=a; i++) {
            sum += i;
        }
        System.out.println(sum);
        */
    }
}
