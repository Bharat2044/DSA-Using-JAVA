import java.util.Scanner;

public class Print1ToNEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
    
        for(int i=1; i<=num; i++) {
            if(i % 2 != 0)
                continue;
            System.out.println(i);
        } 
    }
}