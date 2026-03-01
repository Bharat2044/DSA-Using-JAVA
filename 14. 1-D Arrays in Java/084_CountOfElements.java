/*
Problem Description
Given an array A of N integers. 
Count the number of elements that have at least 1 elements greater than itself.

Problem Constraints
1 <= N <= 10^3
1 <= A[i] <= 10^9

Input Format
First and only argument is an array of integers A.

Output Format
Return the count of elements.

Example Input
Input 1:
A = [3, 1, 2]
Input 2:
A = [5, 5, 3]

Example Output
Output 1:
2
Output 2:
1

Example Explanation
Explanation 1:
The elements that have at least 1 element greater than itself are 1 and 2
Explanation 2:
The elements that have at least 1 element greater than itself is 3
*/



import java.util.*; // Importing all utility classes (Scanner, Arrays, etc.)

// Class declaration
public class CountOfElements {

    /*
    ----------------------------------------------------
    Approach 1: Using Two Loops (Brute Force)
    ----------------------------------------------------
    Time Complexity  : O(n^2)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    /*
    public static int countElementsLessThanMax(int[] arr) {

        int n = arr.length; // Store length of array
        int count = 0; // Variable to count elements less than maximum

        // Loop through each element
        for (int i = 0; i < n; i++) {

            // Compare current element with every other element
            for (int j = 0; j < n; j++) {

                // If current element is greater than any other element
                if (arr[i] > arr[j]) {
                    count++; // It means this element is not maximum
                    break; // No need to check further
                }
            }
        }

        return count; // Return total count
    }
    */


    /*
    ----------------------------------------------------
    Approach 2: Sorting the Array
    ----------------------------------------------------
    Time Complexity  : O(n log n)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    /*
    public static int countElementsLessThanMax(int[] arr) {

        int n = arr.length; // Store array length

        Arrays.sort(arr); // Sort the array in ascending order

        int count = 1; // Start count from 1 (last element is max)

        // Traverse from second last element backwards
        for (int i = n - 2; i >= 0; i--) {

            // If element is equal to next element (same max value)
            if (arr[i] == arr[i + 1]) {
                count++; // Increase frequency of maximum
            } else {
                break; // Stop when value changes
            }
        }

        return n - count; // Total elements minus max frequency
    }
    */


    /*
    ----------------------------------------------------
    Approach 3: Two Pass (Find Max, Then Count)
    ----------------------------------------------------
    Time Complexity  : O(n)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    /*
    public static int countElementsLessThanMax(int[] arr) {

        int n = arr.length; // Store length
        int max = Integer.MIN_VALUE; // Initialize max to smallest possible integer
        int count = 0; // Variable to count frequency of max

        // First loop to find maximum element
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) { // If current element is greater
                max = arr[i]; // Update max
            }
        }

        // Second loop to count how many times max appears
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) { // If element equals max
                count++; // Increase count
            }
        }

        return n - count; // Return elements less than max
    }
    */


    /*
    ----------------------------------------------------
    Approach 4: Single Pass (Optimal)
    ----------------------------------------------------
    Time Complexity  : O(n)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    public static int countElementsLessThanMax(int[] arr) {

        int n = arr.length; // Store length of array

        int max = arr[0]; // Assume first element is maximum
        int count = 1; // Frequency of max starts at 1

        // Traverse from second element to end
        for (int i = 1; i < n; i++) {

            // If current element is greater than max
            if (arr[i] > max) {
                max = arr[i]; // Update max
                count = 1; // Reset frequency
            } 
            // If current element equals max
            else if (arr[i] == max) {
                count++; // Increase frequency
            }
        }

        return n - count; // Return count of elements less than max
    }


    /*
    ----------------------------------------------------
    Main Method (Program Execution Starts Here)
    ----------------------------------------------------
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter size of the array: "); // Ask user for size
        int n = sc.nextInt(); // Read size

        int[] arr = new int[n]; // Create array of size n

        System.out.println("Enter array elements:"); // Ask user for elements

        // Loop to read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Store each element
        }

        // Print the results
        System.out.println(countElementsLessThanMax(arr));
    }
}
