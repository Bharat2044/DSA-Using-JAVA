/*
Problem Description:
You have a number N, you have to write a code to find odd index digit sum and even index digit sum from given number.
Note : Index is starting from 1 till count of digits in a number, and we consider this from right to left;

Problem Constraints:
0 < N < 1000000000

Input Format:
An Integer N

Output Format:
In first line, print ("Sum of Odd Index Digit : x"), x is sum of odd index digits.
In second line, print ("Sum of Even Index Digit : y"), y is sum of even index digits.

Example Input:
Input 1 :
8563724
Input 2 :
4524126

Example Output:
Output 1 :
Sum of Odd Index Digit : 25
Sum of Even Index Digit : 10
Output 2 :
Sum of Odd Index Digit : 13
Sum of Even Index Digit : 11

Example Explanation:
Explanation 1 :
In number 8563724,
4 - index 1
2 - index 2
7 - index 3
3 - index 4
6 - index 5
5 - index 6
8 - index 7
Odd index sum : 4 + 7 + 6 + 8 = 25
Even index sum : 2 + 3 + 5 = 10

Explanation 2 :
In number 4524126,
6 - index 1
2 - index 2
1 - index 3
4 - index 4
2 - index 5
5 - index 6
4 - index 7
Odd index sum : 6 + 1 + 2 + 4 = 13
Even index sum : 2 + 4 + 5 = 11
*/




// Import Scanner class to take input from the user
import java.util.Scanner;

public class Main {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Create Scanner object for reading input
        Scanner sc = new Scanner(System.in);

        // Read the input number
        int n = sc.nextInt();

        // Store the original number for digit counting
        int temp = n;

        // Variable to count total number of digits
        int count = 0;

        // Loop to count the number of digits in the number
        while (temp > 0) {
            // Increment digit count
            count++;

            // Remove last digit
            temp /= 10;
        }

        // Variable to store sum of digits at odd indices
        int oddDigitSum = 0;

        // Variable to store sum of digits at even indices
        int evenDigitSum = 0;

        // Index starts from 1 for right-to-left digit processing
        int index = 1;

        // Loop to process digits from right to left
        while (n > 0) {

            // Extract the last digit of the number
            int lastDigit = n % 10;

            // Check if the current index is odd
            if (index % 2 == 1) {

                // Add digit to odd index sum
                oddDigitSum += lastDigit;

            } else {

                // Add digit to even index sum
                evenDigitSum += lastDigit;
            }

            // Move to the next index
            index++;

            // Remove the last digit from the number
            n /= 10;
        }

        // Print the sum of digits at odd indices
        System.out.println("Sum of Odd Index Digit : " + oddDigitSum);

        // Print the sum of digits at even indices
        System.out.println("Sum of Even Index Digit : " + evenDigitSum);

        // Close the Scanner to release resources
        sc.close();
    }
}
