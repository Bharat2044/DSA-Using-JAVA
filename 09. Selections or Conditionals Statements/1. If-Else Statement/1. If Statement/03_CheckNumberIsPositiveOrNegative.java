import java.util.Scanner;

public class CheckNumberIsPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
    
        // checks if the number is positive
        if (num > 0) {
            System.out.println("You entered a positive integer: " + num);
        }
        
        // checks if the number is negative
        if (num < 0) {
            System.out.println("You entered a negative integer: " + num);
        }
        
        // checks if the number is zero
        if (num == 0) {
            System.out.println("You entered a zero integer: " + num);
        }
    }
}