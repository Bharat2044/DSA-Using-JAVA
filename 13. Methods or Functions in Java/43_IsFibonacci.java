/*
Laxman is newbie in programming. He just learned how to generate fibonacci series, he told this to his elder brother, so his brother gave him an interesting problem.
The problem is, given an integer N, task is to check whether the given number exist in fibonacci sequence or not.

INPUT:
The first line contains an integer, T, denoting the number of test cases.
Next T lines contains an integer, N.

OUTPUT:
For each test case , print “Yes” if the number exists in fibonacci sequence, else print “No”.

CONSTRAINTS:
• 1 ≤ T ≤ 10^5
• 1 ≤ N ≤ 10^9

SAMPLE INPUT:
1
8

SAMPLE OUTPUT:
Yes

EXPLANATION:
Fibonacci Series is: 0 1 1 2 3 5 8, As 8 is the part of Fibonacci series so the output is “Yes”
*/


import java.util.Scanner;

public class IsFibonacci { 
    
    // TC = O(t * n), SC = O(1)
    public static boolean isFibonacci(int n) {
        if(n == 0 || n == 1)
            return true;
            
        int a = 0, b = 1;
        
        while (true) {
            int t = a + b;
            a = b;
            b = t;
            
            if (t == n)
                return true;
            
            else if (t >= n) {
                return false;
            }
        }
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        for(int i=1; i<=t; i++) {
            int n = sc.nextInt();
            
            if(isFibonacci(n)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
