/*
Problem Description:
You are given a positive integer A denoting the radius of a circle. You have to calculate the area of the circle.
Arae of a circle having radius R is given by (π * R2).

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

    public static int areaOfCircle(int r) {
        int ans = (int)((3.14 * r * r) + 1);
        return ans;
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius of the circle: ");
        int r = sc.nextInt();        
        
        int ans = areaOfCircle(r);
        
        System.out.println("Area of circle = " + ans);
    }
}