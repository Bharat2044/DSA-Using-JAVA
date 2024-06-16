// i/p: n = 994543234, d= 4
// o/p: 3


import java.util.Scanner;

/**
 * This program calculates the frequency of a specific digit in a given number.
 * It reads the number and digit from standard input and prints the frequency of the digit.
 */
public class DigitFrequency {
  
    /**
     * Function to calculate the frequency of a specific digit in a number.
     * 
     * Time Complexity: O(log10(n))
     * Space Complexity: O(1)
     */
    public static int getDigitFrequency(int n, int d) {
        int count = 0;
        
        // Loop through each digit of n
        while (n != 0) {
            if (n % 10 == d) {
                count++;
            }
            
            n /= 10; // Move to the next digit
        }
        
        return count;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number n and digit d
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        // Calculate and print the frequency of digit d in number n
        int frequency = getDigitFrequency(n, d);
        System.out.println(frequency);
        
        sc.close();
    }
}
