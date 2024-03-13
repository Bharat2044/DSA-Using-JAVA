import java.util.Scanner;

public class ReadLongValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long a = sc.nextLong();
        
        System.out.println("The number is: " + a);
    }
}
