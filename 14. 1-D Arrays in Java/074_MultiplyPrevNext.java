/*
Multiplication of previous and next

Given an array of integers A, update every element with multiplication of previous and next elements with following exceptions. a) First element is replaced by multiplication of first and second. b) Last element is replaced by multiplication of last and second last.

Input Format:
The only argument given is the integer array A.

Output Format:
Return the updated array.

Constraints: 
1 <= length of the array <= 100000
-10^4 <= A[i] <= 10^4 
 
For Example:
Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [2, 3, 8, 15, 20]
Input 2:
    A = [5, 17, 100, 11]
Output 2:
    [85, 500, 187, 1100]
*/



import java.util.Scanner;

public class MultiplyPrevNext {
    // Function to return the updated array as per the problem statement
    // Time Complexity = O(n), Space Complexity = O(n)
    public static int[] solve(int[] A) {
      
        // Get the length of the array
        int n = A.length;

        // If array has only one element, return it as-is
        if (n == 1) {
            return A;
        }

        // Create a new array to store results
        int[] result = new int[n];

        // First element is product of first and second 
        result[0] = A[0] * A[1];

        // Loop through the middle elements
        for (int i = 1; i < n - 1; i++) {
            result[i] = A[i - 1] * A[i + 1];  // Multiply previous and next elements
        }

        // Last element is product of last and second-last
        result[n - 1] = A[n - 2] * A[n - 1];

        // Return the updated array
        return result;
    }
    
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create an array of size n
        int[] A = new int[n];

        // Prompt user to enter the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();  // Read each element into the array
        }

        // Call the function to compute updated array
        int[] result = solve(A);

        // Print the resulting updated array
        System.out.println("Updated array:");
        for (int value : result) {
            System.out.print(value + " ");
        }

        // Close the Scanner
        sc.close();
    }
}
