/*
Problem Description:
You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
You have to print the odd and even elements of array A in 2 separate lines.

NOTE: Array elements should have the same relative order as in A.

Problem Constraints:
1 <= T <= 10
1 <= |A| <= 10^5
1 <= A[i] <= 10^9

Input Format:
First line of the input contains a single integer T.

For each test case:
First line consists of a single integer |A| denoting the length of array.
Second line consists of |A| space separated integers denoting the elements of array A.


Output Format
For each test case:
First line should contain an array of space separated integers containing all the odd elements of array A
Second line should contain an array of space separated integers containing all the even elements of array A

Example Input
Input 1:
2  
5 
  1 2 3 4 5 
3 
  4 3 2
Input 2:
2  
3 
  2 2 2 
2 
  1 1

Example Output:
Output 1:
 1 3 5 
 2 4 
 
 3 4 
 2
Output 2:
 2 2 2 
 
 1 1     

Example Explanation:
Explanation 1:
Test Case 1:  Odd elements in the array(in the order they occur) are: 1, 3, 5. Even elements in the array(in the order they occur) are: 2, 4.
Test Case 2  Odd elements in the array(in the order they occur) are: 3. Even elements in the array(in the order they occur) are: 4, 2.

Explanation 2:
Test Case 1:  There are no odd elements in the array. Even elements in the array(in the order they occur) are: 2, 2, 2.
Test Case 2  Odd elements in the array(in the order they occur) are: 1, 1. There are no even elements in the array.
*/



import java.util.ArrayList;
import java.util.Scanner;

public class SeparateOddEvenNumbers {
    
    /*
     * 1st Approach: Method to print odd and even numbers of an array
     * 
     * Time Complexity: O(N)
     *   - N is the number of elements in the array.
     *   - The method iterates through the array twice, once for odd numbers and once for even numbers.
     * 
     * Space Complexity: O(1)
     *   - The method uses a constant amount of extra space regardless of input size.
     *   - It only uses a few variables to store temporary values.
     */
    /*
    public static void printOddEvenNumbers(int[] arr) {
    
        // Print odd numbers
        for(int i = 0; i < arr.length; i++) {
            // Check if the number is odd
            if(arr[i] % 2 != 0) { 
                System.out.print(arr[i] + " "); // Print the odd number followed by a space
            }
        }
        
        System.out.println(); // Move to the next line after printing all odd numbers
        
        // Print even numbers
        for(int i = 0; i < arr.length; i++) {
            // Check if the number is even
            if(arr[i] % 2 == 0) { 
                System.out.print(arr[i] + " "); // Print the even number followed by a space
            }
        }
        
        System.out.println(); // Move to the next line after printing all even numbers
    }
    */
    
    
    /*
     * 2nd Approach: Method to print odd and even numbers of an array using ArrayLists
     * 
     * Time Complexity: O(N)
     *   - N is the number of elements in the array.
     *   - The method iterates through the array once to categorize numbers into odd and even.
     * 
     * Space Complexity: O(N)
     *   - The method uses additional space to store oddList and evenList, each potentially
     *     containing up to N/2 elements in the worst case (all odd or all even numbers).
     */
    public static void printOddEvenNumbers(int[] arr) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        
        // Categorize numbers into oddList and evenList
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
        
        // Print odd numbers
        for (int i = 0; i < oddList.size(); i++) {
            System.out.print(oddList.get(i) + " ");
        }
        
        System.out.println(); // Move to the next line after printing all odd numbers
        
        // Print even numbers
        for (int i = 0; i < evenList.size(); i++) {
            System.out.print(evenList.get(i) + " ");
        }
        
        System.out.println(); // Move to the next line after printing all even numbers
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt(); 
        
        // Loop through each test case
        for (int i = 0; i <= t; i++) { 
            // Read the size of the array for this test case
            int n = sc.nextInt(); 
            
            // Initialize an array to store the elements
            int[] arr = new int[n]; 
            
            // Read the elements of the array
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt(); // Read each element and store it in the array
            }
            
            // Call the method to print odd and even numbers
            printOddEvenNumbers(arr); 
        }
        
        sc.close(); // Close the scanner to release resources
    }
}
