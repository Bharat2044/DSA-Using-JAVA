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




import java.util.Scanner; // Import Scanner class for taking input

public class CheckPrime { // Class declaration
    public static void main(String[] args) { // Main method starts
        Scanner sc = new Scanner(System.in); // Create Scanner object
        int a = sc.nextInt(); // Read input number
        
        /*
        // 1st Approach => TC = O(a), SC = O(1)
        if(a == 1) { // If number is 1 (not prime)
            System.out.println("NO"); // Print NO
        }
        else {
            boolean flag = true; // Assume number is prime
            for(int i=2; i<=a-1; i++) { // Check divisibility from 2 to a-1
                if(a%i == 0) { // If divisible
                    System.out.println("NO"); // Not a prime
                    flag = false; // Mark as not prime
                    break; // Exit loop
                }
            }  
        
            if(flag) { // If no divisor found
                System.out.println("YES"); // Prime number
            }
        }
        */
        
        
        /*
        // 2nd Approach => TC = O(a/2) = O(a), SC = O(1)
        if(a == 1) { // If number is 1
            System.out.println("NO"); // Not prime
        }
        else {
            boolean flag = true; // Assume prime
            for(int i=2; i<=a/2; i++) { // Check till a/2
                if(a%i == 0) { // If divisible
                    System.out.println("NO"); // Not prime
                    flag = false; // Update flag
                    break; // Stop checking
                }
            }  
        
            if(flag) { // If still prime
                System.out.println("YES"); // Print YES
            }
        }
        */
        
        
        /*
        // 3rd Approach => TC = O(sqrt(a)), SC = O(1)
        if(a == 1) { // 1 is not prime
            System.out.println("NO"); // Print NO
        }
        else {
            boolean flag = true; // Assume prime
            for(int i=2; i*i<=a; i++) { // Loop till sqrt(a)
                if(a%i == 0) { // If divisible
                    System.out.println("NO"); // Not prime
                    flag = false; // Mark false
                    break; // Exit loop
                }
            }  
        
            if(flag) { // If no divisor found
                System.out.println("YES"); // Prime
            }
        }
        */
        
        
        // 4th Approach => TC = O(sqrt(a)), SC = O(1)
        if(a == 2 || a == 3) { // 2 and 3 are prime numbers
            System.out.println("YES"); // Print YES
        }
        else if(a == 1 || a%2 == 0 || a%3 == 0) { // If 1 or divisible by 2 or 3
            System.out.println("NO"); // Not prime
        }
        else {
            boolean flag = true; // Assume prime
            for(int i=5; i*i<=a; i+=6) { // Check numbers of form 6k±1
                if(a%i == 0 || a%(i+2) == 0) { // If divisible by i or i+2
                    System.out.println("NO"); // Not prime
                    flag = false; // Update flag
                    break; // Exit loop
                }
            }  
        
            if(flag) { // If still prime
                System.out.println("YES"); // Print YES
            }
        }
    }
}
