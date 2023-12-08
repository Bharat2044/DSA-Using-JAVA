/*
Problem Description:
Write a program to input an integer(A) from user and print the Ath month of the year.

Months list: {January, February, March, April, May, June, July, August, September, October, November, December}

Problem Constraints:
1 <= A <= 12

Input Format:
One line containing an integer integer A.

Output Format:
One line containing the Ath month of the year.

Example Input:
Input 1:
1
Input 2:
6

Example Output:
Output 1:
January
Output 1:
June

Example Explanation:
Explanation 1:
Clearly, January is the 1st month.
Explanation 2:
Clearly, June is the 6th month.
*/


import java.util.Scanner;

public class WhichMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a == 1) {
            System.out.print("January");
        } else if(a == 2) {
            System.out.print("February");
        } else if(a == 3) {
            System.out.print("March");
        } else if(a == 4) {
            System.out.print("April");
        } else if(a == 5) {
            System.out.print("May");
        } else if(a == 6) {
            System.out.print("June");
        } else if(a == 7) {
            System.out.print("July");
        } else if(a == 8) {
            System.out.print("August");
        } else if(a == 9) {
            System.out.print("September");
        } else if(a == 10) {
            System.out.print("October");
        } else if(a == 11) {
            System.out.print("November");
        } else if(a == 12) {
            System.out.print("December");
        }
    }
}
