import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int cnt = (int)Math.log10(n) + 1;
        
        System.out.println(cnt);
    }
}