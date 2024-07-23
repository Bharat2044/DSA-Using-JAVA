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
    public static void main(String[] args) {
      
      // Create a Scanner object for user input
      Scanner sc = new Scanner(System.in);
      
      // Prompt the user to enter a number
      System.out.print("Enter a Number: ");
      int n = sc.nextInt();
      
      // Initialize max to store the maximum value
      int max = 0;
      
      // Calculate the number of digits in the input number
      int noOfDigits = (int)Math.log10(n) + 1;
      
      // Iterate through each digit from last
      for (int i = noOfDigits; i >= 1; i--) {
          // Remove one digit and form a new number
          int result = ((n / (int)Math.pow(10, i)) * (int)Math.pow(10, i - 1)) + (n % (int)Math.pow(10, i - 1));
          
          // Update max if the new number is greater
          if (result > max) {
              max = result;
          }
      }
      
      // Print the maximum value obtained
      System.out.println("Maximum Value = " + max);

      // Close the scanner
      sc.close();
    }
}
