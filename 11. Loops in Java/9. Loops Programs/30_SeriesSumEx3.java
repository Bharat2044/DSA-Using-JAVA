// i/p: n = 3
// o/p: 1 + 2 + 4 = 7

// i/p: n = 5
// o/p: 1 + 2 + 4 + 7 + 11 = 25


import java.util.Scanner;

public class SeriesSumEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int sum = 0;
        int term = 1;
        
        for(int i=1; i<=n; i++) {
            sum += term;
            term += i;
        }

        System.out.println("Sum of the series is: " + sum);
    }
}