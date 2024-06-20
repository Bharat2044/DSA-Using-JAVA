import java.util.Scanner;

public class PrintPrimeNumbersInRange {
  
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
    
    /* 
     * Method to print prime numbers in a given range [a, b]
     * 
     * Time Complexity: O((b-a+1) * sqrt(b)), where a and b are input range limits
     * - This method calls isPrime for each number in the range [a, b],
     *   and isPrime itself runs in O(sqrt(n)) time.
     * - The outer loop runs (b-a+1) times, and for each iteration,
     *   isPrime may run up to sqrt(b) times in the worst case.
     * 
     * Space Complexity: O(1)
     * - The method uses only a constant amount of extra space for variables.
     */
    public static void primeInRange(int a, int b) {
        for(int i = a; i <= b; i++) {  // Iterate through each number in the range [a, b]
            if(isPrime(i)) {           // Check if the number is prime
                System.out.print(i + "  ");  // Print the prime number
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input
        
        System.out.print("Enter two numbers: ");  // Prompt user to enter two numbers
        int a = sc.nextInt();  // Read first number
        int b = sc.nextInt();  // Read second number
        
        primeInRange(a, b);  // Call method to print prime numbers in the range [a, b]
    }
}
