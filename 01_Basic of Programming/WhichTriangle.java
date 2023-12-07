/*
Problem Description:
Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.
You have to print if the traingle is "equilateral", "scalene" or "isosceles".

Problem Constraints:
1 <= A <= 100000
1 <= B <= 100000
1 <= C <= 100000

Input Format:
One line containing three space separated integers A, B & C.

Output Format:
One string either "equilateral", "scalene" or "isosceles".

Example Input:
Input 1:
5 6 7
Input 2:
30 30 30

Example Output:
Output 1:
scalene
Output 2:
equilateral

Example Explanation:
Explanation 1:
Since all sides are different, hence it's a scalene triangle.
Explanation 2:
Since all sides are same, hence it's a equilateral triangle.
*/


import java.util.Scanner;

class WhichTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a==b && b==c) {
            System.out.println("equilateral");
        }
        else if(a==b || b==c || c==a) {
            System.out.println("isosceles");
        }
        else {
            System.out.println("scalene");
        }
    }
}
