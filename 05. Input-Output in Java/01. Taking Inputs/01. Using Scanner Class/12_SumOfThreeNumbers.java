import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        
        int sum = a + b + c;
        
        System.out.println("Sum = " + sum);
    }
}
