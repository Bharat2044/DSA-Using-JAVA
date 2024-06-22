/*
Problem Description:
You are given a constant array A and an integer B.
You are required to return another array where outArr[i] = A[i] + B.

Problem Constraints:
1 <= n, A.size() <= 10000
1 <= A[i] <= 10000
1 <= B <= 10000

Input Format:
First argument is a constant array A.
Second argument is an integer B.

Output Format:
You have to return an integer array.

Example Input:
Input 1:
n = 5
A = [1,2,3,2,1]
B = 3
Input 2:
n = 3
A = [1,1,10]
B = 6

Example Output:
Output 1:
 [4,5,6,5,4] 
Output 2:
 [7,7,16] 

Example Explanation:
Explanation 1:
A[0] + 3 = 1 + 3 = 4  
A[1] + 3 = 2 + 3 = 5
A[2] + 3 = 3 + 3 = 6
A[3] + 3 = 2 + 3 = 5
A[4] + 3 = 1 + 3 = 4
*/



import java.util.Scanner;

public class ModifyArray {
    /**
     * Modifies the given array by adding the integer b to each element.
     * 
     * Time Complexity: O(n), where n is the length of the array.
     * Space Complexity: O(n), for storing the modified array.
     */
    public static int[] modifyArray(int[] arr, int b) {
        // Initialize a new array to store the modified elements
        int[] ans = new int[arr.length];
        
        // Iterate over each element in the input array
        for(int i = 0; i < arr.length; i++) { 
            // Add b to the current element and store the result in the new array
            ans[i] = arr[i] + b;
        }
        
        // Return the modified array
        return ans;
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
        
        // Read the integer to be added to each element of the array
        int b = sc.nextInt();
        
        // Call modifyArray to get the modified array
        int[] ans = modifyArray(arr, b);
        
        // Print each element of the modified array
        for(int i = 0; i < ans.length; i++) { 
            System.out.print(ans[i] + "  ");
        }
        
        // Close the Scanner object
        sc.close(); 
    }
}
