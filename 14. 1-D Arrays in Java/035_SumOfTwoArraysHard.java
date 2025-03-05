/*
i/p: 
n1 = 3
arr1 = 4 9 7
n2 = 5
arr2 = 9 4 6 3 2
o/p: 9 5 1 2 9

n1 != n2   &&   arr1 + arr2

-----------------------
            4 | 9 | 7
+ | 9 | 4 | 6 | 3 | 2
-----------------------
    9   5   1   2   9
*/


import java.util.Scanner;

public class SumOfTwoArraysHard {
    
    // Function to sum two arrays
    // Time Complexity = O(max(n1, n2)), Space Complexity = O(max(n1, n2))
    public static int[] sum(int[] one, int[] two) {
      
        // Determine the length of the result array, which is the maximum length of the two input arrays
        int n = Math.max(one.length, two.length);
        int[] ans = new int[n];
        
        // Initialize pointers for the input arrays and the result array
        int i = one.length - 1;
        int j = two.length - 1;
        int k = ans.length - 1;
        
        int c = 0; // carry
        // Loop through both arrays from the end to the start
        while(k >= 0) {
            int d = c; // start with the carry value
            
            // Add the value from the first array if the pointer is within bounds
            if(i >= 0) {
                d = d + one[i];
            }
            
            // Add the value from the second array if the pointer is within bounds
            if(j >= 0) {
                d = d + two[j];
            }
            
            c = d / 10; // calculate new carry
            d = d % 10; // get the last digit of the sum
            
            ans[k] = d; // place the digit in the result array
            
            // Move the pointers
            i--;
            j--;
            k--;
        }
        
        // If there is a carry left, handle it (assuming no leading zeros in final result)
        if(c > 0)
            ans[0] += c * 10;
        
        return ans;
    }
    
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        // Read the length and elements of the first array
        int n1 = sc.nextInt();
        int[] one = new int[n1];
        
        for(int i = 0; i < one.length; i++) {
            one[i] = sc.nextInt();
        }
        
        // Read the length and elements of the second array
        int n2 = sc.nextInt();
        int[] two = new int[n2];
        
        for(int i = 0; i < two.length; i++) {
            two[i] = sc.nextInt();
        }
        
        // Call the sum function and get the result
        int[] result = sum(one, two);
        
        // Print the result array
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        
        sc.close(); // Close the scanner
    }
}
