import java.util.Scanner;

public class PrintAbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
    
        int ans = (num >= 0) ? num : (-num);
        
        System.out.println(ans);
    }
}