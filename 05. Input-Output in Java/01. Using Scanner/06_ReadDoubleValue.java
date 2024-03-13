import java.util.Scanner;

public class ReadDoubleValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        double a = sc.nextDouble();
        
        System.out.println("The number is: " + a);
    }
}
