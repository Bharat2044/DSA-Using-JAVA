/*
n = 5
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *

*/



import java.util.Scanner;

public class Pattern43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //upper part
        for(int i=1; i<=n; i++) {
            //left side star
            for(int j=1; j<=i; j++)
                System.out.print("* ");
                
            //space
            for(int s=1; s<=2*n-2*i; s++)
                System.out.print("  ");
                
            //right side star
            for(int j=1; j<=i; j++)
                System.out.print("* ");
                
            System.out.println();
        }
        
        //lower part
        for(int i=n; i>=1; i--) {
            //left side star
            for(int j=1; j<=i; j++)
                System.out.print("* ");
                
            //space
            for(int s=1; s<=2*n-2*i; s++)
                System.out.print("  ");
                
            //right side star
            for(int j=1; j<=i; j++)
                System.out.print("* ");
                
            System.out.println();
        }
    }
}
