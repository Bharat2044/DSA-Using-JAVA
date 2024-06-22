/*
Problem Description:
You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.

Problem Constraints:
1 <= T <= 10
1 <= A <= 10^5
1 <= A[i], B <= 10^9

Input Format:
First line of the input contains number of test cases as single integer T .
Next, each of the test case consists of 3 lines:
First line contains a single integer A denoting the length of array
Second line contains A integers denoting the array elements
Third line contains a single integer B

Output Format:
For each test case, print on a separate line 1 if the element exists, else print 0.

Example Input:
Input 1:
 1  
 5  
 4 1 5 9 1 
 5
Input 2:
 1 
 3 
 7 7 2 
 1 
 
Example Output:
Output 1:
 1 
Output 2:
 0 

Example Explanation:
Explanation 1:
  B = 5  is present at position 3 in A 
Explanation 2:
  B = 1  is not present in A. 
*/



import java.util.Scanner;

public class SearchElement {

    /**
     * Method to search for element b in array arr.
     * 
     * Time Complexity: O(n)
     * - n is the number of elements in the array arr.
     * - The method iterates through the array arr to check each element.
     * 
     * Space Complexity: O(1)
     * - The method uses only a constant amount of extra space regardless of input size.
     */
    public static int searchElement(int[] arr, int b) {
      
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
          
            // Check if the current element matches b
            if (arr[i] == b) {
                return 1; // Return 1 if b is found in arr
            }
        }
      
        // Return 0 if b is not found in arr
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();

        // Iterate through each test case - TC = O(t * n)
        for (int i = 0; i < t; i++) {
            // Read the size of the array
            int n = sc.nextInt();

            // Initialize an array to store elements
            int[] arr = new int[n];

            // Read elements into the array
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            // Read the integer b to search for
            int b = sc.nextInt();

            // Call the searchElement method to find b in arr
            int ans = searchElement(arr, b);

            // Print the result (1 if found, 0 if not found)
            System.out.println(ans);
        }

        // Close the Scanner to release resources
        sc.close();
    }
}
