/*
Problem Description:
Given an integer A denoting the amount of units of electricity consumed, you have to calculate the electricity bill (in Rs.) with the help of the below charge conditions:

For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.

NOTE: As the electricity bill can have any real value (floating point), you have to tell the floor value of the bill.

Floor value of a floating point is the closest integer less than or equal to that value. For eg, Floor value of 2.91 is 2.

Problem Constraints:
1 <= A <= 500

Input Format:
First line of the input contains a single integer A.

Output Format:
Return an integer denoting the floor value of the Electricity bill.

Example Input:
Input 1:
 150 
Input 2:
 4 

Example Output:
Output 1:
 120 
Output 2:
 2 

Example Explanation:
Explanation 1:
 For first 50 units, the bill is (Rs 0.5/unit) * (50 unit) = Rs 25 For next 100 units, the bill is (Rs 0.75/unit) * (100 unit) = Rs 75 Bill amount without additional surcharge = Rs 100 Total Bill amount with additional surcharge = Rs (100 + 0.20 * 100) = Rs 120
Explanation 2:
 Bill without additional surcharge (Rs 0.5/unit) * (4 unit) = Rs 2 Total Bill amount with additional surcharge = Rs (2 + 0.20 * 2) = Rs 2.4 Floor value of Bill amount = Rs 2
*/


import java.util.Scanner;

public class ElectricBill. {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit of bills: ");
        int unit = sc.nextInt();

        double amount;
        if(unit <= 50) {
            amount = unit*0.50;
        }
        else if(unit <= 150) {
            amount = 25 + (unit-50)*0.75;
        }
        else if(unit <= 250) {
            amount = 100 + (unit-150)*1.20;
        }
        else {
            amount = 220 + (unit-250)*1.50;
        }
        
        int totalAmount = (int)(amount + amount*0.20);
        System.out.println("Total Amount = " + totalAmount);
    }
}
