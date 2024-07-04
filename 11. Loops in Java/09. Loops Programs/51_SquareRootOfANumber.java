import java.util.Scanner;

public class SquareRootOfANumber {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
      
        System.out.print("Enter a Number: "); // Prompt the user to enter a number
        int n = sc.nextInt(); // Read the integer input provided by the user
        
        /*
        // 1st Approach: TC = O(sqrt(n)), SC = O(1)
        int ans = 0; // Initialize a counter variable 'ans' to store the square root
        
        for(int i = 1; i * i <= n; i++) { // Iterate from 1 upwards until i*i <= n
            ans++; // Increment 'ans' for each iteration where i*i <= n
        }
        
        System.out.println("Square Root of " + n + " = " + ans); // Print the result
        */
        
        
        /*
        // 2nd Approach: TC = O(log(n)), SC = O(1)
        int st = 0, end = n, ans = 0; // Initialize variables for binary search
        
        while(st <= end) { // Perform binary search until 'st' <= 'end'
            int mid = st + (end - st) / 2;  // Calculate middle point 'mid'
            
            long square = (long) mid * mid; // Calculate square of 'mid' as 'long' to avoid overflow
            
            if(square == n) { // If square of 'mid' equals 'n', 'mid' is the square root
                ans = mid;
                break;
            } else if (square > n) { // If square of 'mid' is greater than 'n', adjust 'end'
                end = mid - 1; 
            } else { // If square of 'mid' is less than 'n', adjust 'st'
                ans = mid; 
                st = mid + 1; 
            }
        }
        
        System.out.println("Square Root of " + n + " = " + ans); // Print the result
        */
        
        // 3rd Approach: TC = O(log(n)), SC = O(1)
        System.out.println("Square Root of " + n + " = " + Math.sqrt(n)); // Use Math.sqrt() for built-in square root calculation
    }
}
