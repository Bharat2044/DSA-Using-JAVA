import java.util.Scanner;

public class SumOfFirstNEvenAndOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int evenSum = 0, oddSum = 0;
    
        for (int i=1; i<=num; i++) {
            if(i%2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }
        
        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum = " + oddSum);
    }
}