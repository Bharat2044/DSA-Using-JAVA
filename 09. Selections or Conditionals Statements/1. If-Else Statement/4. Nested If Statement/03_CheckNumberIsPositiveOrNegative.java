import java.util.Scanner;

public class CheckNumberIsPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

         // outer if condition
        if(num != 0) {
            // inner if condition
            if(num > 0) {
                System.out.println("The number is positive.");
            }
            // inner else condition
            else {
                System.out.println("The number is negative.");
            }  
        }
        // outer else condition
        else {
            System.out.println("The number is 0 and it is neither positive nor negative.");
        }
    }
}