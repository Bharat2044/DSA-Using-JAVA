/*
Problem Description:
Take an integer A as input, you have to tell whether it is a prime number or not.
A prime number is a natural number greater than 1 which is divisible only by 1 and itself.

Problem Constraints:
1 <= A <= 106

Input Format:
First and only line of the input contains a single integer A.

Output Format:
Print YES if A is a prime, else print NO.

Example Input:
Input 1:
3 
Input 2:
4 

Example Output:
Output 1:
YES 
Output 2:
NO 

Example Explanation:
Explanation 1:
3 is a prime number as it is only divisible by 1 and 3.
Explanation 2:
4 is not a prime number as it is divisible by 2.
*/




import java.util.Scanner;

public class CountTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        /*
        // 1st Approach => TC = O(a), SC = O(1)
        if(a == 1) {
            System.out.println("NO");
        }
        else {
            boolean flag = true;
            for(int i=2; i<=a-1; i++) {
                if(a%i == 0) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }  
        
            if(flag) {
                System.out.println("YES");
            }
        }
        */
        
        
        /*
        // 2nd Approach => TC = O(a/2) = O(a), SC = O(1)
        if(a == 1) {
            System.out.println("NO");
        }
        else {
            boolean flag = true;
            for(int i=2; i<=a/2; i++) {
                if(a%i == 0) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }  
        
            if(flag) {
                System.out.println("YES");
            }
        }
        */
        
        
        /*
        // 3rd Approach => TC = O(sqrt(a)), SC = O(1)
        if(a == 1) {
            System.out.println("NO");
        }
        else {
            boolean flag = true;
            for(int i=2; i*i<=a; i++) {
                if(a%i == 0) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }  
        
            if(flag) {
                System.out.println("YES");
            }
        }
        */
        
        
        // 4th Approach => TC = O(sqrt(a)), SC = O(1)
        if(a == 2 || a == 3) {
            System.out.println("YES");
        }
        else if(a == 1 || a%2 == 0 || a%3 == 0) {
            System.out.println("NO");
        }
        else {
            boolean flag = true;
            for(int i=5; i*i<=a; i+=6) {
                if(a%i == 0 || a%(i+2) == 0) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }  
        
            if(flag) {
                System.out.println("YES");
            }
        }
    }
}
