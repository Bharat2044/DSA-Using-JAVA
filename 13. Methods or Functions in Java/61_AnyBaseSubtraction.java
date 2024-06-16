// Question Link: https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any-base-subtraction-official/ojquestion


/*
i/p: n1 = 2000
     n2 = 999
     b = 10
o/p: 1001
*/


import java.util.Scanner;

public class AnyBaseSubtraction {
    
    // Function to perform subtraction in any base 'b'
    // Time Complexity: O(d), where d is the number of digits in the larger number between n1 and n2.
    // Space Complexity: O(1), excluding the space required for input and output.
    public static int getDifference(int n1, int n2, int b) {
        int ans = 0, pow = 1, borrow = 0;
        
        // Iterate until all digits of n1 are processed
        while(n1 > 0) {
            int d1 = n1 % 10;   // Extract the last digit of n1
            int d2 = n2 % 10;   // Extract the last digit of n2 
            
            n1 /= 10;   // Remove the last digit of n1
            n2 /= 10;   // Remove the last digit of n2
            
            int d = (d1 - d2 - borrow);  // Calculate the difference
            
            // If the difference is negative, adjust with borrow and base 'b'
            if(d < 0) {
                borrow = 1;
                d += b;
            }
            else {
                borrow = 0;
            }
            
            ans += d * pow;   // Update the result with proper place value
            pow *= 10;        // Increment the place value multiplier for the next digit
        }
        
        return ans;   // Return the final difference in the specified base 'b'
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the numbers and the base from the user
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int base = sc.nextInt();
        
        // Determine the larger and smaller numbers for subtraction
        int x = Math.max(n1, n2);
        int y = Math.min(n1, n2);
        
        // Calculate the difference using the getDifference function
        int result = getDifference(x, y, base);
        
        // Output the result, considering the sign based on the original numbers
        if(n1 >= n2)
            System.out.println(result);   // Print the result if n1 is greater than or equal to n2
        else
            System.out.println(-result);  // Print the negative result if n2 is greater than n1

        sc.close();   // Close the scanner to release resources
    }
}
