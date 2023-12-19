/*
Problem Description:
You are given an integer A. 
You have to tell how many days are there in the month denoted by A in a non-leap year.

Months are denoted as follows: January : 1, February : 2, March : 3, April : 4, May : 5, June : 6, July : 7, August : 8, September : 9, October : 10, November : 11, December : 12


Problem Constraints:
1 <= A <= 12 

Input Format:
The input contains a single integer A.

Output Format:
Print a single integer denoting the number of days on a single line.

Example Input:
Input 1:
 1 
Input 2:
 11 

Example Output:
Output 1:
 31 
Output 2:
 30 

Example Explanation:
Explanation 1:
 Number of days in January(1) in a non-leap year = 31.
Explanation 2:
 Number of days in November(11) in a non-leap year = 30.
*/


import java.util.Scanner;

class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        switch(a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
        }
        
        /*
        if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12) {
            System.out.println(31);
        }
        else if(a == 2) {
            System.out.println(28);
        }
        else if(a==3 || a==6 || a==9 || a==11) {
            System.out.println(30);
        }
        */
    }
}
