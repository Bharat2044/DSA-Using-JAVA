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

    /**
     * This method checks if the given number is a Fibonacci number.
     *
     * Time Complexity: O(log n) - In the worst case, the Fibonacci number can be found in logarithmic steps due to exponential growth of Fibonacci numbers.
     * Space Complexity: O(1) - Uses a constant amount of space for the variables.
     *
     * @param n the number to check
     * @return true if the number is a Fibonacci number, false otherwise
     */
    public static boolean isFibonacci(int n) {
        // Check for the first two Fibonacci numbers
        if (n == 0 || n == 1) {
            return true;
        }
        
        // Initialize the first two Fibonacci numbers
        int a = 0, b = 1;
        
        // Generate Fibonacci numbers until we find n or exceed it
        while (true) {
            int t = a + b; // Compute the next Fibonacci number
            a = b; // Move to the next number in the sequence
            b = t; // Move to the next number in the sequence
            
            if (t == n) { // Check if we found the number
                return true;
            } else if (t > n) { // If we exceed the number, it is not in the sequence
                return false;
            }
        }
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();
        
        // Process each test case -> TC = O(t * logn)
        for (int i = 0; i < t; i++) {
            // Read the number to check
            int n = sc.nextInt();
            
            // Check if the number is a Fibonacci number and print the result
            if (isFibonacci(n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
