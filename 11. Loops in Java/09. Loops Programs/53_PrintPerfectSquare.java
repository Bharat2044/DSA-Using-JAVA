/*
Problem Description:
Take an input of a number N from the user. Print all perfect squares less than or equal to N.
Note - Perfect squares are integers whose square root is an integer. (For Example: 16 is perfect square as √16 = 4, or 42 = 16)

Problem Constraints:
1 <= N <= 10^4

Input Format:
A single line consisting of a integer A.

Output Format:
Print perfect squares less than or equal to N in a single line in a space-separated manner.

Example Input:
Input 1:
20
Input 2:
100

Example Output:
Output 1:
1 4 9 16
Output 2:
1 4 9 16 25 36 49 64 81 100
*/



// Imports Scanner class for taking input from the user
import java.util.Scanner; 

public class Main {

    // Main method: execution starts from here
    public static void main(String[] args) {    

        // Create Scanner object to read input from standard input
        Scanner sc = new Scanner(System.in);
        
        // Read the input number
        int n = sc.nextInt(); 

        /*
        ----------------------------------------------------
        Approach - 1: Brute Force
        ----------------------------------------------------
        Time Complexity  : O(n)
        Space Complexity : O(1)
        ----------------------------------------------------
        Logic:
        - Check every number from 1 to n
        - If its square root is an integer, it is a perfect square
        ----------------------------------------------------
        */
        /*
        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {            

            // Check if square root of i is an integer
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                
                // Print perfect square number
                System.out.print(i + " ");                
            }
        }
        */
      

        /*
        ----------------------------------------------------
        Approach - 2: Optimized (BEST)
        ----------------------------------------------------
        Time Complexity  : O(√n)
        Space Complexity : O(1)
        ----------------------------------------------------
        Logic:
        - Generate perfect squares directly
        - Square of i is i*i
        - Stop when i*i becomes greater than n
        ----------------------------------------------------
        */
        // Loop runs till square of i is less than or equal to n
        for (int i = 1; i * i <= n; i++) {            

            System.out.print(i * i + " "); // Print the perfect square            
        }

        sc.close(); // Close Scanner to free resources        
    }
}
