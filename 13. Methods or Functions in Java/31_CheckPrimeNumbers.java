import java.util.Scanner;

public class CheckPrimeNumbers {
  
    /* 
     * Method to check if a number is prime
     * 
     * Time Complexity: O(sqrt(n)), where n is the input number
     * - The method iterates up to the square root of n to check divisibility.
     * - For each number, the loop runs approximately sqrt(n) times.
     * 
     * Space Complexity: O(1)
     * - The method uses only a constant amount of extra space for variables.
     */
    public static boolean isPrime(int n) {
        if(n <= 1) {          // Check if number is less than or equal to 1
            return false;     // 1 and numbers less than 1 are not prime
        }
        
        for(int i = 2; i * i <= n; i++) {  // Iterate from 2 to sqrt(n)
            if(n % i == 0) {              // If n is divisible by i
                return false;             // n is not prime
            }
        }
        
        return true;  // If no divisors found, n is prime
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input
        
        System.out.print("Enter a number: ");  // Prompt user to enter a number
        int n = sc.nextInt();  // Read the number
        
        if(isPrime(n)) {  // Check if the number is prime using isPrime method
            System.out.println("Prime");  // Print "Prime" if the number is prime
        }
        else {
            System.out.println("Not Prime");  // Print "Not Prime" if the number is not prime
        }
    }
}
