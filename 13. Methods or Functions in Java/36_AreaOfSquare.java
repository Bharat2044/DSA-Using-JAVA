import java.util.Scanner;

public class AreaOfSquare { 

    /*
     * Method to calculate the area of a square given its side length
     * Time Complexity: O(1) as it performs a constant number of operations
     * Space Complexity: O(1) as it uses a constant amount of extra space
     */
    public static float areaOfSquare(float a) {        
        // Return the area of the square by squaring the side length
        return (a * a);
    }
  
    public static void main(String[] args) {   
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the side length of the square
        System.out.print("Enter side of square: ");
        
        // Read the side length as a float
        float a = sc.nextFloat(); 
        
        // Compute the area of the square using the areaOfSquare method
        float ans = areaOfSquare(a);
        
        // Print the calculated area
        System.out.println("Area = " + ans);
        
        // Close the scanner
        sc.close();
    }
}
