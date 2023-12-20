// Fibonacci Numbers : 0 1 1 2 3 5 8 13 21 35


import java.util.Scanner;

public class PrintFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number you want to print fibonacci series: ");
        int n = sc.nextInt();
      
        int a = 0, b = 1;
        for(int i=1; i<=n; i++) {
            System.out.print(a + "  ");
            
            int temp = a+b;
            a = b;
            b = temp;
        }
    }
}