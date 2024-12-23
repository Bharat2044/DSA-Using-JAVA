/*
Problem Description:
You are given an integer T (Number of test cases). For each test case, You are given an integer array A.
You have to find all the values that are uniquely present in the array i.e, values having number of occurrences = 1.

Problem Constraints:
1 <= T <= 10
1 <= |A| <= 10^3
0 <= A[i] <= 10^3

Input Format:
First line consists of a single integer T.
For each test case, on a separate line, first integer is |A| denoting the length of array, and then |A| integers denote the array elements (all integers separated by single spaces).

Output Format:
For each test case, print on a separate line, an integer array containing all such values in ascending order.

Example Input
Input 1:
 2 
 10 
 1 2 3 5 1 5 20 2 12 10 
 5 
 3 2 1 0 0
Input 2:
 2 
 2 
 1 1 
 1 
 5

Example Output:
Output 1:
 3 10 12 20  1 2 3
Output 2:
  5

Example Explanation:
Explanation 1:
 For Test Case 1: Number of occurrences of 1 = 2 Number of occurrences of 2 = 2 Number of occurrences of 3 = 1 Number of occurrences of 5 = 2 Number of occurrences of 10 = 1 Number of occurrences of 12 = 1 Number of occurrences of 20 = 1 Only 3, 10, 12 and 20 have number of occurrences = 1, i.e, they are uniquely present in the array.
For Test Case 2: Number of occurrences of 0 = 2 Number of occurrences of 1 = 1 Number of occurrences of 2 = 1 Number of occurrences of 3 = 1 Only 1, 2 and 3 have number of occurrences = 1, i.e, they are uniquely present in the array.
Explanation 2:
 For Test Case 1: Number of occurrences of 1 = 2 There is no uniquely present value. So, an empty array is printed on a separate line. For Test Case 2: Number of occurrences of 5 = 1 5 is uniquely present in the array.
*/



import java.util.*;

public class PrintAllUniqueElements {
    
    /**
     * 1st Approach: Method to find and print all unique elements in the array in ascending order.
     * 
     * Time Complexity: O(n^2)
     *   - Two nested loops iterating through the array leads to O(n^2) complexity.
     *   - For each element, we scan the entire array to count occurrences.
     * 
     * Space Complexity: O(1)
     *   - No additional space is used other than for basic variables.
     */
    /*
    public static void printAllUniqueElements(int[] arr) {
        
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            
            // Count occurrences of arr[i] in the array
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            
            // If count is 1, arr[i] is unique in the array
            if (count == 1) {
                System.out.print(arr[i] + " "); 
            }
        }
        
        System.out.println(); // Move to the next line after printing all unique elements
    }
    */


    /**
     * 2nd Approach: Method to find and print all unique elements in the array in ascending order.
     * 
     * Time Complexity: O(n * log(n))
     *   - Sorting the array takes O(n * log(n)) time.
     *   - Finding unique elements by scanning the sorted array takes O(n) time.
     * 
     * Space Complexity: O(1)
     *   - No additional space is used other than for sorting.
     */
    /*
    public static void printAllUniqueElements(int[] arr) {
        Arrays.sort(arr); // Sort the array in ascending order
        
        int n = arr.length;
        int i = 0;
        
        // Traverse the sorted array to find unique elements
        while (i < n) {
            int current = arr[i]; // Current element to check uniqueness
            int count = 0;
            
            // Count occurrences of current element
            while (i < n && arr[i] == current) {
                count++;
                i++;
            }
            
            // If count is 1, it means the element is unique
            if (count == 1) {
                System.out.print(current + " "); // Print the unique element
            }
        }
        
        // Move to the next line after printing all unique elements
        System.out.println(); 
    }
    */
    
    
     /**
     * 3rd Approach: Method to find and print all unique elements in the array in ascending order.
     * 
     * Time Complexity: O(n)
     *   - One pass to count occurrences using HashMap takes O(n) time.
     *   - Another pass to identify and print unique elements takes O(n) time.
     * 
     * Space Complexity: O(n)
     *   - HashMap space to store elements and their counts can go up to O(n) in the worst case.
     */
    public static void printAllUniqueElements(int[] arr) {
     
        // HashMap to store element counts
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Populate the count map
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Iterate through the array to find and print unique elements
        for (int num : arr) {
            if (countMap.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
        
        // Move to the next line after printing all unique elements
        System.out.println(); 
    }
    

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Read the number of test cases
        
        // Iterate through each test case
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt(); // Read the size of the array for this test case
            
            int[] arr = new int[n]; // Initialize an array to store the elements
            
            // Read the elements of the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // Read each element and store it in the array
            }
            
            // Call the method to find and print all unique elements for this test case
            printAllUniqueElements(arr);
        }
        
        sc.close(); // Close the scanner to release resources
    }
}
