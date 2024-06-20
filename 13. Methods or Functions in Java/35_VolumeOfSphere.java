/*
Problem Description:
You are given a positive integer A denoting the radius of a sphere. You have to calculate the volume ofthe sphere.

Volume of a sphere having radius R is given by (4 * π * r^3) / 3.

NOTE: Since, the answer can be a real number, you have to return the ceil value of the volume. Ceil value of a real number X is the smallest integer that is greater than or equal to X.

Problem Constraints:
1 <= A <= 400

Input Format:
First and only argument is an integer r.

Output Format:
Return a single integer denoting the ceil value of volume of the sphere.

Example Input:
Input 1:
A = 1 
Input 2:
A = 4 

Example Output:
Output 1:
5 
Output 2:
269 

Example Explanation:
Explanation 1:
Volume of sphere having radius 1 units = 4.19 Ceil value of volume = 5 
Explanation 2:
Volume of sphere having radius 4 units = 268.08 Ceil value of volume = 269 
*/




import java.util.Scanner;

public class VolumeOfSphere { 

    /*
     * Method to calculate the volume of a sphere given its radius and return the ceiling value
     * Time Complexity: O(1) as it performs a constant number of operations
     * Space Complexity: O(1) as it uses a constant amount of extra space
     */
    public static int volumeOfSphere(int r) {
        // Calculate the volume of the sphere using the formula (4/3) * π * r^3
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        
        // Return the ceiling value of the calculated volume
        return (int) Math.ceil(volume);
    }
    
    public static void main(String[] args) {   
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the radius of the sphere
        System.out.print("Enter radius of the sphere: ");
        
        // Read the radius as an integer
        int r = sc.nextInt();        
        
        // Compute the volume of the sphere using the volumeOfSphere method
        int ans = volumeOfSphere(r);
        
        // Print the calculated volume
        System.out.println("Volume of sphere = " + ans);
        
        // Close the scanner
        sc.close();
    }
}
