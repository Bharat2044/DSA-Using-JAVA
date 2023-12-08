/*
 n = 5
*
* *
*   *
*     *
*       * 
*     *
*   * 
* *
*

*/



import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // upper half
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(j==1 || j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
                
            System.out.println();
        }
        
        // lower half
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                if(j==1 || j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
                
            System.out.println();
        }
        
    }
}
