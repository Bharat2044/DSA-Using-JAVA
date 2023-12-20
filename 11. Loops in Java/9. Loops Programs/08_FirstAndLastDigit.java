/*
Problem Description:
Write a program to input T numbers(N) from user and print first and last digits of the given numbers.

Problem Constraints:
1 <= T <= 1000
0 <= N <= 100000000

Input Format:
First line is T which means number of test cases.
Each next T lines contain an integer N.

Output Format:
T lines each containing two space separated integers representing first and last digits of the input integer.

Example Input:
Input 1:
2
5
1001
Input 2:
2
10023
1589

Example Output:
Output 1:
5 5
1 1
Output 2:
1 3
1 9

Example Explanation:
Explanation 1:
5 has fist and last digits same.1001 also has fist and last digits same.
Explanation 2:
10023 has 1 as first digit and 3 as last digit.1589 has 1 as first digit and 9 as last digit.
*/


import java.util.Scanner;

public class FirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        // 2nd Approach => TC = O(t * log(logn)), SC = O(1)
        for(int i=1; i<=t; i++) {
            int n = sc.nextInt();
            
            if(n == 0) {
                System.out.println(0 + "  " + 0);
                break;
            }
            
            int last = n%10;
            
            // Find total number of digits - 1
            int digits = (int)(Math.log10(n));
            // Find first digit
            int first = (int)(n / (int)(Math.pow(10, digits)));
            
            System.out.println(first + "  " + last);
        }
        
        
        /*
        // 1st Approach => TC = O(t * logn), SC = O(1)
        for(int i=1; i<=t; i++) { 
            int n = sc.nextInt();
            
            if(n == 0) {
                System.out.println(0 + "  " + 0);
                break;
            }
            
            int last = n%10;
            int first = n;
            
            while(n > 0) {
                first = n%10;
                n /= 10;
            }
            System.out.println(first + "  " + last);
        }
        */
    }
}
