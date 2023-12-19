import java.util.Scanner;

public class PrintTableOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int i = 1;
    
        while (i <= 10) {
            System.out.println(n + " X " + i + " = " + (n * i));
            i++;
        }
    }
}