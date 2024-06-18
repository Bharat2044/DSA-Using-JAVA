import java.util.Scanner;

public class StrongNumberInRange {
    
    /**
     * This method checks if a given number n is a Strong number.
     * A number is called a Strong number if the sum of the factorial of its digits is equal to the number itself.
     * 
     * Time Complexity (TC): O(d * d!), where d is the number of digits in n.
     * Space Complexity (SC): O(1), as we are using a constant amount of extra space.
     * 
     * @param n the number to check
     * @return true if n is a Strong number, false otherwise
     */
    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        
        // Loop through each digit of n
        while(n > 0) {
            int d = n % 10; // Get the last digit of n
            int fact = 1;
            
            // Calculate the factorial of the digit
            for(int i = 1; i <= d; i++)
                fact *= i;
                
            sum += fact; // Add the factorial to the sum
            n /= 10; // Remove the last digit from n
        }
        
        // Return true if the sum of the factorial of digits is equal to the original number
        return (sum == temp);
    }
    
    /**
     * This method prints all Strong numbers in the range [a, b].
     * 
     * Time Complexity (TC): O((b - a + 1) * d * d!), where d is the number of digits in the numbers within the range.
     * Space Complexity (SC): O(1), as we are using a constant amount of extra space.
     * 
     * @param a the start of the range (inclusive)
     * @param b the end of the range (inclusive)
     */
    public static void strongNumberInRange(int a, int b) {
        // Iterate over each number in the range [min(a, b), max(a, b)]
        for(int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            // Check if the current number is a Strong number
            if(isStrong(i))
                System.out.print(i + "   "); // Print the Strong number
        }
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(); // Read the first integer input from the user
        int b = sc.nextInt(); // Read the second integer input from the user
        
        // Find and print all Strong numbers in the range [a, b]
        strongNumberInRange(a, b);
        
        sc.close(); // Close the Scanner object
    }
}
