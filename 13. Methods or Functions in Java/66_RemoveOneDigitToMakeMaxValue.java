// Given 4 digits number, remove any one digit and make it largest value

// i/p: 5343
// o/p: 534

// i/p: 4589
// o/p: 589

// i/p: 5343
// o/p: 543

// i/p: 8943
// o/p: 943

 

import java.util.Scanner;

public class RemoveOneDigitToMakeMaxValue {
    
    // Function to find the maximum value by removing one digit
    public static int findMaxValue(int n) {
        // Initialize max to store the maximum value
        int max = 0;  
        
        // Calculate the number of digits in the input number
        int noOfDigits = (int) Math.log10(n) + 1; 

        // Iterate through each digit from the last
        for (int i = noOfDigits; i >= 1; i--) {
          
            // Remove one digit and form a new number
            int result = ((n / (int) Math.pow(10, i)) * (int) Math.pow(10, i - 1)) + (n % (int) Math.pow(10, i - 1));
            
            // Update max if the new number is greater
            if (result > max) {
                max = result;
            }
        }
        
        // Return the maximum value found
        return max; 
    }

    public static void main(String[] args) {
        
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in); 
        
        // Prompt user for input
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        
        // Get the maximum value after removing one digit
        int maxValue = findMaxValue(n);
        
        // Output the result
        System.out.println("Maximum Value = " + maxValue);

        // Close the scanner to prevent resource leak
        sc.close(); 
    }
}
