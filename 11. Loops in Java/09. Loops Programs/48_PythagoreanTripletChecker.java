// Write a function to check if a given triplet is a Pythagorean triplet or not. 
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).


import java.util.Scanner;

public class PythagoreanTripletChecker {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        
        // 1st Approach
        /*
        int x = a * a;
        int y = b * b;
        int z = c * c;
        
        boolean ans = ((x == y + z) || (y == z + x) || (z == x + y));
        
        if (ans) {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is a Pythagorean triplet.");
        } 
        else {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is not a Pythagorean triplet.");
        }
        */
        
        
        // 2nd Approach
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int middle = a + b + c - min - max;

        boolean ans = ((min * min + middle * middle) == (max * max));
        
        if (ans) {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is a Pythagorean triplet.");
        } 
        else {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is not a Pythagorean triplet.");
        }
            
        sc.close();
    }
}
