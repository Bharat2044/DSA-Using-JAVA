/*
n = 4
* * * * * * *
* *       * *
*   *   *   *
*     *     *
*   *   *   *
* *       * *
* * * * * * *

*/



import java.util.Scanner;

public class Pattern44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //upper part
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=2*n-1; j++) {
                if(i==1 || i==j || j==1 || j==2*n-1 || i+j==2*n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
                
            System.out.println();
        }
        
        //lower part
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=2*n-1; j++) {
                if(i==1 || i==j || j==1 || j==2*n-1 || i+j==2*n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
                
            System.out.println();
        }
    }
}
