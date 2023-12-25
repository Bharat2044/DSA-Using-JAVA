import java.util.Scanner;

public class ArmstrongNumberInRange {
    
    public static boolean isArmstrongNumber(int n) {
         int sum = 0;
        int temp = n;
        
        // count the number of digits
        int count = (int)(Math.log10(n)+1);

        while(temp != 0) {
            int rem = temp % 10;
    
            sum += (int)(Math.pow(rem, count));
            temp /= 10;
        }
        
        return (sum == n);
    }
    
    public static void armstrongNumberInRange(int a, int b) {
        
        for(int i=Math.min(a, b); i<=Math.max(a, b); i++) {
            if(isArmstrongNumber(i))
                System.out.print(i + "   ");
        }
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        armstrongNumberInRange(a, b);
    }
}
