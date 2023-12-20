/*
Problem Description:
Take an integer A as input, determine whether it is palindromic or not.

A palindrome integer is an integer X for which reverse(X) = X where reverse(X) is X with its digits reversed. For e.g., reverse(123) = 321. 
Note : There will be no zeros at the start of a number.

Problem Constraints:
1 <= A <= 106

Input Format:
First and the only line contains a single integer A.

Output Format:
Print Yes if it is palindromic, else print No.

Example Input:
Input 1:
120 
Input 2:
1001 
Input 3:
131 
 
Example Output:
Output 1:
No 
Output 2:
Yes 
Output 3:
Yes 

Example Explanation:
Explanation 1:
For A = 120, reverse(A) = reverse(120) = 021 = 21 (removing leading zeroes). 120 is not equal to 21 
Explanation 2:
For A = 1001, reverse(A) = reverse(1001) = 1001, which is same as A.
Explanation 3:
For A = 131, reverse(A) = reverse(131) = 131, which is same as A. 
*/


import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int x = n;
        int rev = 0;
        
        // TC = O(logn), SC = O(1)
        while(n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        
        if(x == rev) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
