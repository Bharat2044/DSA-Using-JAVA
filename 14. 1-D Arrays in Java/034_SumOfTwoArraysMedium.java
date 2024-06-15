/*
i/p: 
n1 = 4
arr1 = 4 5 6 2
n2 = 3
arr2 = 9 3 4
o/p: 4 -4 3 -2

i/p: 
n1 = 3
arr1 = 4 9 7
n2 = 5
arr2 = 9 4 6 3 2
o/p: 9 4 10 12 9

arr1 + arr2  &&  n1 != n2

------------------
  4 | 5 | 6 | 2
+   | 9 | 3 | 4
------------------
  4   14  9   6
*/


import java.util.Scanner;

public class SumOfTwoArraysMedium {
  
    // Approach - 1: TC = O(max(n1, n2)), SC = O(max(n1, n2))
    // Function to compute the sum of two arrays
    /*
    public static int[] sum(int[] arr1, int[] arr2) {
        int n = Math.max(arr1.length, arr2.length); // Determine the maximum length of the two arrays
        int[] temp = new int[n];  // Initialize an array to store the sum
        
        int i = arr1.length - 1; // Start from the end of arr1
        int j = arr2.length - 1; // Start from the end of arr2
        int k = n - 1; // Start filling temp from the end
        
        // Loop to compute the sum from the end to the beginning of both arrays
        while (i >= 0 && j >= 0) {
            temp[k] = arr1[i] + arr2[j]; // Compute the sum of current elements from arr1 and arr2
            
            i--; // Move to the previous element in arr1
            j--; // Move to the previous element in arr2
            k--; // Move to the previous position in temp
        }
        
        // If arr1 has remaining elements, copy them to temp
        while (i >= 0) {
            temp[k] = arr1[i]; // Copy the remaining element from arr1 to temp
            i--; // Move to the previous element in arr1
            k--; // Move to the previous position in temp
        }
        
        // If arr2 has remaining elements, copy them to temp
        while (j >= 0) {
            temp[k] = arr2[j]; // Copy the remaining element from arr2 to temp
            j--; // Move to the previous element in arr2
            k--; // Move to the previous position in temp
        }
        
        return temp; // Return the resulting array containing the sum of arr1 and arr2
    }
  */


    // Approach - 2: TC = O(max(n1, n2)), SC = O(max(n1, n2))
    // Function to compute the sum of two arrays
    public static int[] sum(int[] arr1, int[] arr2) {
        int n = Math.max(arr1.length, arr2.length); // Determine the maximum length of the two arrays
        int[] result = new int[n]; // Initialize an array to store the sum
        
        int i = arr1.length - 1; // Start from the end of arr1
        int j = arr2.length - 1; // Start from the end of arr2
        int k = result.length - 1; // Start filling result from the end
        
        while (k >= 0) {
            if (i >= 0) {
                result[k] = arr1[i]; // Add arr1 element if i is valid
            }
            
            if (j >= 0) {
                result[k] += arr2[j]; // Add arr2 element if j is valid
            }
            
            i--; // Move to the previous element in arr1
            j--; // Move to the previous element in arr2
            k--; // Move to the previous position in result
        }
        
        return result; // Return the resulting array
    }
  
    
    // Main method for input and output
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        // Input size of arr1 and initialize arr1
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        
        // Input size of arr2 and initialize arr2
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        
        // Compute the sum of arr1 and arr2 using the sum function
        int[] result = sum(arr1, arr2);
        
        // Output the resulting array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        
        // Close the scanner object to prevent resource leak
        sc.close();
    }
}

