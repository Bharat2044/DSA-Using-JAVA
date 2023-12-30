import java.util.Scanner;

public class SwapTwoNumbers {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Before Swapping: a = " + a + "   b = " + b);
        
        // 1st Approach: Using third variable
        /*
        int temp = a;
        a = b;
        b = temp;
        */
        
        // 2nd Approach: Using Arithmetic Operator
        /*
        a = a + b;
        b = a - b;
        a = a - b;
        */
        
        // 3rd Approach: Using Bitwise Operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After  Swapping: a = " + a + "   b = " + b);
        
        sc.close();
    }
}
