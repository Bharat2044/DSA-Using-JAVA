import java.util.Scanner;

public class PrintPrimeNumbersInRange {
  
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        
        for(int i=2; i*i<=n; i++) {
            if(n%i == 0) {
                return false;
            }
        }  
        
        return true;
    }
    
    public static void primeInRange(int a, int b) {
        for(int i = a; i <= b; i++) {
            if(isPrime(i)) {
                System.out.print(i + "  ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        primeInRange(a, b);
    }
}