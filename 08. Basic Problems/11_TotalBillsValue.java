/*
Problem Description:
Given the value of a single bill and the number of bills you received, print the total value of the bills.

Note: The value of all the bills are same

Problem Constraints:
1 <= N <= 100
1 <= M <= 100

Input Format:
The first line of the input is an integer N denoting the value of a single bill.
The second line of the input is an integer M denoting the number of bills.

Output Format:
Print in a single line denoting the total value of bills.

Example Input:
Input:-
12
10

Example Output:
Output:-
120

Example Explanation:
Note: The problem constraints mean that when we test your code, the test cases used in the backend can have input values only within those constraints. You need not implement them in your code. You need to make sure your code will work for all such input values!
*/


import java.util.Scanner;
public class TotalBillsValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int totalBills = n * m;
        
        System.out.println(totalBills);
    }
}
