import java.util.Scanner;

public class PrintDigitOfANumber {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int cnt = 0;
        int temp = n;
        
        while(temp != 0) {
            cnt++;
            temp /= 10;
        }
        
        int div = (int)Math.pow(10, cnt-1);
        
        while(div != 0) {
            int q = n / div;
            System.out.println(q);
            
            n = n % div;
            div /= 10;
        }
        
        sc.close();
    }
}
