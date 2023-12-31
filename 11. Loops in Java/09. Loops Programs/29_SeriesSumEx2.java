// find the sum of the series 1 +11 + 111 + 1111 + .. n terms.

// i/p: 5
// o/p: 12345       => 1 + 11 + 111 + 1111 + 11111  =  12345


import java.util.Scanner;

public class SeriesSumEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int sum = 0;
        int num = 1;
    
        for (int i = 1; i <= n; i++) {
            sum += num;
            num = num * 10 + 1;
        }

        System.out.println("Sum of the series is: " + sum);
    }
}