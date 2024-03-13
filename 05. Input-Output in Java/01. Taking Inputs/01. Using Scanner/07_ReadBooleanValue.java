import java.util.Scanner;

public class ReadBooleanValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a boolean value: ");
        boolean a = sc.nextBoolean();
        
        System.out.println("Result: " + a);
    }
}
