import java.util.Scanner;

public class MinimumBetween2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
    
        String ans = (num1 > num2) ? "num1 is greater than num2" : ((num1 < num2) ? "num1 is smaller than num2" : "num1 and num2 both are equal");
    
        System.out.println(ans);
    }
}