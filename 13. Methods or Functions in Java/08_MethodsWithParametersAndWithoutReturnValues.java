import java.util.Scanner;

public class MethodsWithParametersAndWithoutReturnValues { 

    public static void sum(int a, int b) {
        
        System.out.println("Sum = " + (a + b));
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        sum(a, b);
    }
}