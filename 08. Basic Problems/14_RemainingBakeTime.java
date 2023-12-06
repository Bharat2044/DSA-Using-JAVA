/*
Problem Description:
You're going to write some code to help you cook a gorgeous lasagna from your favorite cookbook. According to your cookbook, the Lasagna should be in the oven for 40 minutes. Given the time (in minutes), the lasagna has been in the oven, find how many more minutes the lasagna still needs to bake for.

Problem Constraints:
0 <= N <= 40

Input Format:
The only first line contains the integer N, denoting the actual time (in minutes) the lasagna has been in the oven for.

Output Format:
Print in a single line how many minutes the lasagna needs to bake.

Example Input:
Input: 
30

Example Output:
Output: 
10

Note: The problem constraints mean that when we test your code, the test cases used in the backend can have input values only within those constraints.
You need not implement them in your code.You need to make sure your code will work for all such input values!
*/


import java.util.Scanner;
public class RemainingBakeTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(40 - n);
    }
}
