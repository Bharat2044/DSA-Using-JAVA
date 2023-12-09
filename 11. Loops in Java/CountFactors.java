/*
Problem Description:
Take an integer N as input and print the count of its factors.
The factor of a number is the number that divides it perfectly leaving no remainder.

Example: 1, 2, 3, and 6 are factors of 6

Problem Constraints:
1 <= N <= 300

Input Format:
The first and only line of input contains a single integer N.</div>

Output Format:
Print the count of factors of N.

Example Input:
Input 1:
5
Input 2:
10
Example Output:
Output 1:
2
Output 2:
4

Example Explanation:
Explanation 1:
Factors of 5 are 1 and 5.
Explanation 2:
Factors of 10 are 1, 2, 5 and 10.
*/


import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        /*
        // 1st Approach => TC = O(n), SC = O(1)
        int count = 0;
      
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
            
        System.out.println(count);
        */
        
        
        // 2nd Approach => TC = O(sqrt(n)), SC = O(1)
        int count = 0;
      
        for(int i=1; i*i<=n; i++) {
            if(n % i == 0) {
                count++;
                
                if(i * i != n) {
                  count++;
                }
            }
        }
            
        System.out.println(count);
    }
}
