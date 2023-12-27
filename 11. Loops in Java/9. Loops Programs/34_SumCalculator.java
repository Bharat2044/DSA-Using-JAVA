// Take integer inputs till the user enters 0 and print the sum of all numbers 

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 0;

        do {
            System.out.print("Enter an integer (enter 0 to finish): ");
            n = sc.nextInt();
            sum += n;
        } while(n != 0);

        System.out.println("Total Sum = " + sum);
        
        sc.close();
    }
}
