import java.util.Scanner;

public class StrongNumberInRange {
    
    public static boolean isStrongNumber(int n) {
        int sum = 0, temp = n;
        
        while(n > 0) {
            int d = n % 10;
            int fact = 1;
            
            for(int i = 1; i <= d; i++)
                fact *= i;
                
            sum += fact;
            n /= 10;
        }
        
        return (sum == temp);
    }
    
    public static void strongNumberInRange(int a, int b) {
        
        for(int i=Math.min(a, b); i<=Math.max(a, b); i++) {
            if(isStrongNumber(i))
                System.out.print(i + "   ");
        }
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        strongNumberInRange(a, b);
    }
}
