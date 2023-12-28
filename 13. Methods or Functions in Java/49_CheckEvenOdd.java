import java.util.Scanner;

public class CheckEvenOdd {
  
    public static boolean isEven(int n) {
        // return (n % 2 == 0);
        
        // return ((n & 1) == 0);
        
        return ((n ^ 1) == (n + 1));
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if(isEven(n)) {
            System.out.println(n + " is an even number");
        }
        else {
            System.out.println(n + " is an odd number");
        }
        
        sc.close();
    }
}
