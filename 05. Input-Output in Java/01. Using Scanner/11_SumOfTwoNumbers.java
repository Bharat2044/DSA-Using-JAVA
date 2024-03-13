import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        
        int sum = a + b;
        
        System.out.println("Sum = " + sum);
    }
}
