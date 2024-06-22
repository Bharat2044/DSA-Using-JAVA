/*
Problem Description:
You are given T(number of test cases) integer arrays. For each array A, you have to find the value of absolute difference between the counts of even and odd elements in the array.

Problem Constraints:
1 <= T <= 10
1 <= |A| <= 10^5
1 <= A[i] <= 10^9

Input Format:
First line contains a single integer T.
Each of the next T lines begin with an integer denoting the length of the array A (|A|), followed by |A| integers which indicate the elements in the array.

Output Format:
For each test case, print an integer in a separate line.

Example Input:
Input 1:
 1  
 4 
 1 2 3 4 
Input 2:
 1 
 4 
 2 3 5 1 
Input 3:
 1  
 1 
 4 

Example Output:
Output 1:
 0 
Output 2:
 2 
Output 3:
 1

Example Explanation:
Explanation 1:
 For 1st test case: Number of even elements = 2  Number of odd elements = 2 |Number of even elements - Number of odd elements| = |2 - 2| = 0 
Explanation 2:
 For 1st test case: Number of even elements = 1  Number of odd elements = 3 |Number of even elements - Number of odd elements| = |1 - 3| = |-2| = 2 
Explanation 3:
 For 1st test case: Number of even elements = 1  Number of odd elements = 0 |Number of even elements - Number of odd elements| = |1 - 0| = |1| = 1  
*/



import java.util.Scanner;

public class EvenOddElements {
    
    /**
     * Method to calculate the absolute difference between counts of even and odd elements
     * Time Complexity (TC): O(n) - The method iterates through the array once.
     * Space Complexity (SC): O(1) - Uses a fixed amount of extra space for counters.
     */
    public static int differenceCount(int[] arr) {
        int evenCount = 0; // Counter for even numbers
        int oddCount = 0; // Counter for odd numbers
        
        // Iterate through the array
        for(int i = 0; i < arr.length; i++) { 
            // Check if the current element is even
            if(arr[i] % 2 == 0) {
                evenCount++; // Increment even counter
            } else {
                oddCount++; // Increment odd counter
            }
        }
        
        // Return the absolute difference between even and odd counts
        return Math.abs(evenCount - oddCount);
    }
  
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in); 
        
        // Read number of test cases
        int t = sc.nextInt(); 
        
        // Iterate over each test case - TC = O(t * n)
        for(int i = 1; i <= t; i++) { 
            // Read the size of the array
            int n = sc.nextInt(); 

            // Create an array of size n
            int[] arr = new int[n]; 
            
            // Read array elements
            for(int j = 0; j < n; j++) { 
                arr[j] = sc.nextInt();
            }
            
            // Get the difference count and print it
            int count = differenceCount(arr); 
            System.out.println(count); 
        }
        
        sc.close(); // Close the scanner
    }
}
