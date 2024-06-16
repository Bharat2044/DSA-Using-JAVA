// Write a function to check if a given triplet is a Pythagorean triplet or not. 
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).


import java.util.Scanner;

public class PythagoreanTriplet {

    // 1st Approach: Direct comparison of squares
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        
        // Calculate squares of a, b, and c
        int x = a * a;
        int y = b * b;
        int z = c * c;
        
        // Check if any of the combinations satisfy the Pythagorean triplet condition
        boolean ans = ((x == y + z) || (y == z + x) || (z == x + y));

        return ans;
    }

    /* 
    // 2nd Approach: Using properties of Pythagorean triplet
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        
        // Find minimum, maximum, and middle value
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int middle = a + b + c - min - max;

        // Check the Pythagorean triplet condition
        return ((min * min + middle * middle) == (max * max));
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Check if the entered triplet is a Pythagorean triplet using the chosen approach
        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is a Pythagorean triplet.");
        } 
        else {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is not a Pythagorean triplet.");
        }
            
        sc.close();
    }
}
