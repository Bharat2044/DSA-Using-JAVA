/*
i/p: n1 = 467
     n2 = 27
     b = 10
o/p: 12609

i/p: n1 = 456
     n2 = 27
     b = 8
o/p: 15442
*/


import java.util.Scanner;

public class AnyBaseMultiplication {

    // Method to calculate the sum of two numbers in a given base
    public static int getSum(int n1, int n2, int b) {
        int sum = 0, pow = 1, carry = 0;
        
        // Loop until both numbers and carry are zero
        while(n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10; // Extract last digit of n1
            int d2 = n2 % 10; // Extract last digit of n2 
            
            n1 /= 10; // Remove last digit of n1
            n2 /= 10; // Remove last digit of n2
            
            // Add digits and carry
            int d = (d1 + d2 + carry);
            
            carry = d / b; // Calculate new carry
            d = d % b; // Calculate new digit
            
            sum += d * pow; // Update sum with current digit
            pow *= 10; // Move to next power of 10
        }
        
        return sum;
    }

    // Method to calculate product of a number with a single digit in a given base
    public static int getProductWithSingleDigit(int n1, int d2, int b) {
        int ans = 0, pow = 1, carry = 0;
        
        // Loop until n1 and carry are zero
        while(n1 > 0 || carry > 0) {
            int d1 = n1 % 10; // Extract last digit of n1
            
            n1 /= 10; // Remove last digit of n1
            
            // Multiply digit and add carry
            int d = (d1 * d2 + carry);
            
            carry = d / b; // Calculate new carry
            d = d % b; // Calculate new digit
            
            ans += d * pow; // Update result with current digit
            pow *= 10; // Move to next power of 10
        }
        
        return ans;
    }

    // Method to calculate product of two numbers in a given base
    public static int getProduct(int n1, int n2, int b) {
        int ans = 0, pow = 1;
        
        // Loop until n2 is zero
        while(n2 > 0) {
            int d2 = n2 % 10; // Extract last digit of n2
            
            n2 /= 10; // Remove last digit of n2
            
            // Get product of n1 with single digit d2
            int psd = getProductWithSingleDigit(n1, d2, b);
            
            // Add product to the answer
            ans = getSum(ans, psd * pow, b);
            
            pow *= 10; // Move to next power of 10
        }
        
        return ans;
    }

    public static void main(String[] args) {
        // Create scanner object for input
        Scanner sc = new Scanner(System.in); 
        
        int n1 = sc.nextInt(); // Input first number
        int n2 = sc.nextInt(); // Input second number
        int base = sc.nextInt(); // Input base
        
        // Calculate product in given base
        int result = getProduct(n1, n2, base); 
        
        System.out.println(result); // Print the result
        
        sc.close(); // Close scanner
    }
}
