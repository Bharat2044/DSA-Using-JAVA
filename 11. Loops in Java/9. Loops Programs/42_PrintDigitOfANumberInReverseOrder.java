import java.util.Scanner;

public class PrintDigitOfANumberInReverseOrder {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        while(n != 0) {
            System.out.println(n % 10);
            n /= 10;
        }
        
        sc.close();
    }
}
