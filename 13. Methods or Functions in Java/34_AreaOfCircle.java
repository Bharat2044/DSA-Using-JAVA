/*
Problem Description:
You are given a positive integer A denoting the radius of a circle. You have to calculate the area of the circle.
Arae of a circle having radius R is given by (π * r^2).

NOTE: Since, the answer can be a real number, you have to return the ceil value of the area. Ceil value of a real number X is the smallest integer that is greater than or equal to X. Use standard PI value in the particular programming language.

Problem Constraints:
1 <= A <= 1000

Input Format:
First and only argument is an integer r.

Output Format:
Return a single integer denoting the ceil value of area of the circle.

Example Input:
Input 1:
A = 1 
Input 2:
A = 4 

Example Output:
Output 1:
4 
Output 2:
51 

Example Explanation:
Explanation 1:
Area of circle having radius 1 units = 3.14 Ceil value = 4 
Explanation 2:
Area of circle having radius 4 units = 50.27 Ceil value of volume = 51 
*/


import java.util.Scanner;

public class AreaOfCircle { 

    /*
     * Method to calculate the area of a circle given its radius and return the ceiling value
     * Time Complexity: O(1) as it performs a constant number of operations
     * Space Complexity: O(1) as it uses a constant amount of extra space
     */
    public static int areaOfCircle(int r) {
        // Calculate the area of the circle using the formula π * r^2
        double area = Math.PI * r * r;
        // Return the ceiling value of the calculated area
        return (int) Math.ceil(area);
    }
    
    public static void main(String[] args) {   
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the radius of the circle
        System.out.print("Enter radius of the circle: ");
        
        // Read the radius as an integer
        int r = sc.nextInt();        
        
        // Compute the area of the circle using the areaOfCircle method
        int ans = areaOfCircle(r);
        
        // Print the calculated area
        System.out.println("Area of circle = " + ans);
        
        // Close the scanner
        sc.close();
    }
}
