/*
    n = 5
*       * * * * *
*       *        
*       *        
*       *        
* * * * * * * * *
        *       *
        *       *
        *       *
* * * * *       *
*/



import java.util.Scanner;

public class Pattern57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=2*n-1; i++) {
            for(int j=1; j<=2*n-1; j++) {
                if(i==n || j==n || (i==1 && j>n) || (i<n && j==1) || (i>n && j==n*2-1) || (i==n*2-1 && j<n))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}
