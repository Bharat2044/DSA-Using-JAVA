import java.util.Scanner;

public class ArmstrongNumberInRange {

    /**
     * Function to check if a number is an Armstrong number
     * Time Complexity (TC): O(d), where d is the number of digits in the input number.
     * Space Complexity (SC): O(1), uses a constant amount of extra space.
     */
    public static boolean isArmstrong(int n) {
        int sum = 0; // Initialize sum of powered digits
        int temp = n; // Temporary variable to store the original number
        
        // Count the number of digits in the number
        int count = (int)(Math.log10(n) + 1);

        // Loop through each digit of the number
        while(temp != 0) {
            int rem = temp % 10; // Get the last digit
            sum += (int)(Math.pow(rem, count)); // Add the digit raised to the power of 'count' to sum
            temp /= 10; // Remove the last digit
        }
        
        // Return true if sum equals the original number, otherwise false
        return (sum == n); 
    }

    /**
     * Function to print all Armstrong numbers in a given range
     * Time Complexity (TC): O(n * d), where n is the range size and d is the number of digits.
     * Space Complexity (SC): O(1), uses a constant amount of extra space.
     */
    public static void armstrongNumberInRange(int a, int b) {
        // Iterate from the minimum to the maximum of the two input numbers
        for(int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            // Check if the current number is an Armstrong number
            if(isArmstrong(i))
                System.out.print(i + "   "); // Print the Armstrong number
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(); // Read the first input number
        int b = sc.nextInt(); // Read the second input number
        
        // Print all Armstrong numbers in the range [a, b]
        armstrongNumberInRange(a, b);
    }
}
