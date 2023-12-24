/*
Problem Description:
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.

Problem Constraints:
0 <= n <= 10^3

Input Format:
Single input parameter n in function.

Output Format:
Return the count of prime numbers less than or equal to n.

Example Input:
Input 1: 19
Input 2: 1


Example Output:
Output 1: 8
Output 2: 0

Example Explanation:
Explanation 1: Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19Explanation 2: There are no primes <= 1 
*/


import java.util.Scanner;

public class CountOfPrimes { 
  
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        
        for(int i=2; i*i<=n; i++) {
            if(n%i == 0) {
                return false;
            }
        }  
        
        return true;
    }

    public static int countOfPrimes(int n) {
        int count = 0;
        
        for(int i=1; i<=n; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        
        int ans = countOfPrimes(n);
          
        System.out.println(ans);
    }
}