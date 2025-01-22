// Question Links : GFG => https://practice.geeksforgeeks.org/problems/second-largest3735/1


/*
Problem Description:
You are given an integer array A of size n. You have to find the second largest element/value in the array or report that no such element exists.

Problem Constraints:
0 <= n <= 10^9 
1 <= |A| <= 10^5
0 <= A[i] <= 10^9

Input Format: 
The first argument is an integer array A.

Output Format:
Return the second largest element. If no such element exist then return -1.

Example Input:
Input 1:
n = 3
 A = [2, 1, 2] 
Input 2:
n = 1
 A = [2]

Example Output:
Output 1:
 1 
Output 2:
 -1 

Example Explanation:
Explanation 1:
 First largest element = 2 Second largest element = 1
Explanation 2:
 There is no second largest element in the array.
*/



import java.util.Scanner;
import java.util.Arrays;

public class SecondLargestElement {
    
    /*
     * 1st Approach - Using Sorting
     * Find the second largest element in an array using sorting
     * Time Complexity: O(n * log(n)) due to sorting
     * - Sorting the array takes O(n * log(n)) time complexity.
     * Space Complexity: O(1)
     * - We use a constant amount of extra space regardless of the input size.
     */
    /*
    public static int findSecondLargest(int[] arr) {
    
        // Get the length of the array
        int n = arr.length; 
        
        // If array has less than 2 elements, no second largest element exists
        if (n < 2) 
            return -1; // Return -1 indicating no second largest element

        // Sort the array to easily find the second largest element
        Arrays.sort(arr);

        int secondLargest = Integer.MIN_VALUE; // Initialize with the largest possible integer value
        // Traverse from the second last element to find the second largest element
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) { // Check for duplicates and ignore them
                secondLargest = arr[i]; // Update secondLargest if different from the largest element
                break; // Exit loop once second largest element is found
            }
        }

        // Return secondLargest or -1 if not found
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest; 
    }
    */
    
    
    /**
     * 2nd Approach - Using loop with 2 iteration
     * Find the second largest element in an array
     * Time Complexity: O(n)
     * - We traverse the array twice, which means the number of operations is proportional to the length of the array.
     * Space Complexity: O(1)
     * - We use a constant amount of extra space regardless of the input size.
     */
    /*
    public static int findSecondLargest(int[] arr) {
        // Get the length of the array
        int n = arr.length; 
        
        // If array has less than 2 elements, no second largest element exists
        if (n < 2) 
            return -1; // Return -1 indicating no second largest element
            
        int largest = Integer.MIN_VALUE;
        
        // Find the largest element in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE; // Initialize with the largest possible integer value
        
        // Find the second largest element by comparing with the largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // Return secondLargest or -1 if not found
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest; 
    }
    */
    
    
    /*
     * 3rd Approach - Using loop with 1 iteration
     * Find the second largest element in an array without sorting
     * Time Complexity: O(n)
     * - We traverse the array once, which means the number of operations is proportional to the length of the array.
     * Space Complexity: O(1)
     * - We use a constant amount of extra space regardless of the input size.
     */
    public static int findSecondLargest(int[] arr) {
     
        // If array has less than 2 elements, no second largest element exists
        if (arr.length < 2) 
            return -1; // Return -1 indicating no second largest element 
        
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE; // Initialize largest and secondLargest
        
        // Iterate through each element of array `arr`
        for (int num : arr) {
            // Check if the current element `num` is greater than `largest`.
            if (num > largest) {
                secondLargest = largest;  // Update secondLargest to previous largest
                largest = num;            // Update largest to current num
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;      // Update secondLargest if num is greater and not equal to largest
            }
        }
        
        // Return secondLargest or -1 if not found
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest; 
    }
    
    
    // Main method where program execution begins
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for reading input

        // Read the size of the array from input
        int n = sc.nextInt();

        // Read array elements from input
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element and store it in the array
        }

        // Find the second largest element in the array
        int result = findSecondLargest(arr);

        // Print the result
        System.out.println(result); // Output the second largest element found
    }
}
