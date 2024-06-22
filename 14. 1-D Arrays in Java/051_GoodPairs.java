/*
Problem Description:
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). 
Check if any good pair exist or not.

Problem Constraints:
1 <= n, A.size() <= 10^4
1 <= A[i] <= 10^9
1 <= B <= 10^9

Input Format:
First argument is an integer array A.
Second argument is an integer B.

Output Format:
Return true if good pair exist otherwise return false.

Example Input:
Input 1:
n = 4
A = [1,2,3,4]
B = 7
Input 2:
n = 3
A = [1,2,4]
B = 4
Input 3:
n = 3
A = [1,2,2]
B = 4

Example Output:
Output 1:
true
Output 2:
false
Output 3:
true

Example Explanation
Explanation 1:
 (i,j) = (3,4)
Explanation 2:
No pair has sum equal to 4.
Explanation 3:
 (i,j) = (2,3)
*/



import java.util.Scanner;
import java.util.Arrays;

public class GoodPairs {
    /**
     * 1st Approach
     * Checks if there exists a pair of elements in the given array whose sum is equal to b.
     *
     * Time Complexity: O(n^2), where n is the length of the array.
     * Space Complexity: O(1), as no additional space is used other than the input and a few variables.
     */
    /*
    public static boolean goodPairs(int[] arr, int b) {
        // Iterate over each pair of elements in the array
        for(int i = 0; i < arr.length-1; i++) { 
            for(int j = i+1; j < arr.length; j++) {
                // Check if the sum of the current pair is equal to b
                if(arr[i] + arr[j] == b) {
                    return true;
                }
            }
        }
        
        // Return false if no such pair is found
        return false;
    }
    */
    
    
    /**
     * 2nd Approach
     * Checks if there exists a pair of elements in the given array whose sum is equal to b.
     *
     * Time Complexity: O(n * log(n)), where n is the length of the array due to sorting.
     * Space Complexity: O(1), as no additional space is used other than the input and a few variables.
     */
    public static boolean goodPairs(int[] arr, int b) {
        // Sort the array to enable two-pointer technique
        Arrays.sort(arr);
        
        // Initialize two pointers
        int left = 0;
        int right = arr.length - 1;
        
        // Iterate while the two pointers do not cross each other
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            // Check if the sum of the current pair is equal to b
            if (sum == b) {
                return true;
            }
            // Move the left pointer to the right if the sum is less than b
            else if (sum < b) {
                left++;
            } 
            // Move the right pointer to the left if the sum is greater than b
            else {
                right--;
            }
        }
        
        // Return false if no such pair is found
        return false;
    }
    
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in); 
        
        // Read the number of elements in the array
        int n = sc.nextInt(); 
        
        // Initialize the array with the given number of elements
        int[] arr = new int[n]; 
        
        // Read each element of the array from the input
        for(int i = 0; i < n; i++) { 
            arr[i] = sc.nextInt(); 
        }
        
        // Read the target sum to check for
        int b = sc.nextInt();
        
        // Call goodPairs to check if there exists a pair with the given sum
        boolean ans = goodPairs(arr, b);
        
        // Print the result
        System.out.print(ans);
        
        // Close the Scanner object
        sc.close(); 
    }
}
