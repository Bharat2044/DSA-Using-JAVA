/*
Problem Description:
Take input an array A of size N and write a program to print maximum and minimum elements of the input. The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.

Problem constraints:
1 <= N <= 1000
1 <= A <= 1000

Input Format:
The first line contains a single integer N representing the length of the array A followed by N elements of the array A.

Output Format:
A single line output containing two space-separated integers.
The first integer is the maximum value of the array.
The second integer is the minimum value of the array.

Example Input:
Input 1:
5 1 2 3 4 5
Input 2:
4 10 50 40 80

Example Output:
Output 1:
5 1
Output 2:
80 10

Note: There is no space after the minimum value in the output format. There is only a single space between the maximum and minimum value.

Write a program to print maximum and minimum elements of the input
*/


import java.util.Scanner;

public class MaxAndMinElementOfAnArray {

    /**
     * Finds the maximum and minimum values in the array.
     * 
     * Time Complexity: O(n), where n is the length of the input array.
     * Space Complexity: O(1), as no additional space is used other than a few variables.
     */
    public static int[] findMaxAndMin(int[] arr) {
        
        int max = arr[0]; // Initialize max with the first element of the array
        int min = arr[0]; // Initialize min with the first element of the array
        
        // Iterate through the array to find max and min
        for (int i = 1; i < arr.length; i++) {
            // Update max if current element is greater than max
            if (arr[i] > max) {
                max = arr[i]; 
            }
            
            // Update min if current element is smaller than min
            if (arr[i] < min) {
                min = arr[i]; 
            }
        }
        
        return new int[]{max, min}; // Return an array containing max and min values
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
        
        // Call findMaxAndMin to get the maximum and minimum values
        int[] result = findMaxAndMin(arr);
        
        // Print the maximum and minimum values
        System.out.print(result[0] + " " + result[1]);
        
        // Close the Scanner object to release resources
        sc.close();
    }
}
