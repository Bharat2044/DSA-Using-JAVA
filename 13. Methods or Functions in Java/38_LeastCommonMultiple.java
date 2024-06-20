/*
Problem Description:
Write a program to input an integer T and then for each test case input two integers A and B in two different lines and then print T lines containing Least Common Multiple (LCM) of two given 2 numbers A and B.
LCM of two integers is the smallest positive integer divisible by both.

Problem Constraints:
1 <= T <= 1000
1 <= A, B <= 1000

Input Format:
The first line contains T which means number of test cases.
Next 2T lines contains input A and B for each testcase.
First line of each testcase contain an integer A and second line of the testcase contains input B.

Output Format:
T lines each containing an integer representing LCM of A & B.

Example Input:
Input 1:
3
2  3
9  6
2  6

Example Output:
Output 1:
6
18
6

Example Explanation:
Explanation:
In first testcase 6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 3 (3 * 2 = 6).
In second testcase 18 is the smallest positive integer which is divisible by both 9 (9 * 2 = 18) and 6 (6 * 3 = 18).
In third testcase  6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 6 (6 * 1 = 6).
*/


import java.util.Scanner;

public class LeastCommonMultiple { 

    // Helper function to calculate the greatest common divisor (GCD) of two numbers
    // using the Euclidean algorithm
    // Time Complexity: O(log(min(a, b)))
    // Space Complexity: O(1)
    public static int gcd(int a, int b) {
        // Using the Euclidean algorithm for efficiency
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // 1st Approach: Calculate the least common multiple (LCM) of two numbers using brute-force
    // Time Complexity: O(a * b / gcd(a, b)) in the worst case when a and b are coprime
    // Space Complexity: O(1)
    public static int lcm(int a, int b) {
        int ans = Math.max(a, b); // Start with the larger of the two numbers
        
        // Increment ans until it is divisible by both a and b
        while (true) {
            if ((ans % a == 0) && (ans % b == 0)) {
                break;
            }
            
            ans++;
        }
        
        return ans;
    }
    
    // 2nd Approach: Calculate the least common multiple (LCM) of two numbers using GCD
    // Time Complexity: O(log(min(a, b))) due to the GCD calculation
    // Space Complexity: O(1)
    /*
    public static int lcm(int a, int b) {
        // LCM(a, b) = (a * b) / GCD(a, b)
        
        // This approach leverages the property of LCM and GCD
        return (a * b) / gcd(a, b);
    }
    */
    
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Loop through each test case
        for (int i = 1; i <= t; i++) {
            // Read the two integers A and B for the current test case
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            // Choose which LCM function to use
            int ans = lcm(a, b); 
            
            // Print the result for the current test case
            System.out.println(ans);
        }
        
        // Close the scanner object
        sc.close();
    }
}
