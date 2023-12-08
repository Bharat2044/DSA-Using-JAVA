/*
Problem Description:
You are given an integer N you need to print all the Prime Numbers between 1 and N.
Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.

Problem Constraints:
1 <= N <= 300

Input Format:
First and only line of input contains a single integer N.

Output Format:
Print all the prime numbers between between 1 and N each in a new line.

Example Input:
Input 1:
5
Input 2:
10

Example Output:
Output 1:
2 3 5
Output 2:
2 3 5 7

Example Explanation:
Explanation 1:
Prime numbers between [1, 5] are (2, 3, 5).
Explanation 2:
Prime numbers between [1, 10] are (2, 3, 5, 7)
*/


import java.util.Scanner;

public class PrintThePrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // TC = O(n* sqrt(n)), SC = O(1)
        for(int x=1; x<=n; x++) {
            boolean flag = true;
            
            for(int i=2; i*i<=x; i++) {
                if(x%i == 0) {
                    flag = false;
                    break;
                }
            }  
        
            if(flag && x != 1) {
                System.out.print(x + "  ");
            }
        }
    }
}
