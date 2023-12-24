import java.util.Scanner;

public class MethodsWithoutParametersAndWithoutReturnValues { 

    public static void sum() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("Sum = " + (a + b));
    }
    
    public static void main(String[] args) {        
        sum();
    }
}