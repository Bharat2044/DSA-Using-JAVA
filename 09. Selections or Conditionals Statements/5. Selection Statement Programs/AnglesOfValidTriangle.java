/*
Problem Description:
You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.
A triangle is valid if sum of its angles equals to 180.

Problem Constraints:
1 <= A, B, C <= 180

Input Format:
First line of the input contains an integer A.
Second line of the input contains an integer B.
Third line of the input contains an integer C.

Output Format:
Print 1 if the triangle having given sides is valid, else print 0.

Example Input:
Input 1:
60 60 60
Input 2:
30 40 50

Example Output:
Output 1:
1 
Output 2:
0 

Example Explanation:
Explanation 1:
Sum of angles = A + B + C = 60 + 60 + 60 = 180 Hence, the given triangle is valid.
Explanation 2:
Sum of angles = A + B + C = 30 + 40 + 50 = 120 As sum of angles is not equal to 180, the given triangle is not valid.
*/


import java.util.Scanner;

class AnglesOfValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a+b+c == 180) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
