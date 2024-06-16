import java.util.Scanner;

public class CheckEvenOdd {
  
    // Approach 1: Using Modulo Operator
    // TC = O(1), SC = O(1)
    public static boolean isEven1(int n) {
        return (n % 2 == 0);
    }
    
    // Approach 2: Using Bitwise AND Operator
    // TC = O(1), SC = O(1)
    public static boolean isEven2(int n) {
        return ((n & 1) == 0);
    }
    
    // Approach 3: Using Bitwise XOR Operator
    // TC = O(1), SC = O(1)
    public static boolean isEven3(int n) {
        return ((n ^ 1) == (n + 1));
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Using isEven1 approach
        if(isEven1(n)) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }
        
        // Using isEven2 approach
        if(isEven2(n)) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }
        
        // Using isEven3 approach
        if(isEven3(n)) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }
        
        sc.close();
    }
}
