import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        
        if(num < 0) {
            System.out.println("Factorial of negative number is not defined 😜");
        }
        else {
            int fact = 1;
            
            for(int i=2; i<=num; i++) {
                fact *= i;
            } 
        
            System.out.println(num + "! = " + fact);
        }
    }
}