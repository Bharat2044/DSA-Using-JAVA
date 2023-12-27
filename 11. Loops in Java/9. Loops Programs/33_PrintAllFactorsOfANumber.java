import java.util.Scanner;

public class PrintAllFactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Approach - 1 : TC = O(n), SC = O(1)
        /*
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                System.out.print(i + "  ");
            }
        }
        */
        
        
        // Approach - 2 : TC = O(n/2) = O(n), SC = O(1)
        /*
        for(int i=1; i<=n/2; i++) {
            if(n % i == 0) {
                System.out.print(i + "  ");
            }
        }
        System.out.print(n);
        */
        
        
        // Approach - 3 : TC = O(sqrt(n)), SC = O(1)
        /*
        for(int i=1; i*i<=n; i++) {
            if(n % i == 0) {
                System.out.print(i + "  ");
                
                if(i != (n/i)) {
                    System.out.print((n / i) + "  ");
                }
            }
        }
        */
        
        
        // Approach - 4 : TC = O(sqrt(n)), SC = O(1)
        int i;
        for(i=1; i*i<n; i++) {
            if(n%i == 0) 
                System.out.print(i + "  ");
        }
        
        if(i-(n/i) == 1)
            i--;
        
        for(; i>=1; i--) {
            if(n%i == 0)
                System.out.print((n / i) + "  ");
        }
        
        
        sc.close();
    }
}
