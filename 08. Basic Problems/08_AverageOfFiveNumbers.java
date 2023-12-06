/*
Problem Description:
Given 5 numbers A, B, C, D, E as input. Print the average of these 5 numbers (correct up to 2 decimal places).</div>

Problem Constraints:
1 <= A, B, C, D, E <= 104</div>

Input Format:
There are five lines in the input.
Each line has an integer.</div>

Output Format:
Print the average of the input numbers (correct up to 2 decimal places).</div>

Example Input:
Input:-
2 2 51 27 73

Example Output:
Output:-
31.00
*/


import java.util.Scanner;
public class AverageOfFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        float avg = (a + b + c + d + e) / 5.0f;
        
        System.out.printf("%.2f", avg);
    }
}
