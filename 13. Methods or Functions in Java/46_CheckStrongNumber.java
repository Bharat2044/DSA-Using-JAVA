// Strong Numbers: A Strong number is a number, where the sum of the factorial of the digits is equal to the number itself. 
// 1, 2, 145, and 40585 are some examples of Strong numbers.
// i/p: 145
// o/p: 145 is a strong number.         => 1! + 4! + 5! = 145


import java.util.Scanner;

public class CheckStrongNumber {
    
    /**
     * This method checks if a given number n is a Strong number.
     * A Strong number is a number where the sum of the factorial of its digits is equal to the number itself.
     * 
     * Time Complexity: O(d * k), where d is the number of digits in n, and k (<= 9) is the maximum number of iterations
     * for calculating factorial for each digit.
     * Space Complexity: O(1), as we are using a constant amount of extra space.
     * 
     * @param n the number to check
     * @return true if n is a Strong number, false otherwise
     */
    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        
        while (n > 0) {
            int d = n % 10; // Get the last digit of n
            int fact = factorial(d); // Calculate factorial of the digit
            
            sum += fact;
            n /= 10; // Move to the next digit
        }
        
        return (sum == temp);
    }
    
    private static int factorial(int n) {
        int fact = 1;
        
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        
        return fact;
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Read an integer input from the user
        
        // Check if the entered number is a Strong number and print the result
        if(isStrong(n))
            System.out.println(n + " is a strong number.");
        else
            System.out.println(n + " is not a strong number.");
        
        sc.close(); // Close the Scanner object
    }
}
