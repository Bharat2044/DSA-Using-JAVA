/*
 n = 5
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/



import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // upper half
        for(int i=1; i<=n; i++) {
            for(int s=1; s<=n-i+1; s++)
                System.out.print(" ");
                
            for(int j=1; j<=i; j++)
                System.out.print("* ");
                
            System.out.println();
        }
        
        // lower half
        for(int i=n-1; i>=1; i--) {
            for(int s=1; s<=n-i+1; s++)
                System.out.print(" ");
                
            for(int j=1; j<=i; j++)
                System.out.print("* ");
                
            System.out.println();
        }
        
    }
}
