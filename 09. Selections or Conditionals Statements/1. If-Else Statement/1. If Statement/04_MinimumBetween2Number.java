import java.util.Scanner;

public class MinimumBetween2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
    
        if(num1 < num2) 
            System.out.println(num1 + " is less than " + num2);
        
        if(num1 > num2) 
            System.out.println(num1 + " is greater than " + num2);
            
        if(num1 == num2) 
            System.out.println(num1 + " and " + num2 + " both are equal");
    }
}