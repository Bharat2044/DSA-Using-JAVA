// i/p: x 
// o/p: 1 + x^1/1! + x^2/2! + x^3/3! + x^4/4! + x^5/5!

// i/p: x = 2
// o/p: 7.266   =>  1 + 2^1/1! + 2^2/2! + 2^3/3! + 2^4/4! + 2^5/5! = 1 + 2/1 + 4/2 + 8/6 + 16/24 + 32/120 = 1 + 2 + 2 + 1.333 + 0.666 + 0.266 = 7.266


import java.util.Scanner;

public class SeriesSumEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int x = sc.nextInt();

        float sum = 1.0f;
        int fact = 1;
    
        for (int i = 1; i <= 5; i++) {
            fact *= i;
            sum += Math.pow(x, i) / fact;
        }
        
        System.out.println(sum);
    }
}