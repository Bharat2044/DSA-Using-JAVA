import java.util.Scanner;

public class FactorialOfANumber {
  
    public static int factorial(int n) {
        if(n <= 1) {
           return 1;
        }
        
        int fact = 1;
        for(int i=2; i<=n; i++) {
            fact *= i;
        } 
        
        return fact;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        
        if(num < 0) {
            System.out.println("Factorial of negative number is not defined 😜");
            // System.exit(0);
            return;
        }
        
        int ans = factorial(num);
        
        System.out.println(num + "! = " + ans);
    }
}
