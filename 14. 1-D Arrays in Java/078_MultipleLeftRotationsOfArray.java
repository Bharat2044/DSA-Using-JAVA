/*
Multiple left rotations of the array

Problem Description:
Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.
Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B.

Problem Constraints:
1 <= length of both arrays <= 2000 -10^9 <= A[i] <= 10^9 0 <= B[i] <= 2000

Input Format:
The first argument given is the integer array A.
The second argument given is the integer array B.

Output Format:
Return the resultant matrix.

Example Input:
Input 1:
    A = [1, 2, 3, 4, 5]
    B = [2, 3]
Input 2:  
    A = [5, 17, 100, 11]
    B = [1]

Example Output:
Output 1:
    [ [3, 4, 5, 1, 2]
     [4, 5, 1, 2, 3] ]
Output 2:    
    [ [17, 100, 11, 5] ]

Example Explanation:
for input 1 -> B[0] = 2 which requires 2 times left rotations
1: [2, 3, 4, 5, 1]
2: [3, 4, 5, 1, 2]
B[1] = 3 which requires 3 times left rotation
1: [2, 3, 4, 5, 1]
2: [3, 4, 5, 1, 2]
2: [4, 5, 1, 2, 4]
*/



// 1st Approach - Time Complexity = O(m * n), Space Complexity = O(m * n)
// Import Scanner class for taking input from the user
import java.util.Scanner; 

public class Main {

    // Function to reverse elements in the array from index 'left' to 'right'
    public static void reverse(int[] A, int left, int right) {

        // Continue while left index is less than right
        while (left < right) { 
            int temp = A[left];       // Store value at left index
            A[left] = A[right];       // Replace left with right
            A[right] = temp;          // Set right with original left value
            
            left++;                   // Move left pointer right
            right--;                  // Move right pointer left
        }
    }

    // Function to perform left rotation by 'k' using reversal algorithm
    public static int[] rotateLeft(int[] A, int k) {

        // Get the length of the array
        int n = A.length;            

        // Create a copy of array to avoid modifying original
        int[] temp = new int[n];     

        // Copy original array into temp
        for (int i = 0; i < n; i++) {
            temp[i] = A[i];
        }

        // Step 1: Reverse first k elements
        reverse(temp, 0, k - 1);

        // Step 2: Reverse the rest of the array
        reverse(temp, k, n - 1);

        // Step 3: Reverse the whole array
        reverse(temp, 0, n - 1);

        return temp; // Return rotated array
    }

    // Function to return 2D array after multiple left rotations based on array B
    public static int[][] solve(int[] A, int[] B) {
        
        int n = A.length;            // Size of array A
        int m = B.length;            // Number of rotations (size of B)

        int[][] result = new int[m][n]; // Resulting 2D array of size m x n

        // Loop through each rotation value in B
        for (int i = 0; i < m; i++) {
            int[] temp = rotateLeft(A, B[i] % n); // Perform rotation with B[i] % n to normalize

            result[i] = temp; // Store the result in the corresponding row
        }

        return result; // Return the 2D result array
    }

    // Main method: reads input and prints the output
    public static void main(String[] args) {
        
        // Scanner to take input from user
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter size of array A: "); // Prompt for size of array A
        int n = scanner.nextInt(); // Read size of array A

        int[] A = new int[n]; // Declare array A
        System.out.println("Enter elements of array A:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt(); // Read elements into array A
        }

        System.out.print("Enter number of rotations (size of array B): "); // Prompt for number of rotations
        int m = scanner.nextInt(); // Read size of array B

        int[] B = new int[m]; // Declare array B
        System.out.println("Enter rotation values (array B):");
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt(); // Read each rotation value into array B
        }

        int[][] result = solve(A, B); // Compute all rotated arrays using solve()

        System.out.println("Resulting arrays after rotations:"); // Print result header

        // Loop over each result row
        for (int i = 0; i < m; i++) {         

            // Loop over each element in the row
            for (int j = 0; j < n; j++) {     
                System.out.print(result[i][j] + " "); // Print element
            }
            
            System.out.println(); // Move to next line after each row
        }
    }
}



/*
// 2nd Approach - Time Complexity = O(m * n), Space Complexity = O(m * n)

// Importing the java.util package to use Scanner, Map, HashMap, etc.
import java.util.*; 

public class MultipleLeftRotationsOfArray {

    // Function to perform left rotation by k positions
    public static int[] rotateLeft(int[] A, int k) {
        // Get the length of the array
        int n = A.length; 
        
        // Create a new array to store the rotated result
        int[] result = new int[n]; 
        
        // Normalize k to avoid unnecessary full rotations
        k = k % n; 

        // Copy elements from index k to end into the beginning of result
        for (int i = 0; i < n - k; i++) {
            result[i] = A[i + k];
        }

        // Copy first k elements to the end of the result array
        for (int i = n - k; i < n; i++) {
            result[i] = A[i - (n - k)];
        }

        // Return the rotated array
        return result; 
    }

    // Function to solve multiple left rotations based on array B
    public static int[][] solve(int[] A, int[] B) {
        int n = A.length; // Length of array A
        int m = B.length; // Number of rotation queries

        // 2D array to store results of each rotation
        int[][] result = new int[m][n]; 

        // Create a cache to store previously computed rotations for efficiency
        Map<Integer, int[]> rotationCache = new HashMap<>();

        // Iterate over each rotation value in B
        for (int i = 0; i < m; i++) {
            int rotation = B[i] % n; // Normalize rotation value

            // Check if this rotation result is already cached
            if (rotationCache.containsKey(rotation)) {
                result[i] = rotationCache.get(rotation); // Use cached result
            } else {
                int[] rotated = rotateLeft(A, rotation); // Perform rotation
                rotationCache.put(rotation, rotated); // Store in cache
                result[i] = rotated; // Save to final result
            }
        }

        // Return 2D array containing all rotated arrays
        return result; 
    }

    // Main method: handles input/output and calls solve
    public static void main(String[] args) {
        // Create scanner to take input from user
        Scanner scanner = new Scanner(System.in); 

        // Prompt user to enter size of array A
        System.out.print("Enter size of array A: ");
        int n = scanner.nextInt(); // Read size of array A

        int[] A = new int[n]; // Declare array A
        System.out.println("Enter elements of array A:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt(); // Read elements of array A
        }

        // Prompt user to enter size of array B (number of rotations)
        System.out.print("Enter number of rotations (size of array B): ");
        int m = scanner.nextInt(); // Read size of array B

        int[] B = new int[m]; // Declare array B
        System.out.println("Enter rotation values (array B):");
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt(); // Read elements of array B (rotation values)
        }

        int[][] result = solve(A, B); // Call solve to get all rotated arrays

        // Print the result arrays
        System.out.println("Resulting arrays after rotations:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " "); // Print each element of the rotated array
            }
            
            System.out.println(); // Newline after each rotation
        }
    }
}
*/
