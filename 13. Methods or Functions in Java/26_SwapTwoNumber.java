import java.util.Scanner;

public class SwapTwoNumber { 

    public static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
        
        System.out.println("Inside swap function: ");
        System.out.println("a = " + a + "   b = " + b);        
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        swap(a, b);
        
        System.out.println("Inside main function: ");
        System.out.println("a = " + a + "   b = " + b);
    }
}