/*
Problem Description:
You are given two integers N and M, find the value of N raised to the power of M i.e. NM

Problem Constraints:
1 <= N <= 10
0 <= M <= 9

Input Format:
First line of input contains an integer N.
Second line of input contains an integer M.

Output Format:
Print the value of NM.

Example Input:
Input 1:
2 2
Input 2:
3 1
 
Example Output:
Output 1:
4
Output 2:
3

Example Explanation:
Explanation 1:
N = 2, M = 2, 22 = 4.
Explanation 2:
N = 3, M = 1, 31 = 3
*/



import java.util.Scanner;

public class FindPower {

    /**
     * This method computes n raised to the power of m (n^m).
     *
     * Time Complexity: O(M) - The loop runs M times, where M is the exponent.
     * Space Complexity: O(1) - Uses a constant amount of space for the variables.
     */
    public static int power(int n, int m) {
        // return (int)(Math.pow(n, m)); // Predefined methods
     
        // Initialize the result to 1 (any number to the power of 0 is 1)
        int ans = 1;

        // Multiply 'ans' by 'n', 'm' times
        for (int i = 1; i <= m; i++) {
            ans = ans * n;
        }

        // Return the computed power
        return ans;
    }
 
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Read the base number 'n' from input
        int n = sc.nextInt();

        // Read the exponent 'm' from input
        int m = sc.nextInt();

        // Call the power method and print the result
        System.out.println(power(n, m));
    }
}
