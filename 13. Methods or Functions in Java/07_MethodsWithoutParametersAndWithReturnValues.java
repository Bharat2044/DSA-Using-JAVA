import java.util.Scanner;

public class MethodsWithoutParametersAndWithReturnValues { 

    public static int sum() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        return (a + b);
    }
    
    public static void main(String[] args) {        
        int ans = sum();
        
        System.out.println("Sum = " + ans);
    }
}