/*
i/p: 
n = 5
arr = 2 12 -6 70 5
o/p: -6
*/


import java.util.Scanner;
import java.util.Arrays;

public class SmallestElementInArray {
    
    /*
    // 1st Approach: Brute Force => Time Complexity (TC) = O(n^2) , Space Complexity (SC) = O(1)
    public static int getSmallestElement(int[] arr) {
        // Iterate through each element in the array
        for(int i = 0; i < arr.length; i++) {
            boolean flag = true;
            
            // Check if there's any element smaller than the current element
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    flag = false; // Found a smaller element
                    break;
                }
            }
            
            // If no smaller element was found, the current element is the smallest
            if(flag == true)
                return arr[i];
        }
        
        return -1; // This return statement is just a fallback, should not be reached
    }
    */
    
    /*
    // 2nd Approach: Using Sorting => Time Complexity (TC) = O(n * log(n)) , Space Complexity (SC) = O(1)
    public static int getSmallestElement(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // The smallest element will be the first element in the sorted array
        return arr[0];
    }
    */
    
    // 3rd Approach: Optimal Approach => Time Complexity (TC) = O(n) , Space Complexity (SC) = O(1)
    public static int getSmallestElement(int[] arr) {
        // Initialize min with the first element of the array
        int min = arr[0];
        
        // Iterate through the array starting from the second element
        for(int i = 1; i < arr.length; i++) {
            // Update min if the current element is smaller
            if(arr[i] < min)
                min = arr[i];
        }
        
        // Return the smallest element
        return min;
    }
    
    public static void main(String[] args) {   
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        int n = sc.nextInt();
        
        // Create an array of the given size
        int[] arr = new int[n];
        
        // Read the elements of the array from the user
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Call the method to find the smallest element in the array
        int ans = getSmallestElement(arr);
        
        // Print the smallest element
        System.out.println(ans);
        
        // Close the Scanner object
        sc.close();
    }
}
