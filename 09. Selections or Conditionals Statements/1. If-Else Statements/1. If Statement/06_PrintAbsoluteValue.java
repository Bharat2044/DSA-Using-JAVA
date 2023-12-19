import java.util.Scanner;

public class PrintAbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
    
        if(num >= 0) 
            System.out.println(num);
        
        if(num < 0)  
            System.out.println((-num));
    }
}