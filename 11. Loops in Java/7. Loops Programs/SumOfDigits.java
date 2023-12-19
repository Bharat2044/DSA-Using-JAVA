/*
Problem Description:
Take T (number of test cases) as input.
For each test case, take integer N as input and Print the sum of digits of that number.

Problem Constraints:
1 <= T <= 10000 <= N <= 100000000

Input Format:
The first line is T which means the total number of test cases.Each of the next T lines contain an integer N.

Output Format:
T lines each containing one integer representing the sum of the digits of the input integer.

Example Input:
Input 1:
2 
5 1001
Input 2: 
2
123 1589

Example Output:
Output 1: 
5 2
Output 2:
6 23

Example Explanation:
Explanation 1:
5 has only 1 digit hence sum is 5. Sum(1001) = 1+0+0+1 = 2.
Explanation 2:
Sum(123) = 1+2+3 = 6. Sum(1589) = 1+5+8+9 = 23.
*/


import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        // TC = O(t * log(n)), SC = O(1)
        for(int i=1; i<=t; i++) {
            int n = sc.nextInt();
            int sum = 0;
            
            while(n > 0) {
                int digit = n%10;
                sum += digit;
                n /= 10;
            }
            
            System.out.println(sum);
        }
    }
}
