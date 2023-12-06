import java.util.Scanner;

public class ReadCharacterValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);
        
        System.out.println("The Character: " + a);
    }
}
