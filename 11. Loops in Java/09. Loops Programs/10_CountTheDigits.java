/*
Problem Description:
Take T (number of test cases) as input.
For each test case, take integer N as input and Print the count of digits of that number.

Note: No of digits for number 0 is considered as 1.

Problem Constraints:
1 <= T <= 1000 <= N <= 100000000

Input Format:
The first line is the number T which denotes the total number of test cases.Next T lines contain an integer N for which you have to print the number of digits.

Output Format:
For T different Numbers, Print the number of digits in separate lines.

Example Input:
Input 1: 2
0 1
Input 2: 
2
100
10101

Example Output:
Output 1:
1 1
Output 2:
3 5
Example Explanation:
Explanation 1:
0 and 1 both have only one digit.
Explanation 2:
100 has three digits and 10101 has 5 digits.
*/


import java.util.Scanner;

public class CountTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        // 2nd Approach => TC = O(t)), SC = O(1)
        for(int i=1; i<=t; i++) {
            int n = sc.nextInt();
            
            if(n == 0) {
                System.out.println(1);
            }
            else {
                int count = (int)(Math.log10(n) + 1);
                System.out.println(count);
            }
        }
        
        
        /*
        // 1st Approach => TC = O(t * log(n)), SC = O(1)
        for(int i=1; i<=t; i++) {
            int n = sc.nextInt();
            int count = 0;
            
            if(n == 0) {
                count++;
            }
            
            while(n > 0) {
                count++;
                n /= 10;
            }
            
            System.out.println(count);
        }
        */
    }
}
