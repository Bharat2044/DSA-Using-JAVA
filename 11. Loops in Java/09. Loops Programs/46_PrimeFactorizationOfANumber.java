// i/p: n = 1440,   o/p: 2 2 2 2 2 3 3 4
// i/p: n = 46,   o/p: 2 23


import java.util.Scanner;

public class PrimeFactorizationOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();

        for(int f=2; f*f<=n; f++) {
            while(n % f == 0) {
                System.out.print(f + "  ");
                n /= f;
            }
        }        
        
        if(n != 1)
            System.out.print(n);
        
        sc.close();
    }
}
