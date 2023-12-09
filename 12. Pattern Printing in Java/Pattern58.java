/*
 n = 4
*       *
*       *
*       *
* * * * *
*       *
*       *
*       *

*/



import java.util.Scanner;

public class Pattern58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=2*n-1; i++) {
            for(int j=1; j<=n; j++) {
                if(i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}
