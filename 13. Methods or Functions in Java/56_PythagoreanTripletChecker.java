// Write a function to check if a given triplet is a Pythagorean triplet or not. 
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).


import java.util.Scanner;

public class PythagoreanTripletChecker {
  
    /**
     * Checks if the given triplet (a, b, c) forms a Pythagorean triplet.
     * 
     * @param a First number of the triplet.
     * @param b Second number of the triplet.
     * @param c Third number of the triplet.
     * @return True if (a, b, c) is a Pythagorean triplet, false otherwise.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    // 1st Approach: Direct comparison of squares
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        // Calculate the squares of each number
        int x = a * a;
        int y = b * b;
        int z = c * c;
        
        // Check if any of the combinations satisfy the Pythagorean triplet condition
        boolean ans = ((x == y + z) || (y == z + x) || (z == x + y));

        return ans;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to input three numbers
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Check if the triplet (a, b, c) is a Pythagorean triplet using the function
        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is a Pythagorean triplet.");
        } 
        else {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is not a Pythagorean triplet.");
        }
            
        sc.close();
    }
}
