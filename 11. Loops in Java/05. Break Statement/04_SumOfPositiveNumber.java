// program to find the sum of positive numbers
// if the user enters a negative numbers, break ends the loop
// the negative number entered is not added to sum


import java.util.Scanner;

public class SumOfPositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int sum = 0;
    
        while(true) {
            // takeing input from the user
            System.out.print("Enter a positive number: ");
            num = sc.nextInt();
    
            // break condition
            if(num < 0)
                break;     
                
             // adding all positive numbers
            sum += num;      
        } 
        
        System.out.println("Sum = " + sum);
    }
}