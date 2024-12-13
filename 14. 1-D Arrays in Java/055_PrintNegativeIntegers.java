/*
Problem Description:
Write a program to print all negative numbers from input array A of size N. 
Take integer N and N elements of the array as input from user.

Problem Constraints:
1 <= N <= 1000
-1000 <= A <= 1000

Input Format:
A single line representing N followed by N integers of the array A

Output Format:
A single line containing elements from the input array which are negative in the same order.

Example Input:
Input 1:
5 
1 -5 2 -8 -4
Input 2:
4 
-1 0 -8 -1

Example Output:
Output 1:
-5 -8 -4
Output 2:
-1 -8 -1

Example explanation:
Output 1:
all the negative elements of [5 1 -5 2 -8 -4] are [-5 -8 -4]
Output 2:
all the negative elements of [4 -1 0 -8 -1] are [-1 -8 -1]
*/



import java.util.Scanner;

public class PrintNegativeIntegers {

    /**
     * Prints all negative integers from the input array.
     * 
     * Time Complexity: O(n), where n is the length of the input array.
     * Space Complexity: O(1), as no additional space is used other than a few variables.
     */
    public static void printNegativeIntegers(int[] arr) {
       
        // Iterate through the array to find and append negative integers to StringBuilder
        for (int i = 0; i < arr.length; i++) {
          
            // Check if current element is negative
            if (arr[i] < 0) { 
                System.out.print(arr[i] + "  ");
            }
        }
    }

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements in the array
        int n = sc.nextInt();
        
        // Initialize the array with the given number of elements
        int[] arr = new int[n];
        
        // Read each element of the array from the input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Call printNegativeIntegers to print all negative integers in the array
        printNegativeIntegers(arr);
        
        // Close the Scanner object to release resources
        sc.close();
    }
}
