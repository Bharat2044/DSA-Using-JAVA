
import java.util.Scanner;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        /*
        // 1st Approach => TC = O(t * n), SC = O(1)
        for(int m=1; m<=t; m++) {
            int n = sc.nextInt();
            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) 
                    sum += i;
            }
        
            if (sum == n) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        */
        
        
        /*
        // 2nd Approach => TC = O(t * n/2) = O(t * n), SC = O(1)
        for(int m=1; m<=t; m++) {
            int n = sc.nextInt();
            int sum = 0;

            for (int i = 1; i <= n/2; i++) {
                if (n % i == 0) 
                    sum += i;
            }
        
            if (sum == n) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        */
        
        
        // 3rd Approach => TC = O(t * sqrt(n)), SC = O(1)
        for(int m=1; m<=t; m++) {
            int n = sc.nextInt();
            int sum = 1;

            for (int i=2; i*i<=n; i++) {
                if (n%i == 0) {
                    sum += i;
                    
                    if (i*i != n)
                        sum += n/i;
                }
            }
        
            if (sum == n) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
