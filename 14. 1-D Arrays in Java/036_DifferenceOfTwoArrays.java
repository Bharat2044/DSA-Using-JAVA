// Question Link: https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/difference-of-two-arrays-official/ojquestion


/*
i/p: 
n1 = 4
arr1 = 1 0 0 0
n2 = 3
arr2 = 2 6 7
o/p: 7 3 3
*/


import java.util.Scanner;

public class DifferenceOfTwoArrays {
  
    // Function to calculate the difference between two integer arrays (one - two)
    // Time Complexity: O(n1) where n1 is the length of the first array
    // Space Complexity: O(n1) for the result array
    public static int[] difference(int[] one, int[] two) {
        // Initialize the result array with the same length as the first array
        int[] ans = new int[one.length];
        
        // Pointers for traversing the arrays from the end
        int i = one.length - 1;
        int j = two.length - 1;
        int k = ans.length - 1;
        
        int b = 0;  // Variable to hold the borrow value
      
        // Loop through both arrays from the end to the start
        while (k >= 0) {
            int d = one[i] - b; // Start with the current value of the first array minus any borrow
            
            // Subtract the value from the second array if the pointer is within bounds
            if (j >= 0) {
                d = d - two[j];
            }
            
            // If the result is negative, borrow from the next higher place value
            if (d < 0) {
                d = d + 10;
                b = 1; // Set the borrow for the next iteration
            } else {
                b = 0; // Reset the borrow if no borrow is needed
            }
            
            ans[k] = d; // Store the result in the result array
            
            // Move the pointers
            i--;
            j--;
            k--;
        }
        
        return ans; // Return the result array
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the length and elements of the first array
        int n1 = sc.nextInt();
        int[] one = new int[n1];
        for (int i = 0; i < one.length; i++) {
            one[i] = sc.nextInt();
        }
        
        // Read the length and elements of the second array
        int n2 = sc.nextInt();
        int[] two = new int[n2];
        for (int i = 0; i < two.length; i++) {
            two[i] = sc.nextInt();
        }
        
        // Call the difference function to get the result array
        int[] result = difference(one, two);
        
        // Print the result array, skipping any leading zeros
        int idx = 0;
        while (idx < result.length) {
            if (result[idx] != 0) {
                break;
            } else {
                idx++;
            }
        }
        
        for (int i = idx; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        
        sc.close(); // Close the scanner to free resources
    }
}
