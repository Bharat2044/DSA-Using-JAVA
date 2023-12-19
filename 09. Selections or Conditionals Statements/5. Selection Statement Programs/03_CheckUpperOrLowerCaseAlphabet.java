import java.util.Scanner;

public class CheckUpperOrLowerCaseAlphabet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        if((ch >= 'A') && (ch <= 'Z'))
            System.out.println("The alphabet is in upper case");
        else if((ch >= 'a') && (ch <= 'z'))
            System.out.println("The alphabet is in lower case");
        else
            System.out.println("It is not an alphabet");
    }
}
