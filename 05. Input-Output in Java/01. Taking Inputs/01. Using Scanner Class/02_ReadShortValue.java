import java.util.Scanner;

public class ReadShortValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        short a = sc.nextShort();
        
        System.out.println("The number is: " + a);
    }
}
